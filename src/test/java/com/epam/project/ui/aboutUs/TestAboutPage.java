package com.epam.project.ui.aboutUs;

import com.epam.project.framework.ui.screens.AboutUsScreen;
import com.epam.project.framework.ui.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.epam.project.framework.properties.EnvironmentProperty.getEnv;

public class TestAboutPage {
    private final HomeScreen homeScreen = new HomeScreen();
    private AboutUsScreen aboutUsScreen;

    @BeforeTest
    public void setUp() {
        homeScreen.openPage(getEnv());
        homeScreen.clickToggleThemeButton();
    }

    // Add test methods here
    @Test
    public void testAboutPageIsDisplayed() {
        aboutUsScreen = homeScreen.navigateToAboutPage();
        Assert.assertTrue(aboutUsScreen.isScreenLoaded(), "About page is not loaded");
    }
}
