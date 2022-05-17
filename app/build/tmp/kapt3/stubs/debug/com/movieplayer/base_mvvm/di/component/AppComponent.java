package com.movieplayer.base_mvvm.di.component;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001:\u0001\u0006J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0007"}, d2 = {"Lcom/movieplayer/base_mvvm/di/component/AppComponent;", "", "inject", "", "app", "Lcom/movieplayer/base_mvvm/base/BaseApplication;", "Builder", "app_debug"})
@dagger.Component(modules = {dagger.android.support.AndroidSupportInjectionModule.class, com.movieplayer.base_mvvm.di.module.NetworkModule.class, com.movieplayer.base_mvvm.di.module.ApplicationModule.class, com.movieplayer.base_mvvm.di.module.ActivityBindingModule.class})
@javax.inject.Singleton()
public abstract interface AppComponent {
    
    public abstract void inject(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.base.BaseApplication app);
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0003H\'J\b\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/movieplayer/base_mvvm/di/component/AppComponent$Builder;", "", "application", "Lcom/movieplayer/base_mvvm/base/BaseApplication;", "build", "Lcom/movieplayer/base_mvvm/di/component/AppComponent;", "app_debug"})
    @dagger.Component.Builder()
    public static abstract interface Builder {
        
        @org.jetbrains.annotations.NotNull()
        @dagger.BindsInstance()
        public abstract com.movieplayer.base_mvvm.di.component.AppComponent.Builder application(@org.jetbrains.annotations.NotNull()
        com.movieplayer.base_mvvm.base.BaseApplication application);
        
        @org.jetbrains.annotations.NotNull()
        public abstract com.movieplayer.base_mvvm.di.component.AppComponent build();
    }
}