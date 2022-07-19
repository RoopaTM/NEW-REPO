package com.vtiger.login;


import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteOrg 
{
	@Test
	public void test1() throws Throwable
	{
		Random random = new Random();
		int randomnumber = random.nextInt(100);
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		driver.navigate().to("http://localhost:8888");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("adm");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@value='Login' and @id='submitButton']")).click();
		driver.findElement(By.xpath("//a[.='Organizations']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//img[@title='Create Organization...']")).click();
		String orgname="RoopaTm"+randomnumber;
		System.out.println(orgname);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
		driver.findElement(By.xpath("//input[@accesskey='S']")).click();
		Thread.sleep(1000);
		driver.navigate().back();
		List<WebElement> allorgNames = driver.findElements(By.xpath("//table[@class='lvt small']/tbody/tr/td[3]"));
		for(WebElement e:allorgNames)
		{
			
			String ele = e.getText();
			System.out.println(ele);
		if(ele.contains(orgname))
		{
			driver.findElement(By.xpath("//input[@name='selectall']")).click();
	 // driver.findElement(By.xpath("//a[.='Organization No']/../../following-sibling::tr[2]/td//input[@type='checkbox']")).click();
			Thread.sleep(1000);
			driver.findElement(By.xpath("//table[@class='small']/tbody/tr/td//input[@class='crmbutton small delete']")).click();
			Robot robot = new Robot();
			Thread.sleep(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
		}

}

	}
}

