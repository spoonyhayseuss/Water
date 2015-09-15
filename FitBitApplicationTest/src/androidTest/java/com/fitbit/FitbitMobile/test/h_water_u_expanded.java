package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class h_water_u_expanded extends ActivityInstrumentationTestCase2 {
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
    public h_water_u_expanded() throws ClassNotFoundException {
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
        //Sleep
        solo.sleep(1000);
        solo.clickOnText(java.util.regex.Pattern.quote("fl oz"));
        //Wait for activity: 'com.fitbit.home.ui.DetailActivity_'
        assertTrue("WaterListActivity is not found!", solo.waitForActivity("WaterListActivity"));
        //Click on No measurements
        solo.clickOnView(solo.getView("chart_wrapper"));
        //Sleep
        solo.sleep(1500);
        //Click on 1 Week
        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));
        solo.sleep(1000);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.RIGHT);
        solo.scrollToSide(Solo.RIGHT);
        //Click on 1 MONTH
        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));
        solo.sleep(1000);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.RIGHT);
        solo.scrollToSide(Solo.RIGHT);

        //Click on 3 MONTH
        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));
        solo.sleep(1000);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.RIGHT);
        solo.scrollToSide(Solo.RIGHT);

        //Click on 1 YEAR
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));
        solo.sleep(1000);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.LEFT);
        solo.scrollToSide(Solo.RIGHT);
        solo.scrollToSide(Solo.RIGHT);

        solo.clickOnText(java.util.regex.Pattern.quote("1 MONTH"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 WEEK"));
        solo.clickOnText(java.util.regex.Pattern.quote("1 YEAR"));
        solo.clickOnText(java.util.regex.Pattern.quote("3 MONTH"));

        //Click on ImageView
        solo.clickOnView(solo.getView("btn_shrink"));

    }
}
