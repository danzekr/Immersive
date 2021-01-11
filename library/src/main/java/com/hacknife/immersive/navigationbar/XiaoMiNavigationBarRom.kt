package com.hacknife.immersive.navigationbar

import android.app.Activity
import android.os.Build
import android.provider.Settings
import android.util.Log
import androidx.annotation.RequiresApi
import com.hacknife.immersive.NavigationBarRom
import com.hacknife.immersive.TAG

/**
 * author : hacknife
 * e-mail : hacknife@outlook.com
 * time   : 2019/8/5
 * desc   : 小米 MiuiRom
 * version: 1.0
 */
class XiaoMiNavigationBarRom : NavigationBarRom {
    companion object {
        const val CONTENT_KEY = "force_fsg_nav_bar"
    }

    init {
        Log.v(TAG, "XiaoMiNavigationBarRom")
    }

    @RequiresApi(Build.VERSION_CODES.KITKAT)
    override fun navigationBarExist(activity: Activity): Boolean {
        return Settings.Global.getInt(activity.contentResolver, CONTENT_KEY, 0) == 0
    }

}