package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class h_water_b_z_ozCleanUp extends ActivityInstrumentationTestCase2 {
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
    public h_water_b_z_ozCleanUp() throws ClassNotFoundException {
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

        solo.clickOnText(java.util.regex.Pattern.quote("fl oz"));
        //Wait for activity: 'com.fitbit.home.ui.DetailActivity_'
        assertTrue("WaterListActivity is not found!", solo.waitForActivity("WaterListActivity"));
        //Sleep
        solo.sleep(500);

        solo.clickOnText(java.util.regex.Pattern.quote("Today"));
        //Sleep
        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("8"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("16.9"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("24.7"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("34.3"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("28"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("0.1"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("999,999"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("32.7"));

        solo.clickOnView(solo.getView(android.R.id.button1));
        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("51.2"));

        solo.clickOnView(solo.getView(android.R.id.button1));

        solo.sleep(500);
        solo.clickLongOnText(java.util.regex.Pattern.quote("33"));

        solo.clickOnView(solo.getView(android.R.id.button1));



    }
}
