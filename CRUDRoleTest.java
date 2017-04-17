package automationFramework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Random;

public class CRUDRoleTest {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "<Path to your WebDriver>");
		System.setProperty("webdriver.chrome.driver", "/Developer/chromedriver");
		WebDriver driver = new ChromeDriver();
		String appUrl = "http://gentle-retreat-83213.herokuapp.com";
		String name = "Role" + Integer.toString(randInt(1,1000));
		String description = name + " description.";
		String newName = "Role" + Integer.toString(randInt(1,1000));
		String newDescription = newName + " description.";
		
		driver.get(appUrl);
		
		// Login
		driver.findElement(By.partialLinkText("Login")).click();;
		driver.findElement(By.id("email")).sendKeys("schurch1992@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("password")).submit();
		
		// Create New Role
		driver.findElement(By.partialLinkText("Admin Tools")).click();
		driver.findElement(By.partialLinkText("Roles")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.name("name")).sendKeys(name);
		driver.findElement(By.name("display_name")).sendKeys(name);
		driver.findElement(By.name("description")).sendKeys(description);
		for(WebElement current : driver.findElements(By.name("permission[]"))) {
			if(randInt(1,2) == 2) {
				current.click();
			}
		}
		driver.findElement(By.name("description")).submit();
		
		
		// Read Role Created
		for(WebElement current : driver.findElements(By.xpath("//td[text()='" + description + "']/../td/a"))) {
			try {
				current.click();
			} catch(Exception e) {}
		}
		driver.findElement(By.partialLinkText("Back")).click();
		
		
		// Update Role Created
		for(WebElement current : driver.findElements(By.xpath("//td[text()='" + description + "']/../td/following::a[text()='Edit']"))) {
			try {
				current.click();
			} catch(Exception e) {}
		}
		driver.findElement(By.name("display_name")).clear();
		driver.findElement(By.name("description")).clear();
		driver.findElement(By.name("display_name")).sendKeys(newName);
		driver.findElement(By.name("description")).sendKeys(newDescription);
		for(WebElement current : driver.findElements(By.name("permission[]"))) {
			if(randInt(1,2) == 2) {
				current.click();
			}
		}
		driver.findElement(By.name("description")).submit();
		
		//Delete Role Created & Updated
		for(WebElement current : driver.findElements(By.xpath("//td[text()='" + newDescription + "']/../td/following::form"))) {
			try {
				current.submit();;
			} catch(Exception e) {}
		}
	}
	
	public static int randInt(int min, int max) {
	    Random rand = new Random();
	    int randomNum = rand.nextInt((max - min) + 1) + min;
	    return randomNum;
	}

}
