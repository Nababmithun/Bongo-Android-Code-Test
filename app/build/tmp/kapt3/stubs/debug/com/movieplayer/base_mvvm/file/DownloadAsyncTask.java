package com.movieplayer.base_mvvm.file;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u001d\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ!\u0010\u0015\u001a\u00020\u00042\u0012\u0010\u0016\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0017\"\u00020\u0002H\u0014\u00a2\u0006\u0002\u0010\u0018J\u0018\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0007H\u0002J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0004H\u0014J\b\u0010\u001e\u001a\u00020\u001cH\u0014J%\u0010\u001f\u001a\u00020\u001c2\u0016\u0010 \u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00030\u0017\"\u0004\u0018\u00010\u0003H\u0014\u00a2\u0006\u0002\u0010!R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00070\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0002X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/movieplayer/base_mvvm/file/DownloadAsyncTask;", "Landroid/os/AsyncTask;", "Landroid/net/Uri;", "", "", "mUri", "context", "Landroid/content/Context;", "callback", "Lcom/movieplayer/base_mvvm/file/FileUtils$CallBackDownloadAsyncTask;", "(Landroid/net/Uri;Landroid/content/Context;Lcom/movieplayer/base_mvvm/file/FileUtils$CallBackDownloadAsyncTask;)V", "errorReason", "folder", "Ljava/io/File;", "is", "Ljava/io/InputStream;", "mContext", "Ljava/lang/ref/WeakReference;", "pathPlusName", "returnCursor", "Landroid/database/Cursor;", "doInBackground", "params", "", "([Landroid/net/Uri;)Ljava/lang/String;", "getFileName", "uri", "onPostExecute", "", "result", "onPreExecute", "onProgressUpdate", "values", "([Ljava/lang/Integer;)V", "app_debug"})
public final class DownloadAsyncTask extends android.os.AsyncTask<android.net.Uri, java.lang.Integer, java.lang.String> {
    private final java.lang.ref.WeakReference<android.content.Context> mContext = null;
    private java.lang.String pathPlusName;
    private java.io.File folder;
    private android.database.Cursor returnCursor;
    private java.io.InputStream is;
    private java.lang.String errorReason;
    private final android.net.Uri mUri = null;
    private final com.movieplayer.base_mvvm.file.FileUtils.CallBackDownloadAsyncTask callback = null;
    
    @java.lang.Override()
    protected void onPreExecute() {
    }
    
    @java.lang.Override()
    protected void onProgressUpdate(@org.jetbrains.annotations.NotNull()
    java.lang.Integer... values) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    protected java.lang.String doInBackground(@org.jetbrains.annotations.NotNull()
    android.net.Uri... params) {
        return null;
    }
    
    private final java.lang.String getFileName(android.net.Uri uri, android.content.Context context) {
        return null;
    }
    
    @java.lang.Override()
    protected void onPostExecute(@org.jetbrains.annotations.Nullable()
    java.lang.String result) {
    }
    
    public DownloadAsyncTask(@org.jetbrains.annotations.NotNull()
    android.net.Uri mUri, @org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    com.movieplayer.base_mvvm.file.FileUtils.CallBackDownloadAsyncTask callback) {
        super();
    }
}