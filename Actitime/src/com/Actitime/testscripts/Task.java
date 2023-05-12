package com.Actitime.testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.Actitime.GenericLibrary.Baseclass;
import com.Actitime.GenericLibrary.FileLibrary;
import com.Actitime.ObjectRepository.Homepage;
import com.Actitime.ObjectRepository.Taskpage;
//we are creating objects to call taskpage
public class Task extends Baseclass{
	@Test//to create a test case
	public void createcustomer() throws EncryptedDocumentException, IOException {
		Homepage hp = new Homepage(driver);
		hp.getTaskbt().click();
		
		Taskpage tp= new Taskpage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcusbtn().click();
		
		FileLibrary f= new FileLibrary();
		String createcustomer = f.readDataFromExcel("Sheet1", 2, 1);
		tp.getEntcusname().sendKeys(createcustomer);
		String value = f.readDataFromExcel("Sheet1", 2, 2);
		tp.getEntcusdescrip().sendKeys(value);
		tp.getCrecusbtn().click();
		
		String expectedresult = createcustomer;
		String Actualresult = driver.findElement(By.xpath("(//div[.='"+createcustomer+"'])[2]")).getText();
		SoftAssert s= new SoftAssert();
		s.assertEquals(Actualresult, expectedresult);
		s.assertAll();
		
		
	
		
		
				
	}
	}
