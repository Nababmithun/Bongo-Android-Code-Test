package com.movieplayer.base_mvvm.utils.extentions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 2, d1 = {"\u0000B\n\u0000\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0014\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u0014\u0010\u0004\u001a\u00020\u0001*\u00020\u00052\b\b\u0001\u0010\u0003\u001a\u00020\u0001\u001a\u001e\u0010\u0006\u001a\u00020\u0007*\u00020\u00052\b\b\u0001\u0010\b\u001a\u00020\u00012\b\b\u0003\u0010\t\u001a\u00020\u0001\u001a\n\u0010\n\u001a\u00020\u000b*\u00020\f\u001a\u0012\u0010\r\u001a\u00020\f*\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0001\u001a\n\u0010\u0010\u001a\u00020\u000b*\u00020\f\u001a\u001c\u0010\u0011\u001a\u00020\u000b*\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0001\u001a\u001c\u0010\u0011\u001a\u00020\u000b*\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\u0001\u001a\n\u0010\u0017\u001a\u00020\u000b*\u00020\f\u00a8\u0006\u0018"}, d2 = {"getColor", "", "Landroidx/fragment/app/Fragment;", "colorRes", "getColorCompat", "Landroid/content/Context;", "getDrawableCompat", "Landroid/graphics/drawable/Drawable;", "resId", "tintColorRes", "gone", "", "Landroid/view/View;", "inflate", "Landroid/view/ViewGroup;", "layoutRes", "invisible", "toast", "Landroidx/appcompat/app/AppCompatActivity;", "text", "", "duration", "Landroidx/fragment/app/FragmentActivity;", "visible", "app_debug"})
public final class ViewExtentionsKt {
    
    /**
     * * Created by Waheed on 04,November,2019
     */
    public static final void visible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final void invisible(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final void gone(@org.jetbrains.annotations.NotNull()
    android.view.View $receiver) {
    }
    
    public static final int getColorCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @androidx.annotation.ColorRes()
    int colorRes) {
        return 0;
    }
    
    public static final int getColor(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.Fragment $receiver, @androidx.annotation.ColorRes()
    int colorRes) {
        return 0;
    }
    
    /**
     * * Easy toast function for Activity.
     */
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.fragment.app.FragmentActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    public static final void toast(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.app.AppCompatActivity $receiver, @org.jetbrains.annotations.NotNull()
    java.lang.String text, int duration) {
    }
    
    /**
     * * Inflate the layout specified by [layoutRes].
     */
    @org.jetbrains.annotations.NotNull()
    public static final android.view.View inflate(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup $receiver, int layoutRes) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public static final android.graphics.drawable.Drawable getDrawableCompat(@org.jetbrains.annotations.NotNull()
    android.content.Context $receiver, @androidx.annotation.DrawableRes()
    int resId, @androidx.annotation.ColorRes()
    int tintColorRes) {
        return null;
    }
}