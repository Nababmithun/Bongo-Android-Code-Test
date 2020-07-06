package com.movieplayer.base_mvvp.utils.extentions

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

fun <T : AppCompatActivity> AppCompatActivity.startActivity(clazz: Class<T>) {
    val intent = Intent(this, clazz)
    startActivity(intent)
}

fun <T : AppCompatActivity> AppCompatActivity.startActivity(clazz: Class<T>, bundle: Bundle) {
    val intent = Intent(this, clazz)
    intent.putExtras(bundle)
    startActivity(intent)
}

fun <T : AppCompatActivity> AppCompatActivity.startActivityForResult(clazz: Class<T>, requestCode: Int) {
    val intent = Intent(this, clazz)
    startActivityForResult(intent, requestCode)
}

fun <T : AppCompatActivity> AppCompatActivity.startActivityForResult(
    clazz: Class<T>,
    requestCode: Int,
    bundle: Bundle
) {
    val intent = Intent(this, clazz)
    intent.putExtras(bundle)
    startActivityForResult(intent, requestCode)
}

fun <T : AppCompatActivity> AppCompatActivity.startActivityNewTask(clazz: Class<T>) {
    val intent = Intent(this, clazz)
    intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
    startActivity(intent)
}

fun <T : AppCompatActivity> AppCompatActivity.isConnectedInternet(): Boolean {
    val connectivityManager =
        this.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager?
    return if (connectivityManager != null) {
        val networkInfo = connectivityManager.activeNetworkInfo
        networkInfo != null && networkInfo.isConnected
    } else {
        false
    }
}