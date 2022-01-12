package testCases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;



import pageObjects.LandingPage;
import pageObjects.LoginDashBoard;
import pageObjects.PatientRegistrationPage;
import utility.BaseClass;
import utility.CommonFunctions;




@Test(priority=1)
public class PatientSearch_btn extends BaseClass {
	CommonFunctions cf=new CommonFunctions();

	SoftAssert soft=new SoftAssert();
	String initials,firstname, lastname,uhid, co,coname,phoneno,mobileno,emergencyno,personName,emailid, year,month,day,paddress, ppin, pcounrty,
	pstate, pdistrict,pcity,parea,saddress,spin,scountry,sstate, sdistrict, scity, sarea,group,marrital,partyname,mothername,nationality,sap,fax,blg,language,religion,occupation,source,adhar,passport,refferedby,dispercent,viptype,remarks;
	boolean isbpl,isvip,istrible,isdisable,isexpired;
	@Test(description="Patient Registration",priority=1)
	public void New_Patient_Registration() throws Throwable
	{   
		LandingPage lp = new LandingPage(driver);
		LoginDashBoard ld = new LoginDashBoard(driver);
		
		PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		logger.info("patient registration is started");
		
		lp.enterUserName("Admin");
		lp.enterPassword("a");   // Admin Login Credential
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
		initials=prp.getselectedinitialvalue();
		
		prp.txt_firstName(cf.randoname());
		logger.debug("First name is entered");
		firstname=prp.stringfirstName();
		
		prp.txt_lastName(cf.randoname());
		logger.debug("last name is entered");
		lastname=prp.stringlastName();
		
		prp.txt_UHID("15");
		logger.debug("UHID is entered");
		uhid=prp.stringUHID();
		
		prp.clickoncareoftypeandselectvalue();
		logger.debug("care of type selected");
		co=prp.getselectedcareoftypevalue();
		
		prp.txt_coname(cf.randoname());
		logger.debug("name of care of is entered");
		coname=prp.stringconame();
		
		prp.txt_phoneno(cf.randommobilenumber());
		logger.debug("phone number is entered");
		phoneno=prp.stringphone();
		
		prp.txt_mobileno(cf.randommobilenumber());
		logger.debug("mobile number is entered");
		mobileno=prp.stringmobile();
		
		prp.txt_emergencyno(cf.randommobilenumber());
		logger.debug("emergency number is entered");
		emergencyno=prp.stringemergencyno();
		
		prp.txt_personName(cf.randoname());
		logger.debug("person name is entered");
		personName=prp.stringpersonname();
		
		prp.txt_emailid(cf.randoname() + "@gmail.com");
		logger.debug("email id is entered");
		emailid=prp.stringemailid();
		
		prp.txt_year("27"); // enter dob year
		logger.debug("DOB year is entered");
		year=prp.stringyear();
		
		prp.txt_month("11"); // enter dob month
		logger.debug("DOB month is entered");
		month=prp.stringmonth();
		
		prp.txt_day("20"); // enter dob month
		logger.debug("DOB day is entered");
		day=prp.stringday();
		
		prp.txt_pyouraddress("101/08, Usha Nagar"); // enter permanent address
		logger.debug("permanent address is entered");
		paddress=prp.stringpaddress();
		
		prp.txt_ppincode("562845"); // enter pin code
		logger.debug("permanent PIN is entered");
		ppin=prp.Bstringermanentpin();
		
		prp.clickoncountryandselectvalue(); // select country
		logger.debug("permanent country is selected");
		pcounrty=prp.getselectedCountryvalue();
		
		prp.clickonStateandselectvalue(); // select state
		logger.debug("permanent state is selected");
		pstate=prp.getselectedstatevalue();
		
		prp.clickonDistrictandselectvalue(); // select district
		logger.debug("permanent disctrict is selected");
		sdistrict=prp.getselecteddistrictvalue();
		
		prp.clickonCityandselectvalue(); // select city
		logger.debug("permanent city is selected");
		pcity=prp.getselectedcityvalue();
		
		Thread.sleep(1000);
		prp.clickonAreaandselectvalue(); // select area
		logger.debug("permanent area is selected");
		parea=prp.getselectedareavalue();
		
//		prp.select_same_as();
//		logger.debug("same as address button is not clicked");
		
		prp.txt_syouraddress("65/08, Jain Nagar"); // select current address
		logger.debug("current address is selected");
		saddress=prp.stringsaddress();
		
		prp.stxt_spincode("565568"); // enter pin code
		logger.debug("current PIN is selected");
		spin=prp.stringspincode();
		
		prp.clickonlocalcountryandselectvalue(); // select country
		logger.debug("current current is selected");
		scountry=prp.getselectedLocalCountryvalue();
		
		prp.clickonlocalstateandselectvalue(); // select state
		logger.debug("current state is selected");
		sstate=prp.getselectedselectlocalstatevaluevalue();
		
		prp.clickonlocaldistrictandselectvalue(); // select district
		logger.debug("current disctrict is selected");
		sdistrict=prp.getselectedlocaldistrictvalue();
		
		prp.clickonlocalcityandselectvalue(); // select city
		logger.debug("current city is selected");
		scity=prp.getselectedlocalcityvalue();  
		
		Thread.sleep(1000);
		prp.clickonlocalareaandselectvalue(); // select area
		logger.debug("current area is selected");
		sarea=prp.getselectedlocalareavalue();
		
		prp.otherinformation();
		Thread.sleep(1000);
		logger.debug("other information tab is clicked");
		
		prp.clickongroupandselectvalue();
		group = prp.getselectedgroupvalue();
		Thread.sleep(1000);
		logger.debug("group is selected");
		
		prp.clickonmariatalstatusandselectvalue();
		logger.debug("marriatal status is selected");
		marrital = prp.getselectedmarritalvalue();
		
		Thread.sleep(1000);
		prp.clickonpartynamesandselectvalue();
		partyname = prp.getselectedpartyvalue();
		logger.debug("party name is selected");
		
		prp.txt_mothername("Reema Devi"); // enter Mother name
		mothername=prp.Bstringmothername();
		logger.debug("mother name is entered");

		prp.clickNationalityAndSelectValue();
		nationality=prp.getSelectedNationalityValue();
		logger.debug("nationality is selected");
		
		prp.txt_sap("Test"); // enter sap
		sap=prp.Bsap();
		logger.debug("SAP is entered");

		prp.txt_faxno("156545"); // enter fax number
		fax=prp.Bfax();
		logger.debug("fax is entered");

		prp.clickBloodGroupAndSelectValue();
		blg = prp.getSelectedBloodGroupValue();
		logger.debug("blood group is selected");

		prp.clickLanguageAndSelectValue();
		language=prp.getSelectedLanguageValue();
		logger.debug("language is selected");

		prp.getSelectedReligionValue();
		religion=prp.getSelectedReligionValue();
		logger.debug("religion is selected");

		prp.getSelectedOccupationValue();
		occupation=prp.getSelectedOccupationValue();
		System.out.println(prp.getSelectedOccupationValue());
		logger.debug("occupation is selected");

		prp.getSelectedSourceValue();
		source=prp.getSelectedSourceValue();
		logger.debug("source is selected");

		prp.txt_adharcard("205245217896"); // enter adhar card number
		adhar=prp.Badharcard();
		logger.debug(" adhar card number is entered");
		
		prp.txt_passportno("ADHJ78459652698"); // enter passport number
		passport=prp.Bpassport();
		logger.debug("passport number is entered");
		
		prp.cbox_BPL(); // check on blp
		isbpl=prp.BPL();
		logger.debug("BPL check box is selected");
		
		prp.cbox_tribal(); // check on tribal
		istrible=prp.trible();
		logger.debug("trible check box is selected");
		
		Thread.sleep(1000);
		prp.clickreferedbyAndSelectValue(); // select reffred by
		refferedby=prp.getSelectedreferedbyValue();
		logger.debug("referred by check box is selected");
		
		prp.cbox_disabled(); // check disabled
		isdisable=prp.disable();
		logger.debug("disabled check box is selected");
		
		prp.select_disablepercent(1); // select disabled percent
		dispercent=prp.Bdisablepercent();
		logger.debug("disabled percentage is selected");
		
		prp.cbox_isvip(); // check isvip
		isvip=prp.vip();
		logger.debug("VIP check box is selected");
		
		prp.select_viptype(1); // select type of vip
		viptype=prp.Bviptype();
		logger.debug("VIP type is selected");
		
		prp.txt_remarks("Testing"); // enter remarks
		remarks=prp.Bremarks();
		logger.debug("remarks is entered");
		
//		prp.cbox_isexpired();   //check isexpired
		logger.debug("expired check box is not selected");
		
		prp.btn_saveupdate(); // click save/update button
		logger.debug("save button is clicked");
		
		Thread.sleep(1000);
		prp.tab_personalInformation(); // click personal information tab
		logger.debug("personal information tab is clicked");
		
		System.out.println("Current Patient ID - " + prp.btn_patientID.getAttribute("value")); // print currently
		logger.debug("new patient registration number is generated---> "+prp.btn_patientID.getAttribute("value"));		
		
		prp.patientseacrhbtn();
		logger.debug("patient search button is clicked");
		
		Thread.sleep(1000);
		prp.selepatient();
		logger.debug("Patient is selected");
	}

