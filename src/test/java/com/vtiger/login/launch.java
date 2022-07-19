package com.vtiger.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class launch 
{

	public static void main(String[] args) throws AWTException, InterruptedException 
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://localhost:8888");
		driver.get("https://www.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
		driver.get("http://www.facebook.com");
		driver.get("http://www.instagram.com");
		/*Robot r = new Robot();
		for(int i=0;i<3;i++)
		{
			r.keyPress(KeyEvent.VK_CONTROL);
			r.keyPress(KeyEvent.VK_T);
			Thread.sleep(2000);
			r.keyRelease(KeyEvent.VK_CONTROL);
			r.keyRelease(KeyEvent.VK_T);
		}
	
		 Set<String> get = driver.getWindowHandles();
			ArrayList<String> l = new ArrayList<String>(get);
		 
			
			String a1 = l.get(1);
			driver.switchTo().window(a1);
			Thread.sleep(2000);
				driver.close();
		 }*/
		 
		
	
	}			
			
		
		
}
	

