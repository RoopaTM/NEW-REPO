package com.vtiger.login;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.testng.annotations.Test;

public class file 
{
	@Test(priority = 1)
	public void test1()
	{
		System.out.println("test1");
	}
	
	@Test
	public void test2()
	{
		System.out.println("test22");
	}
	
	@Test(priority =2)
	public void test3()
	{
		System.out.println("test333");
	}
//	@Test(priority =-1)
//	public void test4()
//	{
//		System.out.println("test4444");
//	}
	
	

	
}

