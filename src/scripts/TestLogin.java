package scripts;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseClass;
import pages.LoginPage;

public class TestLogin extends BaseClass	 {

	@Test
	public void test() {
		LoginPage loginPage = new LoginPage(driver);
		Reporter.log("successsss",true);
		loginPage.closeButton();
	}
}
