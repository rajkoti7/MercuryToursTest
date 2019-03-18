package com.mercury.qa.testcases;



import org.apache.log4j.Logger;
//import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.mercury.qa.base.TestBase;
import com.mercury.qa.pages.HomePage;
import com.mercury.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	LoginPage loginpage;
	HomePage homepage;
	//static WebDriver driver;
	Logger log = Logger.getLogger(LoginPageTest.class);
	
	//PropertyConfigurator.configure("log4j.properties");
	
	public LoginPageTest() {
		super();
		
	}
	@BeforeMethod
	public void setUp() {
		initialization();
		 loginpage=new LoginPage();
		 homepage=new HomePage();
		 	log.info("entering application URL");
			log.warn("Hey this just a warning message");
			log.fatal("hey this is just fatal error message");
			log.debug("this is debug message");
			
	}
	
	@Test(priority=1)
	public void validateLoginTitleTest() {
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** MercuryToursTest *****************************************");
		String title= loginpage.validateLoginTitle();
		Assert.assertEquals(title, "Welcome: Mercury Tours");
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** MercuryToursTest *****************************************");
		
	}
	@Test(priority=2)
	public void validateTitleLogoTest() {
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** MercuryToursTest *****************************************");
		boolean flag=loginpage.validateTitleLogo();
		Assert.assertTrue(flag);
		log.info("****************************** ending test case *****************************************");
		log.info("****************************** MercuryToursTest *****************************************");
	}
	@Test(priority=1)
	public void validateLoginTest() {
		log.info("****************************** starting test case *****************************************");
		log.info("****************************** MercuryToursTest *****************************************");
	homepage=loginpage.validateLogin(prop.getProperty("username"), prop.getProperty("password"));
	log.info("****************************** ending test case *****************************************");
	log.info("****************************** MercuryToursTest *****************************************");
	}
	
	@AfterMethod
	public void teardown() {
	driver.quit();
	
}
}
