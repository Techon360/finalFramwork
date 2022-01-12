package pageObjects;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PatientRegistrationPage {
	WebDriver driver;
   
	public PatientRegistrationPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}

	/* personal information */
	
	// click registration menu
	
		@FindBy(xpath="//p[text()='Registration']") public   WebElement menu_registration;
		
		public void menu_registration()
		{
			WebDriverWait wait= new WebDriverWait(driver, 10);
			wait.until(ExpectedConditions.elementToBeClickable(menu_registration));
			menu_registration.click();
		}

		
		  // click on initial 
				@FindBy(xpath="//mat-select[@name='initial']") public  WebElement initial;
			
				//select value from initial
				@FindBy(xpath="//mat-option[3]") public  WebElement selectinitialvalue;
				
				//get text from selected value
				@FindBy(xpath="//mat-select[@name='initial']/div/div/span/span") public  WebElement getselectinitialedvalue;
				
				
				public void clickoninitialandselectvalue() throws InterruptedException
				{
					initial.click();
					Thread.sleep(150);
					selectinitialvalue.click();
					
				}
				
				public String getselectedinitialvalue() throws InterruptedException
				{
					return getselectinitialedvalue.getText();

				      
				}
		

	// first Name
	@FindBy(xpath="//input[@name='firstname']") public   WebElement txt_firstName;
	
	public void txt_firstName(String pateintName)
	{
		txt_firstName.sendKeys(pateintName);
	}
	
	public String stringfirstName()
	{
		return txt_firstName.getAttribute("value");
	
	}


	// second Name
	@FindBy(xpath="//input[@name='lastname']") public   WebElement txt_lastName;
	
	public void txt_lastName(String patientlastName)
	{
		txt_lastName.sendKeys(patientlastName);
	}

	public String stringlastName()
	{
		return txt_lastName.getAttribute("value");
	}
	
	
	// UHID
	@FindBy(xpath="//input[@name='oldno']") public   WebElement txt_UHID;
	
	public void txt_UHID(String uhid)
	{
		txt_UHID.sendKeys(uhid);
	}
	
	
	public String stringUHID()

	{
		return txt_UHID.getAttribute("value");
	}
	
	// click on careoftype
	@FindBy(xpath="//mat-select[@name='careoftype']") public  WebElement careoftype;

	//select value from careoftype
	@FindBy(xpath="//mat-option[4]") public  WebElement selectcareoftypevalue;
	
	//get text from selected value
	@FindBy(xpath="//mat-select[@name='careoftype']/div/div/span/span") public  WebElement getselectcareoftypevalue;
	
	
	public void clickoncareoftypeandselectvalue() throws InterruptedException
	{
		careoftype.click();
		Thread.sleep(150);
		selectcareoftypevalue.click();
		
	}
	
	public String getselectedcareoftypevalue() throws InterruptedException
	{
		return getselectcareoftypevalue.getText();

	      
	}

	
	// care of name
	@FindBy(xpath="//input[@name='careof']") public   WebElement txt_coname;
	
	 public void  txt_coname(String parentName)
	 {
		 txt_coname.sendKeys(parentName);
	 }
	
	 public String  stringconame()
	 {
		return txt_coname.getAttribute("value");
	 }
	 
	// phone no
	@FindBy(xpath="//input[@id='mat-input-20']")  public   WebElement txt_phoneno;
	
	public void txt_phoneno(String phoneno)
	{
		txt_phoneno.sendKeys(phoneno);
	}
	
	 public String  stringphone()
	 {
		return txt_phoneno.getAttribute("value");
	 }

	// mobile no
	@FindBy(xpath="//input[@name='mobileno']") public   WebElement txt_mobileno;
	
	public void txt_mobileno(String mobileno)
	{
		txt_mobileno.sendKeys(mobileno);
		
	}
	
	 public String  stringmobile()
	 {
		return txt_mobileno.getAttribute("value");
	 }

	//  emergency no
	@FindBy(xpath="//input[@id='mat-input-22']") public   WebElement txt_emergencyno;
	
	public void txt_emergencyno(String emergencymobileno)
	{
		txt_emergencyno.sendKeys(emergencymobileno);
	}
	
	 public String  stringemergencyno()
	 {
		return txt_emergencyno.getAttribute("value");
	 }

	// person Name
	@FindBy(xpath="//input[@data-placeholder='Person Name']") public   WebElement txt_personName;
	
	public void txt_personName(String personName)
	{
		txt_personName.sendKeys(personName);
	}
	
	 public String  stringpersonname()
	 {
		return txt_personName.getAttribute("value");
	 }

	// email id
	@FindBy(name="email") public   WebElement txt_emailid;
	
	public void txt_emailid(String emailid)
	{
		txt_emailid.sendKeys(emailid);
	}
	
	 public String  stringemailid()
	 {
		return txt_emailid.getAttribute("value");
	 }
	 
	 //DOB
	 
	 @FindBy(xpath="//input[@data-placeholder='Date Of Birth(DD/MM/YY)']") public WebElement txt_dob;
	 
	 public String getdob()
	 {
		 return txt_dob.getAttribute("data-placeholder");
	 }

	// year
	@FindBy(xpath="//input[@name='years']") public   WebElement txt_year;
	

	public void txt_year(String year)
	{
		txt_year.sendKeys(year);
	}
	
	 public String  stringyear()
	 {
		return txt_year.getAttribute("value");
	 }

	// month
	@FindBy(xpath="//input[@name='month']") public   WebElement txt_month;
	

	public void txt_month(String month)
	{
		txt_month.sendKeys(month);
	}
	
	 public String  stringmonth()
	 {
		return txt_month.getAttribute("value");
	 }
	

	// day
	@FindBy(xpath="//input[@name='days']") public   WebElement txt_day;
	

	public void txt_day(String day)
	{
		txt_day.sendKeys(day);
	}
	 public String  stringday()
	 {
		return txt_day.getAttribute("value");
	 }

	// patient search
	@FindBy(xpath="//button[@mattooltip='Search']") public   WebElement btn_patientsearch;
	

	public void btn_patientsearch()
	{
		btn_patientsearch.click();
	}

	// your address
	@FindBy(xpath="//textarea[@name='paddress']") public   WebElement txt_pyouraddress;
	
	public void txt_pyouraddress(String address)
	{
		txt_pyouraddress.sendKeys(address);
	}
	
	 public String  stringpaddress()
	 {
		return txt_pyouraddress.getAttribute("value");
	 }
	 

	// PIN code
	@FindBy(xpath="//input[@name='pincode']") public   WebElement txt_ppincode;
	
	public void txt_ppincode(String pin)
	{
		txt_ppincode.sendKeys(pin);
	}
	
	 public String  Bstringermanentpin()
	 {
		return txt_ppincode.getAttribute("value");
	 }
     
	 public String  Astringermanentpin()
	 {
		return txt_ppincode.getAttribute("value");
	 }
