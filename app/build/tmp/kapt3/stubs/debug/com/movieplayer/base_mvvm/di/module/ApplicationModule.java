package com.movieplayer.base_mvvm.di.module;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\b\u0010\u0007\u001a\u00020\bH\u0007J\b\u0010\t\u001a\u00020\nH\u0007J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\rH\u0007J\b\u0010\u000e\u001a\u00020\u000fH\u0007J\b\u0010\u0010\u001a\u00020\u0011H\u0007J\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0007J\u0010\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0017"}, d2 = {"Lcom/movieplayer/base_mvvm/di/module/ApplicationModule;", "", "()V", "provideAlertService", "Lcom/movieplayer/base_mvvm/utils/AlertService;", "context", "Landroid/content/Context;", "provideAppLogger", "Lcom/movieplayer/base_mvvm/utils/AppLogger;", "provideAppSchedule", "Lcom/movieplayer/base_mvvm/rx/AppSchedulerProvider;", "provideContext", "baseApp", "Lcom/movieplayer/base_mvvm/base/BaseApplication;", "provideNavigator", "Lcom/movieplayer/base_mvvm/utils/Navigator;", "provideNetworkUtils", "Lcom/movieplayer/base_mvvm/utils/NetworkUtils;", "providePermissionUtils", "Lcom/movieplayer/base_mvvm/utils/PermissionUtils;", "preferenceManager", "Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "providePreferenceManager", "app_debug"})
@dagger.Module(includes = {com.movieplayer.base_mvvm.di.module.ViewModelBindingModule.class})
public final class ApplicationModule {
    
    @org.jetbrains.annotations.NotNull()
    @dagger.Provides()
    public final android.content.Context provideContext(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.base.BaseApplication baseApp) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.movieplayer.base_mvvm.data.local.SharedPrefManager providePreferenceManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.movieplayer.base_mvvm.utils.PermissionUtils providePermissionUtils(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.data.local.SharedPrefManager preferenceManager) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.movieplayer.base_mvvm.utils.AlertService provideAlertService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.movieplayer.base_mvvm.rx.AppSchedulerProvider provideAppSchedule() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.movieplayer.base_mvvm.utils.Navigator provideNavigator() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.movieplayer.base_mvvm.utils.AppLogger provideAppLogger() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.movieplayer.base_mvvm.utils.NetworkUtils provideNetworkUtils() {
        return null;
    }
    
    public ApplicationModule() {
        super();
    }
}