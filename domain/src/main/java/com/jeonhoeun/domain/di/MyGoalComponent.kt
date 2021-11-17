package com.jeonhoeun.domain.di

import dagger.Component

@Component
interface MyGoalComponent {
    @Component.Builder
    interface Builder{
        fun build() : MyGoalComponent
    }
}