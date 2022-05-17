package com.movieplayer.base_mvvm.di.module;

import android.app.Activity;
import com.movieplayer.base_mvvm.di.scope.ActivityScope;
import com.movieplayer.base_mvvm.ui.activity.movie_details.MovieDetailsActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBindingModule_BidndMovieDetailsActivity.MovieDetailsActivitySubcomponent.class
)
public abstract class ActivityBindingModule_BidndMovieDetailsActivity {
  private ActivityBindingModule_BidndMovieDetailsActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(MovieDetailsActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      MovieDetailsActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface MovieDetailsActivitySubcomponent extends AndroidInjector<MovieDetailsActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MovieDetailsActivity> {}
  }
}
