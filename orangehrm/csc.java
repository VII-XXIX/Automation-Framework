package com.framework.orangehrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class csc {

    public static void main(String[] args) {
        // Create two WebDriver instances for Chrome and Firefox
        WebDriver chromeDriver = new ChromeDriver();
        chromeDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
        WebDriver firefoxDriver = new FirefoxDriver();
        firefoxDriver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
        
        // Navigate to the OrangeHRM login page in both browsers
        chromeDriver.get("https://opensource-demo.orangehrmlive.com/");
        firefoxDriver.get("https://opensource-demo.orangehrmlive.com/");
        
        // Enter login credentials in both browsers
        chromeDriver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        chromeDriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        chromeDriver.findElement(By.xpath("//button")).click();
        
        firefoxDriver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
        firefoxDriver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
        firefoxDriver.findElement(By.xpath("//button")).click();
        
        // Verify if the user is logged in successfully in both browsers
        if (chromeDriver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard") &&
            firefoxDriver.getCurrentUrl().equals("https://opensource-demo.orangehrmlive.com/index.php/dashboard")) {
            System.out.println("User logged in successfully in both browsers.");
        } else {
            System.out.println("User could not log in successfully in both browsers.");
        }
        
        // Close the browsers
        chromeDriver.quit();
        firefoxDriver.quit();
    }

}