	//initials matching
		@Test(priority=2)
		public void initialmatches() throws InterruptedException

		{   
			SoftAssert soft=new SoftAssert(); 
			PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			soft.assertEquals(initials, prp.getselectedinitialvalue(), "Intial is not matched");
			soft.assertAll();
		}
		//first name matching
		@Test(priority=3)
		public void fistnamematches()
		{SoftAssert soft=new SoftAssert(); 
		PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(firstname, prp.txt_firstName.getAttribute("value"), "First name is not matched");
		soft.assertAll();
		}
		//last name matching
		@Test(priority=4)
		public void lastnamematches()
		{
			SoftAssert soft=new SoftAssert();
			PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			soft.assertEquals(lastname, prp.txt_lastName.getAttribute("value"), "last name is not matched");
			soft.assertAll();

		}
		//UHID matching
		@Test(priority=5)
		public void uhidmatches()
		{SoftAssert soft=new SoftAssert(); 
		PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(uhid, prp.txt_UHID.getAttribute("value"), "UHID is not matched");
		soft.assertAll();

		}
		@Test(priority=6)
		//care of type matching
		public void cotypematches() throws InterruptedException
		{
			SoftAssert soft=new SoftAssert();
			PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			soft.assertEquals(prp.getselectedcareoftypevalue(), co, "Care of type is not matched");
			soft.assertAll();
		}
		@Test(priority=7)
		//care of name matching
		public void conamematches()
		{SoftAssert soft=new SoftAssert();
		PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(prp.txt_coname.getAttribute("value"), coname, "Care of name is not matched");
		soft.assertAll();
		}

