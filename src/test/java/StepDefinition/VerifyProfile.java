package StepDefinition;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import POM.ViewOrderPOM;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
public class VerifyProfile {
	WebDriver driver;
	@BeforeTest
	@Given("^User is on asianpaint homepage$")
	public void user_is_on_asianpaint_homepage() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.get("https://www.asianpaints.com/");
	 
	    driver.manage().window().maximize();
	}
@Test(priority=1)
	@When("^User click on Profile icon$")
	public void user_click_on_Profile_icon() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickunderstand();
		Thread.sleep(6000);
		//driver.switchTo().alert().accept();		 
		Thread.sleep(5000);
		orderpage.clickprofile();
	}
@Test(priority=2)
	@When("^Click on login icon$")
	public void click_on_login_icon() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 Thread.sleep(3000);
			orderpage.clickloginbtn();
			Thread.sleep(2000);
	}
@Test(priority=3)
	@When("^Enter the phone number and otp$")
	public void enter_the_phone_number_and_otp() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.enterno("8610425963");
		 orderpage.numbersubmit();
		 Thread.sleep(20000);
		 orderpage.otpsubmit();
		 Thread.sleep(10000);
	}
@Test(priority=4)
	@When("^Click on profile$")
	public void click_on_profile() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickprofile1();
	}
@Test(priority=5)
	@When("^Click on my profile button$")
	public void click_on_my_profile_button() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickmyprofile();
		 Thread.sleep(3000);
	}
@Test(priority=6)
	@When("^Click on edit button$")
	public void click_on_edit_button() throws Throwable {
	   ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickedit();
		Thread.sleep(3000);
	}
@Test(priority=7)
	@When("^Enters ([(\\d+)@\\.\\.]*) and ([g\\.\\.@]*) and ([(\\d+)]*)$")  
	public void enters_FirstName_and_LastName_and_MobileName(String FirstName,String LastName,String MobileNumber) throws Throwable {
		driver.findElement(By.xpath("//input[@name='profile_fname']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='profile_fname']")).clear();
		    driver.findElement(By.xpath("//input[@name='profile_fname']")).sendKeys(FirstName);
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div/div[1]/div[2]/form/div/div/ul[1]/li[2]/input")).click();
		    driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div/div[1]/div[2]/form/div/div/ul[1]/li[2]/input")).sendKeys(LastName);
		    Thread.sleep(2000);
		    driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div/div[1]/div[2]/form/div/div/ul[1]/li[5]/input")).click();
		    driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div/div[1]/div[2]/form/div/div/ul[1]/li[5]/input")).sendKeys(MobileNumber);
		    Thread.sleep(2000);
	}
@Test(priority=8)
	@When("^click on update$")
	public void click_on_update() throws Throwable {
		 driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div/div[1]/div[2]/form/div/div/a")).click();
	}
@AfterTest
	@Then("^User should not able update it$")
	public void user_should_not_able_update_it() throws Throwable {
		 boolean data= driver.findElement(By.xpath("//*[@id=\"profile\"]/div/div/div[1]/div[2]/form/div/div/div/div/div[1]/span")).isDisplayed();
		 Assert.assertTrue(data);
			Thread.sleep(3000);
			driver.close();
	}
}
