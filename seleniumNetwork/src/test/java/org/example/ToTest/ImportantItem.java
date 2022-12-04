package org.example.ToTest;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ImportantItem {
    protected static WebDriver driver;

    static ChromeOptions chromeOptions;


    @BeforeClass
    public static void yükle(){
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver(chromeOptions());

    }
    public static ChromeOptions chromeOptions() {
        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--disable-notifications");
        chromeOptions.addArguments("--start-fullscreen");
        return chromeOptions;
    }
    @AfterClass
    public static void Subtract(){
        driver.quit();
    }
}
