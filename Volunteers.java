package com.msd.assign4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Volunteers {
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		try {
			System.setProperty("webdriver.chrome.driver", "/Users/mohansharma/Documents/workspace/MSD-Assign4/chromedriver");
			WebDriver myChromeDriver = new ChromeDriver();
			
			myChromeDriver.get("http://gentle-retreat-83213.herokuapp.com/");
			Thread.sleep(500);
			myChromeDriver.findElement(By.linkText("Login")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.id("email")).clear();
			Thread.sleep(500);
			myChromeDriver.findElement(By.id("email")).sendKeys("admin@email.com");
			Thread.sleep(500);
			myChromeDriver.findElement(By.id("password")).clear();
			Thread.sleep(500);
			myChromeDriver.findElement(By.id("password")).sendKeys("password");
			Thread.sleep(500);
			myChromeDriver.findElement(By.cssSelector("button.btn.btn-primary")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.linkText("Librarian Tools")).click();
			Thread.sleep(500);
		    myChromeDriver.findElement(By.linkText("Volunteers")).click();
		    Thread.sleep(500);
		    myChromeDriver.findElement(By.xpath("//img[contains(@src,'http://gentle-retreat-83213.herokuapp.com/images/logo2.png')]")).click();
		    Thread.sleep(500);
		    myChromeDriver.findElement(By.linkText("Admin")).click();
		    Thread.sleep(500);
		    myChromeDriver.findElement(By.linkText("Logout")).click();
			
			// myChromeDriver.quit();

		} catch (Exception e) {
			System.out.println("Error:" + e.getMessage());
		}

	}


}