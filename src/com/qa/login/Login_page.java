package com.qa.login;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_page {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
        JavascriptExecutor js = (JavascriptExecutor)driver;		
        
        WebElement submit = driver.findElement(By.id("u_0_a"));
        
        WebElement txtbox =driver.findElement(By.name("email"));
        
        txtbox.sendKeys("jpandi2393?@gmail.com");
        
        WebElement pwd =driver.findElement(By.name("pass"));
        
        pwd.sendKeys("Pandi23Kumar");

        js.executeAsyncScript("arguments[0].click();",submit);

        js.executeScript("alert('Welcome to facebook');");   

        
        

		
		

	}

}
