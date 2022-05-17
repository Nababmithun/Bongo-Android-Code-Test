package com.movieplayer.base_mvvm.data.remote.api_response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u001cB9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t\u00a2\u0006\u0002\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u0014\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\tH\u00c6\u0003JE\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u001c\b\u0002\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\tH\u00c6\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0019\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001a\u001a\u00020\u001bH\u00d6\u0001R*\u0010\u0006\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0007j\n\u0012\u0006\u0012\u0004\u0018\u00010\b`\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e\u00a8\u0006\u001d"}, d2 = {"Lcom/movieplayer/base_mvvm/data/remote/api_response/PopularMovieResponse;", "", "page", "", "totalResults", "totalPages", "movies", "Ljava/util/ArrayList;", "Lcom/movieplayer/base_mvvm/data/remote/api_response/PopularMovieResponse$SingleMovie;", "Lkotlin/collections/ArrayList;", "(IIILjava/util/ArrayList;)V", "getMovies", "()Ljava/util/ArrayList;", "getPage", "()I", "getTotalPages", "getTotalResults", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "SingleMovie", "app_debug"})
public final class PopularMovieResponse {
    @com.google.gson.annotations.SerializedName(value = "page")
    @com.google.gson.annotations.Expose()
    private final int page = 0;
    @com.google.gson.annotations.SerializedName(value = "total_results")
    @com.google.gson.annotations.Expose()
    private final int totalResults = 0;
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    @com.google.gson.annotations.Expose()
    private final int totalPages = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "results")
    @com.google.gson.annotations.Expose()
    private final java.util.ArrayList<com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse.SingleMovie> movies = null;
    
    public final int getPage() {
        return 0;
    }
    
    public final int getTotalResults() {
        return 0;
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse.SingleMovie> getMovies() {
        return null;
    }
    
    public PopularMovieResponse(int page, int totalResults, int totalPages, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse.SingleMovie> movies) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse.SingleMovie> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse copy(int page, int totalResults, int totalPages, @org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse.SingleMovie> movies) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 1, 11}, bv = {1, 0, 2}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b,\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\u0003\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u0014\u001a\u00020\t\u00a2\u0006\u0002\u0010\u0015J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00050\u0010H\u00c6\u0003J\t\u0010+\u001a\u00020\tH\u00c6\u0003J\t\u0010,\u001a\u00020\u0003H\u00c6\u0003J\t\u0010-\u001a\u00020\tH\u00c6\u0003J\t\u0010.\u001a\u00020\tH\u00c6\u0003J\t\u0010/\u001a\u00020\u0005H\u00c6\u0003J\t\u00100\u001a\u00020\u0007H\u00c6\u0003J\t\u00101\u001a\u00020\tH\u00c6\u0003J\t\u00102\u001a\u00020\u0005H\u00c6\u0003J\t\u00103\u001a\u00020\u0007H\u00c6\u0003J\t\u00104\u001a\u00020\tH\u00c6\u0003J\t\u00105\u001a\u00020\tH\u00c6\u0003J\t\u00106\u001a\u00020\tH\u00c6\u0003J\u009b\u0001\u00107\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00072\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\r\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\t2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00102\b\b\u0002\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u00032\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\tH\u00c6\u0001J\u0013\u00108\u001a\u00020\u00072\b\u00109\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010:\u001a\u00020\u0005H\u00d6\u0001J\t\u0010;\u001a\u00020\tH\u00d6\u0001R\u0016\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0016\u0010\f\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00108\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0016\u0010\r\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0019R\u0016\u0010\u000e\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0019R\u0016\u0010\u0013\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0019R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010\u0019R\u0016\u0010\u0014\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u0019R\u0016\u0010\u0011\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u0019R\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0017R\u0016\u0010\u0012\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\"R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001d\u00a8\u0006<"}, d2 = {"Lcom/movieplayer/base_mvvm/data/remote/api_response/PopularMovieResponse$SingleMovie;", "", "popularity", "", "voteCount", "", "video", "", "posterPath", "", "id", "adult", "backdropPath", "originalLanguage", "originalTitle", "genreIds", "", "title", "voteAverage", "overview", "releaseDate", "(DIZLjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;)V", "getAdult", "()Z", "getBackdropPath", "()Ljava/lang/String;", "getGenreIds", "()Ljava/util/List;", "getId", "()I", "getOriginalLanguage", "getOriginalTitle", "getOverview", "getPopularity", "()D", "getPosterPath", "getReleaseDate", "getTitle", "getVideo", "getVoteAverage", "getVoteCount", "component1", "component10", "component11", "component12", "component13", "component14", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "app_debug"})
    public static final class SingleMovie {
        @com.google.gson.annotations.SerializedName(value = "popularity")
        @com.google.gson.annotations.Expose()
        private final double popularity = 0.0;
        @com.google.gson.annotations.SerializedName(value = "vote_count")
        @com.google.gson.annotations.Expose()
        private final int voteCount = 0;
        @com.google.gson.annotations.SerializedName(value = "video")
        @com.google.gson.annotations.Expose()
        private final boolean video = false;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "poster_path")
        @com.google.gson.annotations.Expose()
        private final java.lang.String posterPath = null;
        @com.google.gson.annotations.SerializedName(value = "id")
        @com.google.gson.annotations.Expose()
        private final int id = 0;
        @com.google.gson.annotations.SerializedName(value = "adult")
        @com.google.gson.annotations.Expose()
        private final boolean adult = false;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "backdrop_path")
        @com.google.gson.annotations.Expose()
        private final java.lang.String backdropPath = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "original_language")
        @com.google.gson.annotations.Expose()
        private final java.lang.String originalLanguage = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "original_title")
        @com.google.gson.annotations.Expose()
        private final java.lang.String originalTitle = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "genre_ids")
        @com.google.gson.annotations.Expose()
        private final java.util.List<java.lang.Integer> genreIds = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "title")
        @com.google.gson.annotations.Expose()
        private final java.lang.String title = null;
        @com.google.gson.annotations.SerializedName(value = "vote_average")
        @com.google.gson.annotations.Expose()
        private final double voteAverage = 0.0;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "overview")
        @com.google.gson.annotations.Expose()
        private final java.lang.String overview = null;
        @org.jetbrains.annotations.NotNull()
        @com.google.gson.annotations.SerializedName(value = "release_date")
        @com.google.gson.annotations.Expose()
        private final java.lang.String releaseDate = null;
        
        public final double getPopularity() {
            return 0.0;
        }
        
        public final int getVoteCount() {
            return 0;
        }
        
        public final boolean getVideo() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getPosterPath() {
            return null;
        }
        
        public final int getId() {
            return 0;
        }
        
        public final boolean getAdult() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getBackdropPath() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOriginalLanguage() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOriginalTitle() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Integer> getGenreIds() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTitle() {
            return null;
        }
        
        public final double getVoteAverage() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getOverview() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getReleaseDate() {
            return null;
        }
        
        public SingleMovie(double popularity, int voteCount, boolean video, @org.jetbrains.annotations.NotNull()
        java.lang.String posterPath, int id, boolean adult, @org.jetbrains.annotations.NotNull()
        java.lang.String backdropPath, @org.jetbrains.annotations.NotNull()
        java.lang.String originalLanguage, @org.jetbrains.annotations.NotNull()
        java.lang.String originalTitle, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> genreIds, @org.jetbrains.annotations.NotNull()
        java.lang.String title, double voteAverage, @org.jetbrains.annotations.NotNull()
        java.lang.String overview, @org.jetbrains.annotations.NotNull()
        java.lang.String releaseDate) {
            super();
        }
        
        public final double component1() {
            return 0.0;
        }
        
        public final int component2() {
            return 0;
        }
        
        public final boolean component3() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component4() {
            return null;
        }
        
        public final int component5() {
            return 0;
        }
        
        public final boolean component6() {
            return false;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component7() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component8() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component9() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.util.List<java.lang.Integer> component10() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component11() {
            return null;
        }
        
        public final double component12() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component13() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component14() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.movieplayer.base_mvvm.data.remote.api_response.PopularMovieResponse.SingleMovie copy(double popularity, int voteCount, boolean video, @org.jetbrains.annotations.NotNull()
        java.lang.String posterPath, int id, boolean adult, @org.jetbrains.annotations.NotNull()
        java.lang.String backdropPath, @org.jetbrains.annotations.NotNull()
        java.lang.String originalLanguage, @org.jetbrains.annotations.NotNull()
        java.lang.String originalTitle, @org.jetbrains.annotations.NotNull()
        java.util.List<java.lang.Integer> genreIds, @org.jetbrains.annotations.NotNull()
        java.lang.String title, double voteAverage, @org.jetbrains.annotations.NotNull()
        java.lang.String overview, @org.jetbrains.annotations.NotNull()
        java.lang.String releaseDate) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object p0) {
            return false;
        }
    }
}