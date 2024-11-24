package com.epam.project.framework.ui.webdriver;

import com.epam.project.framework.loging.Log;
import com.epam.project.utils.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.HashMap;

import org.openqa.selenium.safari.SafariDriver;

import static com.epam.project.framework.ui.AbstractScreen.DEFAULT_TIME_OUT_FOR_PAGE_REFRESH;

public class WebDriverFactory {

    private WebDriverFactory() {
    }

    private static WebDriver driver;

    public static WebDriver getWebDriver() {
        if (null == driver) {
            WebDriverManager.chromedriver().setup();
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(options);

            driver.manage().window().maximize();
        }
        return driver;
    }
}
