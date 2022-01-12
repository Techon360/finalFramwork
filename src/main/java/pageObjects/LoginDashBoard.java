package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginDashBoard {

	WebDriver driver;

	public LoginDashBoard(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	// select company or hospital name

	@FindBy(xpath = "//select[@id='mat-input-3']")
	WebElement company;

	// select billing company

	@FindBy(xpath = "//select[@id='mat-input-4']")
	WebElement billingcompany;

	// select bill company name as a string
	public String billcompanyforbill() {
		Select s = new Select(billingcompany);
		return s.getFirstSelectedOption().getText();

	}

	// select branch
	@FindBy(xpath = "//select[@id='mat-input-5']")
	WebElement branch;

	// select branch name as a string
	public String branchforbill() {
		Select s = new Select(branch);
		return s.getFirstSelectedOption().getText();

	}

	// select fin year
	@FindBy(xpath = "//select[@id='mat-input-6']")
	WebElement finyear;

	// select fin year as a string
	public String finyearforbill() {
		Select s = new Select(finyear);
		return s.getFirstSelectedOption().getText();

	}

	// select role
	@FindBy(xpath = "//select[@id='mat-input-7']")
	WebElement role;

	// select room no
	@FindBy(xpath = "//select[@id='mat-input-8']")
	WebElement roomno;

	// dashboard_button
	@FindBy(xpath = "//button[text()=' Dashboard ']")
	public WebElement btnDashboard;

	// click dashboard button

	public void clickdashboardbtn() {
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Dashboard ']")));
		btnDashboard.click();
	}

	// dashboard is displayed
	public boolean dashboardBtndisplayed() {
		
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[text()=' Dashboard ']")));
		return btnDashboard.isDisplayed();
	}

	// change password
	@FindBy(xpath = "//button[contains(text(),'Change Password')]")
	WebElement changepassword;
	public void clickchangepassword() {
		changepassword.click();
	}
	

	// click change

}
