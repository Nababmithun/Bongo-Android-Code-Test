package com.movieplayer.base_mvvm.file;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0010B\u0015\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ#\u0010\t\u001a\u0004\u0018\u00010\u00042\u0012\u0010\n\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u000b\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0004H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0011"}, d2 = {"Lcom/movieplayer/base_mvvm/file/ImageDownloader;", "Landroid/os/AsyncTask;", "", "Ljava/lang/Void;", "Landroid/graphics/Bitmap;", "imageUrl", "callbackImageDownload", "Lcom/movieplayer/base_mvvm/file/ImageDownloader$CallbackImageDownload;", "(Ljava/lang/String;Lcom/movieplayer/base_mvvm/file/ImageDownloader$CallbackImageDownload;)V", "doInBackground", "params", "", "([Ljava/lang/String;)Landroid/graphics/Bitmap;", "onPostExecute", "", "bitmap", "CallbackImageDownload", "app_debug"})
public final class ImageDownloader extends android.os.AsyncTask<java.lang.String, java.lang.Void, android.graphics.Bitmap> {
    private final java.lang.String imageUrl = null;
    private final com.movieplayer.base_mvvm.file.ImageDownloader.CallbackImageDownload callbackImageDownload = null;
    
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
    com.movieplayer.base_mvvm.file.ImageDownloader.CallbackImageDownload callbackImageDownload) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&\u00a8\u0006\u0006"}, d2 = {"Lcom/movieplayer/base_mvvm/file/ImageDownloader$CallbackImageDownload;", "", "imageDidDownload", "", "bitmap", "Landroid/graphics/Bitmap;", "app_debug"})
    public static abstract interface CallbackImageDownload {
        
        public abstract void imageDidDownload(@org.jetbrains.annotations.Nullable()
        android.graphics.Bitmap bitmap);
    }
}