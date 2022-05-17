package com.movieplayer.base_mvvm.di.module

import android.content.Context
import com.movieplayer.base_mvvm.base.BaseApplication
import com.movieplayer.base_mvvm.data.local.SharedPrefManager
import com.movieplayer.base_mvvm.rx.AppSchedulerProvider
import com.movieplayer.base_mvvm.utils.*
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [ViewModelBindingModule::class])
class ApplicationModule {

    @Provides
    fun provideContext(baseApp: BaseApplication): Context {
        return baseApp
    }

    @Provides
    @Singleton
    fun providePreferenceManager(context: Context): SharedPrefManager {
        return SharedPrefManager(context)
    }

    @Provides
    @Singleton
    fun providePermissionUtils(preferenceManager: SharedPrefManager): PermissionUtils {
        return PermissionUtils(preferenceManager)
    }

    @Provides
    @Singleton
    fun provideAlertService(context: Context): AlertService {
        return AlertService(context)
    }

    @Provides
    @Singleton
    fun provideAppSchedule(): AppSchedulerProvider {
        return AppSchedulerProvider()
    }

    @Provides
    @Singleton
    fun provideNavigator(): Navigator {
        return Navigator()
    }

    @Provides
    @Singleton
    fun provideAppLogger(): AppLogger {
        return AppLogger()
    }

    @Provides
    @Singleton
    fun provideNetworkUtils(): NetworkUtils {
        return NetworkUtils()
    }
}