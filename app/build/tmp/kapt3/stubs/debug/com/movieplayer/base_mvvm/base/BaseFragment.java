package com.movieplayer.base_mvvm.base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\n\u00107\u001a\u0004\u0018\u000108H\u0004J\b\u00109\u001a\u00020:H&J$\u0010;\u001a\u00020*2\u0006\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?2\b\u0010@\u001a\u0004\u0018\u00010AH$J\r\u0010B\u001a\u00028\u0000H&\u00a2\u0006\u0002\u0010%J\b\u0010C\u001a\u00020DH\u0004J\u0012\u0010E\u001a\u00020D2\b\u0010F\u001a\u0004\u0018\u00010AH\u0016J,\u0010G\u001a\u0004\u0018\u00010*2\b\b\u0001\u0010<\u001a\u00020=2\n\b\u0001\u0010>\u001a\u0004\u0018\u00010?2\n\b\u0001\u0010F\u001a\u0004\u0018\u00010AH\u0017J\b\u0010H\u001a\u00020DH\u0016J\u0012\u0010I\u001a\u00020D2\b\u0010J\u001a\u0004\u0018\u00010AH$J\u0010\u0010K\u001a\u00020D2\u0006\u0010L\u001a\u00020\u0006H\u0004R\u001b\u0010\u0005\u001a\u00020\u00068DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001e\u0010\u0011\u001a\u00020\u00128\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001e\u0010\u0017\u001a\u00020\u00188\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u00020\u001e8\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001b\u0010#\u001a\u00028\u00008DX\u0084\u0084\u0002\u00a2\u0006\f\n\u0004\b&\u0010\n\u001a\u0004\b$\u0010%R\u0010\u0010\'\u001a\u0004\u0018\u00010(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010)\u001a\u00020*X\u0084.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001e\u00101\u001a\u0002028\u0006@\u0006X\u0087.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106\u00a8\u0006M"}, d2 = {"Lcom/movieplayer/base_mvvm/base/BaseFragment;", "V", "Lcom/movieplayer/base_mvvm/base/BaseViewModel;", "Landroidx/fragment/app/Fragment;", "()V", "TAG", "", "getTAG", "()Ljava/lang/String;", "TAG$delegate", "Lkotlin/Lazy;", "mAlertService", "Lcom/movieplayer/base_mvvm/utils/AlertService;", "getMAlertService", "()Lcom/movieplayer/base_mvvm/utils/AlertService;", "setMAlertService", "(Lcom/movieplayer/base_mvvm/utils/AlertService;)V", "mAppLogger", "Lcom/movieplayer/base_mvvm/utils/AppLogger;", "getMAppLogger", "()Lcom/movieplayer/base_mvvm/utils/AppLogger;", "setMAppLogger", "(Lcom/movieplayer/base_mvvm/utils/AppLogger;)V", "mNetworkUtils", "Lcom/movieplayer/base_mvvm/utils/NetworkUtils;", "getMNetworkUtils", "()Lcom/movieplayer/base_mvvm/utils/NetworkUtils;", "setMNetworkUtils", "(Lcom/movieplayer/base_mvvm/utils/NetworkUtils;)V", "mPrefManager", "Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "getMPrefManager", "()Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "setMPrefManager", "(Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;)V", "mViewModel", "getMViewModel", "()Lcom/movieplayer/base_mvvm/base/BaseViewModel;", "mViewModel$delegate", "progressDialog", "Landroid/app/ProgressDialog;", "rootView", "Landroid/view/View;", "getRootView", "()Landroid/view/View;", "setRootView", "(Landroid/view/View;)V", "unBinder", "Lbutterknife/Unbinder;", "viewModelFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getViewModelFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "setViewModelFactory", "(Landroidx/lifecycle/ViewModelProvider$Factory;)V", "getActivityContext", "Landroid/content/Context;", "getContentView", "", "getFragmentView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "saveInstanceState", "Landroid/os/Bundle;", "getViewModel", "hideProgressDialog", "", "onCreate", "savedInstanceState", "onCreateView", "onDestroy", "onViewReady", "getArguments", "showProgressDialog", "message", "app_debug"})
public abstract class BaseFragment<V extends com.movieplayer.base_mvvm.base.BaseViewModel> extends androidx.fragment.app.Fragment {
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Inject()
    public androidx.lifecycle.ViewModelProvider.Factory viewModelFactory;
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
    @org.jetbrains.annotations.NotNull()
    protected android.view.View rootView;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.ViewModelProvider.Factory getViewModelFactory() {
        return null;
    }
    
    public final void setViewModelFactory(@org.jetbrains.annotations.NotNull()
    androidx.lifecycle.ViewModelProvider.Factory p0) {
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
    
    @org.jetbrains.annotations.NotNull()
    protected final android.view.View getRootView() {
        return null;
    }
    
    protected final void setRootView(@org.jetbrains.annotations.NotNull()
    android.view.View p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    @androidx.annotation.NonNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    @androidx.annotation.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    protected abstract android.view.View getFragmentView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle saveInstanceState);
    
    public abstract int getContentView();
    
    @org.jetbrains.annotations.NotNull()
    public abstract V getViewModel();
    
    protected abstract void onViewReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle getArguments);
    
    protected final void showProgressDialog(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    protected final void hideProgressDialog() {
    }
    
    @org.jetbrains.annotations.Nullable()
    protected final android.content.Context getActivityContext() {
        return null;
    }
    
    @java.lang.Override()
    public void onDestroy() {
    }
    
    public BaseFragment() {
        super();
    }
}