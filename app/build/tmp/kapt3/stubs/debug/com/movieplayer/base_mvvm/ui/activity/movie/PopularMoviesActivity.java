package com.movieplayer.base_mvvm.ui.activity.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\r\u001a\u00020\u0005H\u0016J\b\u0010\u000e\u001a\u00020\u0002H\u0016J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0010H\u0002J\b\u0010\u0017\u001a\u00020\u0010H\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/movieplayer/base_mvvm/ui/activity/movie/PopularMoviesActivity;", "Lcom/movieplayer/base_mvvm/base/BaseActivity;", "Lcom/movieplayer/base_mvvm/ui/activity/movie/PopularMoviesViewModel;", "()V", "currentPage", "", "gridLayoutManager", "Landroidx/recyclerview/widget/GridLayoutManager;", "isLoadingAdded", "", "popularMovieAdapter", "Lcom/movieplayer/base_mvvm/ui/adapter/PopularMovieAdapter;", "totalPages", "getContentView", "getViewModel", "onNetworkCallStarted", "", "onViewReady", "savedInstanceState", "Landroid/os/Bundle;", "intent", "Landroid/content/Intent;", "setUpAdapter", "setUpDataObserver", "app_debug"})
public final class PopularMoviesActivity extends com.movieplayer.base_mvvm.base.BaseActivity<com.movieplayer.base_mvvm.ui.activity.movie.PopularMoviesViewModel> {
    private com.movieplayer.base_mvvm.ui.adapter.PopularMovieAdapter popularMovieAdapter;
    private androidx.recyclerview.widget.GridLayoutManager gridLayoutManager;
    private int currentPage;
    private int totalPages;
    private boolean isLoadingAdded;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getContentView() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.movieplayer.base_mvvm.ui.activity.movie.PopularMoviesViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    @java.lang.Override()
    public void setUpDataObserver() {
    }
    
    private final void setUpAdapter() {
    }
    
    @java.lang.Override()
    public void onNetworkCallStarted() {
    }
    
    public PopularMoviesActivity() {
        super();
    }
}