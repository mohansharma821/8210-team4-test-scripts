package com.msd.assign4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

// import com.sun.org.apache.bcel.internal.generic.Select;

public class Appeals {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		try {
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
			myChromeDriver.navigate().to("http://gentle-retreat-83213.herokuapp.com/appeals");
			Thread.sleep(500);
			myChromeDriver.findElement(By.linkText("Create Appeal")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.name("description")).sendKeys("Old Books for sale");
			Thread.sleep(500);
			myChromeDriver.findElement(By.name("start_date_time")).sendKeys("05/01/2017 9:00 AM");
			Thread.sleep(500);
			myChromeDriver.findElement(By.name("end_date_time")).sendKeys("05/01/2017 5:00 PM");
			Thread.sleep(500);
			myChromeDriver.findElement(By.name("type")).sendKeys("Email");
			Thread.sleep(500);
			myChromeDriver.findElement(By.xpath("//input[@value='Save']")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.xpath("(//a[contains(text(),'View')])[1]")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.linkText("Librarian Tools")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.linkText("Appeals")).click();
			Thread.sleep(500);
			myChromeDriver.findElement(By.xpath("(//input[@value='Delete'])[3]")).click();
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
