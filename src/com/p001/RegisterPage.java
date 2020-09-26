package com.p001;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage{


		static WebDriver driver;
		By FirstName = (By.name("firstName"));
		
		public static void Registerinfo(By firstName)
		{
			driver.findElement(firstName).sendKeys("Test");
		}
		

	
}
