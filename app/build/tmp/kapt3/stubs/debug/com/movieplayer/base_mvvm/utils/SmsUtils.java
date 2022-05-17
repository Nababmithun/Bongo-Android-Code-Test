package com.movieplayer.base_mvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005*\u0002\u000b\u0010\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u001e\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\u0006J\u0006\u0010\u0017\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\fR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0010\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/SmsUtils;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "DELIVERED", "", "SENT", "alertService", "Lcom/movieplayer/base_mvvm/utils/AlertService;", "deliveredBroadCastReceiver", "com/movieplayer/base_mvvm/utils/SmsUtils$deliveredBroadCastReceiver$1", "Lcom/movieplayer/base_mvvm/utils/SmsUtils$deliveredBroadCastReceiver$1;", "getMContext", "()Landroid/content/Context;", "sentBroadCastReceiver", "com/movieplayer/base_mvvm/utils/SmsUtils$sentBroadCastReceiver$1", "Lcom/movieplayer/base_mvvm/utils/SmsUtils$sentBroadCastReceiver$1;", "registerSentDeliveredReceiver", "", "sendSMS", "phoneNo", "message", "unRegisterSentDeliveredReceiver", "app_debug"})
public final class SmsUtils {
    private final java.lang.String SENT = null;
    private final java.lang.String DELIVERED = null;
    private final com.movieplayer.base_mvvm.utils.AlertService alertService = null;
    private final android.content.BroadcastReceiver sentBroadCastReceiver = null;
    private final android.content.BroadcastReceiver deliveredBroadCastReceiver = null;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    
    public final void sendSMS(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext, @org.jetbrains.annotations.NotNull()
    java.lang.String phoneNo, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void registerSentDeliveredReceiver() {
    }
    
    public final void unRegisterSentDeliveredReceiver() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public SmsUtils(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
}