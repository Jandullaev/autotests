package com.epam.project.ui.products;

import com.epam.project.framework.ui.screens.HomeScreen;
import com.epam.project.framework.ui.screens.ProductScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static com.epam.project.framework.properties.EnvironmentProperty.getEnv;

public class TestProductsPage {
    HomeScreen homeScreen = new HomeScreen();

    @BeforeTest
    public void setUp() {
        homeScreen.openPage(getEnv());
    }

    @Test
    public void testHomePageIsDisplayed() {
        ProductScreen productScreen = homeScreen.navigateToProductsPage();
        Assert.assertTrue(productScreen.isScreenLoaded(), "Home page is not loaded");
    }
}
