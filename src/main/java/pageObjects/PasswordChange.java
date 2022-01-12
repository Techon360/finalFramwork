package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PasswordChange {
	WebDriver driver;
	
	public PasswordChange(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@name='oldpassword']")
	WebElement oldpassword;
	
	@FindBy(xpath="//input[@name='newpassword']")
	WebElement newpassword;
	
	@FindBy(xpath="//input[@name='confirmpassword']")
	WebElement confirmpassword;
	
	@FindBy(xpath="//button[contains(text(),'Change Password')]")
	WebElement btn_changepassword;
	
	@FindBy(xpath="//button[contains(text(),' Back To Login')]")
	WebElement btn_back_login;
	
	public void oldpass(String enter_old_password)
	{
		oldpassword.sendKeys(enter_old_password);
	}
	
	public void newpass(String enter_new_password)
	{
		newpassword.sendKeys(enter_new_password);
	}
	
	public void confirmpass(String enter_confirm_password)
	{
		confirmpassword.sendKeys(enter_confirm_password);
	}
	
	public void changepass()
	{
		btn_changepassword.click();
	}
	public void backlogin()
	{
		btn_back_login.click();
	}
	
}
