package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LandingPage {

	WebDriver driver;
	
	public LandingPage(WebDriver rdriver)

	{
		driver = rdriver;
		PageFactory.initElements(driver, this);
	}

	public void mainurl()
	{
		driver.get("http://20.193.244.164/WebNetramN/#/login");
	}
	
	// user name text field
	@CacheLookup
	@FindBy(xpath = "//input[@name='Username']")
	public WebElement txt_userName;

	// user name password field
	@CacheLookup
	@FindBy(xpath = "//input[@name='Password']")
	public WebElement txt_userpassword;

	// submit button
	@CacheLookup
	@FindBy(xpath = "//div[@class='row']/div/a")
	public WebElement btn_verify_yourself;

	// is verify button displayed
	public boolean verifybtndisplayed() {
		return btn_verify_yourself.isDisplayed();
	}

	// facebook button
	@CacheLookup
	@FindBy(xpath = "//a[@title='Facebook']")
	public WebElement btn_facebook;

	// Twitter button
	@CacheLookup
	@FindBy(xpath = "//a[@title='twitter']")
	public WebElement btn_twitter;

	// Youtube button
	@CacheLookup
	@FindBy(xpath = "//a[@title='youtube']")
	public WebElement btn_youtube;

	// linked in button
	@CacheLookup
	@FindBy(xpath = "//a[@title='linkedin']")
	public WebElement btn_linkedin;

	// instagram button
	@CacheLookup
	@FindBy(xpath = "//a[@title='instagram']")
	public WebElement btn_instagram;

	// Eli website

	@FindBy(xpath = "//p[contains(text(),'www.elihealthemr.com')]")
	public WebElement btn_elihealthemr;

	public void enterUserName(String username) throws InterruptedException {
		    WebDriverWait wait= new WebDriverWait(driver, 10);
		    wait.until(ExpectedConditions.visibilityOf(txt_userName));
			txt_userName.sendKeys(username);
			Thread.sleep(2);
	}	
	
	public void enterPassword(String password) throws InterruptedException {
		
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOf(txt_userpassword));
	    txt_userpassword.sendKeys(password);
	    Thread.sleep(2);
	    WebDriverWait wait1= new WebDriverWait(driver, 10);
	    wait1.until(ExpectedConditions.elementToBeClickable(btn_verify_yourself));
	    btn_verify_yourself.click();
    }	
		

	

	// facebook page tile verification
	public void verifyfacebooktitle() throws InterruptedException {
		String parentwindow = driver.getWindowHandle();
		btn_facebook.click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			String Facebooktitle = driver.getTitle();
			if (Facebooktitle.equals("www.facebook.com")) {
				Assert.assertTrue(true);
			}

			else
				Assert.assertFalse(false, "facebook title is not matched");
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);

	}

	// Twitter page title verificaiton
	public void verifyTwittertitle() throws InterruptedException {
		String parentwindow = driver.getWindowHandle();
		btn_twitter.click();
		Thread.sleep(3000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			String twittertitle = driver.getCurrentUrl();
			if (twittertitle.equals("https://twitter.com/eli_emr")) {
				Assert.assertTrue(true);
			}

			else
				Assert.assertFalse(false, "Twitter title is not matched");
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);

	}

	// Youtube page title verification
	public void verifyYoutubetitle() throws InterruptedException {
		String parentwindow = driver.getWindowHandle();
	btn_youtube.click();
		Thread.sleep(3000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			String youtubetitle = driver.getTitle();
			if (youtubetitle.equals("Netram - YouTube")) {
				Assert.assertTrue(true);
			}

			else
				Assert.assertFalse(false, "Youtube title is not matched");
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);

	}

	// LinkedIn page title verification
	public void verifyLinkedIntitle() throws InterruptedException {
		String parentwindow = driver.getWindowHandle();
		btn_linkedin.click();
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			String linkedintitle = driver.getTitle();
			if (linkedintitle.equals("Sign In | LinkedIn")) {
				Assert.assertTrue(true);
			}

			else
				Assert.assertFalse(false, "LinkedIn title is not matched");
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);

	}

	// Instagram page title verification
	public void verifyInstagramtitle() throws InterruptedException {
		String parentwindow = driver.getWindowHandle();
		btn_instagram.click();
		Thread.sleep(3000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			String Instagramtitle = driver.getTitle();
			if (Instagramtitle.equals("www.instagram.com")) {
				Assert.assertTrue(true);
			}

			else
				Assert.assertFalse(false, "Instagram title is not matched");
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);

	}

	// Elihealthemr website title verificaiotn

	public void verifyEliwebsitetitle() throws InterruptedException {
		String parentwindow = driver.getWindowHandle();
		btn_elihealthemr.click();
		Thread.sleep(3000);
		for (String winHandle : driver.getWindowHandles()) {
			driver.switchTo().window(winHandle);
			String Instagramtitle = driver.getTitle();
			if (Instagramtitle.equals("Hospital Management Software | Ophthalmology EMR Software")) {
				Assert.assertTrue(true);
			}

			else
				Assert.assertFalse(false, "Eli website title is not matched");
		}
		driver.close();
		Thread.sleep(2000);
		driver.switchTo().window(parentwindow);

	}
	
	public void waitForPageLoad()
	{
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//h4[text()='please wait we are configuring your details... ']")));
	}

}
