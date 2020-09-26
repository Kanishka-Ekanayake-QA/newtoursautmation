package com.p001;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class Base 
{
	
	static WebDriver driver;

	
		public static void closevideo()
		{
			
			try
			{	
				driver.switchTo().frame("flow_close_btn_iframe");
				driver.findElement(By.id("closeBtn")).click();
				System.out.println("Success");
				driver.switchTo().defaultContent();
			}
			
			catch(NoSuchFrameException e)
			{
					System.out.println(e.toString()+"Fail");
			}
			
		}
		
		public static void Registerinfo()
		{
			WebElement FirstName = driver.findElement(By.name("firstName"));
			FirstName.sendKeys("FirstName");
			WebElement LastName = driver.findElement(By.name("lastName"));
			LastName.sendKeys("LastName");
			WebElement Phone = driver.findElement(By.name("phone"));
			Phone.sendKeys("123456789");
			WebElement UserName = driver.findElement(By.id("userName"));
			UserName.sendKeys("test@test.com");
			WebElement Address = driver.findElement(By.name("address1"));
			Address.sendKeys("Main Street");
			WebElement City = driver.findElement(By.name("city"));
			City.sendKeys("NewYork");
			WebElement State = driver.findElement(By.name("state"));
			State.sendKeys("NewYork");
			Select Country = new Select(driver.findElement(By.name("country")));
			Country.selectByValue("ALBANIA");
			WebElement PostalCode = driver.findElement(By.name("postalCode"));
			PostalCode.sendKeys("14858");
			WebElement email = driver.findElement(By.name("email"));
			email.sendKeys("test@test13.com");
			WebElement Password = driver.findElement(By.name("password"));
			Password.sendKeys("123456");
			WebElement ConfirmPassword = driver.findElement(By.name("confirmPassword"));
			ConfirmPassword.sendKeys("123456");
			WebElement Submit = driver.findElement(By.name("submit"));
			Submit.click();
		
		}
		
		public static void RegValidate()
		{
			
			try
			{
				driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[4]/td/table/tbody/tr/td[2]/table/tbody/tr[1]/td/img"));
				System.out.println("Registration Success");
			}
			catch(NoSuchElementException e)
			{
				System.out.println("Registration fail");
			}
			
		}
		
		public static void logout()
		{
			driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")).click();
		}
		
		public static void login()
		{
			System.out.println("Registration fail");
			driver.findElement(By.name("userName")).sendKeys("test@test12.com");
			driver.findElement(By.name("userName")).sendKeys("123456");
			driver.findElement(By.name("submit")).click();
		}
}