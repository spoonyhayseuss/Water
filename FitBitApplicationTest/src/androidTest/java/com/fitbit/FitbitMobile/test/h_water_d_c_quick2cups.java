package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class h_water_d_c_quick2cups extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public h_water_d_c_quick2cups() throws ClassNotFoundException {
        super(launcherActivityClass);
    }

    public void setUp() throws Exception {
        super.setUp();
        solo = new Solo(getInstrumentation());
        getActivity();
    }

    @Override
    public void tearDown() throws Exception {
        solo.finishOpenedActivities();
        super.tearDown();
    }
    @SmallTest
    public void testRun() {
        //Wait for activity: 'com.fitbit.onboarding.landing.LandingActivity_'
        solo.waitForActivity("LandingActivity_", 2000);

        solo.clickOnText(java.util.regex.Pattern.quote("cup"));
        //Wait for activity: 'com.fitbit.home.ui.DetailActivity_'
        assertTrue("WaterListActivity is not found!", solo.waitForActivity("WaterListActivity"));
        //Sleep
        solo.sleep(500);
        solo.clickOnView(solo.getView("add_water"));
        solo.clickOnText(java.util.regex.Pattern.quote("+2.1"));
        //Sleep
        solo.sleep(500);
        solo.clickOnView(solo.getView("btn_save_water"));



    }
}
