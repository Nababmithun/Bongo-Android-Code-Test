package com.movieplayer.base_mvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0002()B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0002J\u001c\u0010\u0018\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\nH\u0002J\u0010\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\rH\u0002J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\f\u001a\u00020\rH\u0002J(\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020\n2\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010!H\u0002J\u0015\u0010\"\u001a\u00020#2\u0006\u0010\u0002\u001a\u00020\u0003H\u0000\u00a2\u0006\u0002\b$J,\u0010%\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\r2\b\u0010\u0015\u001a\u0004\u0018\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\n2\b\u0010\'\u001a\u0004\u0018\u00010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\b8BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006*"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/NotificationUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mBuilder", "Landroidx/core/app/NotificationCompat$Builder;", "mNotificationManager", "Landroid/app/NotificationManager;", "notificationChannelID", "", "notificationChannelName", "notificationId", "", "getNotificationId", "()I", "notificationManager", "getNotificationManager", "()Landroid/app/NotificationManager;", "bigPictureStyleNotification", "", "title", "bitmap", "Landroid/graphics/Bitmap;", "bigTextStyleNotification", "message", "buildNotification", "NOTIFICATION_ID", "getLaunchIntent", "Landroid/app/PendingIntent;", "inboxStyleNotification", "summeryText", "messageList", "Ljava/util/ArrayList;", "isAppIsInBackground", "", "isAppIsInBackground$app_debug", "showNotification", "smallIcon", "imageUrl", "ImageDownloadListener", "ImageDownloader", "app_debug"})
public final class NotificationUtils {
    private android.app.NotificationManager mNotificationManager;
    private androidx.core.app.NotificationCompat.Builder mBuilder;
    private final java.lang.String notificationChannelID = null;
    private final java.lang.String notificationChannelName = null;
    private final android.content.Context context = null;
    
    private final android.app.NotificationManager getNotificationManager() {
        return null;
    }
    
    private final int getNotificationId() {
        return 0;
    }
    
    private final void buildNotification(int NOTIFICATION_ID) {
    }
    
    private final android.app.PendingIntent getLaunchIntent(int notificationId) {
        return null;
    }
    
    private final void bigPictureStyleNotification(java.lang.String title, android.graphics.Bitmap bitmap) {
    }
    
    private final void bigTextStyleNotification(java.lang.String title, java.lang.String message) {
    }
    
    private final void inboxStyleNotification(java.lang.String title, java.lang.String summeryText, java.util.ArrayList<java.lang.String> messageList) {
    }
    
    public final void showNotification(int smallIcon, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.String message, @org.jetbrains.annotations.Nullable()
    java.lang.String imageUrl) {
    }
    
    public final boolean isAppIsInBackground$app_debug(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return false;
    }
    
    public NotificationUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/NotificationUtils$ImageDownloader;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "imageUrl", "downloadListener", "Lcom/movieplayer/base_mvvm/utils/NotificationUtils$ImageDownloadListener;", "(Ljava/lang/String;Lcom/movieplayer/base_mvvm/utils/NotificationUtils$ImageDownloadListener;)V", "doInBackground", "params", "", "([Ljava/lang/String;)Landroid/graphics/Bitmap;", "onPostExecute", "", "bitmap", "app_debug"})
    public static final class ImageDownloader extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap> {
        private final java.lang.String imageUrl = null;
        private final com.movieplayer.base_mvvm.utils.NotificationUtils.ImageDownloadListener downloadListener = null;
        
        @org.jetbrains.annotations.Nullable()
        @java.lang.Override()
        protected android.graphics.Bitmap doInBackground(@org.jetbrains.annotations.NotNull()
        java.lang.String... params) {
            return null;
        }
        
        @java.lang.Override()
        protected void onPostExecute(@org.jetbrains.annotations.NotNull()
        android.graphics.Bitmap bitmap) {
        }
        
        public ImageDownloader(@org.jetbrains.annotations.NotNull()
        java.lang.String imageUrl, @org.jetbrains.annotations.NotNull()
        com.movieplayer.base_mvvm.utils.NotificationUtils.ImageDownloadListener downloadListener) {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/NotificationUtils$ImageDownloadListener;", "", "onDownloadedImage", "", "bitmap", "Landroid/graphics/Bitmap;", "app_debug"})
    public static abstract interface ImageDownloadListener {
        
        public abstract void onDownloadedImage(@org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap bitmap);
    }
}