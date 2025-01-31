package com.shrikant.badwaik.expensemanager.view.ui.dashboard.layout

import com.shrikant.badwaik.expensemanager.R

sealed class DashboardBottomNavItem(val label: String, val icon: Int, val route: String) {
    data object Home : DashboardBottomNavItem(
        "Home", R.drawable.ic_outline_home_24, "home"
    )

    data object Transactions : DashboardBottomNavItem(
        "Transactions", R.drawable.ic_outline_transactions_24, "transactions"
    )
}