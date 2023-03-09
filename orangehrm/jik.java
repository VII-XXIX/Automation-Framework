package com.framework.orangehrm;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class jik {
	   public static void main(String[] args) {
	      WebDriver driver = new ChromeDriver();
	      driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	      driver.get("https://opensource-demo.orangehrmlive.com/");
	     WebElement orangeHRMImage = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[2]/img"));
	      if(orangeHRMImage.isDisplayed()) {
	         System.out.println("OrangeHRM image is displayed on the login page.");
	      } else {
	         System.out.println("OrangeHRM image is not displayed on the login page.");
	      }
	      // close the browser
	      driver.quit();
	   }
	}