package com.movieplayer.base_mvvm.utils.extentions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0003\u001a\"\u0010\u0004\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u001a*\u0010\u0004\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\b\u001a\u00020\t\u001a*\u0010\n\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f\u001a2\u0010\n\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00072\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\t\u001a\"\u0010\r\u001a\u00020\u0005\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0007\u00a8\u0006\u000e"}, d2 = {"isConnectedInternet", "", "T", "Landroidx/appcompat/app/AppCompatActivity;", "startActivity", "", "clazz", "Ljava/lang/Class;", "bundle", "Landroid/os/Bundle;", "startActivityForResult", "requestCode", "", "startActivityNewTask", "app_debug"})
public final class ActivityExtentionsKt {
    
    public static final <T extends androidx.appcompat.app.AppCompatActivity>void startActivity(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz) {
    }
    
    public static final <T extends androidx.appcompat.app.AppCompatActivity>void startActivity(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, @org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    public static final <T extends androidx.appcompat.app.AppCompatActivity>void startActivityForResult(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, int requestCode) {
    }
    
    public static final <T extends androidx.appcompat.app.AppCompatActivity>void startActivityForResult(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz, int requestCode, @org.jetbrains.annotations.NotNull()
    android.os.Bundle bundle) {
    }
    
    public static final <T extends androidx.appcompat.app.AppCompatActivity>void startActivityNewTask(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.Class<T> clazz) {
    }
    
    public static final <T extends androidx.appcompat.app.AppCompatActivity>boolean isConnectedInternet(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $receiver) {
        return false;
    }
}