package com.framework.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class jik2 {

	public static void main(String[] args) throws Exception {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		WebElement loginPanel = driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div"));
		String bgColor = loginPanel.getCssValue("--oxd-primary-one-color");
		System.out.println(bgColor);
		String actualres = "#FF7B1D";
		if(bgColor== actualres) {
			System.out.println("The background color is orange (#FF7B1D)");
		} else {
			System.out.println("The background color is not orange (#FF7B1D)");
		}
		driver.quit();

	}

}
