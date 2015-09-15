package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class h_water_c_z_mlCleanUp extends ActivityInstrumentationTestCase2 {
    private Solo solo;

    private static final String LAUNCHER_ACTIVITY_FULL_CLASSNAME = "com.fitbit.onboarding.landing.LandingActivity_";

    private static Class<?> launcherActivityClass;
    static{
        try {
            launcherActivityClass = Class.forName(LAUNCHER_ACTIVITY_FULL_CLASSNAME);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

    @SuppressWarnings("unchecked")
    public h_water_c_z_mlCleanUp() throws ClassNotFoundException {
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

        solo.clickOnText(java.util.regex.Pattern.quote("ml"));
        //Wait for activity: 'com.fitbit.home.ui.DetailActivity_'
        assertTrue("WaterListActivity is not found!", solo.waitForActivity("WaterListActivity"));
        //Sleep
        solo.sleep(500);

        solo.clickOnText(java.util.regex.Pattern.quote("Today"));
        //Sleep
        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("499"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("730"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("1,014"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("236"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("20"));

        solo.clickOnView(solo.getView(android.R.id.button1));




    }
}
