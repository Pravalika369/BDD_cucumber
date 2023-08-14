package com.wipro.testcases;

import org.testng.annotations.Test;

import com.wipro.base.TestBase;
import com.wipro.pages.RegistrationPage;

import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;

public class Registration extends TestBase{
	
	 @BeforeClass
	  public void beforeClass() {
		 String url=" https://demo.automationtesting.in/Register.html"; 
		  launchBrowser();
	  }
  @Test
  	public void RegistrationTest(String first_name,String last_name, String address, String email, String country,int year, int month, int day, String password,String secondpassword){
	  RegistrationPage registrationPage = new RegistrationPage();
	  boolean actResult = registrationPage.createAccount(first_name,last_name,address,email,country,year,month,day,password,secondpassword);
	  Assert.assertTrue(actResult);
	  
  }

  //@DataProvider
 // public Object[][] dp() {
   // return new Object[][] {
     // new Object[] { 1, "a" },
      //new Object[] { 2, "b" },
    //};
  //}

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
