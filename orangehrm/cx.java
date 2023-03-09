package com.framework.orangehrm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class cx {

	private WebDriver driver;

	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(3));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@AfterMethod
	public void tearDown() {
		// Quit driver
		driver.quit();
	}
	@Test
	public void verifyLoginPageResponsive() {
		// Navigate to OrangeHRM login page


		// Get the login form element
		WebElement loginForm = driver.findElement(By.id("frmLogin"));

		// Verify that the login form is displayed
		Assert.assertTrue(loginForm.isDisplayed(), "Login form is not displayed on the page.");

		// Verify that the login form is responsive
		int loginFormWidth = loginForm.getSize().getWidth();
		Assert.assertTrue(loginFormWidth >= 300 && loginFormWidth <= 500, "Login form width is not within expected range.");

		// Verify that the login form logo is responsive
		WebElement loginFormLogo = driver.findElement(By.xpath("//img[@alt='OrangeHRM']"));
		int loginFormLogoWidth = loginFormLogo.getSize().getWidth();
		Assert.assertTrue(loginFormLogoWidth >= 100 && loginFormLogoWidth <= 200, "Login form logo width is not within expected range.");
	}
}

