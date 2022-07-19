package com.vtiger.login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.stream.FileImageInputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ipl
{
public static void main(String[]args) throws IOException
{
	// TODO Auto-generated method stub


	   FileInputStream file = new FileInputStream("./src/test/resources/rmgyantra.xlsx") ;
	   Workbook book = WorkbookFactory.create(file);
	   Sheet shee = book.getSheet("ipl");
	   
	  
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.icc-cricket.com/rankings/mens/team-rankings/test");//https://www.cricbuzz.com/cricket-series/3472/indian-premier-league-2021/points-table");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		List<WebElement> ele = driver.findElements(By.xpath("//tr[2]/td[2]"));//table[@class='table cb-srs-pnts']"));
		for(WebElement ele1:ele)
		{
			 
			   System.out.println(ele1.getText());
			  
	}

}

}
