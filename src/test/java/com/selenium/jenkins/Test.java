package com.selenium.jenkins;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test {

WebDriver driver;
	
@BeforeTest
public void precondition1()
{
	WebDriverManager.firefoxdriver().setup();
	driver = new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://demo.automationtesting.in/Register.html"); // to open URL
	
}

@org.testng.annotations.Test
public void test()
{
	System.out.println("new test");
	org.openqa.selenium.WebElement addr =		driver.findElement(By.tagName("textarea"));
	
	addr.click();
	addr.clear();
	addr.sendKeys("Perungudi");
		
}

@AfterTest
public void closebrowser()
{
	driver.close();
}
	
}
