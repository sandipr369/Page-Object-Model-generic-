package com.nopcommerce.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

public class BaseTest extends Utils {
@BeforeTest
public void openWindow(){
    openBrowser();

}

@AfterTest
    public void closewindow(){
    closeBrowser();
}
}