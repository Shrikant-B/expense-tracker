package com.shrikant.badwaik.expensemanager.view.ui.splash

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.shrikant.badwaik.expensemanager.view.ui.splash.actions.SplashActions
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SplashViewModel @Inject constructor() : ViewModel() {
    private var _actions: MutableLiveData<SplashActions> = MutableLiveData()
    val actions: LiveData<SplashActions> get() = _actions

    fun navigateToMainActivity() {
        Thread.sleep(2000)
        _actions.postValue(SplashActions.NavigateToDashboard)
    }
}