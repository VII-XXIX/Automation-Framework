package com.framework.orangehrm;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jjk3 {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		WebElement one = driver.findElement(By.xpath("//div[@class='orangehrm-login-layout-blob']"));
		String suero = one.getCssValue("--oxd-primary-one-color");
		System.out.println(suero+" ");
		driver.close();
	}
}