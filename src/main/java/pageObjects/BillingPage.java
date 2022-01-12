package pageObjects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class BillingPage {

	public WebDriver driver;

	public BillingPage(WebDriver ldriver) {
		this.driver = ldriver;
		PageFactory.initElements(driver, this);
	}

	// current time in HH:MM
	public String systemcurrentime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm");
		Date date = new Date();
		return dateFormat.format(date);
	}

	// current time in HH:MM
	public String systemcurrendate() {
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

	// invoice details to fetch text field data

	@FindBy(xpath = "//div[@class='col-md-3 Invoice-Panel']")
	public WebElement billinvoicedetails;

	public String fetchinvoicedetails() {
		return billinvoicedetails.getText();
	}

	// Billing menu

	@FindBy(xpath = "//ul[@class='nav']//child::li[4]")
	public WebElement menu_billing;

	public void click_menu_billing() {
		menu_billing.click();
	}

	// patient ID F2 text field

	@FindBy(xpath = "//input[@name='patientid']")
	public WebElement Patient_Id;

	// click patient id
	public void clickOnPatietnId() {
		Patient_Id.click();
	}

	public void EnterPatietnId() {
		Patient_Id.sendKeys("880");
		Patient_Id.sendKeys(Keys.ENTER);
	}

	// Patient Name field

	@FindBy(xpath = "//div[@class='col-md-9']")
	public WebElement Patientdetails;

	// get patient name, age/sex and address
	public String getPatientName() {
		return Patientdetails.getText();
	}

	// bill search button

	@FindBy(xpath = "//mat-icon[contains(text(),'search')]")
	public WebElement Patientbillsearch;

	// Patient search button should be clickable

	public boolean patientbillsearchbutton() {
		return Patientbillsearch.isEnabled();
	}

	// Short registration button

	@FindBy(xpath = "//button[contains(text(),' Short-Registration')]")
	public WebElement Patientshortregistration;

	// Short registration button should be clickable

	public boolean Patientshortregistration() {
		return Patientshortregistration.isEnabled();
	}

	// Academic check box

	@FindBy(xpath = "//span[normalize-space()='Academic']//input[@type='checkbox']")
	public WebElement billingacademiccheckbox;

	// Academic should be unchecked
	public boolean billingacademiccheckbox() {
		return billingacademiccheckbox.isSelected();
	}

	// MLC check box

	@FindBy(xpath = "//span[normalize-space()='MLC']//input[@type='checkbox']")
	public WebElement billingmlccheckbox;

	// Academic should be unchecked
	public boolean billingmlccheckbox() {
		return billingmlccheckbox.isSelected();
	}

	// "Is header required" radio button
	@FindBy(xpath = "	//span[@class='mat-checkbox-inner-container']")
	public WebElement billingisheaderrequiredradiobox;

	// "Is header required" should be unchecked
	public boolean billingisheaderrequiredradiobox() {
		return billingisheaderrequiredradiobox.isSelected();
	}

	// "With Appointment" radio button

	@FindBy(xpath = "//mat-radio-button[@class='mat-radio-button example-radio-button mat-accent ng-star-inserted mat-radio-checked']/label[@class='mat-radio-label']/child::span/span[@class='mat-radio-outer-circle']")
	public WebElement billingwithappointmentradiobox;

	// "With Appointment" should be unchecked

	public boolean billingwithappointmentradiobox() {
		return billingwithappointmentradiobox.isSelected();
	}

	// "Walk-in" radio button

	@FindBy(xpath = "//*[@id=\"mat-radio-3-input\"]")
	public WebElement billingwalkinradiobox;

	// "Walk-in" radio button should be checked

	public boolean billingwalkinradiobox() {
		return billingwalkinradiobox.isSelected();
	}

	// billing company

	@FindBy(xpath = "//select[@data-placeholder='Billing Company']")
	public WebElement billingcomapny;

	public String billcom() {
		Select s = new Select(billingcomapny);
		return s.getFirstSelectedOption().getText();
	}

	// bili/invoice field
	@FindBy(xpath = "//input[@type=\"text\" and @class=\"form-control\"]")
	public WebElement bilinvoiceno;

	// get text
	public String getbillinvoicetext() {
		return bilinvoiceno.getAttribute("value");
	}

	// get text
	public int getbillinvoicetextclickable() {
		if (bilinvoiceno.isDisplayed() && bilinvoiceno.isEnabled()) {

		}
		return 0;
	}

	// Bill series name drop down
	@FindBy(xpath = "//*[@id='mat-select-value-3']/span/span")
	public WebElement billseriesnamedropdown;

	// get selected option value
	public String billseriesnamegettext() {

		return billseriesnamedropdown.getText();

	}

	// Bill Entry type drop down
	@FindBy(xpath = "//*[@id='mat-select-value-5']/span/span")

	public WebElement billentrytypedropdown;

	// get selected option value
	public String billentrytypegettext() {

		return billentrytypedropdown.getText();

	}

	// select category drop down
	@FindBy(xpath = "//*[@id='mat-select-value-7']/span/span")

	public WebElement selectcategorydropdown;

	// get selected option value
	public String selectcategorygettext() {

		return selectcategorydropdown.getText();

	}

	// select doctor name drop down
	@FindBy(xpath = "//*[@id=\"mat-select-value-9\"]")

	public WebElement selectdoctornamedropdown;

	// get selected option value
	public String selectdoctornamegettext() {

		return selectdoctornamedropdown.getText();

	}

	// select referred by drop down
	@FindBy(xpath = "//*[@id=\"mat-select-value-11\"]/span/span")

	public WebElement selectreferreddropdown;

	// get selected option value
	public String selectreferredgettext() {

		return selectreferreddropdown.getText();

	}

	// select party/TPA by drop down
	@FindBy(xpath = "//*[@id=\"mat-select-value-13\"]/span/span")

	public WebElement selectpartytpadropdown;

	// get selected option value
	public String selectpartytpagettext() {

		return selectpartytpadropdown.getText();

	}

	// select rate list drop down (hospital rate list)
	@FindBy(xpath = "//input[@placeholder='Rate List']")

	public WebElement selectratelistdropdown;

	// get selected option value
	public String selectratelistttext() {

		return selectratelistdropdown.getAttribute("ng-reflect-model");

	}

	// select rate type drop down 
	@FindBy(xpath = "//*[@id=\"mat-select-value-15\"]/span/span")

	public WebElement selectratetyedropdown;

	// get selected option value
	public String selectratetypetext() {

		return selectratetyedropdown.getText();

	}

	// select free or discount type drop down
	@FindBy(xpath = "//input[@placeholder='Free Discount Reason']")

	public WebElement selectfreeordiscountdropdown;

	// get selected option value
	public String selectfreeordiscounttext() {

		return selectfreeordiscountdropdown.getText();

	}

	// billing remarks drop down
	@FindBy(xpath = "	//input[@placeholder='Billing Remarks']")

	public WebElement selectbillingremarksdropdown;

	// get selected option value
	public String selectbillingremarkstext() {

		return selectbillingremarksdropdown.getText();

	}

	// party/insurance details patient

	@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div[2]/app-billing/div[1]/div/div/div/div[2]/div/div/table/tr[2]/td[2]")

	public WebElement billingpatientamout;

	// get selected option value
	public int billingpatientamoutgettext() {

		String a= billingpatientamout.getText();
		int b=Integer.parseInt(a);
		return b;

	}
	
	// party/insurance details patient

		@FindBy(xpath = "/html/body/app-root/app-admin-layout/div/div[2]/app-billing/div[1]/div/div/div/div[2]/div/div/table/tr[3]/td[2]")

		public WebElement billinginsuranceamout;

		// get selected option value
		public int billinginsuranceamoutgettext() {

			String a=billinginsuranceamout.getText();
			int b=Integer.parseInt(a);
			return b;

		}
		
//---------------------Payment Details-------------------------------------------------------------------
		
		//total amount field
	
		@FindBy(xpath = "//div[@class='card col-md-2 Right-sidebar']//tr[2]//td[2]")

		public WebElement billingtotalamount;

		// get selected option value
		public int billingtotalamountgettext() {

			String a= billingtotalamount.getText();
			int b=Integer.parseInt(a);
			return b;

		}
		
		//service charge field
		
		@FindBy(xpath = "//div[@class='card col-md-2 Right-sidebar']//tr[3]//td[2]")

		public WebElement billingservicecharge;

		// get selected option value
		public int billingservicechargegettext() {

			String a= billingservicecharge.getText();
			int b=Integer.parseInt(a);
			return b;

		}
		
	//less discount field
		
		@FindBy(xpath = "//div[@class='card col-md-2 Right-sidebar']//tr[4]//td[2]//input")

		public WebElement billinglessdiscount;

		// get selected option value
		public int billinglessdiscountgettext() {

			String a= billinglessdiscount.getAttribute("value");
			int b=Integer.parseInt(a);
			return b;

		}
		
	//Net Bill Amount  field
		
		@FindBy(xpath = "//div[@class='card col-md-2 Right-sidebar']//tr[5]//td[2]")

		public WebElement billingnetbillamount;

		// get selected option value
		public int billingnetbillamountgettext() {

			String a= billingnetbillamount.getText();
			int b=Integer.parseInt(a);
			return b;
		}
		
		//Current Payable  Amount  field
		
				@FindBy(xpath = "//div[@class='card col-md-2 Right-sidebar']//tr[6]//td[2]")

				public WebElement billingcurrentpayable;

				// get selected option value
				public int billingcurrentpayablegettext() {

					String a= billingcurrentpayable.getText();
					int b=Integer.parseInt(a);
					return b;

				}
				
				//Deposited Amount  field
				
				@FindBy(xpath = "//div[@class='card col-md-2 Right-sidebar']//tr[7]//td[2]")

				public WebElement billingdepositedamount;

				// get selected option value
				public int billingdepositedamountgettext() {

					String a= billingdepositedamount.getText();
					int b=Integer.parseInt(a);
					return b;

				}
				
	//Balance Amount  field
				
				@FindBy(xpath = "//div[@class='card col-md-2 Right-sidebar']//tr[8]//td[2]")

				public WebElement billingbalanceamount;

				// get selected option value
				public int billingbalanceamountgettext() {

					String a= billingbalanceamount.getText();
					int b=Integer.parseInt(a);
					return b;

				}
				
	//Save Bill button
				
				@FindBy(xpath = "//div[@class='card col-md-2 Right-sidebar']/div/div/button[1]")

				public WebElement billsavebutton;
				
				// click save button
				public void click_save_button() 
				{


					billsavebutton.click();
					
				}
				
	//print invoice button
				
				@FindBy(xpath = "//button[normalize-space()='Print Invoice']")

				public WebElement billPrintInvoicebutton;

				// get selected option value
				public void isbillPrintInvoicebuttonclickable() {

					

				}

	//Receipt button
				
				@FindBy(xpath = "//button[text()=' RECEIPT']")

				public WebElement billReceiptbutton;

				// get selected option value
				public void isbillReceiptbuttonclickable() {
				}
//Bill summary button

	@FindBy(xpath = "	//button[normalize-space()='Bill Summary']")

	public WebElement billsummarybutton;

	// get selected option value
	public void isbillsummarybuttonclickable() {

	}


	//Make advance receipt button

	@FindBy(xpath="//button[contains(text(),'Make Advance')]")
	public WebElement makeadvancebutton;

				public void clickmakeadvancereceipt()
				{
					makeadvancebutton.click();
				}

	//UHID in advance receipt

	@FindBy(xpath="//div[@class='col-md-3 BillInformation ng-star-inserted']/input[@name='patientid']")
	public WebElement UHID;
//send patient id
	public String senduhid(String send)
	{
		UHID.sendKeys(send);
		return send;
	}
//enter patient id
	public void enteruhid( )
	{
		UHID.sendKeys(Keys.ENTER);

	}
// send received amount
@FindBy(xpath = "//input[@placeholder='Amount Received']")

public WebElement amountreceivedasadvance;

	public String amountreceivedasadvance(String send)
	{
		amountreceivedasadvance.clear();
		amountreceivedasadvance.sendKeys(send);
		return send;
	}
	//get entered amount

	public String getamountreceivedasadvance()
	{
		 return amountreceivedasadvance.getAttribute("value");

	}


	//user remarks text field
	@FindBy(xpath = "//input[@placeholder='User Remarks']")

	public WebElement advancereceiptuserremarkstxt;

	public String sendadvancereceiptuserremarkstxt(String send)
	{
		advancereceiptuserremarkstxt.clear();
		advancereceiptuserremarkstxt.sendKeys(send);
		return send;
	}

	//save advance receipt button
	@FindBy(xpath = "//a[text()='Save Reciept']")

	public WebElement saveadvancereceiptbtn;

	public void clicksaveadvancereceiptbtn()
	{
		saveadvancereceiptbtn.click();
	}
	
	//save  receipt button
		@FindBy(xpath = "//a[text()='Save Reciept']")

		public WebElement savereceiptbtn;

		public void clicksavereceiptbtn()
		{
			savereceiptbtn.click();
		}

	//advance amount in advance receipt
	@FindBy(xpath = "//table[@class='RefundDetail']/tr[2]/td[5]")

	public WebElement amountInAdvanceReceipt;

	public String  getamountInAdvanceReceipt()
	{
		return amountInAdvanceReceipt.getText();
	}


	//advance receipt windows closing
		@FindBy(xpath = "//a[@class='btnmodelclear']/i")

		public WebElement closeAdvanceReceiptWindow;

		public void  closeAdvanceReceiptWindow()
		{
			 closeAdvanceReceiptWindow.click();
		}			

			
			
		//modify party name
				@FindBy(xpath = "//table[@class='RefundDetail']/tr[2]")

				public WebElement firstrowofadvancereceipt;

				public void  clickOnAdvanceReceipt()
				{
					firstrowofadvancereceipt.click();
					
				}			
	
		//UHID field on billing page

	@FindBy(xpath = "//input[@placeholder='Patient Id Press F2']")

	public WebElement txt_UHID_field;
//send patient id
	public String SendPatientIdtoBilling(String send)
	{
		txt_UHID_field.sendKeys(send);
		return send;
	}
	
	//enter patient id
	public void enteruhidtobilling( )
	{
		txt_UHID_field.sendKeys(Keys.ENTER);

	}
	
	//save button for pop-up

	@FindBy(xpath = "//*[@id=\"ReciptModelBox\"]/div/div/div[3]/button[1]")

	public WebElement yesbutononfirstpopup;
   //click yes button in "do you want to save button".
	public void clickYesButtonOnfirstPopUp()
	{
		yesbutononfirstpopup.click();
	
	}
	
	//click yes on second pop up
	@FindBy(xpath = "//div[@id='ReciptModelBox']//div//div//button[contains(text(),'Yes')]")
	//div[@id='ReciptModelBox']//div//div//button[contains(text(),'No')]

	public WebElement yesbutononsecondpopup;
   //click yes button in "do you want to save button".
	public void clickYesButtonOnsecondPopUp()
	{
		yesbutononsecondpopup.click();
	
	}
	
	//click No on second pop up
		@FindBy(xpath = "//div[@id='ReciptModelBox']//div//div//button[contains(text(),'No')]")
		

		public WebElement Nobutononsecondpopup;
	   //click No button in "do you want to save button".
		public void clickNoButtonOnsecondPopUp()
		{
			Nobutononsecondpopup.click();
		
		}
	
	//click on receipt button 
	
		public void clickOnBillReceiptButton()
		{
			billReceiptbutton.click();
		
		}

   //enter bill amount
		
		@FindBy(xpath = "//table[@class='mat-table cdk-table mat-elevation-z8']/tbody/tr/td[2]/input")

		public WebElement billAmount;
	   //send bill amount 
		public void  sendBillAmount(String sendBillamount)
		{
			billAmount.clear();
			billAmount.sendKeys(sendBillamount);
		
		}
		
		//after send bill amount hit the enter button
		public void  hitenterbutton()
		{
			billAmount.sendKeys(Keys.ENTER);
		}
		
		//get entered bill amount
		public String   fetchBillAmount()
		{
			return billAmount.getAttribute("value");
		}
		
		//bill receipt close button
		@FindBy(xpath = "//i[text()=' clear']")
		public WebElement closeButton;
		//close bill receipt window
		public void   closeBillReceiptWindow()
		{
			 closeButton.click();
		}
		
		//bill search button
				@FindBy(xpath = "//mat-icon[text()=' search']")
				public WebElement billSearchButton;
				//select Bill from first row
				@FindBy(xpath = "//tr[@role='row']/td")
				public WebElement selectbill;
				//click on edit bill button
				@FindBy(xpath = "//span[text()=' mode_edit ']")
				public WebElement editBillButton;
				//click bill search button and select bill
				public void   clickBillSearchbuttonAndSelectBillandClickOnEditBillButton()
				{
					 closeButton.click();
					 selectbill.click();
					 editBillButton.click();
				}
}
