package com.vtiger.login;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class makemytrip 
{

	public static void main(String[] args) throws InterruptedException 
	{
		 WebDriverManager.firefoxdriver().setup();
			WebDriver driver = new FirefoxDriver();
			driver.get("https://www.google.com/");
			driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			driver.manage().window().maximize();
			driver.findElement(By.xpath("//input[@class='gLFyf gsfi']")).sendKeys("stop watch online");
			
			 driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']//input[@value='Google Search']")).click();
			driver.findElement(By.xpath("//span[.='Start']")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//span[.='Stop']")).click();
			
			 WebElement ele = driver.findElement(By.xpath("//div[@class='act-tim-txt-cnt']"));
		
			System.out.println(ele.getText());
			/*
			 * driver.findElement(By.xpath("//li[.='Round Trip']")).click();
			 * Thread.sleep(2000); driver.findElement(By.xpath("//span[.='From']")).click();
			 * Thread.sleep(2000); //WebElement from = driver.findElement(By.xpath(
			 * "//label//span[.='From']/..//input[@id='fromCity']")); //from.click();
			 * WebElement from =
			 * driver.findElement(By.xpath("//input[@placeholder='From']"));
			 * Thread.sleep(1000); from.sendKeys("Bengaluru International Airport");
			 * Thread.sleep(1000);
			 * driver.findElement(By.xpath("//p[.='Bengaluru, India']")).click();
			 * Thread.sleep(1000);
			 * 
			 * driver.findElement(By.xpath("//span[.='To']")).click(); Thread.sleep(1000);
			 * driver.findElement(By.xpath("//input[@placeholder='To']")).
			 * sendKeys("Delhi, India");
			 * driver.findElement(By.xpath("//p[.='Delhi, India']")).click();
			 * driver.close();
			 */
					
			
			
			
	}

}
