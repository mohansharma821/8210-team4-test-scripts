package testSignuploginlogoutaddupdatedeletelibrary;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.bcel.generic.Select;
import org.junit.*;
import static org.junit.Assert.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import com.gargoylesoftware.htmlunit.javascript.host.dom.Selection;

import org.openqa.selenium.WebDriver;
import jxl.Workbook;

import java.util.regex.Pattern;
import static org.hamcrest.CoreMatchers.*;




public class Signuploginlogoutaddupdatedeletelibrary {
  private WebDriver driver;
  private String baseUrl;
  private StringBuffer verificationErrors = new StringBuffer();
  private File excel;

  @Before
  public void setUp() throws Exception {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\v_dar\\Downloads\\chromedriver_win32\\chromedriver.exe");
	  driver = new ChromeDriver();
    baseUrl = "https://gentle-retreat-83213.herokuapp.com/";
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    excel = new File("E:/Onedrive/workspace/Excelfile/LibraryTestData.xls");
  }

  @Test
  public void testSignuploginlogoutaddupdatedeletelibrary() throws Exception {
    driver.get(baseUrl + "/");
    Workbook wb=Workbook.getWorkbook(excel);
    
    driver.findElement(By.linkText("Register")).click();
    driver.findElement(By.id("name")).clear();
    String name=wb.getSheet(0).getCell(1,1).getContents();
    driver.findElement(By.id("name")).sendKeys(name);
    driver.findElement(By.id("email")).clear();
    String email=wb.getSheet(0).getCell(1,2).getContents();
    driver.findElement(By.id("email")).sendKeys(email);
    String password=wb.getSheet(0).getCell(1,3).getContents();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(password);
    driver.findElement(By.id("password-confirm")).clear();
    driver.findElement(By.id("password-confirm")).sendKeys(password);
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText(name)).click();
    driver.findElement(By.linkText("Logout")).click();

    
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.linkText("Login")).click();
    driver.findElement(By.id("email")).clear();
    String Librarian_email=wb.getSheet(0).getCell(1,6).getContents();
    driver.findElement(By.id("email")).sendKeys(Librarian_email);
    String Librarian_password=wb.getSheet(0).getCell(1,7).getContents();
    driver.findElement(By.id("password")).clear();
    driver.findElement(By.id("password")).sendKeys(Librarian_password);
    driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
    driver.findElement(By.linkText("Librarian Tools")).click();
    driver.findElement(By.linkText("Libraries")).click();
    
    {
    for(int cell_ref=12; cell_ref<18; cell_ref++)
    {
    driver.findElement(By.linkText("Create Library")).click();
    driver.findElement(By.id("library_name")).clear();
    String Libray_name=wb.getSheet(0).getCell(0,cell_ref).getContents();
    driver.findElement(By.id("library_name")).sendKeys(Libray_name);
    String Libray_add=wb.getSheet(0).getCell(1,cell_ref).getContents();
    driver.findElement(By.id("library_address")).clear();
    driver.findElement(By.id("library_address")).sendKeys(Libray_add);
    String Libray_city=wb.getSheet(0).getCell(2,cell_ref).getContents();
    driver.findElement(By.id("library_city")).clear();
    driver.findElement(By.id("library_city")).sendKeys(Libray_city);
    String Libray_state=wb.getSheet(0).getCell(3,cell_ref).getContents();
    driver.findElement(By.id("library_state")).sendKeys(Libray_state);
    String Libray_zip=wb.getSheet(0).getCell(4,cell_ref).getContents();
    driver.findElement(By.id("library_zip")).clear();
    driver.findElement(By.id("library_zip")).sendKeys(Libray_zip);
    String Librarian_name=wb.getSheet(0).getCell(5,cell_ref).getContents();
    driver.findElement(By.id("librarian")).clear();
    driver.findElement(By.id("librarian")).sendKeys(Librarian_name);
    String Librarian_email1=wb.getSheet(0).getCell(6,cell_ref).getContents();
    driver.findElement(By.id("librarian_email")).clear();
    driver.findElement(By.id("librarian_email")).sendKeys(Librarian_email1);
    String Librarian_phone=wb.getSheet(0).getCell(7,cell_ref).getContents();
    driver.findElement(By.id("work_phone")).clear();
    driver.findElement(By.id("work_phone")).sendKeys(Librarian_phone);
    driver.findElement(By.xpath("//input[@value='Save']")).click();
    }
    }
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath("(//a[contains(text(),'Update')])[8]")).click();
    driver.findElement(By.id("library_name")).clear();
    String ULibrary_name=wb.getSheet(0).getCell(0,21).getContents();
    driver.findElement(By.id("library_name")).sendKeys(ULibrary_name);
    driver.findElement(By.id("librarian")).clear();
    String ULibrarian_name=wb.getSheet(0).getCell(5,21).getContents();
    driver.findElement(By.id("librarian")).sendKeys(ULibrarian_name);
    driver.findElement(By.xpath("//input[@value='Update']")).click();
    
    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.findElement(By.xpath("(//input[@value='Delete'])[6]")).click();
  }

  @After
  public void tearDown() throws Exception {
    // driver.quit();
    String verificationErrorString = verificationErrors.toString();
    if (!"".equals(verificationErrorString)) {
      fail(verificationErrorString);
    }
  }
}
