package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pageObjects.LandingPage;
import pageObjects.LoginDashBoard;
import utility.BaseClass;


public class LoginPageTest extends BaseClass {
	
	 //Verify WebNetram title
    @Test(priority=1)
	public void verifyApplicationTitle()
	{
   
    	SoftAssert soft=new SoftAssert();
        logger.info("Browser is started");
		String title=driver.getTitle();
	
	
		if(title.equalsIgnoreCase("Webnetram-Login"))
		{
			 soft.assertFalse(false);
			 logger.info("Website title is verfied");
		
		}
		else
			soft.assertFalse(true);
		    logger.debug("Website title is not matched");
		
	}
    
    //Verify facebook page title
    @Test(priority=2)
  		public void verifyFacebookPageTitle() throws InterruptedException
  		{
   	        LandingPage lp = new LandingPage(driver);
  	    	lp.verifyfacebooktitle();
  	    	logger.info("facebook title is verfied");
  	    	
  			
  		}
	
    //Verify twitter page title
    @Test(priority=3)
	public void verifyTwitterPageTitle() throws InterruptedException
	{
    	
   	 LandingPage lp = new LandingPage(driver);
  	    	lp.verifyTwittertitle();
  	    	logger.info("twitter title is verfied");
  	    
	}
	
    //Verify youtube page title
	@Test(priority = 4, enabled=false)
	public void verifyYoutubePageTitle() throws InterruptedException
	{
   	 LandingPage lp = new LandingPage(driver);
  	    	lp.verifyYoutubetitle();
  	    	 logger.info("youtube title is verfied");
  	    	
	}
	
    //Verify linkedin page title
    @Test(priority=5)
	public void verifyLinked_inPageTitle() throws InterruptedException
	{
    
   	 LandingPage lp = new LandingPage(driver);
  	    	lp.verifyLinkedIntitle();
  	    	 logger.info("linkedIn title is verfied");
  	    	
	}
	
    //Verify instagram page title
    @Test(priority=6)
	public void verifyInstagramPageTitle() throws InterruptedException
	{
   	 LandingPage lp = new LandingPage(driver);
  	    	lp.verifyInstagramtitle();
  	    	 logger.info("instagram title is verfied");
  	    
	}
    
    //Verify Eli health emr website  page title
    @Test(priority=7, enabled=false)
	public void verifyEliWebsiteTitle() throws InterruptedException
	{
    
   	 LandingPage lp = new LandingPage(driver);
  	    	lp.verifyEliwebsitetitle();
  	    	 logger.info("eli health website title is verfied");
  	    	
	}
    
 
    	@Test(priority=8)
		public void valid_Userid_Invalid_password() throws InterruptedException
		{   
			LandingPage lp=new LandingPage(driver);
			lp.enterUserName("Admin");
			lp.enterPassword("a123");
			if(lp.verifybtndisplayed())
			{
				Assert.assertTrue(true);
			}
			else
				Assert.assertFalse(false);
		}
		
		
		@Test(priority=9)
		public void invalid_Userid_valid_password() throws InterruptedException
		{   
			LandingPage lp=new LandingPage(driver);
			lp.enterUserName("Admin123");
			lp.enterPassword("a");
			if(lp.verifybtndisplayed())
			{
				Assert.assertTrue(true);
			}
			else
				Assert.assertFalse(false);	
		}
		
		
		@Test(priority=10)
		public void invalid_Userid_Invalid_password() throws InterruptedException
		{   
			LandingPage lp=new LandingPage(driver);
			lp.enterUserName("Admin123");
			lp.enterPassword("a232");
			if(lp.verifybtndisplayed())
			{
				Assert.assertTrue(true);
			}
			else
				Assert.assertFalse(false);	
		}
		
		
		@Test(priority=11)
		public void Blank_Userid_Blank_password() throws InterruptedException
		{   
			LandingPage lp=new LandingPage(driver);
			lp.enterUserName("");
			lp.enterPassword("");
			if(lp.verifybtndisplayed())
			{
				Assert.assertTrue(true);
			}
			else
				Assert.assertFalse(false);
		}
		
		@Test(priority=12)
		public void valid_Userid_valid_password() throws InterruptedException 
		{   
			LandingPage lp=new LandingPage(driver);
			lp.enterUserName("Admin");
			lp.enterPassword("a");
			LoginDashBoard ldp=new LoginDashBoard(driver);
			if(ldp.dashboardBtndisplayed())
			{
				Assert.assertTrue(true);
			}
			else
				Assert.assertFalse(false);
		}
    }

