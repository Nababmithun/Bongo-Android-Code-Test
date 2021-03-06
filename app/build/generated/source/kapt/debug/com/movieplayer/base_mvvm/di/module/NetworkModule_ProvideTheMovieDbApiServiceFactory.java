// Generated by Dagger (https://google.github.io/dagger).
package com.movieplayer.base_mvvm.di.module;

import com.movieplayer.base_mvvm.data.remote.ApiServiceBuilder;
import com.movieplayer.base_mvvm.data.remote.api_service.TheMovieDbApiService;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class NetworkModule_ProvideTheMovieDbApiServiceFactory
    implements Factory<TheMovieDbApiService> {
  private final NetworkModule module;

  private final Provider<ApiServiceBuilder> apiServiceBuilderProvider;

  public NetworkModule_ProvideTheMovieDbApiServiceFactory(
      NetworkModule module, Provider<ApiServiceBuilder> apiServiceBuilderProvider) {
    this.module = module;
    this.apiServiceBuilderProvider = apiServiceBuilderProvider;
  }

  @Override
  public TheMovieDbApiService get() {
    return Preconditions.checkNotNull(
        module.provideTheMovieDbApiService(apiServiceBuilderProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static NetworkModule_ProvideTheMovieDbApiServiceFactory create(
      NetworkModule module, Provider<ApiServiceBuilder> apiServiceBuilderProvider) {
    return new NetworkModule_ProvideTheMovieDbApiServiceFactory(module, apiServiceBuilderProvider);
  }

  public static TheMovieDbApiService proxyProvideTheMovieDbApiService(
      NetworkModule instance, ApiServiceBuilder apiServiceBuilder) {
    return Preconditions.checkNotNull(
        instance.provideTheMovieDbApiService(apiServiceBuilder),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}
