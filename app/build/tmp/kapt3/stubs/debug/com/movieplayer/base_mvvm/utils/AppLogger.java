package com.movieplayer.base_mvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0005\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\"\u0010\u000b\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\"\u0010\f\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\f\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\f\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\"\u0010\r\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\r\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004J\"\u0010\u000e\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t2\u0006\u0010\n\u001a\u00020\u0004J\u000e\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0004J\u0016\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/AppLogger;", "", "()V", "TAG", "", "logD", "", "T", "className", "Ljava/lang/Class;", "message", "logE", "logI", "logV", "logW", "app_debug"})
public final class AppLogger {
    private final java.lang.String TAG = "SHISHIR_13";
    
    /**
     * DEBUG type log 
     */
    public final void logD(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void logD(@org.jetbrains.annotations.NotNull()
    java.lang.String TAG, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final <T extends java.lang.Object>void logD(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> className, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * Verbose type log 
     */
    public final void logV(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void logV(@org.jetbrains.annotations.NotNull()
    java.lang.String TAG, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final <T extends java.lang.Object>void logV(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> className, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * ERROR type log = RED COLOR 
     */
    public final void logE(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void logE(@org.jetbrains.annotations.NotNull()
    java.lang.String TAG, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final <T extends java.lang.Object>void logE(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> className, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * WARNING type log = RED COLOR 
     */
    public final void logW(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void logW(@org.jetbrains.annotations.NotNull()
    java.lang.String TAG, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final <T extends java.lang.Object>void logW(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> className, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    /**
     * INFO type log = RED COLOR 
     */
    public final void logI(@org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void logI(@org.jetbrains.annotations.NotNull()
    java.lang.String TAG, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final <T extends java.lang.Object>void logI(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> className, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public AppLogger() {
        super();
    }
}