package com.Actitime.GenericLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.Actitime.ObjectRepository.Homepage;

	public class Baseclass {
		public static WebDriver driver;
		FileLibrary f = new FileLibrary();
	@BeforeSuite
	public void databaseconnection() {
		Reporter.log("Database connected",true);
	}
	@BeforeClass
	public void launchBrowser() throws IOException {
		 driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String URL = f.readDataFromPropertyFile("url");
		driver.get(URL);
		Reporter.log("Browser launched",true);
	}
	//to get loginpage from pom we need to crete  objet
	@BeforeMethod
	public void login() throws IOException {
		String UN = f.readDataFromPropertyFile("username");
		driver.findElement(By.id("username")).sendKeys(UN);
		String PW = f.readDataFromPropertyFile("password");
		driver.findElement(By.name("pwd")).sendKeys(PW);;
		driver.findElement(By.xpath("//div[.='Login ']")).click();
		Reporter.log("Login sucessfull",true);
		
	}
	@AfterMethod
	public void logout() {
		Homepage hp = new Homepage(driver);
		//driver.findElement(By.id("logoutLink")).click();
		Reporter.log("Logout sucessfull",true);
	}
	@AfterClass
	public void closeBrowser() {
		driver.close();
		Reporter.log("Browser closed",true);
	}
	@AfterSuite
	public void databasedisconnection() {
		Reporter.log("Database Disconnected Sucessfully",true);
	}
	}
