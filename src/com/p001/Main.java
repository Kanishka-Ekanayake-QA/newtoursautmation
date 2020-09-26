package com.p001;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Main extends Base {


	public static void main(String[] args){
		
		
		System.setProperty("webdriver.chrome.driver", "D:\\3.Trainings\\Drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/test/newtours/");
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Base.closevideo();
		
		By Register = By.xpath("/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[2]/a");
		driver.findElement(Register).click();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		//Base.closevideo();
		Base.Registerinfo();
		Base.RegValidate();
		Base.logout();
		//Base.closevideo();
		//Base.closevideo();
		Base.login();
		
		
	}

}
