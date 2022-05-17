package com.movieplayer.base_mvvm.loc;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\b\u0010\u0014\u001a\u00020\u0013H\u0002J\u0006\u0010\u0015\u001a\u00020\u0016J\u0006\u0010\u0017\u001a\u00020\u0013J\b\u0010\u0018\u001a\u00020\u0013H\u0007J\u0006\u0010\u0019\u001a\u00020\u0013R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0010\u0010\f\u001a\u0004\u0018\u00010\rX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/movieplayer/base_mvvm/loc/SSFusedLocationProviderClient;", "", "mContext", "Landroid/content/Context;", "(Landroid/content/Context;)V", "INTERVAL", "", "LOCATION_REFRESH_TIME", "fusedLocationProviderClient", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getMContext", "()Landroid/content/Context;", "mLastLocation", "Landroid/location/Location;", "mLocationCallback", "Lcom/google/android/gms/location/LocationCallback;", "mLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "buildLocationCallback", "", "buildLocationRequest", "isLocationProviderEnabled", "", "onDestroy", "startLocationUpdates", "stopLocationUpdates", "Companion", "app_debug"})
public final class SSFusedLocationProviderClient {
    private final long INTERVAL = 10000L;
    private final long LOCATION_REFRESH_TIME = 2000L;
    private com.google.android.gms.location.FusedLocationProviderClient fusedLocationProviderClient;
    private android.location.Location mLastLocation;
    private com.google.android.gms.location.LocationRequest mLocationRequest;
    private com.google.android.gms.location.LocationCallback mLocationCallback;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context mContext = null;
    private static double mLatitude;
    private static double mLongitude;
    public static final com.movieplayer.base_mvvm.loc.SSFusedLocationProviderClient.Companion Companion = null;
    
    private final void buildLocationRequest() {
    }
    
    private final void buildLocationCallback() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void startLocationUpdates() {
    }
    
    public final void stopLocationUpdates() {
    }
    
    public final boolean isLocationProviderEnabled() {
        return false;
    }
    
    public final void onDestroy() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getMContext() {
        return null;
    }
    
    public SSFusedLocationProviderClient(@org.jetbrains.annotations.NotNull()
    android.content.Context mContext) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\b\u00a8\u0006\f"}, d2 = {"Lcom/movieplayer/base_mvvm/loc/SSFusedLocationProviderClient$Companion;", "", "()V", "mLatitude", "", "getMLatitude", "()D", "setMLatitude", "(D)V", "mLongitude", "getMLongitude", "setMLongitude", "app_debug"})
    public static final class Companion {
        
        public final double getMLatitude() {
            return 0.0;
        }
        
        public final void setMLatitude(double p0) {
        }
        
        public final double getMLongitude() {
            return 0.0;
        }
        
        public final void setMLongitude(double p0) {
        }
        
        private Companion() {
            super();
        }
    }
}