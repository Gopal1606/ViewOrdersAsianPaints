package StepDefinition;
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
public class ViewOrders {
	WebDriver driver;
	@BeforeTest
	@Given("^User is on home page$")
	public void user_is_on_home_page() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\selenium driver\\chromedriver.exe");
	     driver = new ChromeDriver();
	    driver.get("https://www.asianpaints.com/");
	 
	    driver.manage().window().maximize();
	}
    @Test(priority=1)
	@When("^User Navigate to Profile icon$")
	public void user_Navigate_to_Profile_icon() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickunderstand();
		Thread.sleep(6000);
		//driver.switchTo().alert().accept();		 
		Thread.sleep(5000);
		orderpage.clickprofile();
	}
    @Test(priority=2)
	@When("^Click on login$")
	public void click_on_login() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 Thread.sleep(3000);
			orderpage.clickloginbtn();
			Thread.sleep(2000);
	}
    @Test(priority=3)
	@When("^Enter phone number and otp$")
	public void enter_phone_number_and_otp() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.enterno("8610425963");
		 orderpage.numbersubmit();
		 Thread.sleep(20000);
		 orderpage.otpsubmit();
		 Thread.sleep(10000);
	}
    @Test(priority=4)
	@When("^Click on profile icon$")
	public void click_on_profile_icon() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		orderpage.clickprofile1();
	}
    @Test(priority=5)
	@When("^Click on my profile$")
	public void click_on_my_profile() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickmyprofile();
		 Thread.sleep(3000);
	}
    @Test(priority=6)
	@When("^Click on my order$")
	public void click_on_my_order() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 orderpage.clickmyorder();
	}
    @AfterTest
	@Then("^User should see the ordered items$")
	public void user_should_see_the_ordered_items() throws Throwable {
		ViewOrderPOM orderpage = PageFactory.initElements(driver,ViewOrderPOM.class);
		 boolean empty = orderpage.emptyorder(); 
			Assert.assertTrue(empty);
			Thread.sleep(3000);
			   
			   driver.close();
	}
}
