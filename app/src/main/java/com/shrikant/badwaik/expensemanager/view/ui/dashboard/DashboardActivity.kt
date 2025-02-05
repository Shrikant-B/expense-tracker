package com.shrikant.badwaik.expensemanager.view.ui.dashboard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.shrikant.badwaik.expensemanager.view.theme.ExpenseManagerTheme
import com.shrikant.badwaik.expensemanager.view.ui.dashboard.layout.DashboardView

class DashboardActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ExpenseManagerTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    DashboardView(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}