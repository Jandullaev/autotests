package com.epam.project.framework.ui.screens;

import com.epam.project.framework.ui.AbstractScreen;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class ProductScreen extends AbstractScreen {

    @FindBy(xpath = "//img[@Class='object-cover']")
    private WebElement productPage;

    public ProductScreen() {
        super();
        PageFactory.initElements(driver, this);
    }

    @Override
    public boolean isScreenLoaded() {
        return productPage.isDisplayed();
    }
}
