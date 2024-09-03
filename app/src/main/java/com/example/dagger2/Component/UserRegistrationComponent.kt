package com.example.dagger2.Component

import com.example.dagger2.Annontation.ActivityLevel
import com.example.dagger2.MainActivity
import com.example.dagger2.Module.NotificationModule
import com.example.dagger2.Module.RepositoryModule
import dagger.BindsInstance
import dagger.Component
import dagger.Subcomponent
import javax.inject.Singleton

@ActivityLevel
@Subcomponent( modules = [NotificationModule::class,RepositoryModule::class])
interface UserRegistrationComponent {


    fun inject(mainActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory{
        fun create( @BindsInstance tryCount:Int):UserRegistrationComponent
    }
}