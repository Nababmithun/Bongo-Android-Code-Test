package com.movieplayer.base_mvvm.base

import android.app.ProgressDialog
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import butterknife.ButterKnife
import butterknife.Unbinder
import com.movieplayer.base_mvvm.data.local.SharedPrefManager
import com.movieplayer.base_mvvm.utils.AlertService
import com.movieplayer.base_mvvm.utils.AppLogger
import com.movieplayer.base_mvvm.utils.NetworkUtils
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject


abstract class BaseFragment<V : BaseViewModel> : Fragment() {

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

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
    protected lateinit var rootView: View

    override fun onCreate(savedInstanceState: Bundle?) {
        AndroidSupportInjection.inject(this)
        super.onCreate(savedInstanceState)
        setHasOptionsMenu(false)
    }

    @Nullable
    override fun onCreateView(@NonNull inflater: LayoutInflater, @Nullable container: ViewGroup?, @Nullable savedInstanceState: Bundle?): View? {
        rootView = getFragmentView(inflater, container, savedInstanceState)
        unBinder = ButterKnife.bind(this, rootView)
        onViewReady(arguments)
        return rootView
    }

    protected abstract fun getFragmentView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        saveInstanceState: Bundle?
    ): View

    abstract fun getContentView(): Int
    abstract fun getViewModel(): V
    protected abstract fun onViewReady(getArguments: Bundle?)


    protected fun showProgressDialog(message: String) {
        if (progressDialog == null) {
            progressDialog = ProgressDialog(getActivityContext())
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


    protected fun getActivityContext(): Context? {
        return activity
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