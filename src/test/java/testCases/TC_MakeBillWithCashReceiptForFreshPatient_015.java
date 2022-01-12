package testCases;

import pageObjects.*;
import utility.BaseClass;
import utility.CommonFunctions;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TC_MakeBillWithCashReceiptForFreshPatient_015 extends BaseClass {
	
    String pid,billamountreceived, billamountinBillReceipt;
    @Test(description = "Patient Registration", priority=1)
    public void New_Patient_Registration() throws Throwable {
    
      	LandingPage lp = new LandingPage(driver);
    		LoginDashBoard ld = new LoginDashBoard(driver);
    		PatientRegistrationPage prp = new PatientRegistrationPage(driver);
    		CommonFunctions cf=new CommonFunctions();
    		
    		logger.info("patient registration is started");
    		
    		lp.enterUserName("Admin"); 
    		lp.enterPassword("a"); // Admin Login Credential
    		logger.debug("user entered valid credential");
    		
    		Thread.sleep(1000);
    		ld.clickdashboardbtn(); // click on dashboard button
    		logger.debug("clicked on dashboard button");
    		
    		Thread.sleep(900);
    		prp.menu_registration(); // click on registration menu
    		logger.debug("clicked on registration menu");
    		
    		Thread.sleep(500);
    		prp.clickoninitialandselectvalue();
    		logger.debug("Initials is selected");
    		
    		prp.txt_firstName(cf.randoname());
    		logger.debug("First name is entered");
    		
    		prp.txt_lastName(cf.randoname());
    		logger.debug("last name is entered");
    		
    		prp.txt_UHID("15");
    		logger.debug("UHID is entered");
    		
    		prp.clickoncareoftypeandselectvalue();
    		logger.debug("care of type selected");
    		
    		prp.txt_coname(cf.randoname());
    		logger.debug("name of care of is entered");
    		
    		prp.txt_phoneno(cf.randommobilenumber());
    		logger.debug("phone number is entered");
    		
    		prp.txt_mobileno(cf.randommobilenumber());
    		logger.debug("mobile number is entered");
    		
    		prp.txt_emergencyno(cf.randommobilenumber());
    		logger.debug("emergency number is entered");
    		
    		prp.txt_personName(cf.randoname());
    		logger.debug("person name is entered");
    		
    		prp.txt_emailid(cf.randoname() + "@gmail.com");
    		logger.debug("email id is entered");
    		
    		prp.txt_year("27"); // enter dob year
    		logger.debug("DOB year is entered");
    		
    		prp.txt_month("11"); // enter dob month
    		logger.debug("DOB month is entered");
    		
    		prp.txt_day("20"); // enter dob month
    		logger.debug("DOB day is entered");
    		
    		prp.txt_pyouraddress("101/08, Usha Nagar"); // enter permanent address
    		logger.debug("permanent address is entered");
    		
    		prp.txt_ppincode("562845"); // enter pin code
    		logger.debug("permanent PIN is entered");
    		
    		prp.clickoncountryandselectvalue(); // select country
    		logger.debug("permanent country is selected");
    		
    		prp.clickonStateandselectvalue(); // select state
    		logger.debug("permanent state is selected");
    		
    		prp.clickonDistrictandselectvalue(); // select district
    		logger.debug("permanent disctrict is selected");
    		
    		prp.clickonCityandselectvalue(); // select city
    		logger.debug("permanent city is selected");
    		
    		Thread.sleep(1000);
    		prp.clickonAreaandselectvalue(); // select area
    		logger.debug("permanent area is selected");
    		
//    		prp.select_same_as();
    		logger.debug("same as address button is not clicked");
    		
    		prp.txt_syouraddress("65/08, Jain Nagar"); // select current address
    		logger.debug("current address is selected");
    		
    		prp.stxt_spincode("565568"); // enter pin code
    		logger.debug("current PIN is selected");
    		
    		prp.clickonlocalcountryandselectvalue(); // select country
    		logger.debug("current current is selected");
    		
    		prp.clickonlocalstateandselectvalue(); // select state
    		logger.debug("current state is selected");
    		
    		prp.clickonlocaldistrictandselectvalue(); // select district
    		logger.debug("current disctrict is selected");
    		
    		prp.clickonlocalcityandselectvalue(); // select city
    		logger.debug("current city is selected");
    		
    		Thread.sleep(1000);
    		prp.clickonlocalareaandselectvalue(); // select area
    		logger.debug("current area is selected");
    		
    		prp.otherinformation();
    		Thread.sleep(1000);
    		logger.debug("other information tab is clicked");
    		
    		prp.clickongroupandselectvalue();
    		Thread.sleep(1000);
    		logger.debug("group is selected");
    		
    		prp.clickonmariatalstatusandselectvalue();
    		logger.debug("marriatal status is selected");
    		
    		Thread.sleep(1000);
    		prp.clickonpartynamesandselectvalue();
    		logger.debug("party name is selected");
    		
    		prp.txt_mothername("Reema Devi"); // enter Mother name
    		logger.debug("mother name is entered");

    		prp.clickNationalityAndSelectValue();
    		logger.debug("nationality is selected");
    		
    		prp.txt_sap("Test"); // enter sap
    		logger.debug("SAP is entered");

    		prp.txt_faxno("156545"); // enter fax number
    		logger.debug("fax is entered");

    		prp.clickBloodGroupAndSelectValue();
    		logger.debug("blood group is selected");

    		prp.clickLanguageAndSelectValue();
    		logger.debug("language is selected");

    		prp.getSelectedReligionValue();
    		logger.debug("religion is selected");

    		prp.getSelectedOccupationValue();
    		logger.debug("occupation is selected");

    		prp.getSelectedSourceValue();
    		logger.debug("source is selected");

    		prp.txt_adharcard("205245217896"); // enter adhar card number
    		logger.debug(" adhar card number is entered");
    		
    		prp.txt_passportno("ADHJ78459652698"); // enter passport number
    		logger.debug("passport number is entered");
    		
    		prp.cbox_BPL(); // check on blp
    		logger.debug("BPL check box is selected");
    		
    		prp.cbox_tribal(); // check on tribal
    		logger.debug("trible check box is selected");
    		
    		Thread.sleep(1000);
    		prp.clickreferedbyAndSelectValue(); // select reffred by
    		logger.debug("referred by check box is selected");
    		
    		Thread.sleep(1000);
    		prp.cbox_disabled(); // check disabled
    		logger.debug("disabled check box is selected");
    		
    		prp.select_disablepercent(1); // select disabled percent
    		logger.debug("disabled percentage is selected");
    		
    		prp.cbox_isvip(); // check isvip
    		logger.debug("VIP check box is selected");
    		
    		prp.select_viptype(1); // select type of vip
    		logger.debug("VIP type is selected");
    		
    		prp.txt_remarks("Testing"); // enter remarks
    		logger.debug("remarks is entered");
    		
//    		prp.cbox_isexpired();   //check isexpired
    		logger.debug("expired check box is not selected");
    		
    		prp.btn_saveupdate(); // click save/update button
    		logger.debug("save button is clicked");
    		
    		Thread.sleep(1000);
    		prp.tab_personalInformation(); // click personal information tab
    		logger.debug("personal information tab is clicked");
		System.out.println("Current Patient ID - " + prp.btn_patientID.getAttribute("value")); // print currently
		logger.debug("new patient registration number is generated---> "+prp.btn_patientID.getAttribute("value"));																					// registered patient ID
        pid=prp.btn_patientID.getAttribute("value");
    }

    @Test(description = "Make Bill with cash amount", priority = 2)
    public void MakeBillwithCash() throws InterruptedException {
    	 BillingPage bp = new BillingPage(driver);
     	 bp.click_menu_billing();
         logger.debug("Clicked on billing menu");
         Thread.sleep(900);
         bp.SendPatientIdtoBilling(pid);
         logger.debug("patient id sent ");
		 bp.enteruhidtobilling();
		   logger.debug("patient id sent and hit the enter button ");
		 Thread.sleep(900);
		 bp.sendBillAmount("1000");
		 logger.debug("Bill amount is entered");
		 bp.hitenterbutton();
		 logger.debug("hit enter button after entering bill amount");
		 Thread.sleep(900);
		 billamountreceived=bp.fetchBillAmount();
		 Thread.sleep(900);
		 bp.click_save_button();
		 logger.debug("Clicked on bill save button");
		 Thread.sleep(900);
		 bp.clickYesButtonOnsecondPopUp();
		 logger.debug("Clicked on yes for create cash receipt");
		 Thread.sleep(900);
		 logger.info("Bill is created amount is "+billamountreceived);
		 System.out.println("Bill is created amount is "+billamountreceived);
    }
    @Test(description = "Verify created Cash receipt", priority=3)
    public void verifyBillReceiptAmount() throws InterruptedException {
    	BillingPage bp = new BillingPage(driver);
        SoftAssert soft=new SoftAssert();
        Thread.sleep(900);
        bp.clickOnBillReceiptButton();
        logger.debug("Clicked on bill Receipt button");
		Thread.sleep(900);
		 logger.debug("Bill Receipt verification is started");
		soft.assertEquals(billamountreceived, bp.getamountreceivedasadvance(), "Bill amount is not matched");
		 logger.debug("Bill amount is verified "+billamountreceived);
		Thread.sleep(900);
		 

    }

}
