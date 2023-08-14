package com.wipro.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.wipro.base.TestBase;

public class RegistrationPage extends TestBase{
	
	public static WebDriver driver;
	
	public void launchbrowser() {
		System.setProperty("webdriver.chrome.driver", "/Users/GP20450709/Downloads/chromedriver_mac64/chromedriver");
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

	
		By first_name=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[1]/input");
		By last_name=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[1]/div[2]/input");
		By address=By.xpath("//textarea[@class=\"form-control ng-pristine ng-valid ng-touched\"]");
		By email=By.xpath("//input[@class=\"form-control ng-pristine ng-valid-email ng-invalid ng-invalid-required ng-touched\"]");
		By radiobtn=By.className("ng-valid ng-dirty ng-valid-parse ng-touched");
		By hobbies=By.id("checkbox1");
		By hobbies1=By.id("checkbox2");
		By languages=By.className("ui-corner-all");
		By skills=By.xpath("//*[@id=\"Skills\"]/option[32]");
		By country=By.id("countries");
		By country1=By.xpath("//*[@id=\"select2-country-results\"]/li[6]");
		By year=By.id("yearbox");
		By month=By.xpath("//*[@id=\"basicBootstrapForm\"]/div[11]/div[2]/select");
		By day=By.id("daybox");
		By password=By.xpath("//*[@id=\"firstpassword\"]");
		By secondpassword=By.id("secondpassword");
		By submit=By.id("submitbtn");
		
		public boolean createAccount(String first_name1,String last_name1, String address1, String email1, String country2,int year1, int month1, int day1, String password1,String secondpassword1) {
			
			driver.findElement(first_name).sendKeys("pravalika");
			driver.findElement(last_name).sendKeys("gaddam");
			driver.findElement(address).sendKeys("Hyderabad");
			driver.findElement(email).sendKeys("g.pravalika@gmail.com");
			driver.findElement(radiobtn).click();
			driver.findElement(hobbies).click();
			driver.findElement(hobbies1).click();
			driver.findElement(languages).click();
			driver.findElement(skills).click();
			driver.findElement(country).click();;
			driver.findElement(country1).sendKeys("India");
			driver.findElement(year).sendKeys("2001");
			driver.findElement(month).sendKeys("09");
			driver.findElement(day).sendKeys("14");
			driver.findElement(password).sendKeys("pravalika@123");
			driver.findElement(secondpassword).sendKeys("pravalika@123");
			driver.findElement(submit).click();
			
			WebDriverWait wait = new WebDriverWait(driver,10);
			boolean actResult = true;
			return actResult;
			
		}

}
