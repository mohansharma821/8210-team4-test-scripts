package automationFramework;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExportDonorsCSV {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "<Path to your WebDriver>");
		System.setProperty("webdriver.chrome.driver", "/Developer/chromedriver");
		WebDriver driver = new ChromeDriver();
		String appUrl = "http://gentle-retreat-83213.herokuapp.com";

		driver.get(appUrl);
		
		// Login
		driver.findElement(By.partialLinkText("Login")).click();;
		driver.findElement(By.id("email")).sendKeys("schurch1992@gmail.com");
		driver.findElement(By.id("password")).sendKeys("password");
		driver.findElement(By.id("password")).submit();
		
		// Download Donors as CSV
		driver.findElement(By.partialLinkText("Donors")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Download')][1]")).click();
		driver.findElement(By.partialLinkText("CSV")).click();
	}

}
