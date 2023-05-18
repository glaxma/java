package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Demo {
    WebDriver driver;
    @Test(priority=1)
    public void setUp() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.setCapability("se:recordVideo", "true");
        chromeOptions.setCapability("se:timeZone", "IST");
        driver = new RemoteWebDriver(new URL("http://20.106.163.173:4444/wd/hub"), chromeOptions);
        driver = new ChromeDriver(chromeOptions);
        try {
            driver.manage().window().maximize();
            driver.get("https://google.com");
            WebElement ele = driver.findElement(By.xpath("//textarea[@id='APjFqb']"));
            ele.sendKeys("selenium");
            driver.findElement(By.xpath("//body/div[1]/div[3]/form[1]/div[1]/div[1]/div[4]/center[1]/input[1]")).click();
        } finally {
            driver.quit();
        }
    }
    @Test(priority=2)
    public void faceBook() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.setCapability("se:recordVideo", "true");
        chromeOptions.setCapability("se:timeZone", "IST");
        driver = new RemoteWebDriver(new URL("http://20.106.163.173:4444/wd/hub"), chromeOptions);
        driver = new ChromeDriver(chromeOptions);
        try {
            driver.manage().window().maximize();
            driver.get("https://www.facebook.com/");
        } finally {
            driver.quit();
        }
    }
    @Test(priority=3)
    public void gmail() throws MalformedURLException {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        chromeOptions.setCapability("se:recordVideo", "true");
        chromeOptions.setCapability("se:timeZone", "IST");
        driver = new RemoteWebDriver(new URL("http://20.106.163.173:4444/wd/hub"), chromeOptions);
        driver = new ChromeDriver(chromeOptions);
        try {
            driver.manage().window().maximize();
            driver.get("https://accounts.google.com/");
        } finally {
            driver.quit();
        }
    }
}
