package com.movieplayer.base_mvvm.ui.activity.movie_details;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0002H\u0016J\u001a\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u000eH\u0002J\b\u0010\u0014\u001a\u00020\u000eH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/movieplayer/base_mvvm/ui/activity/movie_details/MovieDetailsActivity;", "Lcom/movieplayer/base_mvvm/base/BaseActivity;", "Lcom/movieplayer/base_mvvm/ui/activity/movie_details/MovieDetailsViewModel;", "()V", "itemDecoration", "Landroidx/recyclerview/widget/DividerItemDecoration;", "linearLayoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "trailersAdapter", "Lcom/movieplayer/base_mvvm/ui/adapter/MovieTrailersAdapter;", "getContentView", "", "getViewModel", "onViewReady", "", "savedInstanceState", "Landroid/os/Bundle;", "intent", "Landroid/content/Intent;", "setUpAdapter", "setUpDataObserver", "app_debug"})
public final class MovieDetailsActivity extends com.movieplayer.base_mvvm.base.BaseActivity<com.movieplayer.base_mvvm.ui.activity.movie_details.MovieDetailsViewModel> {
    private com.movieplayer.base_mvvm.ui.adapter.MovieTrailersAdapter trailersAdapter;
    private androidx.recyclerview.widget.LinearLayoutManager linearLayoutManager;
    private androidx.recyclerview.widget.DividerItemDecoration itemDecoration;
    private java.util.HashMap _$_findViewCache;
    
    @java.lang.Override()
    public int getContentView() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public com.movieplayer.base_mvvm.ui.activity.movie_details.MovieDetailsViewModel getViewModel() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewReady(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void setUpAdapter() {
    }
    
    @java.lang.Override()
    public void setUpDataObserver() {
    }
    
    public MovieDetailsActivity() {
        super();
    }
}