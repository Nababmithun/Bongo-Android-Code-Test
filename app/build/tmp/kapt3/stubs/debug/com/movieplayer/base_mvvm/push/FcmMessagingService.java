package com.movieplayer.base_mvvm.push;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002J\u001c\u0010\u000b\u001a\u00020\b2\b\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002J\b\u0010\u000f\u001a\u00020\bH\u0016J\u0010\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\rH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/movieplayer/base_mvvm/push/FcmMessagingService;", "Lcom/google/firebase/messaging/FirebaseMessagingService;", "()V", "mNotificationUtils", "Lcom/movieplayer/base_mvvm/utils/NotificationUtils;", "mPrefs", "Lcom/movieplayer/base_mvvm/data/local/SharedPrefManager;", "handleDataMessage", "", "notificationJson", "Lorg/json/JSONObject;", "handleNotificationMessage", "title", "", "message", "onCreate", "onMessageReceived", "remoteMessage", "Lcom/google/firebase/messaging/RemoteMessage;", "onNewToken", "newToken", "app_debug"})
public final class FcmMessagingService extends com.google.firebase.messaging.FirebaseMessagingService {
    private com.movieplayer.base_mvvm.utils.NotificationUtils mNotificationUtils;
    private com.movieplayer.base_mvvm.data.local.SharedPrefManager mPrefs;
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    @java.lang.Override()
    public void onNewToken(@org.jetbrains.annotations.NotNull()
    java.lang.String newToken) {
    }
    
    @java.lang.Override()
    public void onMessageReceived(@org.jetbrains.annotations.NotNull()
    com.google.firebase.messaging.RemoteMessage remoteMessage) {
    }
    
    private final void handleNotificationMessage(java.lang.String title, java.lang.String message) {
    }
    
    private final void handleDataMessage(org.json.JSONObject notificationJson) {
    }
    
    public FcmMessagingService() {
        super();
    }
}