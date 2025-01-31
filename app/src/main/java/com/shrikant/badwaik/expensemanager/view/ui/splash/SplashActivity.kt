package com.shrikant.badwaik.expensemanager.view.ui.splash

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.shrikant.badwaik.expensemanager.domain.navigator.Navigator
import com.shrikant.badwaik.expensemanager.view.theme.ExpenseManagerTheme
import com.shrikant.badwaik.expensemanager.view.ui.dashboard.DashboardActivity
import com.shrikant.badwaik.expensemanager.view.ui.splash.actions.SplashActions
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SplashActivity : AppCompatActivity() {
    private val viewModel: SplashViewModel by viewModels()
    @Inject lateinit var navigator: Navigator

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpenseManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    SplashScreen(innerPadding)
                }
            }
        }

        observeActions()
        viewModel.navigateToMainActivity()
    }

    private fun observeActions() {
        viewModel.actions.observe(this) {
            when (it) {
                is SplashActions.NavigateToDashboard -> {
                    navigator.navigateTo(this, DashboardActivity::class.java)
                    finish()
                }
            }
        }
    }
}