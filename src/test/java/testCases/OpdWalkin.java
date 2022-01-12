package testCases;

import pageObjects.*;
import utility.BaseClass;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



public class OpdWalkin extends BaseClass {
	
	SoftAssert soft=new SoftAssert();
	String patientid,initials,firstname, lastname,uhid, co,coname,phoneno,mobileno,emergencyno,personName,emailid, year,month,day,paddress, ppin, pcounrty,
	pstate, pdistrict,pcity,parea,saddress,spin,scountry,sstate, sdistrict, scity, sarea,group,marrital,partyname,mothername,nationality,sap,fax,blg,language,religion,occupation,source,adhar,passport,refferedby,dispercent,viptype,remarks;
	boolean isbpl,isvip,istrible,isdisable,isexpired;

	@Test(priority=1, description="Patient Appointment with walkin")
	public void patient_appointment_walkin() throws Throwable
	{
		SoftAssert soft=new SoftAssert();
		OpdVisitPage ap=new OpdVisitPage(driver);
		 LandingPage lp = new LandingPage(driver);
		logger.info("OPD visit started");
		Thread.sleep(900);
		lp.enterUserName("Admin");
		lp.enterPassword("a");    //Admin Login Credential
		logger.debug("user entered credential");
		Thread.sleep(1000);
		LoginDashBoard ld = new LoginDashBoard(driver);
		ld.clickdashboardbtn();
		logger.debug("user entered credential");
		Thread.sleep(900);
		CommonMenus menu=new CommonMenus(driver);
		menu.click_menu_OPD();
		logger.debug("user entered credential");
		ap.patientseacrhbtn();
		logger.debug("Clicked on patient search button");
		Thread.sleep(1000);
		ap.selepatient();
		patientid=ap.getselepatient();
		System.out.println("patient id selected for OPD visit "+patientid);
		logger.debug("latest patient is selected");
		Thread.sleep(1000);
		ap.clickonDoctorandselectvalue();
		logger.debug("Doctor is selected");
		ap.clickonCategoryandselectvalue();
		logger.debug("category is selected");
		ap.clickonReferedbyandselectvalue();
		logger.debug("Referred by is selected");
		ap.appointmentreason("testing purpose");
		logger.debug("appointment reason is entered");
		ap.appointmentsavebutton();
		logger.debug("save opd visit button is clicked");
		menu.click_menu_home();
		logger.debug("Home button is clicked");
		Thread.sleep(1000);
		HomePage hp=new HomePage(driver);
		if(patientid.equalsIgnoreCase(hp.getpatientidoffirstrow()))
		{
			logger.info("Patient on dashboard"+patientid);
			System.out.println("-------Patient on dashboard-------"+patientid);
		}
		else
			System.out.println("Patient id is not come to Home page");
		    logger.error("Patient id is not come to Home page "+patientid);
			soft.fail("Patient id is not come to Home page");




	}

}
