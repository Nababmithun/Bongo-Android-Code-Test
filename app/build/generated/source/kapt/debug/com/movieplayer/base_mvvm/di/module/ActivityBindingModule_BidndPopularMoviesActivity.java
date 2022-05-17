package com.movieplayer.base_mvvm.di.module;

import android.app.Activity;
import com.movieplayer.base_mvvm.di.scope.ActivityScope;
import com.movieplayer.base_mvvm.ui.activity.movie.PopularMoviesActivity;
import dagger.Binds;
import dagger.Module;
import dagger.Subcomponent;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

@Module(
  subcomponents =
      ActivityBindingModule_BidndPopularMoviesActivity.PopularMoviesActivitySubcomponent.class
)
public abstract class ActivityBindingModule_BidndPopularMoviesActivity {
  private ActivityBindingModule_BidndPopularMoviesActivity() {}

  @Binds
  @IntoMap
  @ActivityKey(PopularMoviesActivity.class)
  abstract AndroidInjector.Factory<? extends Activity> bindAndroidInjectorFactory(
      PopularMoviesActivitySubcomponent.Builder builder);

  @Subcomponent
  @ActivityScope
  public interface PopularMoviesActivitySubcomponent
      extends AndroidInjector<PopularMoviesActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<PopularMoviesActivity> {}
  }
}
