package com.movieplayer.base_mvvm.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u00a2\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u00032\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u00109\u001a\u00020:H\u0004J\b\u0010;\u001a\u00020:H&J\u0006\u0010<\u001a\u00020=J\r\u0010>\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010-J\u0010\u0010?\u001a\u00020@2\u0006\u0010A\u001a\u00020BH\u0002J\b\u0010C\u001a\u00020@H\u0004J\b\u0010D\u001a\u00020@H\u0014J\b\u0010E\u001a\u00020@H\u0014J\b\u0010F\u001a\u00020@H\u0014J\u0012\u0010G\u001a\u00020@2\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\b\u0010J\u001a\u00020@H\u0014J\b\u0010K\u001a\u00020@H\u0014J\b\u0010L\u001a\u00020@H\u0016J\b\u0010M\u001a\u00020@H\u0016J\u0012\u0010N\u001a\u00020O2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\b\u0010R\u001a\u00020@H\u0014J\b\u0010S\u001a\u00020@H\u0014J\u001c\u0010T\u001a\u00020@2\u0012\u0010U\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070VH\u0014J\u001a\u0010W\u001a\u00020@2\b\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010X\u001a\u00020YH&J\b\u0010Z\u001a\u00020@H&J\b\u0010[\u001a\u00020@H\u0002J\u0010\u0010\\\u001a\u00020@2\u0006\u0010]\u001a\u00020\u0007H\u0004J\u000e\u0010^\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0016R\u001b\u0010\u0006\u001a\u00020\u00078DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\u00138\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R$\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u00020 8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001e\u0010%\u001a\u00020&8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\'\u0010(\"\u0004\b)\u0010*R\u001b\u0010+\u001a\u00028\u00008DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b.\u0010\u000b\u001a\u0004\b,\u0010-R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00103\u001a\u0002048\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b5\u00106\"\u0004\b7\u00108\u00a8\u0006_"}, d2 = {"Lcom/movieplayer/base_mvvm/base/BaseActivity;", "V", "Lcom/movieplayer/base_mvvm/base/BaseViewModel;", "Landroidx/appcompat/app/AppCompatActivity;", "Ldagger/android/support/HasSupportFragmentInjector;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "TAG$delegate", "Lkotlin/Lazy;", "mAlertService", "Lcom/movieplayer/base_mvvm/utils/AlertService;", "getMAlertService", "()Lcom/movieplayer/base_mvvm/utils/AlertService;", "setMAlertService", "(Lcom/movieplayer/base_mvvm/utils/AlertService;)V", "mAppLogger", "Lcom/movieplayer/base_mvvm/utils/AppLogger;", "getMAppLogger", "()Lcom/movieplayer/base_mvvm/utils/AppLogger;", "setMAppLogger", "(Lcom/movieplayer/base_mvvm/utils/AppLogger;)V", "mFragmentInjector", "Ldagger/android/DispatchingAndroidInjector;", "Landroidx/fragment/app/Fragment;", "getMFragmentInjector", "()Ldagger/android/DispatchingAndroidInjector;", "setMFragmentInjector", "(Ldagger/android/DispatchingAndroidInjector;)V", "mNetworkUtils", "Lcom/movieplayer/base_mvvm/utils/NetworkUtils;", "getMNetworkUtils", "()Lcom/movieplayer/base_mvvm/utils/NetworkUtils;", "setMNetworkUtils", "(Lcom/movieplayer/base_mvvm/utils/NetworkUtils;)V", "mPrefManager", "Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "getMPrefManager", "()Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "setMPrefManager", "(Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;)V", "mViewModel", "getMViewModel", "()Lcom/movieplayer/base_mvvm/base/BaseViewModel;", "mViewModel$delegate", "progressDialog", "Landroid/app/ProgressDialog;", "unBinder", "Lbutterknife/Unbinder;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "currentScreenOrientation", "", "getContentView", "getContext", "Landroid/content/Context;", "getViewModel", "handleErrors", "", "throwable", "", "hideProgressDialog", "on401", "on404", "on405", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onInternetUnavailable", "onNetworkCallEnded", "onNetworkCallStarted", "onOptionsItemSelected", "", "item", "Landroid/view/MenuItem;", "onServerError", "onTimeOutError", "onValidationError", "errors", "Ljava/util/LinkedHashMap;", "onViewReady", "intent", "Landroid/content/Intent;", "setUpDataObserver", "setUpObserver", "showProgressDialog", "message", "supportFragmentInjector", "app_debug"})
public abstract class BaseActivity<V extends com.movieplayer.base_mvvm.base.BaseViewModel> extends androidx.appcompat.app.AppCompatActivity implements dagger.android.support.HasSupportFragmentInjector {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> mFragmentInjector;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.movieplayer.base_mvvm.utils.AlertService mAlertService;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.movieplayer.base_mvvm.utils.NetworkUtils mNetworkUtils;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.movieplayer.base_mvvm.utils.AppLogger mAppLogger;
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public com.movieplayer.base_mvvm.data.local.SharedPrefManager mPrefManager;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy mViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy TAG$delegate = null;
    private android.app.ProgressDialog progressDialog;
    private butterknife.Unbinder unBinder;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> getMFragmentInjector() {
        return null;
    }
    
    public final void setMFragmentInjector(@org.jetbrains.annotations.NotNull()
    dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.movieplayer.base_mvvm.utils.AlertService getMAlertService() {
        return null;
    }
    
    public final void setMAlertService(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.utils.AlertService p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.movieplayer.base_mvvm.utils.NetworkUtils getMNetworkUtils() {
        return null;
    }
    
    public final void setMNetworkUtils(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.utils.NetworkUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.movieplayer.base_mvvm.utils.AppLogger getMAppLogger() {
        return null;
    }
    
    public final void setMAppLogger(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.utils.AppLogger p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.movieplayer.base_mvvm.data.local.SharedPrefManager getMPrefManager() {
        return null;
    }
    
    public final void setMPrefManager(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.data.local.SharedPrefManager p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final V getMViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected final java.lang.String getTAG() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public abstract int getContentView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract V getViewModel();
    
    public abstract void onViewReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent);
    
    public abstract void setUpDataObserver();
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public dagger.android.DispatchingAndroidInjector<androidx.fragment.app.Fragment> supportFragmentInjector() {
        return null;
    }
    
    protected final void showProgressDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected final void hideProgressDialog() {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    private final void setUpObserver() {
    }
    
    protected void onInternetUnavailable() {
    }
    
    public void onNetworkCallStarted() {
    }
    
    public void onNetworkCallEnded() {
    }
    
    protected void on401() {
    }
    
    protected void on404() {
    }
    
    protected void on405() {
    }
    
    protected void onServerError() {
    }
    
    protected void onTimeOutError() {
    }
    
    protected void onValidationError(@org.jetbrains.annotations.NotNull()
    java.util.LinkedHashMap<java.lang.String, java.lang.String> errors) {
    }
    
    private final void handleErrors(java.lang.Throwable throwable) {
    }
    
    protected final int currentScreenOrientation() {
        return 0;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public BaseActivity() {
        super();
    }
}