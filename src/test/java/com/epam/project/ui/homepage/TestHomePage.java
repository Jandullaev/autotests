package com.epam.project.ui.homepage;

import com.epam.project.framework.ui.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static com.epam.project.framework.properties.EnvironmentProperty.getEnv;


public class TestHomePage {
     HomeScreen homeScreen = new HomeScreen();

    @BeforeTest
    public void setUp() {
        homeScreen.openPage(getEnv());
    }

    @Test
    public void testHomePageIsDisplayed() {
        Assert.assertTrue(homeScreen.isScreenLoaded(), "Home page is not loaded");
    }

    @Test
    public void verifyButtonIsDisplayed() {
        Assert.assertTrue(homeScreen.isStartOrderButtonDisplayed(), "Button is not displayed");
    }
}
