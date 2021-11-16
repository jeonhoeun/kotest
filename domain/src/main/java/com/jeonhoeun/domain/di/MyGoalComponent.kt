package com.jeonhoeun.domain.di

import com.jeonhoeun.domain.view.SplashView
import dagger.BindsInstance
import dagger.Component

@Component
interface MyGoalComponent {
    @Component.Builder
    interface Builder{
        fun build() : MyGoalComponent
    }
}