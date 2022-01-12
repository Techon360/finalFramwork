package testCases;
// change the password and login with change password.

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.LandingPage;
import pageObjects.LoginDashBoard;
import pageObjects.PasswordChange;
import utility.BaseClass;

@Test
public class PasswordChangeVerification extends BaseClass {

	@Test(description = "Changing password", priority = 1)
	public void passwordChange() throws Throwable {
		 LandingPage lp = new LandingPage(driver);
		 LoginDashBoard ld = new LoginDashBoard(driver);
		 PasswordChange pc = new PasswordChange(driver);
		// Enter valid password
		 lp.enterUserName("Admin");
			lp.enterPassword("a");  
		logger.debug("user entered existing password");
		// click change password button
		ld.clickchangepassword();
		logger.debug("clicked on password change button");
		// enter old password
		pc.oldpass("aa");
		logger.debug("entered old password");
		Thread.sleep(1000);
		// enter new password
		pc.newpass("aaaa");
		logger.debug("entered new password");
		Thread.sleep(1000);
		// enter confirm password
		pc.confirmpass("aaaa");
		logger.debug("Re-entered new password");
		Thread.sleep(1000);
		// click change password
		pc.changepass();
		logger.debug("clicked on change password");
		Thread.sleep(1000);
		System.out.println("password changed");
		Thread.sleep(1000);

	}

	@Test(description = "login with new password and verify passowrd is changed", priority = 2)
	public void login_with_new_passowrd() throws InterruptedException {
		 LoginDashBoard ld = new LoginDashBoard(driver);
		logger.warn("password change verfication is started");
		LandingPage lp = new LandingPage(driver);
		logger.warn("landing to login page");
		lp.mainurl();
		lp.enterUserName("Admin");
		lp.enterPassword("a");  
		logger.debug("entered new password");
		boolean Truestatus = true;
		if (ld.dashboardBtndisplayed() == Truestatus) {
			Assert.assertTrue(true);
			logger.debug("user logged in with new password successfully");

		} else
			Assert.assertFalse(true);
		logger.error("user logged failed with new password successfully");
	}

}
