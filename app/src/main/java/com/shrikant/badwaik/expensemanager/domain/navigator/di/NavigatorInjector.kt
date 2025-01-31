package com.shrikant.badwaik.expensemanager.domain.navigator.di

import android.content.Context
import com.shrikant.badwaik.expensemanager.domain.navigator.Navigator
import com.shrikant.badwaik.expensemanager.domain.navigator.NavigatorImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped

@Module
@InstallIn(ActivityComponent::class)
object NavigatorInjector {

    @Provides
    @ActivityScoped
    fun provideNavigator(@ActivityContext context: Context): Navigator {
        return NavigatorImpl(context)
    }
}