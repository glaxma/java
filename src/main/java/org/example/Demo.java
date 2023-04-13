package org.example;


import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Demo {
    @Test
    public void setUp() {
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        WebDriver driver = new ChromeDriver(chromeOptions);
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

}
