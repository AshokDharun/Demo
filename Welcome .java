package testdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Boomlogout 
{
public static void main(String[] args) 
{
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	RemoteWebDriver driver=new ChromeDriver();
	driver.get("http://52.66.129.203:4200/#/auth/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("mat-input-0")).sendKeys("8680097929");
	driver.findElement(By.id("mat-input-1")).sendKeys("Ashok@123");
	driver.findElement(By.id("kt_login_signin_submit")).click();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.findElement(By.linkText("Search Customer")).click();
	//driver.findElement(By.xpath("//input[@id='mat-input-2']")).sendKeys("8680097929",Keys.ENTER);
	driver.findElement(By.id("mat-input-2")).sendKeys("8680097929");
	/*
	 * logout
	
	driver.findElement(By.xpath("//span[contains(text(),'Ashoktest')]")).click();
	driver.findElement(By.xpath("//a[contains(text(),'Sign')]")).click();
	 */
	
}
}

