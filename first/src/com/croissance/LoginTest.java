package com.croissance;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class LoginTest {

	@Test
public void testLogin() throws InterruptedException
{
	
	WebDriver dr = new FirefoxDriver();
	
	dr.navigate().to("https://www.facebook.com/");
	
	dr.findElement(By.xpath("//*[@id='email']")).sendKeys("kapiladvitdaks@gmail.com");
	dr.findElement(By.xpath("//*[@id='pass']")).sendKeys("sundaridady");
	
	dr.findElement(By.xpath("//*[@id='u_0_1']")).click();
	
	Thread.sleep(10000);
	dr.quit();
		
}
}