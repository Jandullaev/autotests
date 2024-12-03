package com.epam.project.ui.products;

import com.epam.project.framework.ui.screens.HomeScreen;
import com.epam.project.framework.ui.screens.ProductScreen;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static com.epam.project.framework.properties.EnvironmentProperty.getEnv;

public class TestProductsPage {

    @BeforeTest
    public void setUp() {
        homeScreen.openPage(getEnv());
    }

    @Test
    public void testProductPageIsDisplayed() {
        ProductScreen productScreen = homeScreen.navigateToProductsPage();
        Assert.assertTrue(productScreen.isScreenLoaded(), "Product page is not loaded");
    }

    @DataProvider(name = "regionData")
    public Object[][] createRegionData() {
        return new Object[][] {
            {Region.UZBEKISTAN},
            {Region.KAZAKHSTAN},
            {Region.GEORGIA},
            {Region.UKRAINE},
            {Region.CHINA}
        };
    }

    @Test(dataProvider = "regionData")
    public void testRegionCurrency(Region region) {
        ProductScreen productScreen = homeScreen.navigateToProductsPage();
        productScreen.selectRegion(region.getName());
        Assert.assertEquals(productScreen.getProductPriceCurrency(), region.getCurrency(), "Currency does not match for " + region.getName());
    }
}
