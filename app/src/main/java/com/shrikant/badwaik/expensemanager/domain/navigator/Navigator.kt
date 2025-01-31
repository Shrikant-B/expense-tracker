package com.shrikant.badwaik.expensemanager.domain.navigator

import android.content.Context
import android.content.Intent

interface Navigator {
    fun navigateTo(from: Context, to: Class<*>)
}

class NavigatorImpl(private val context: Context) : Navigator {

    override fun navigateTo(from: Context, to: Class<*>) {
        context.startActivity(Intent(from, to))
    }
}