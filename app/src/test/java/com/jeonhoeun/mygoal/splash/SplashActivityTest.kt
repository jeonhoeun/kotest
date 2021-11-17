package com.jeonhoeun.mygoal.splash

import android.content.Intent
import android.widget.Button
import com.jeonhoeun.mygoal.R
import com.jeonhoeun.mygoal.home.HomeActivity
import junit.framework.Assert.assertEquals
import org.junit.Test
import org.junit.runner.RunWith
import org.robolectric.Robolectric
import org.robolectric.RobolectricTestRunner
import org.robolectric.Shadows
import org.robolectric.annotation.Config
import org.robolectric.shadows.ShadowIntent

@Config( sdk = [30])
@RunWith(RobolectricTestRunner::class)
class SplashActivityTest{

    @Test
    fun `홈으로를 누르면 메인액티비티가 실행되어야 함`(){
        val splashActivity = Robolectric.buildActivity(SplashActivity::class.java).create().get()

        val buttonGoToHome = splashActivity.findViewById<Button>(R.id.button_move_to_home)
        buttonGoToHome.performClick()

        val shadowActivity = Shadows.shadowOf(splashActivity)
        val intent : Intent = shadowActivity.nextStartedActivity
        val shadowIntent : ShadowIntent = Shadows.shadowOf(intent)

        assertEquals(HomeActivity::class.java.name, shadowIntent.intentClass.name)

    }
}