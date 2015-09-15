package com.fitbit.FitbitMobile.test;

import android.test.ActivityInstrumentationTestCase2;
import android.test.suitebuilder.annotation.SmallTest;

import com.robotium.solo.Solo;


@SuppressWarnings("rawtypes")
public class h_water_t_add2switchUnit extends ActivityInstrumentationTestCase2 {
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
    public h_water_t_add2switchUnit() throws ClassNotFoundException {
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
        //Sleep
        solo.sleep(1000);
        solo.clickOnView(solo.getView("add_water"));
        //solo.clickOnText(java.util.regex.Pattern.quote("8 fl oz"));
        solo.clickOnView(solo.getView("quick_add_large_panel"));
        //solo.clickOnText(java.util.regex.Pattern.quote("16.9 fl oz"));
        solo.clickOnView(solo.getView("quick_add_huge_panel"));
        //Sleep
        solo.sleep(1000);

        solo.clickOnView(solo.getView("spinner"));

        //Click on cup
        solo.clickOnView(solo.getView(android.R.id.text1, 1));
        solo.sleep(1000);

        solo.clickOnView(solo.getView("spinner"));

        //Click on cup
        solo.clickOnView(solo.getView(android.R.id.text1, 2));
        solo.sleep(1000);


        //Click on cup
        solo.clickOnView(solo.getView(android.R.id.text1));
        solo.sleep(1000);




    }
}
