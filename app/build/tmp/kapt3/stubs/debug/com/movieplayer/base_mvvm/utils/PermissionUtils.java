package com.movieplayer.base_mvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u000fB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J\u0016\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/PermissionUtils;", "", "preferenceManager", "Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "(Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;)V", "checkPermission", "", "context", "Landroid/content/Context;", "permission", "", "listener", "Lcom/movieplayer/base_mvvm/utils/PermissionUtils$OnPermissionAskListener;", "shouldAskPermission", "", "OnPermissionAskListener", "app_debug"})
public final class PermissionUtils {
    private final com.movieplayer.base_mvvm.data.local.SharedPrefManager preferenceManager = null;
    
    private final boolean shouldAskPermission() {
        return false;
    }
    
    public final boolean shouldAskPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    public final void checkPermission(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String permission, @org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.utils.PermissionUtils.OnPermissionAskListener listener) {
    }
    
    public PermissionUtils(@org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.data.local.SharedPrefManager preferenceManager) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\b\u0010\u0005\u001a\u00020\u0003H&J\b\u0010\u0006\u001a\u00020\u0003H&\u00a8\u0006\u0007"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/PermissionUtils$OnPermissionAskListener;", "", "onNeedPermission", "", "onPermissionGranted", "onPermissionPreviouslyDenied", "onPermissionPreviouslyDeniedWithNeverAskAgain", "app_debug"})
    public static abstract interface OnPermissionAskListener {
        
        public abstract void onNeedPermission();
        
        public abstract void onPermissionPreviouslyDenied();
        
        public abstract void onPermissionPreviouslyDeniedWithNeverAskAgain();
        
        public abstract void onPermissionGranted();
    }
}