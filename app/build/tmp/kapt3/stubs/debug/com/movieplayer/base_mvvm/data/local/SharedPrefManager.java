package com.movieplayer.base_mvvm.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\t\u001a\u00020\nH\u0002J\b\u0010\u000b\u001a\u00020\nH\u0002J\u0016\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0012\u001a\u00020\u000eJ\u0016\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0016J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u000eJ\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0018J\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a2\u0006\u0010\u0012\u001a\u00020\u000eJ)\u0010\u001b\u001a\u0004\u0018\u0001H\u001c\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u0002H\u001c0\u001e\u00a2\u0006\u0002\u0010\u001fJ\u000e\u0010 \u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0018\u0010 \u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000eJ\u0014\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001a2\u0006\u0010\u0012\u001a\u00020\u000eJ\u001c\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010#2\u0006\u0010\u0012\u001a\u00020\u000eJ\u000e\u0010$\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\u000eJ\u0016\u0010%\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0001J\u0016\u0010\'\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0010J\u0016\u0010(\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0016J\u0016\u0010)\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u0018J\u001c\u0010*\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00180\u001aJ!\u0010,\u001a\u00020\n\"\u0004\b\u0000\u0010\u001c2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010&\u001a\u0002H\u001c\u00a2\u0006\u0002\u0010-J\u0016\u0010.\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010&\u001a\u00020\u000eJ\u001c\u0010/\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u000e0\u001aJ\"\u00100\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000e2\u0012\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e0#J\u000e\u00102\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u000eJ\u0006\u00103\u001a\u00020\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00064"}, d2 = {"Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "mEditor", "Landroid/content/SharedPreferences$Editor;", "mPref", "Landroid/content/SharedPreferences;", "doCommit", "", "doEdit", "firstTimeAskingPermission", "permission", "", "isFirstTime", "", "get", "key", "getBoolean", "defaultValue", "getDouble", "", "getInt", "", "getIntegerArrayList", "Ljava/util/ArrayList;", "getObject", "T", "theClass", "Ljava/lang/Class;", "(Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;", "getString", "getStringArrayList", "getStringHashMap", "Ljava/util/HashMap;", "isFirstTimeAskingPermission", "put", "value", "putBoolean", "putDouble", "putInt", "putIntegerArrayList", "arrayList", "putObject", "(Ljava/lang/String;Ljava/lang/Object;)V", "putString", "putStringArrayList", "putStringHashMap", "map", "remove", "removeAll", "app_debug"})
public final class SharedPrefManager {
    private final android.content.SharedPreferences mPref = null;
    private android.content.SharedPreferences.Editor mEditor;
    
    public final void put(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Object value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.Object get(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final <T extends java.lang.Object>void putObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, T value) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final <T extends java.lang.Object>T getObject(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> theClass) {
        return null;
    }
    
    public final void putString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getString(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.lang.String defaultValue) {
        return null;
    }
    
    public final void putInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int value) {
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return 0;
    }
    
    public final int getInt(@org.jetbrains.annotations.NotNull()
    java.lang.String key, int defaultValue) {
        return 0;
    }
    
    public final void putDouble(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double value) {
    }
    
    public final double getDouble(@org.jetbrains.annotations.NotNull()
    java.lang.String key, double defaultValue) {
        return 0.0;
    }
    
    public final void putBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean value) {
    }
    
    public final boolean getBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String key, boolean defaultValue) {
        return false;
    }
    
    public final void putStringArrayList(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> arrayList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getStringArrayList(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void putIntegerArrayList(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.Integer> arrayList) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.Integer> getIntegerArrayList(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void putStringHashMap(@org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.NotNull()
    java.util.HashMap<java.lang.String, java.lang.String> map) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.HashMap<java.lang.String, java.lang.String> getStringHashMap(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
        return null;
    }
    
    public final void firstTimeAskingPermission(@org.jetbrains.annotations.NotNull()
    java.lang.String permission, boolean isFirstTime) {
    }
    
    public final boolean isFirstTimeAskingPermission(@org.jetbrains.annotations.NotNull()
    java.lang.String permission) {
        return false;
    }
    
    private final void doEdit() {
    }
    
    private final void doCommit() {
    }
    
    public final void remove(@org.jetbrains.annotations.NotNull()
    java.lang.String key) {
    }
    
    public final void removeAll() {
    }
    
    public SharedPrefManager(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
}