		@Test(priority=8)
		//Phone number matching 
		public void phonematches()
		{SoftAssert soft=new SoftAssert();
		PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(prp.txt_phoneno.getAttribute("value"), phoneno, "Phone number is not matched");
		soft.assertAll();


		}

		@Test(priority=9)
		//Mobile number matching 
		public void mobilenomatches()
		{
			SoftAssert soft=new SoftAssert();
			PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			soft.assertEquals(prp.txt_mobileno.getAttribute("value"), mobileno, "Mobile number is not matched");
			soft.assertAll();
		}

		@Test(priority=10)
		//Emergency number matching 
		public void emergencymatches()
		{SoftAssert soft=new SoftAssert(); 
		PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(prp.txt_emergencyno.getAttribute("value"), emergencyno, "Emergency mobile number is not matched");
		soft.assertAll();

		}

		@Test(priority=11)
		//Person name matching 
		public void person_name_matches()
		{

			SoftAssert soft=new SoftAssert(); 
			PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			soft.assertEquals(prp.txt_personName.getAttribute("value"), personName, "Person name is not matched");
			soft.assertAll();
		}

		@Test(priority=12)
		//Email matching 
		public void emailmatches()
		{
			SoftAssert soft=new SoftAssert(); 
			PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			soft.assertEquals(prp.txt_emailid.getAttribute("value"), emailid, "Email id is not matched");
			soft.assertAll();

		}

