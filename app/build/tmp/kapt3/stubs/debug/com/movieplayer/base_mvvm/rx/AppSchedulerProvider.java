package com.movieplayer.base_mvvm.rx;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H\u0016J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\b\u0010\u0006\u001a\u00020\u0004H\u0016\u00a8\u0006\u0007"}, d2 = {"Lcom/movieplayer/base_mvvm/rx/AppSchedulerProvider;", "Lcom/movieplayer/base_mvvm/rx/SchedulerProvider;", "()V", "computation", "Lio/reactivex/Scheduler;", "io", "ui", "app_debug"})
public final class AppSchedulerProvider implements com.movieplayer.base_mvvm.rx.SchedulerProvider {
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler io() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler ui() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public io.reactivex.Scheduler computation() {
        return null;
    }
    
    public AppSchedulerProvider() {
        super();
    }
}