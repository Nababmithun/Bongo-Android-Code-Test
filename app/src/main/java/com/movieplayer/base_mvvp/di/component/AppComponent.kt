package com.movieplayer.base_mvvp.di.component
import com.movieplayer.base_mvvp.base.BaseApplication
import dagger.BindsInstance
import dagger.Component
import dagger.android.support.AndroidSupportInjectionModule
import com.movieplayer.base_mvvp.di.module.ActivityBindingModule
import com.movieplayer.base_mvvp.di.module.ApplicationModule
import com.movieplayer.base_mvvp.di.module.NetworkModule
import javax.inject.Singleton

@Singleton
@Component(modules = [
    AndroidSupportInjectionModule::class,
    NetworkModule::class,
    ApplicationModule::class,
    ActivityBindingModule::class])

interface AppComponent {
    @Component.Builder
    interface Builder {

        @BindsInstance
        fun application(application: BaseApplication): Builder

        fun build(): AppComponent
    }

    fun inject(app: BaseApplication)
}