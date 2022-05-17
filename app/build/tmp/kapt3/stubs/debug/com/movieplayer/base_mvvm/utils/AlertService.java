package com.movieplayer.base_mvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0019B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\"\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0002J\"\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\rJ>\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u0016J \u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u000f2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ \u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/AlertService;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mAlert", "Landroidx/appcompat/app/AlertDialog;", "mConfirmationAlert", "mToast", "Landroid/widget/Toast;", "createToast", "", "message", "", "duration", "", "showAlert", "title", "showConfirmationAlert", "negativeBtn", "positiveBtn", "alertListener", "Lcom/movieplayer/base_mvvm/utils/AlertService$AlertListener;", "showToast", "resId", "AlertListener", "app_debug"})
public final class AlertService {
    private android.widget.Toast mToast;
    private androidx.appcompat.app.AlertDialog mAlert;
    private androidx.appcompat.app.AlertDialog mConfirmationAlert;
    private final android.content.Context context = null;
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, int resId, int duration) {
    }
    
    public final void showToast(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String message, int duration) {
    }
    
    private final void createToast(android.content.Context context, java.lang.String message, int duration) {
    }
    
    public final void showAlert(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void showConfirmationAlert(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.NotNull()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String negativeBtn, @org.jetbrains.annotations.NotNull()
    java.lang.String positiveBtn, @org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.utils.AlertService.AlertListener alertListener) {
    }
    
    public AlertService(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&\u00a8\u0006\u0005"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/AlertService$AlertListener;", "", "negativeBtnDidTapped", "", "positiveBtnDidTapped", "app_debug"})
    public static abstract interface AlertListener {
        
        public abstract void negativeBtnDidTapped();
        
        public abstract void positiveBtnDidTapped();
    }
}