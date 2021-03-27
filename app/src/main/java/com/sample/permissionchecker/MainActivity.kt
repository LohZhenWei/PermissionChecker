package com.sample.permissionchecker

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    private val permissionManager = PermissionManager()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        permissionManager.register(this) {

        }
        permissionManager.checkAllRequiredPermission()
    }
}