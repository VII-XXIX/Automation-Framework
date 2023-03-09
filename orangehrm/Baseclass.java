package com.framework.orangehrm;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Properties;
import java.util.Set;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
public class Baseclass {

	WebDriver driver;
	FileInputStream fis;
	Properties prop;
	String URL;
	public POM_For_OrangeHRm pmo;
	String gt;
	String FPSNDKYS;
	ArrayList<String> al;
	WebElement logo;
	Set<String> multi;
	public SoftAssert softass; 

	@BeforeMethod
	public void url_DD() throws Exception {
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofMinutes(2));
		softass = new SoftAssert();
		//***********************************************************************************************
		fis= new FileInputStream("./data/orange");
		prop= new Properties();
		prop.load(fis);
		URL = prop.getProperty("url");
		driver.get(URL);	
	}
	@Test
	public void TC01() throws Exception
	{
		driver.get(URL);
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods = "TC01")
	public void TC02() throws Exception
	{
		driver.get(URL);
		Thread.sleep(3000);
		gt=driver.getTitle();
		Reporter.log("Title for the Login Page is ----> "+gt,true);
	}
	@Test(dependsOnMethods = "TC02")
	public void TC03()throws Exception 
	{
		driver.get(URL);
		Thread.sleep(4000);
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP003_Login();
	}
	@Test(dependsOnMethods = "TC03")
	public void TC04() throws Exception
	{
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP004_Login();
		Thread.sleep(4000);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String filename = time.toString().replace(" "," -- ").replace(":", "");
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File("./Screenshot/"+filename+".png"));
	}
	@Test(dependsOnMethods = "TC04")
	public void TC05() throws Exception
	{
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP005_Login();
		Thread.sleep(3000);
		pmo.setlogut();
		Thread.sleep(3000);
	}
	@Test(dependsOnMethods = "TC05")
	public void TC06() throws Exception
	{
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP006_Login();
		Thread.sleep(3000);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String filename = time.toString().replace(" "," -- ").replace(":", "");
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File("./Screenshot/"+filename+".png"));
	}
	@Test(dependsOnMethods = "TC06")
	public void TC07() throws Exception
	{
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP007_Login();
		Thread.sleep(3000);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String filename = time.toString().replace(" "," -- ").replace(":", "");
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File("./Screenshot/"+filename+".png"));
	}
	@Test(dependsOnMethods = "TC07")
	public void TC08() throws Exception
	{
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP008_Login();
		Thread.sleep(3000);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String filename = time.toString().replace(" "," -- ").replace(":", "");
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File("./Screenshot/"+filename+".png"));
	}
	@Test(dependsOnMethods = "TC08")
	public void TC09() throws Exception
	{
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP009_Login();
		Thread.sleep(3000);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String filename = time.toString().replace(" "," -- ").replace(":", "");
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File("./Screenshot/"+filename+".png"));
	}
	@Test(dependsOnMethods = "TC09")
	public void TC010() throws Exception
	{
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP010_Login();
		Thread.sleep(3000);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String filename = time.toString().replace(" "," -- ").replace(":", "");
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File("./Screenshot/"+filename+".png"));
	}
	@Test(dependsOnMethods = "TC010")
	public void TC011() throws Exception
	{
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP011_Login();
		Thread.sleep(4000);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String filename = time.toString().replace(" "," -- ").replace(":", "");
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File("./Screenshot/"+filename+".png"));
	}
	@Test(dependsOnMethods = "TC011")
	public void TC012() throws Exception
	{
		pmo = new POM_For_OrangeHRm(driver);
		pmo.LP012_Login();
		Thread.sleep(4000);
		Calendar cal = Calendar.getInstance();
		Date time = cal.getTime();
		String filename = time.toString().replace(" "," -- ").replace(":", "");
		File sourcefile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(sourcefile, new File("./Screenshot/"+filename+".png"));
	}
	@Test(dependsOnMethods = "TC012")
	public void TC013() throws Exception
	{
		pmo= new POM_For_OrangeHRm(driver);
		pmo.LP013_Login();
		FPSNDKYS=prop.getProperty("fpsnd");
		Thread.sleep(3000);
		pmo.fpsend.sendKeys(FPSNDKYS);
		Thread.sleep(3000);
	}
	@Test(priority = -1)
	public void TC014() throws Exception
	{
		pmo=new POM_For_OrangeHRm(driver);
		Thread.sleep(2000);
		pmo.linkicon.click();
//		String expectedresult2="linkedin.com/company/orangehrm";
//		String expectdresult1="https://www.linkedin.com/authwall?trk=gf&trkInfo=AQFxr6iOz2fpLwAAAYahS7ngK51uyJsmdyxL3DzOOFW2hSHcD7wv7C525aEBIo8kMav8wCcw0RB9CHGmoMPLT2uf-Smti6uDkE6lmdEIetqJO6-GZZZkrgNxVUTpgIMBvXHu1Fk=&original_referer=https://www.linkedin.com/company/orangehrm/mycompany/&sessionRedirect=https%3A%2F%2Fwww.linkedin.com%2Fcompany%2Forangehrm";
		multi = driver.getWindowHandles();
		al=new ArrayList<String>(multi);
		driver.switchTo().window(al.get(1));
		pmo.linkcoss.click();
		Thread.sleep(2000);
	}
	@Test (dependsOnMethods = "TC014")
	public void TC015() throws Exception {
		pmo=new POM_For_OrangeHRm(driver);
		pmo.LP015_Login();
		Thread.sleep(6000);
	}
	@Test(dependsOnMethods = "TC015")
	public void TC016() throws Exception {
		pmo=new POM_For_OrangeHRm(driver);
		pmo.LP016_Login();
		Thread.sleep(9000);
	}
	@Test(dependsOnMethods = "TC016")
	public void TC017() throws Exception {
		pmo=new POM_For_OrangeHRm(driver);
		pmo.LP017_Login();
		Thread.sleep(9000);
	}
	@Test(dependsOnMethods = "TC017")
	public void TC018() throws Exception {
		pmo=new POM_For_OrangeHRm(driver);
		pmo.LP018_Login();
		Thread.sleep(7000);
	}
	@Test(dependsOnMethods = "TC018")
	public void TC019() throws Exception {
		pmo=new POM_For_OrangeHRm(driver);
	}
	@Test(dependsOnMethods = "TC019")
	public void TC020() {
		pmo=new POM_For_OrangeHRm(driver);
		boolean acres = pmo.orangelogoooooo.isDisplayed();
		if (acres==true) {
			System.out.println("OrangeHRM image is displayed on the login page.");
		} else {
			System.out.println("OrangeHRM image is not displayed on the login page.");
			Assert.fail("Ithu fail image ila");}}
	@Test(dependsOnMethods = "TC020")
	public void TC021() {
		pmo=new POM_For_OrangeHRm(driver);
		logo = pmo.colororange;
		String borderColor = logo.getCssValue("background-color");
		String color=org.openqa.selenium.support.Color.fromString(borderColor).asHex();
		if (color.equals("#ff7b1d")) {
			System.out.println("The user is able to view the ORANGE COLOR in Login Page");
		} else 
			System.out.println("The user is not able to view the ORANGE COLOR in Login Page");
	}		
	@Test(dependsOnMethods = "TC021")
	public void TC022() {
		pmo=new POM_For_OrangeHRm(driver);
		String ExpectedResult = "Login";
		String RAJUBHAI = pmo.LOGIN_TEXT.getText();
		if(RAJUBHAI.equals(ExpectedResult))
			System.out.println("Login Text is correct");
		else 
			System.out.println("Login Text is not correct");
	}
	@AfterMethod
	public void close() {
		driver.quit();
		softass.assertAll();
	

	}
}