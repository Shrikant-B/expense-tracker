package com.shrikant.badwaik.expensemanager.view.ui.splash

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SplashScreen(innerPadding: PaddingValues) {
    Box(Modifier.fillMaxSize(), contentAlignment = Alignment.Center) {
        AppName(modifier = Modifier.padding(innerPadding))
    }
}

@Composable
fun AppName(modifier: Modifier = Modifier) {
    Text(
        text = "Expense Tracker",
        modifier = modifier
    )
}