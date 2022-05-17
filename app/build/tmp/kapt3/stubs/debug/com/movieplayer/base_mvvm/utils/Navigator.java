package com.movieplayer.base_mvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tJ2\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\"\u0010\u000f\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\tJ2\u0010\u0010\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00050\t2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e\u00a8\u0006\u0012"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/Navigator;", "", "()V", "back", "", "T", "context", "Landroid/content/Context;", "target", "Ljava/lang/Class;", "backWithBundle", "bundleKey", "", "bundle", "Landroid/os/Bundle;", "navigate", "navigateWithBundle", "Companion", "app_debug"})
public final class Navigator {
    @org.jetbrains.annotations.NotNull()
    private static final com.movieplayer.base_mvvm.utils.Navigator sharedInstance = null;
    public static final com.movieplayer.base_mvvm.utils.Navigator.Companion Companion = null;
    
    public final <T extends java.lang.Object>void navigate(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> target) {
    }
    
    public final <T extends java.lang.Object>void back(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> target) {
    }
    
    public final <T extends java.lang.Object>void navigateWithBundle(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> target, @org.jetbrains.annotations.NotNull()
    java.lang.String bundleKey, @org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    public final <T extends java.lang.Object>void backWithBundle(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> target, @org.jetbrains.annotations.NotNull()
    java.lang.String bundleKey, @org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    public Navigator() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/Navigator$Companion;", "", "()V", "sharedInstance", "Lcom/movieplayer/base_mvvm/utils/Navigator;", "getSharedInstance", "()Lcom/movieplayer/base_mvvm/utils/Navigator;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.movieplayer.base_mvvm.utils.Navigator getSharedInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}