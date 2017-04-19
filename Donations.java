package com.msd.assign4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Donations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try 
		{
			
			System.setProperty("webdriver.chrome.driver", "/Users/mohansharma/Documents/workspace/MSD-Assign4/chromedriver");
			WebDriver myChromeDriver = new ChromeDriver();
			myChromeDriver.get("http://gentle-retreat-83213.herokuapp.com");
			Thread.sleep(500);
			myChromeDriver.findElement(By.linkText("Login")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.name("email")).sendKeys("admin@email.com");
			Thread.sleep(500);
			myChromeDriver.findElement(By.name("password")).sendKeys("password");
			Thread.sleep(500);
			myChromeDriver.findElement(By.cssSelector("button.btn.btn-primary")).click();
			Thread.sleep(500);
			myChromeDriver.navigate().to("http://gentle-retreat-83213.herokuapp.com/donated-items");
			Thread.sleep(500);
			myChromeDriver.findElement(By.linkText("Create Donated Item")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.id("description")).clear();
			myChromeDriver.findElement(By.id("description")).sendKeys("My new donation");
			Thread.sleep(500);
			myChromeDriver.findElement(By.id("item_value")).clear();
			myChromeDriver.findElement(By.id("item_value")).sendKeys("4.5");			
			Thread.sleep(500);
			myChromeDriver.findElement(By.xpath("//input[@value='Save']")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.xpath("(//a[contains(text(),'View')])[1]")).click();
			Thread.sleep(500);
			Thread.sleep(500);
			myChromeDriver.findElement(By.linkText("Admin")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.linkText("Logout")).click();
			
		} 
		
		catch (Exception e) 
		{
			System.out.println("Error:" + e.getMessage());
		}

	}

}
