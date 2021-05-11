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
public class ViewOrderSignout {
	WebDriver driver;
	@BeforeTest
	@Given("^User is on  asianpaints home page$")
	public void user_is_on_asianpaints_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.get("https://www.asianpaints.com/");
	 
	    driver.manage().window().maximize();
	}
@Test(priority=1)
	@When("^User Navigate to Profile button$")
	public void user_Navigate_to_Profile_button() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickunderstand();
		Thread.sleep(6000);
		//driver.switchTo().alert().accept();		 
		Thread.sleep(5000);
		orderpage.clickprofile();
	}

	@When("^Click on login button$")
	public void click_on_login_button() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 Thread.sleep(3000);
			orderpage.clickloginbtn();
			Thread.sleep(2000);
	}
	@Test(priority=2)
	@When("^Enter mobile number and otp$")
	public void enter_mobile_number_and_otp() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.enterno("8610425963");
		 orderpage.numbersubmit();
		 Thread.sleep(20000);
		 orderpage.otpsubmit();
		 Thread.sleep(10000);
	}
	@Test(priority=3)
	@When("^Click on profile button$")
	public void click_on_profile_button() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickprofile1();
	}
	@Test(priority=4)
	@When("^Click on my profile icon$")
	public void click_on_my_profile_icon() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickmyprofile();
		 Thread.sleep(3000);
	}
	@Test(priority=5)
	@When("^Click on my order icon$")
	public void click_on_my_order_icon() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickmyorder();
	}
	@Test(priority=6)
	@When("^Click on signout$")
	public void click_on_signout() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickprofile2();
		   Thread.sleep(2000);
		   orderpage.signout();
		   Thread.sleep(3000);
		   orderpage.clickmyprofile1();
		   Thread.sleep(2000);
		   orderpage.clickedit();
	}
@AfterTest
	@Then("^User should not see profile details$")
	public void user_should_not_see_profile_details() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		String actual = driver.findElement(By.name("profile_fname")).getAttribute("value");
	    String expected="";
	    Assert.assertEquals(actual, expected);
		  driver.close();
	}
}
