package com.ahuaman.pockiosk.presentation

import android.app.admin.DeviceAdminReceiver
import android.content.Context
import android.content.Intent

class MyDeviceAdminReceiver : DeviceAdminReceiver() {
    override fun onEnabled(context: Context, intent: Intent) {
        println("Device Admin Enabled")
        super.onEnabled(context, intent)
    }
}