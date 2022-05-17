package com.movieplayer.base_mvvm.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0005\u00a2\u0006\u0002\u0010\u0002J \u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u0006\u0010\u0010\u001a\u00020\u000fR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/ImageCompresser;", "", "()V", "maxHeight", "", "maxWidth", "calculateInSampleSize", "", "options", "Landroid/graphics/BitmapFactory$Options;", "reqWidth", "reqHeight", "getCompressedImageFile", "Ljava/io/File;", "imagePath", "", "getFilename", "Companion", "app_debug"})
public final class ImageCompresser {
    private final float maxHeight = 1000.0F;
    private final float maxWidth = 750.0F;
    @org.jetbrains.annotations.NotNull()
    private static final com.movieplayer.base_mvvm.utils.ImageCompresser instance = null;
    public static final com.movieplayer.base_mvvm.utils.ImageCompresser.Companion Companion = null;
    
    /**
     * * Reduces the size of an image without affecting its quality.
     *     *
     *     * @param imagePath -Path of an image
     *     * @return
     */
    @org.jetbrains.annotations.NotNull()
    public final java.io.File getCompressedImageFile(@org.jetbrains.annotations.NotNull()
    java.lang.String imagePath) {
        return null;
    }
    
    private final int calculateInSampleSize(android.graphics.BitmapFactory.Options options, int reqWidth, int reqHeight) {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFilename() {
        return null;
    }
    
    public ImageCompresser() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/movieplayer/base_mvvm/utils/ImageCompresser$Companion;", "", "()V", "instance", "Lcom/movieplayer/base_mvvm/utils/ImageCompresser;", "getInstance", "()Lcom/movieplayer/base_mvvm/utils/ImageCompresser;", "app_debug"})
    public static final class Companion {
        
        @org.jetbrains.annotations.NotNull()
        public final com.movieplayer.base_mvvm.utils.ImageCompresser getInstance() {
            return null;
        }
        
        private Companion() {
            super();
        }
    }
}