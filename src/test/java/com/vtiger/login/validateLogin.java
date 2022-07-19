package com.vtiger.login;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class validateLogin 
{
	
@Test (dataProvider = "loginData")
	public void creatloginTest(String username,String password)
	{
	  WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.MINUTES);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys(password);
		driver.findElement(By.xpath("//button[@id='loginbutton']")).click();
		if(driver.getTitle().contains("Log in to Facebook"))
		{
		  System.out.println("username and password is valid and accepting");	
	    }
		else
		{
			System.out.println("username and password is invalid and not accepting");	
		}
	}
	@DataProvider
	public  Object[][] loginData()
	{
	Object[][] data=new Object[3][2];
	data[0][0]="8197940953";
    data[0][1]="roopa@123";	
    
    data[1][0]="8088767583";
    data[1][1]="8088767583";
    
    data[2][0]="username";
    data[2][1]="password";
	
    return data;
	
}
}