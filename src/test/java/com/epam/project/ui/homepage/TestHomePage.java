package com.epam.project.ui.homepage;

import com.epam.project.framework.ui.screens.HomeScreen;
import com.epam.project.framework.ui.yopmailEmailGeneration.EmailGenerationPage;
import com.epam.project.model.User;
import com.epam.project.service.UserService;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;

import static com.epam.project.framework.properties.EnvironmentProperty.getEnv;

public class TestHomePage {
     HomeScreen homeScreen = new HomeScreen();
     EmailGenerationPage emailGenerationPage = new EmailGenerationPage();
    User user = UserService.withCredentialsFromProperty();

    @BeforeTest
    public void setUp() throws InterruptedException {
        homeScreen.openPage(getEnv());
        emailGenerationPage.login(user.getEmail());

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
