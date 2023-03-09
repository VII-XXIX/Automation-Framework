package com.framework.orangehrm;

import static org.testng.Assert.assertTrue;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class POM_For_OrangeHRm extends Baseclass
{
	//DECLARTION
	@FindBy(name="username")
	private WebElement UsernameBox;
	@FindBy(name="password")
	private WebElement Passwordbox;
	@FindBy(xpath="//button[@type='submit']")
	private WebElement Loginbutton;
	@FindBy(xpath="//i[@class='oxd-icon bi-caret-down-fill oxd-userdropdown-icon']")
	private WebElement Logoutarrow;
	@FindBy(xpath="//a[.='Logout']")
	private WebElement Logoutbutton;
	@FindBy(xpath = "(//img)[1]")
	private WebElement OrangeBanner;
	@FindBy(xpath = "//p[.='Forgot your password? ']")
	private WebElement Forgotpasswordbutton;
	@FindBy(name = "username")
	public WebElement fpsend;
	@FindBy(xpath = "(//a[@target='_blank'])[1]")
	public WebElement linkicon;
	@FindBy(xpath = "(//button[@aria-label='Dismiss'])[12]")
	public WebElement linkdiss;
	@FindBy(xpath = "/html/body/div[4]/div/div/section/button")
	public WebElement linkcoss;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[2]")
	public WebElement fbicon;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[3]")
	public WebElement twittericon;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[1]/a[4]")
	public WebElement youtubeicon;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[3]/div[2]/p[2]/a")
	public WebElement orangeINC;
	@FindBy(xpath = "//*[@id=\"app\"]/div[1]/div/div[2]/img")
	public WebElement orangelogoooooo;
	@FindBy(xpath="//h5")
	public WebElement LOGIN_TEXT;
	@FindBy(xpath = "//div[@class='orangehrm-login-layout']")
	public WebElement colororange;
	//INTIALIZATION
	public POM_For_OrangeHRm (WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//Screenshot
	public void scnshot() throws Exception 	{
		TakesScreenshot scrsht = (TakesScreenshot)driver;
		File source = scrsht.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/Iamge1.png");
		FileUtils.copyFileToDirectory(source, target);
	}
	//UTILIZATION
	public void LP003_Login() throws InterruptedException {
		String actual=OrangeBanner.getText();
		String Expected="OrangeHRM";
		Thread.sleep(4000);
		assertTrue(true, actual);
		Reporter.log("Branding logo is visible ",true);
	}
	public void LP004_Login() {
		UsernameBox.sendKeys("adminn");
		Passwordbox.sendKeys("admin123");
		Loginbutton.click();
	}
	public void LP005_Login() {
		UsernameBox.sendKeys("Admin");
		Passwordbox.sendKeys("admin123");
		Loginbutton.click();
	}
	public void LP006_Login() {
		UsernameBox.sendKeys("adminnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn");
		Passwordbox.sendKeys("admin1234");
		Loginbutton.click();
	}
	public void LP007_Login() {
		UsernameBox.sendKeys("Adminn");
		Passwordbox.sendKeys("admin1234");
		Loginbutton.click();
	}
	public void LP008_Login() {
		UsernameBox.sendKeys(" ");
		Passwordbox.sendKeys(" ");
		Loginbutton.click();
	}
	public void LP009_Login() {
		UsernameBox.sendKeys("");
		Passwordbox.sendKeys("admin123");
		Loginbutton.click();
	}
	public void LP010_Login() {
		UsernameBox.sendKeys("Admin");
		Passwordbox.sendKeys(" ");
		Loginbutton.click();
	}
	public void LP011_Login() {
		UsernameBox.sendKeys(" ");
		Passwordbox.sendKeys("aadmin123");
		Loginbutton.click();
	}
	public void LP012_Login() {
		UsernameBox.sendKeys("aadmin");
		Passwordbox.sendKeys(" ");
		Loginbutton.click();
	}
	public void LP013_Login() {
		Forgotpasswordbutton.click();
	}
	public void LP014_Login() {
		linkicon.click();
		linkcoss.click();
	}
	public void LP015_Login() {
		fbicon.click();
	}
	public void LP016_Login() {
		twittericon.click();
	}
	public void LP017_Login() {
		youtubeicon.click();
	}
	public void LP018_Login() {
		orangeINC.click();
	}
	public void setlogut() {
		Logoutarrow.click();
		Logoutbutton.click();
	}
}
