package com.shrikant.badwaik.expensemanager.view.ui.splash.actions

sealed interface SplashActions {
    data object NavigateToDashboard : SplashActions
}