package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewOrderPOM {
	WebDriver driver;
	@FindBy(xpath="//button[@class='ctaText i-understand-btn text-uppercase']")
	WebElement understand;
	@FindBy(css=".profileIcon")
	WebElement clickprofileicon;
	@FindBy(id="loginMobile")
	WebElement clicklogin;
	@FindBy(id="loginMobile")
	WebElement enternumber;
	@FindBy(xpath="//*[@id=\"validate-mobile\"]/div[2]/button")
	WebElement clicksubmit;
	@FindBy(xpath="//*[@id=\"loginOtp\"]")
	WebElement enterotp;
	@FindBy(xpath="//*[@id=\"validate-otp\"]/div[3]/button")
	WebElement Clickotpsubmit;
	@FindBy(css=".profileIcon-active")
	WebElement clickprofileicon1;
	@FindBy(linkText="My Profile")
	WebElement myprofile;
	@FindBy(xpath="//*[@id=\"as-smart-tab\"]/li[3]/a")
	WebElement myorder;
	@FindBy(xpath="//*[@id=\"emptyOrderTab\"]/div")
	WebElement empty;
	@FindBy(css=".profileIcon-active")
	WebElement clickprofileicon2;
	@FindBy(xpath="//*[@id=\"as-smart-tab\"]/li[1]/a")
	WebElement myprofile1;
	@FindBy(xpath="//*[@id=\"loginDropdown\"]/div/ul/li[3]/a/span")
	WebElement clicksignout;
	@FindBy(xpath="//*[@id=\"profile\"]/div/div/div[1]/div[2]/form/div/div/ul[1]/li[2]/input")
	WebElement verifyprofile;
	@FindBy(xpath="//*[@id=\"slick-slide02\"]/a/picture/img")
	WebElement homepage;
	@FindBy(xpath="//*[@id=\"editProfile\"]")
	WebElement edit;
	
	

	public ViewOrderPOM(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	public void clickunderstand()
	{
		understand.click();
	}
	public void clickprofile()
	{
		clickprofileicon.click();
	}
	public void clickloginbtn()
	{
		clicklogin.click();
	}
	public void enterno(String PN)
	{
		enternumber.sendKeys(PN);
	}
	public void numbersubmit()
	{
		clicksubmit.click();
	}
	public void otpenter(String OTP)
	{
		enterotp.sendKeys(OTP);
	}
	public void otpsubmit()
	{
		Clickotpsubmit.click();
	}
	public void clickprofile1()
	{
		clickprofileicon1.click();
	}
	
	public void clickmyprofile()
	{
		myprofile.click();
	}
	public void clickmyorder()
	{
		myorder.click();
	}
	public boolean emptyorder()
	{
		return empty.isDisplayed();
	}
	public void clickprofile2()
	{
		clickprofileicon2.click();
	}
	public void clickmyprofile1()
	{
		 myprofile1.click();
	}
	public void signout()
	{
		clicksignout.click();
	}
	public String verifymyprofile()
	{
		return verifyprofile.getText();
	}
	public void clickedit()
	{
		edit.click();
	}
	public boolean clickhomepage()
	{
		 return homepage.isDisplayed();
	}
}
