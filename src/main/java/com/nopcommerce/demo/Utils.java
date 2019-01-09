package com.nopcommerce.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Utils extends BasePage {




    //click
    //clear
    //get
    // 10 reusable methods
    // all methods should be static

    //1. click element
    public static void click_element(By by) {
        driver.findElement(by).click();
    }

    //2. Enter text
    public static void enter_Text(By by, String text) {
        driver.findElement(by).sendKeys(text);
    }

    //3. Method to get text at perticular locator
    public static String getTextFromElement(By by) {
        return driver.findElement(by).getText();
    }

    //4. Date stamp
    public static String date_Stamp() {
        SimpleDateFormat date = new SimpleDateFormat("mmddyymmss");
        Date date1 = new Date();
        String date2 = date.format(date1);
        return date2; }

    //5 Implecity wait
    public static void implecity_Wait(int time, TimeUnit seconds) {
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS); }

    //6. Explicitywait
    public static void explicityWait_Until_Element_is_Clickable(By by, int timeSecond) {
        WebDriverWait wait = new WebDriverWait(driver, timeSecond);
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(by));
    }

    public static void ewaitUntilDisplay(By by, int timeSecond) {
        WebDriverWait wait = new WebDriverWait(driver, timeSecond);
        WebElement element =wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    //7 method to select an element by value
    public static void select_Element_by_value(By by, String value) {
        Select byValue = new Select(driver.findElement(by));
        byValue.selectByValue(value);
    }

    //8.method to select an element by visible text
    public static void select_Element_By_Visible_Text(By by, String text) {
        Select by_VisbleText = new Select(driver.findElement(by));
        by_VisbleText.selectByVisibleText(text);
    }

    //9.method to select an element by index
    public static void select_By_Index(By by, int index) {
        Select by_Index = new Select(driver.findElement(by));
        by_Index.selectByIndex(index);
    }

    //10. Get value by attribute
    public static void get_Value_by_Attribute(By by, String attribute) {
        driver.findElement(by).getAttribute(attribute);
    }

    public void openBrowser() {

        System.setProperty("webdriver.chrome.driver","src\\main\\java\\BrowserDriver\\chromedriver.exe");
        driver = new ChromeDriver();
        implecity_Wait(20,TimeUnit.SECONDS);
        driver.get("https://demo.nopcommerce.com/"); }


    public void closeBrowser() {
        driver.close();
    }
}