//--------------------------------------------------------------------------------	 
		// click on country
		@FindBy(xpath="//mat-select[@name='country']") public  WebElement country;

		//select value from country
		@FindBy(xpath="//mat-option/span") public List <WebElement> selectcountryvalue;
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='country']/div/div/span/span") public  WebElement getselectcountryvalue;
		
		
		public void clickoncountryandselectvalue() throws InterruptedException
		{  
			int i;
		    String co="India";
			country.click();
			 List <WebElement> selectcountryvalue=driver.findElements(By.xpath("//mat-option/span"));
			for( i=0; i<selectcountryvalue.size();i++)
			{
				String countrylist=selectcountryvalue.get(i).getText();
				if(countrylist.equalsIgnoreCase(co))
				{
					selectcountryvalue.get(i).click();
					break;
				}		
			}	
			  
		}
		
		public String getselectedCountryvalue()
		{
			return getselectcountryvalue.getText();      
		}
		
		
		
//-----------------------------------------------------------------------------------------		

	// select state
	
		@FindBy(xpath="//mat-select[@name='state']") public  WebElement state;

		
		
	
		
		public void clickonStateandselectvalue() throws InterruptedException
		{  
			Thread.sleep(900);
			int i;
		    String co="Madhya Pradesh";
		    state.click();
		  //select value from state
		    List <WebElement> selectstatevalue=driver.findElements(By.xpath("//mat-option/span"));
			for( i=0; i<selectstatevalue.size();i++)
			{
				String countrylist=selectstatevalue.get(i).getText();
				if(countrylist.equalsIgnoreCase(co))
				{
					selectstatevalue.get(i).click();
					break;
				}		
			}	  
		}
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='state']/div/div/span/span") public  WebElement getselectstatevalue;
		
		public String getselectedstatevalue() throws InterruptedException
		{
			return getselectstatevalue.getText();     
		}

	// select district
		@FindBy(xpath="//mat-select[@name='district']") public  WebElement district;

		//select value from state
		@FindBy(xpath="//mat-option/span") public List <WebElement> selectdistrictvalue;
		
		public void clickonDistrictandselectvalue() throws InterruptedException
		{  
			Thread.sleep(900);
			int i;
		    String co="Indore";
		    district.click();
		    List <WebElement> selectdistrictvalue=driver.findElements(By.xpath("//mat-option/span"));
			for( i=0; i<selectdistrictvalue.size();i++)
			{
				String countrylist=selectdistrictvalue.get(i).getText();
				if(countrylist.equalsIgnoreCase(co))
				{
					selectdistrictvalue.get(i).click();
					break;
				}		
			}	  
		}
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='district']/div/div/span/span") public  WebElement getselectdistrictvalue;
		public String getselecteddistrictvalue() throws InterruptedException
		{
			return getselectdistrictvalue.getText();

		      
		}
	

	// select city
		
				@FindBy(xpath="//mat-select[@name='city']") public  WebElement city;

				//select value from state
				@FindBy(xpath="//mat-option/span") public List <WebElement> selectcityvalue;
				
				public void clickonCityandselectvalue() throws InterruptedException
				{  
					Thread.sleep(900);
					int i;
				    String co="Indore";
				    city.click();
				    List <WebElement> selectcityvalue=driver.findElements(By.xpath("//mat-option/span"));
					for( i=0; i<selectcityvalue.size();i++)
					{
						String countrylist=selectcityvalue.get(i).getText();
						if(countrylist.equalsIgnoreCase(co))
						{
		
							selectcityvalue.get(i).click();
							break;
						}		
					}	  
				}
				
				//get text from selected value
				@FindBy(xpath="//mat-select[@name='city']/div/div/span/span") public  WebElement getselectcityvalue;
				
				public String getselectedcityvalue() throws InterruptedException
				{
					return getselectcityvalue.getText();
				}
				
				
				// select area
				
				@FindBy(xpath="//mat-select[@name='area']") public  WebElement area;

				//select value from area
				@FindBy(xpath="//mat-option/span") public List <WebElement> selectareavalue;
				
				public void clickonAreaandselectvalue() throws InterruptedException
				{  
					Thread.sleep(900);
					int i;
				    String co1="Rau";
				    area.click();
				    List <WebElement> selectareavalue=driver.findElements(By.xpath("//mat-option/span"));
					for( i=0; i<selectareavalue.size();i++)
					{
						String countrylist=selectareavalue.get(i).getText();
						if(countrylist.equalsIgnoreCase(co1))
						{
				
							selectareavalue.get(i).click();
							break;
						}		
					}	  
				}
				
				//get text from selected area
				@FindBy(xpath="//mat-select[@name='area']/div/div/span/span") public  WebElement getselectareavalue;
				public String getselectedareavalue() throws InterruptedException
				{
					return getselectareavalue.getText();  
				}
	
				
				
	// select same as
	@FindBy(xpath="//span[@class='mat-checkbox-inner-container mat-checkbox-inner-container-no-side-margin']") public   WebElement select_same_as;
	
	public void select_same_as()
	{
		select_same_as.click();
	}

	// -----------------------------------------same as  address---------------------------------------------------------------------------------------------

	// your address
	@FindBy(xpath="//textarea[@name='localaddress']") public   WebElement txt_syouraddress;
	
	public void txt_syouraddress(String saddress)
	{
		txt_syouraddress.sendKeys(saddress);
	}
	
	public String stringsaddress()
	{
		return txt_syouraddress.getAttribute("value");
	}

	// PIN code
	@FindBy(xpath="//input[@name='Your Pincode']") public   WebElement txt_spincode;
	
	public void stxt_spincode(String spincode)
	{
		txt_spincode.sendKeys(spincode);
	}
	
	public String stringspincode( )
	{
		return txt_spincode.getAttribute("value");
	}

	
	
	// select local country
	
	@FindBy(xpath="//mat-select[@name='localcountry']") public  WebElement localcountry;

	//select value from local country
	@FindBy(xpath="//mat-option/span") public List <WebElement> selectlocalcountryvalue;
	
	public void clickonlocalcountryandselectvalue() throws InterruptedException
	{  
		Thread.sleep(900);
		int i;
	    String co="India";
	    localcountry.click();
	    List <WebElement> selectlocalcountryvalue=driver.findElements(By.xpath("//mat-option/span"));
		for( i=0; i<selectlocalcountryvalue.size();i++)
		{
			String countrylist=selectlocalcountryvalue.get(i).getText();
			if(countrylist.equalsIgnoreCase(co))
			{
				
				selectlocalcountryvalue.get(i).click();
				break;
			}		
		}	  
	}
	
	//get text from selected local country
	@FindBy(xpath="//mat-select[@name='localcountry']/div/div/span/span") public  WebElement getselectlocalcountryvalue;
	public String getselectedLocalCountryvalue() throws InterruptedException
	{
		return getselectlocalcountryvalue.getText();  
	}



	// select localstate
	
	@FindBy(xpath="//mat-select[@name='localstate']") public  WebElement localstate;

	//select value from localstate
	@FindBy(xpath="//mat-option/span") public List <WebElement> selectlocalstatevalue;
	
	public void clickonlocalstateandselectvalue() throws InterruptedException
	{  
		Thread.sleep(900);
		int i;
	    String co="Madhya Pradesh";
	    localstate.click();
	    List <WebElement> selectlocalstatevalue=driver.findElements(By.xpath("//mat-option/span"));
		for( i=0; i<selectlocalstatevalue.size();i++)
		{
			String countrylist=selectlocalstatevalue.get(i).getText();
			if(countrylist.equalsIgnoreCase(co))
			{
				
				selectlocalstatevalue.get(i).click();
				break;
				
			}		
		}	  
	}
	
	//get text from selected local state
	@FindBy(xpath="//mat-select[@name='localstate']/div/div/span/span") public  WebElement getselectlocalstatevalue;
	public String getselectedselectlocalstatevaluevalue() throws InterruptedException
	{
		return getselectlocalstatevalue.getText();  
	}

	

	// select localdistrict
	
	@FindBy(xpath="//mat-select[@name='localdistrict']") public  WebElement localdistrict;

	//select value from localdistrict
	@FindBy(xpath="//mat-option/span") public List <WebElement> selectlocaldistrictvalue;
	
	public void clickonlocaldistrictandselectvalue() throws InterruptedException
	{  
		Thread.sleep(900);
		int i;
	    String co="Indore";
	    localdistrict.click();
	    List <WebElement> selectlocaldistrictvalue=driver.findElements(By.xpath("//mat-option/span"));
		for( i=0; i<selectlocaldistrictvalue.size();i++)
		{
			String countrylist=selectlocaldistrictvalue.get(i).getText();
			if(countrylist.equalsIgnoreCase(co))
			{
			
				selectlocaldistrictvalue.get(i).click();
				break;
			}		
		}	  
	}
	
	//get text from selected local district
	@FindBy(xpath="//mat-select[@name='localdistrict']/div/div/span/span") public  WebElement getselectlocaldistrictvalue;
	public String getselectedlocaldistrictvalue() throws InterruptedException
	{
		return getselectlocaldistrictvalue.getText();  
	}

