package com.movieplayer.base_mvvm.base

import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import butterknife.ButterKnife
import butterknife.Unbinder
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import com.movieplayer.base_mvvm.R
import com.movieplayer.base_mvvm.data.local.SharedPrefManager
import com.movieplayer.base_mvvm.data.remote.NoConnectivityException
import com.movieplayer.base_mvvm.utils.*
import dagger.android.AndroidInjection
import dagger.android.DispatchingAndroidInjector
import dagger.android.support.HasSupportFragmentInjector
import org.json.JSONObject
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException
import java.util.LinkedHashMap
import javax.inject.Inject
import javax.net.ssl.SSLHandshakeException

abstract class BaseActivity<V : BaseViewModel> : AppCompatActivity(), HasSupportFragmentInjector {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    @Inject
    lateinit var mFragmentInjector: DispatchingAndroidInjector<Fragment>

    @Inject
    lateinit var mAlertService: AlertService

    @Inject
    lateinit var mNetworkUtils: NetworkUtils

    @Inject
    lateinit var mAppLogger: AppLogger

    @Inject
    lateinit var mPrefManager: SharedPrefManager


    protected val mViewModel: V by lazy {
        getViewModel()
    }

    protected val TAG: String  by lazy {
        this.javaClass.simpleName
    }

    private var progressDialog: ProgressDialog? = null
    private var unBinder: Unbinder? = null


    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(getContentView())
        unBinder = ButterKnife.bind(this)
        supportActionBar?.let {
            val launcherActivity = AppUtils.sharedInstance.getAppLauncherActivity(getContext())
            val currentActivity = this.javaClass.canonicalName
            if (currentActivity != launcherActivity) {
                it.apply {
                    setDisplayHomeAsUpEnabled(true)
                    setDisplayShowHomeEnabled(true)
                }
            }
        }
        setUpObserver()
        setUpDataObserver()
        onViewReady(savedInstanceState, intent)
    }

    abstract fun getContentView(): Int
    abstract fun getViewModel(): V
    abstract fun onViewReady(savedInstanceState: Bundle?, intent: Intent)
    abstract fun setUpDataObserver()

    override fun supportFragmentInjector() = mFragmentInjector


    protected fun showProgressDialog(message: String) {
        if (progressDialog == null) {
            progressDialog = ProgressDialog(this, R.style.MyAlertDialogStyle)
            progressDialog!!.setCancelable(false)
        }
        progressDialog!!.setMessage(message)
        if (!progressDialog!!.isShowing) {
            progressDialog?.show()
        }
    }

    protected fun hideProgressDialog() {
        if (progressDialog != null && progressDialog!!.isShowing) progressDialog?.dismiss()
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item != null && item.itemId == android.R.id.home) onBackPressed()
        return super.onOptionsItemSelected(item)
    }

    fun getContext(): Context {
        return this
    }

    private fun setUpObserver() {

        mViewModel.loading.observe(this, Observer<Boolean> { isLoading ->
            if (isLoading) onNetworkCallStarted() else onNetworkCallEnded()
        })

        mViewModel.errors.observe(this, Observer<Throwable> {
            handleErrors(it)
        })

    }

    protected open fun onInternetUnavailable() {
        mAlertService.showAlert(
            getContext(),
            "No Connectivity Available",
            "Please check your internet connection and try again."
        )
    }

    open fun onNetworkCallStarted() {
        showProgressDialog("Please wait...")
    }

    open fun onNetworkCallEnded() {
        hideProgressDialog()
    }

    protected open fun on401() {
        showToast("401: Unauthorized")
    }

    protected open fun on404() {
        showToast("404: Not Found")
    }

    protected open fun on405() {
        showToast("405: Method not supported")
    }

    protected open fun onServerError() {
        showToast("Server Error")
    }

    protected open fun onTimeOutError() {
        showToast("Time Out Error")
    }

    protected open fun onValidationError(errors: LinkedHashMap<String, String>) {
        showToast("Validation Error")
    }

    private fun handleErrors(throwable: Throwable) {
        when (throwable) {
            is NoConnectivityException -> onInternetUnavailable()
            is HttpException -> {
                val httpErrorCode = throwable.code()
                val httpErrorResponse = throwable.response()
                when (httpErrorCode) {
                    401 -> on401()
                    404 -> on404()
                    405 -> on405()
                    422 -> {          // 422 = FORM DATA NOT VALID
                        try {
                            val jsnStr = httpErrorResponse.errorBody()?.string()
                            if (jsnStr != null) {
                                val rootObj = JSONObject(jsnStr)
                                val errors = rootObj.getJSONObject("body")
                                val errorMap = Gson().fromJson<LinkedHashMap<String, String>>(
                                    errors.toString(),
                                    object : TypeToken<LinkedHashMap<String, String>>() {}.type
                                )
                                onValidationError(errorMap)
                            }
                        } catch (exception: Exception) {
                            exception.printStackTrace()
                        }
                    }
                    500 -> onServerError()
                }
            }
            is SocketTimeoutException, is UnknownHostException -> onServerError()
            is SSLHandshakeException, is ConnectException -> onTimeOutError()
        }
    }

    protected fun currentScreenOrientation(): Int {
        return getContext().resources.configuration.orientation
    }


    override fun onDestroy() {
        super.onDestroy()
        hideProgressDialog() // if already is showing
        if (unBinder != null) {
            unBinder!!.unbind()
            unBinder = null
        }
    }

}