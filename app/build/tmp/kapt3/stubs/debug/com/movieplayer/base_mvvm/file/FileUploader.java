package com.movieplayer.base_mvvm.file;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\u001a\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\rJ\u001a\u0010\u000e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/movieplayer/base_mvvm/file/FileUploader;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "createPartFromString", "Lokhttp3/RequestBody;", "text", "", "getMultipartBodyPart", "Lokhttp3/MultipartBody$Part;", "fileName", "fileUri", "Landroid/net/Uri;", "getMultipartBodyPartFromFile", "file", "Ljava/io/File;", "getRealPathFromUri", "app_debug"})
public final class FileUploader {
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part getMultipartBodyPart(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.Nullable()
    android.net.Uri fileUri) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final okhttp3.MultipartBody.Part getMultipartBodyPartFromFile(@org.jetbrains.annotations.NotNull()
    java.lang.String fileName, @org.jetbrains.annotations.Nullable()
    java.io.File file) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRealPathFromUri(@org.jetbrains.annotations.NotNull()
    android.net.Uri fileUri) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final okhttp3.RequestBody createPartFromString(@org.jetbrains.annotations.NotNull()
    java.lang.String text) {
        return null;
    }
    
    public FileUploader(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}