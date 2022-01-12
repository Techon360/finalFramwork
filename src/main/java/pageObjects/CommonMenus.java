package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMenus {
	
	WebDriver driver;
	
	public CommonMenus(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	
	// click Home menu
	
			@FindBy(xpath="//ul[@class='nav']//child::li[1]") public   WebElement menu_home;
			
			public void click_menu_home()
			{
				menu_home.click();
			}
			
	
	// click registration menu
	
		@FindBy(xpath="//p[text()='Registration']") public   WebElement menu_registration;
		
		public void click_menu_registration()
		{
			menu_registration.click();
		}
		
		// click reports menu
		
			@FindBy(xpath="//ul[@class='nav']//child::li[3]/a") public   WebElement menu_reports;
			
			public void click_menu_reports()
			{
				menu_reports.click();
			}
			
			// click Billing menu
			
				@FindBy(xpath="//p[text()='Billing']") public   WebElement menu_billing;
				
				public void click_menu_billing()
				{
					menu_billing.click();
				}
				
				// click Receipt menu
				
				@FindBy(xpath="//ul[@class='nav']//child::li[5]") public   WebElement menu_recipt;
				
				public void click_menu_recipt()
				{
					menu_recipt.click();
				}
				
              // click OPD visit menu
				
				@FindBy(xpath="//p[text()='Opd Visit']") public   WebElement menu_OPD;
				
				public void click_menu_OPD()
				{
					WebDriverWait wait= new WebDriverWait(driver, 10);
					wait.until(ExpectedConditions.elementToBeClickable(menu_OPD));
					menu_OPD.click();
				}
				
              // click OPD visit menu
				
				@FindBy(xpath="//p[text()='Appointments']") public   WebElement menu_appointment;
				
				public void click_menu_appointment()
				{
					menu_appointment.click();
				}
	
	

}