// select localcity
	
			@FindBy(xpath="//mat-select[@name='localcity']") public  WebElement localcity;

			//select value from state
			@FindBy(xpath="//mat-option/span") public List <WebElement> selectlocalcityvalue;
			
			
			
			
			public void clickonlocalcityandselectvalue() throws InterruptedException
			{  
				Thread.sleep(900);
				int i;
			    String co="Indore";
			    localcity.click();
			    List <WebElement> selectlocalcityvalue=driver.findElements(By.xpath("//mat-option/span"));
				for( i=0; i<selectlocalcityvalue.size();i++)
				{
					String countrylist=selectlocalcityvalue.get(i).getText();
					if(countrylist.equalsIgnoreCase(co))
					{

						selectlocalcityvalue.get(i).click();
						break;
					}		
				}	  
			}
			
			//get text from selected value
			@FindBy(xpath="//mat-select[@name='localcity']/div/div/span/span") public  WebElement getselectlocalcityvalue;
			public String getselectedlocalcityvalue() throws InterruptedException
			{
				return getselectlocalcityvalue.getText();

			      
			}
			
			
			// select localarea
			
			@FindBy(xpath="//mat-select[@name='localarea']") public  WebElement localarea;

			//select value from area
			@FindBy(xpath="//mat-option/span") public List  <WebElement> selectlocalareavalue;
			
		
			
			
			public void clickonlocalareaandselectvalue() throws InterruptedException
			{  
				Thread.sleep(900);
				int i;
			    String co="Siyaganj";
			    localarea.click();
			    List <WebElement> selectlocalareavalue=driver.findElements(By.xpath("//mat-option/span"));
				for( i=0; i<selectlocalareavalue.size();i++)
				{
					String countrylist=selectlocalareavalue.get(i).getText();
					if(countrylist.equalsIgnoreCase(co))
					{
						
						selectlocalareavalue.get(i).click();
						break;
					}		
				}	  
			}
			
			//get text from selected area
			@FindBy(xpath="//mat-select[@name='localarea']/div/div/span/span") public  WebElement getselectlocalareavalue;
			public String getselectedlocalareavalue() throws InterruptedException
			{
				return getselectlocalareavalue.getText();  
			}

	
	
	/* Other information */

	// click other information
	@FindBy(xpath="//div[text()='OTHER INFORMATION']") public   WebElement otherinformation;
	
	public void otherinformation()
	{
		otherinformation.click();
	}


	   // click on group 
		@FindBy(xpath="//mat-select[@name='grpname']") public  WebElement group;
	
		//select value from group
		@FindBy(xpath="//mat-option[3]") public  WebElement selectgroupvalue;
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='grpname']/div/div/span/span") public  WebElement getselectedvalue;
		
		
		public void clickongroupandselectvalue() throws InterruptedException
		{
			group.click();
			Thread.sleep(150);
			selectgroupvalue.click();
			
		}
		
		public String getselectedgroupvalue() throws InterruptedException
		{
			return getselectedvalue.getText();

		      
		}
		
	 // click on merital status 
	@FindBy(xpath="//mat-select[@name='maritalstatus']") public  WebElement marritalstatus;

	//select value
	@FindBy(xpath="//mat-option[2]") public  WebElement selectmarritalstatus;
	
	//get text from selected value
	@FindBy(xpath="//mat-select[@name='maritalstatus']/div/div/span/span") public  WebElement getselectmarritalstatus;
	
	
	public void clickonmariatalstatusandselectvalue() throws InterruptedException
	{
		Thread.sleep(500);
		marritalstatus.click();
		selectmarritalstatus.click();
	}
	
	public String getselectedmarritalvalue() throws InterruptedException
	{
		return getselectmarritalstatus.getText();  
	}
	
	
	 // click on select party name 
		@FindBy(xpath="//mat-select[@name='partyname']") public  WebElement partyname;

		//select value
		@FindBy(xpath="//mat-option[2]") public  WebElement selectpartyname;
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='partyname']/div/div/span/span") public  WebElement getselectedpartyname;
		
		
		public void clickonpartynamesandselectvalue() throws InterruptedException
		{
			partyname.click();
			Thread.sleep(150);
			selectpartyname.click();
			Thread.sleep(150);
			
		}
		
		public String getselectedpartyvalue() throws InterruptedException
		{
			return getselectedpartyname.getText();

		      
		}
		
	

	// mother name
	@FindBy(xpath="//input[@name='mothername']") public   WebElement txt_mothername;
	
	public void txt_mothername(String mothername)
	{
		txt_mothername.sendKeys(mothername);
	
	}
	
	public String Bstringmothername()
	{
		return txt_mothername.getAttribute("value");
	
	}
	
	public String Astringmothername()
	{
		return txt_mothername.getAttribute("value");
	
	}

	 // click on select Nationality
		@FindBy(xpath="//mat-select[@name='nationality']") public  WebElement nationality;

		//select value
		@FindBy(xpath="//mat-option[2]") public  WebElement selectNationality;
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='nationality']/div/div/span/span") public  WebElement getSelectedNationality;
		
		
		public void clickNationalityAndSelectValue() throws InterruptedException
		{
			nationality.click();
			Thread.sleep(150);
			selectNationality.click();
			Thread.sleep(150);
			
		}
		
		public String getSelectedNationalityValue() throws InterruptedException
		{
			return getSelectedNationality.getText();

		      
		}
	
	// sap
	@FindBy(xpath="//input[@name='sap']") public   WebElement txt_sap;
	
	public void txt_sap(String sap)
	{
		txt_sap.sendKeys(sap);
	}
	
	public String Asap()
	{
		return txt_sap.getAttribute("value");
	
	}
	public String Bsap()
	{
		return txt_sap.getAttribute("value");
	
	}

	// fax no
	@FindBy(xpath="//input[@name='fax']") public   WebElement txt_faxno;
	
	public void txt_faxno(String fax)
	{
		txt_faxno.sendKeys(fax);
	}
	public String Bfax()
	{
		return txt_faxno.getAttribute("value");
	
	}
	public String Afax()
	{
		return txt_faxno.getAttribute("value");
	
	}

	 // click on select blood Group
	@FindBy(xpath="//mat-select[@name='bloodgroup']") public  WebElement bloodGroup;

	//select value
	@FindBy(xpath="//mat-option[2]") public  WebElement selectBloodGroupValue;
	
	//get text from selected value
	@FindBy(xpath="//mat-select[@name='bloodgroup']/div/div/span/span") public  WebElement getSelectedBloodGroupValue;
	
	
	public void clickBloodGroupAndSelectValue() throws InterruptedException
	{
		bloodGroup.click();
	Thread.sleep(150);
		selectBloodGroupValue.click();
		Thread.sleep(150);
		
	}
	
	public String getSelectedBloodGroupValue() throws InterruptedException
	{
		return getSelectedBloodGroupValue.getText();
	      
	}
	
	
	
	 // click on select language
	@FindBy(xpath="//mat-select[@name='language']") public  WebElement language;

	//select value
	@FindBy(xpath="//mat-option[2]") public  WebElement selectLanguageValue;
	
	//get text from selected value
	@FindBy(xpath="//mat-select[@name='language']/div/div/span/span") public  WebElement getSelectedLanguageValue;
	
	
	public void clickLanguageAndSelectValue() throws InterruptedException
	{
		language.click();
		selectLanguageValue.click();
		
		
	}
	
	public String getSelectedLanguageValue() throws InterruptedException
	{
		return getSelectedLanguageValue.getText();
	      
	}

	 // click on select religion
		@FindBy(xpath="//mat-select[@name='religion']") public  WebElement religion;

		//select value
		@FindBy(xpath="//mat-option[3]") public  WebElement selectreligionValue;
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='religion']/div/div/span/span") public  WebElement getSelectedReligionValue;
		
		
		public void clickReligionAndSelectValue() throws InterruptedException
		{
			religion.click();
			 Thread.sleep(150);
			selectreligionValue.click();
			 Thread.sleep(150);
			
		}
		
		public String getSelectedReligionValue() throws InterruptedException
		{
			return getSelectedReligionValue.getText();
		      
		}
     
	
		 // click on select occupation
		@FindBy(xpath="//mat-select[@name='occupation']") public  WebElement Occupation;

		//select value
		@FindBy(xpath="//mat-option[2]") public  WebElement selectOccupationValue;
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='occupation']/div/div/span/span") public  WebElement getSelectedOccupationValue;
		
		
		public void clickOccupationAndSelectValue() throws InterruptedException
		{
			Occupation.click();
			 Thread.sleep(150);
			selectOccupationValue.click();
			 Thread.sleep(150);
			
		}
		
		public String getSelectedOccupationValue() throws InterruptedException
		{
			return getSelectedOccupationValue.getText();
		      
		}
	
		 // click on select Source
		@FindBy(xpath="//mat-select[@name='source']") public  WebElement Source;

		//select value
		@FindBy(xpath="//mat-option[2]") public  WebElement selectSourceValue;
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='source']/div/div/span/span") public  WebElement getSelectedSourceValue;
		
		
		public void clickSourceAndSelectValue() throws InterruptedException
		{
			Source.click();
			 Thread.sleep(150);
			selectSourceValue.click();
			 Thread.sleep(150);
			
		}
		
		public String getSelectedSourceValue() throws InterruptedException
		{
			return getSelectedSourceValue.getText();
		      
		}
	

	// Adhar card
	@FindBy(xpath="//input[@name='adharno']") public   WebElement txt_adharcard;
	
	public void txt_adharcard(String adhar)
	{
		txt_adharcard.sendKeys(adhar);
	}
	
	public String Badharcard()
	{
		return txt_adharcard.getAttribute("value");
	}
	
	public String Aadharcard()
	{
		return txt_adharcard.getAttribute("value");
	}

	// Passport no
	@FindBy(xpath="//input[@name='passportno']") public   WebElement txt_passportno;
	
	public void txt_passportno(String passport)
	{
		txt_passportno.sendKeys(passport);
	}
	
	public String Bpassport()
	{
		return txt_passportno.getAttribute("value");
	}
	
	public String Apassport()
	{
		return txt_passportno.getAttribute("value");
	}

	// is BPL
	@FindBy(xpath="//mat-checkbox[@name='isbpl']") public   WebElement cbox_BPL;
	
	public void cbox_BPL()
	{
		cbox_BPL.click();
	}
	
	public boolean BPL()
	{
		return cbox_BPL.isSelected();
	}

	
	// is tribal
	@FindBy(xpath="//mat-checkbox[@name='istrible']") public   WebElement cbox_tribal;
	public void cbox_tribal()
	{
		cbox_tribal.click();
	}
	
	public boolean trible()
	{
		return cbox_tribal.isSelected();
	}

	 // click on select reffred by
		@FindBy(xpath="//mat-select[@name='referedby']") public  WebElement referedby;

		//select value
		@FindBy(xpath="//mat-option[2]") public  WebElement selectreferedbyValue;
		
		//get text from selected value
		@FindBy(xpath="//mat-select[@name='source']/div/div/span/span") public  WebElement getSelectedreferedbyValue;
		
		
		public void clickreferedbyAndSelectValue() throws InterruptedException
		{
			referedby.click();
			Thread.sleep(150);
			selectreferedbyValue.click();
			Thread.sleep(150);
			
		}
		
		public String getSelectedreferedbyValue() throws InterruptedException
		{
			return getSelectedSourceValue.getText();
		      
		}

	// select referred type
	@FindBy(xpath="//select[@name='reftype']") public   WebElement select_reftype;
	
	public void select_reftype(int reffertype)
	{
	Select s=new Select(select_reftype);
	s.selectByIndex(reffertype);
	}

	// is disabled
	@FindBy(xpath="//mat-checkbox[@name='isdisabled']") public   WebElement cbox_disabled;
	
	public void cbox_disabled()
	{
		cbox_disabled.click();
	}
	
	public boolean disable()
	{
		return cbox_tribal.isSelected();
	}

	// select disabled %
	@FindBy(xpath="	//select[@name='disable' and @data-placeholder='Disable % ']") public   WebElement select_disablepercent;
	
	public void select_disablepercent(int per) throws InterruptedException
	{
    select_disablepercent.click();
	Select s=new Select(select_disablepercent);
	s.selectByIndex(per);
	}
	
	public String Bdisablepercent()
	{
		Select a=new Select(select_disablepercent);
		WebElement a1=a.getFirstSelectedOption();
		 String hello=a1.getText();
		 return hello;
	}
	
	public String Adisablepercent()
	{
		Select a=new Select(select_disablepercent);
		WebElement a1=a.getFirstSelectedOption();
		 String hello=a1.getText();
		 return hello;
	}
	
	


	// is VIP
	@FindBy(xpath="//*[@id=\"mat-checkbox-5\"]/label/span[1]") public   WebElement cbox_isvip;
	
	
	public void cbox_isvip()
	{
		cbox_isvip.click();
	}
    
	public boolean vip()
	{
		return cbox_isvip.isSelected();
	}
	
	
	// select VIP type
	@FindBy(xpath="//select[@name='vip']") public   WebElement select_viptype;
	
	public void select_viptype(int viptype)
	{
	Select s=new Select(select_viptype);
	s.selectByIndex(viptype);
	}
	
	public String Bviptype()
	{
		Select a=new Select(select_viptype);
		WebElement a1=a.getFirstSelectedOption();
		 String hello=a1.getText();
		 return hello;
	}
	
	public String Aviptype()
	{
		Select a=new Select(select_viptype);
		WebElement a1=a.getFirstSelectedOption();
		 String hello=a1.getText();
		 return hello;
	}

	

	// Remarks
	@FindBy(xpath="//input[@name='remarks']") public   WebElement txt_remarks;
	
	public void txt_remarks(String remarks)
	{
		txt_remarks.sendKeys(remarks);
	}
    
	public String Bremarks()
	{
		return txt_remarks.getAttribute("value");
	}
	
	public String Aremarks()
	{
		return txt_remarks.getAttribute("value");
	}
 
	// is Expired
	@FindBy(xpath="//div[@class='col-md-3 col-sm-4']/label/mat-checkbox") public   WebElement cbox_isexpired;
	
	public void cbox_isexpired()
	{
		cbox_isexpired.click();
	}
	
	public boolean expire()
	{
		return cbox_isexpired.isSelected();
	}

	// save/update button
	@FindBy(xpath="//button[@class='mat-focus-indicator btnwidth btn-block btn btn-success mat-raised-button mat-button-base mat-accent']") public   WebElement btn_saveupdate;

	public void btn_saveupdate()
	{
		btn_saveupdate.click();
	}
	
	// clear button
	@FindBy(xpath="//button[@class='mat-focus-indicator btnwidth mat-raised-button mat-button-base mat-warn']") public   WebElement btn_clear;
	
	public void btn_clear()
	{
		btn_clear.click();
	}
	
	// delete
	@FindBy(xpath="mat-focus-indicator btnwidth mat-raised-button mat-button-base mat-primary mat-button-disabled") public   WebElement btn_delete;
	
	public void btn_delete()
	{
		btn_delete.click();
	}
	
	//patient id
	@FindBy(xpath="//input[@name='patientid']")  public WebElement btn_patientID;
	public WebElement patientID()
	{
		btn_patientID.getText();
		return btn_patientID;
	}
	//send patient id
	@FindBy(xpath="//input[@name='patientid']")  public WebElement sendpatientID;
	public String sendpatientID(String send, Keys enter)
	{
		btn_patientID.sendKeys(send);
		return send;
		
	}
	
	//personal information
	@FindBy(xpath="//div[text()='PERSONAL INFORMATION']") public  WebElement personalInformation;
	public void tab_personalInformation()
	{
		personalInformation.click();
	}
	
	//click patient search button
	@FindBy(xpath="//mat-icon[contains(text(),'search')]") WebElement clickpatientsearchbtn;
	
	public void patientseacrhbtn()
	{
		clickpatientsearchbtn.click();
		
	}
	
	//select patient and double click
	
	@FindBy(xpath="//tbody[@role='rowgroup']/child::tr[@role='row']/child::td[2]") WebElement selectpatient;
	
	public void selepatient()
	{
		Actions act=new Actions(driver);
		act.doubleClick(selectpatient).build().perform();
		
	}
	
	//select patient and double click
	
			@FindBy(xpath="//tbody[@role='rowgroup']/child::tr[@role='row']/child::td[1]") WebElement getpatientid;
			
			public String get_patient_id_from_patient_search()
			{
				return getpatientid.getText();
				
			}
			
		//patient search window closing button
			
@FindBy(xpath="//i[contains(text(),'clear')]") WebElement patientSearchWindowCloseButton;
			
			public void  close_patient_search_window()
			{
				 patientSearchWindowCloseButton.click();
				
			}
			
	}
	

