package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpdVisitPage {
	
	WebDriver driver;
	
	public OpdVisitPage(WebDriver ldriver)
	{
		this.driver=ldriver;
		PageFactory.initElements(driver, this);
	}
	
	//patrint walkin button
	@FindBy(xpath=("//mat-radio-button[@value='1']")) WebElement walkin_chbox;
	
	public void click_walikin()
	{
		walkin_chbox.click();
	}
	
	//patrint With appointment button
		@FindBy(xpath=("//mat-radio-button[@value='2']")) WebElement appointment_chbox;
		

		public void click_appointment()
		{
			appointment_chbox.click();
		}
		
		//click patient search button
		@FindBy(xpath="//mat-icon[contains(text(),'search')]") WebElement clickpatientsearchbtn;
		
		public void patientseacrhbtn()
		{
			clickpatientsearchbtn.click();
			
		}
		
		//select patient and double click
		
		@FindBy(xpath="//tr[@role='row']/td") WebElement selectpatient;
		
		public void selepatient()
		{
			Actions act=new Actions(driver);
			act.doubleClick(selectpatient).build().perform();
			
		}
	public String getselepatient()
	{
		return selectpatient.getText();

	}

		//appointment patient id
		
         @FindBy(xpath="//input[@name='patid']") WebElement txt_patientid;
		
		public void appointmentpatientid(String sendid)
		{	
			txt_patientid.sendKeys(sendid);
		}
		
		//select doctor
		
        @FindBy(xpath="//mat-select[@name='userid']") WebElement doctor;
		
      //select value from doctor
      		@FindBy(xpath="//mat-option[2]") public  WebElement selectDoctor;
     
      		public void clickonDoctorandselectvalue() throws InterruptedException
      		{
      			doctor.click();
      			Thread.sleep(150);
      			selectDoctor.click();
      			
      		}
      		
      		
      	
		
      		//select category
    		
            @FindBy(xpath="//mat-select[@name='categoryid']") WebElement category;
    		
          //select value from group
          		@FindBy(xpath="//mat-option[2]") public  WebElement selectCategory;
         
          		public void clickonCategoryandselectvalue() throws InterruptedException
          		{
          			category.click();
          			Thread.sleep(150);
          			selectCategory.click();
          			
          		}
		
          	//select Referedby
        		
                @FindBy(xpath="//mat-select[@name='referedby']") WebElement referedby;
        		
              //select value from Referedby
              		@FindBy(xpath="//mat-option[2]") public  WebElement selectReferedby;
             
              		public void clickonReferedbyandselectvalue() throws InterruptedException
              		{
              			referedby.click();
              			Thread.sleep(150);
              			selectReferedby.click();
              			
              		}
		
        //Appointment remarks
		
        @FindBy(xpath="//textarea[@name='reason']") WebElement appointmentreason;
		
		public void appointmentreason(String remarks)
		{	
			appointmentreason.sendKeys(remarks);
		} 
		
         //Appointment save/update button
		
        @FindBy(xpath="//button[contains(text(),' Save Opd Visit ')]") WebElement appointmentsaveupdatebtn;
		
		public void appointmentsavebutton()
		{	
			appointmentsaveupdatebtn.click();
		} 
		
            //Appointment clear button
		
        @FindBy(xpath="//input[contains(text(),' Clear All ')]") WebElement appointmentclearbtn;
		
		public void appointmentclearbutton()
		{	
			appointmentclearbtn.click();
		} 
		
		
	

}
