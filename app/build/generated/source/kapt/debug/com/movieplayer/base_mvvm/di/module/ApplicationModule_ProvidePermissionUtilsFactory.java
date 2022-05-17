// Generated by Dagger (https://google.github.io/dagger).
package com.movieplayer.base_mvvm.di.module;

import com.movieplayer.base_mvvm.data.local.SharedPrefManager;
import com.movieplayer.base_mvvm.utils.PermissionUtils;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

public final class ApplicationModule_ProvidePermissionUtilsFactory
    implements Factory<PermissionUtils> {
  private final ApplicationModule module;

  private final Provider<SharedPrefManager> preferenceManagerProvider;

  public ApplicationModule_ProvidePermissionUtilsFactory(
      ApplicationModule module, Provider<SharedPrefManager> preferenceManagerProvider) {
    this.module = module;
    this.preferenceManagerProvider = preferenceManagerProvider;
  }

  @Override
  public PermissionUtils get() {
    return Preconditions.checkNotNull(
        module.providePermissionUtils(preferenceManagerProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static ApplicationModule_ProvidePermissionUtilsFactory create(
      ApplicationModule module, Provider<SharedPrefManager> preferenceManagerProvider) {
    return new ApplicationModule_ProvidePermissionUtilsFactory(module, preferenceManagerProvider);
  }

  public static PermissionUtils proxyProvidePermissionUtils(
      ApplicationModule instance, SharedPrefManager preferenceManager) {
    return Preconditions.checkNotNull(
        instance.providePermissionUtils(preferenceManager),
        "Cannot return null from a non-@Nullable @Provides method");
  }
}