		@Test(priority=13)
		//Year matching 
		public void yearmatches()
		{SoftAssert soft=new SoftAssert();
		PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(prp.txt_year.getAttribute("value"), year, "Year is not matched");
		soft.assertAll();

		}
		@Test(priority=14)
		//Month matching 
		public void monthmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(prp.txt_month.getAttribute("value"), month, "Month is not matched");
		soft.assertAll();

		}

		@Test(priority=15)
		//Day matching 
		public void daymatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(prp.txt_day.getAttribute("value"), day, "Day is not matched");
		soft.assertAll();

		}
		@Test(priority=16)
		//Permanent address matching 
		public void permanentadressmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(prp.txt_pyouraddress.getAttribute("value"), paddress, "Permanent address is not matched");
		soft.assertAll();

		}

		@Test(priority=17)
		//Permanent PIN matching 
		public void permanentpinmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(prp.Astringermanentpin(),ppin, "Permanent PIN is not matched");
		soft.assertAll();
		}

		@Test(priority=18)
		//Permanent country matching 
		public void permanentcountrymatches()
		{
			SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			 
			soft.assertEquals(prp.getselectedCountryvalue(),pcounrty, "Permanent country is not matched");
			soft.assertAll();
		}

		@Test(priority=19)
		//Permannt state matching 
		public void permanentstatematches() throws InterruptedException
		{
			SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			 
			soft.assertEquals(prp.getselectedstatevalue(),pstate, "Permanent state is not matched");
			soft.assertAll();
		}

		@Test(priority=20, enabled=false)
		//Permanent district matching 
		public void permanentdistrictmatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselecteddistrictvalue(),pdistrict, "Permanent district is not matched");
		soft.assertAll();

		}

		@Test(priority=21)
		//Permanent city matching 
		public void permanentcitymatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselectedcityvalue(),pcity, "Permanent city is not matched");
		soft.assertAll();

		}

		@Test(priority=22)
		//Permanent area matching 
		public void permanentareamatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselectedareavalue(),parea, "Permanent area is not matched");
		soft.assertAll();


		}

		@Test(priority=23)
		//local address matching 
		public void localaddressmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.txt_syouraddress.getAttribute("value"),saddress, "Local address is not matched");
		soft.assertAll();
		}

		@Test(priority=24)
		//local PIN matching 
		public void localpinmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.txt_spincode.getAttribute("value"),spin, "Local PIN is not matched");
		soft.assertAll();
		}

		@Test(priority=25)
		//local country matching 
		public void localcountrymatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselectedLocalCountryvalue(),scountry, "Local country is not matched");
		soft.assertAll();

		}


		@Test(priority=26)
		//local state matching 
		public void localstatematches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselectedselectlocalstatevaluevalue(),sstate, "Local state is not matched");
		soft.assertAll();
		}

		@Test(priority=27)
		//local district matching 
		public void localdistrictmatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselectedlocaldistrictvalue(),sdistrict, "Local district is not matched");
		soft.assertAll();
		}

		@Test(priority=28)
		//local city matching 
		public void localcitymatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselectedlocalcityvalue(),scity, "Local city is not matched");
		soft.assertAll();
		}


		@Test(priority=29)
		//local area matching 
		public void localareamatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselectedlocalareavalue(),sarea, "Local area is not matched");
		soft.assertAll();
		}

		@Test(priority=30)
		public void clicktotherinformaiontab()
		{
			PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			prp.otherinformation();
		}

		@Test(priority=31)
		//group matching 
		public void groupmatches() throws InterruptedException
		{
			SoftAssert soft=new SoftAssert(); 
			PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		soft.assertEquals(prp.getselectedgroupvalue(),group, "Group is not matched");
		soft.assertAll();
		}

		@Test(priority=32)
		//marrital status matching 
		public void marritalstatusmatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselectedmarritalvalue(),marrital, "Marrital status is not matched");
		soft.assertAll();

		}
		@Test(priority=33)
		//party name matching 
		public void partynamematches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getselectedpartyvalue(),partyname, "Party is not matched");
		soft.assertAll();
		}

		@Test(priority=34)
		//mother name matching 
		public void mothernamematches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.Astringmothername(),mothername, "Mother name is not matched");
		soft.assertAll();
		}

		@Test(priority=35)
		//Nationality matching 
		public void nationalitymatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getSelectedNationalityValue(),nationality, "Nationality is not matched");
		soft.assertAll();
		}

		@Test(priority=36)
		//sap matching 
		public void sapmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.Asap(),sap, "SAP is not matched");
		soft.assertAll();
		}

		@Test(priority=37)
		//fax number matching 
		public void faxnumbermatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.Afax(),fax, "Fax is not matched");
		soft.assertAll();
		}

		@Test(priority=38)
		//blood group matching 
		public void bloodgroupmatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getSelectedBloodGroupValue(),blg, "Blood Group is not matched");
		soft.assertAll();

		}

		@Test(priority=39)
		//language matching 
		public void languagematches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getSelectedLanguageValue(),language, "Language is not matched");
		soft.assertAll();
		}

		@Test(priority=40)
		//Religion matching 
		public void religionmatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getSelectedReligionValue(),religion, "Religion is not matched");
		soft.assertAll();
		}

		@Test(priority=41)
		//Religion matching 
		public void occupationmatches() throws InterruptedException
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.getSelectedOccupationValue(),occupation, "Occupation is not matched");
		soft.assertAll();
		}

		@Test(priority=42)
		//Religion matching 
		public void sourcematches() throws InterruptedException
		{
			SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			 
			soft.assertEquals(prp.getSelectedSourceValue(),source, "Source is not matched");
			soft.assertAll();
		}

		@Test(priority=43)
		//Adhar matching 
		public void adharmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.Aadharcard(),adhar, "Adhar card number is not matched");
		soft.assertAll();
		}

		@Test(priority=44)
		//passport matching 
		public void passportmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.Apassport(),passport, "Passport number is not matched");
		soft.assertAll();
		}

		@Test(priority=45)
		//is BPL matching 
		public void isbplmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.BPL(),isbpl,"Is BPL is not matched");
		soft.assertAll();
		}
		@Test(priority=46)
		//is trible matching 
		public void istriblematches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.trible(),istrible,"Is trible is not matched");
		soft.assertAll();

		}
		/*	@Test(priority=47)
		//Reffred by matching 
		public void refferedbymatches()
		{
	 SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		     
		    soft.assertEquals(prp.Arefferby(),refferedby,"Reffered by is not matched");
	    	soft.assertAll();
		}  */

		@Test(priority=48)
		//is disable matching 
		public void isdisablematches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.disable(),isdisable,"Is disable is not matched");
		soft.assertAll();
		}

		@Test(priority=49)
		//Disable percent matching 
		public void disablepercentmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.Adisablepercent(),dispercent,"Disable percent is not matched");
		soft.assertAll();
		}



		@Test(priority=50)
		//is vip matching 
		public void isvipmatches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.vip(),isvip,"Is VIP is not matched");
		soft.assertAll();
		}

		@Test(priority=51)
		//VIP type matching 
		public void Viptypematches()
		{SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
		 
		soft.assertEquals(prp.Aviptype(),viptype,"VIP type is not matched");
		soft.assertAll();
		}

		@Test(priority=52)
		//Remarks by matching 
		public void remarksmatches()
		{
			SoftAssert soft=new SoftAssert(); PatientRegistrationPage prp = new PatientRegistrationPage(driver);
			 
			soft.assertEquals(prp.Aremarks(),remarks,"Remarks is not matched");
			soft.assertAll();
		}


		/*
		@Test(priority=53)
		//Is expired matching 
		public void isexpired()
		{
			 
			soft.assertEquals(prp.expire(),isexpired,"Is Expired not matched");
			soft.assertAll();
		}   
		 */

}







