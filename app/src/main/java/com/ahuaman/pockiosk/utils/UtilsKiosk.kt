package com.ahuaman.pockiosk.utils

import android.app.Activity
import android.content.ComponentName
import android.content.Context
import android.content.ContextWrapper
import com.ahuaman.pockiosk.presentation.MyDeviceAdminReceiver



fun setupTaskMode(context: Context) {
    val adminComponent = getAdminComponent(context)
    val devicePolicyManager = context.getSystemService(Context.DEVICE_POLICY_SERVICE) as? android.app.admin.DevicePolicyManager
    devicePolicyManager?.setLockTaskPackages(adminComponent, arrayOf(context.packageName))
}

fun getAdminComponent(context: Context) = ComponentName(context, MyDeviceAdminReceiver::class.java)

fun Context.getActivityOrNull(): Activity? {
    var context = this
    while (context is ContextWrapper) {
        if (context is Activity) {
            return context
        }
        context = context.baseContext
    }
    return null
}