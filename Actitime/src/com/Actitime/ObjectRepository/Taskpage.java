package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Taskpage {
	//declaration
	@FindBy(xpath="//div[.='Add New']")
	private WebElement addnewbtn;
	
	@FindBy(xpath="//div[.='+ New Customer']")
	private WebElement newcusbtn;
	
	@FindBy(xpath ="(//input[@placeholder='Enter Customer Name'])[2]")
	private WebElement entcusname;
	
	@FindBy(xpath = "//textarea[@placeholder='Enter Customer Description']")
	private WebElement entcusdescrip;
	
	@FindBy(xpath = "//div[.='Create Customer']")
	private WebElement crecusbtn;
	
	@FindBy(xpath = "//div[@class='greyButton cancelBtn']")
	private WebElement cancelbtn;
	
	//initilization
	public Taskpage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utlization

	public WebElement getAddnewbtn() {
		return addnewbtn;
	}

	public WebElement getNewcusbtn() {
		return newcusbtn;
	}

	public WebElement getEntcusname() {
		return entcusname;
	}

	public WebElement getEntcusdescrip() {
		return entcusdescrip;
	}

	public WebElement getCrecusbtn() {
		return crecusbtn;
	}

	public WebElement getCancelbtn() {
		return cancelbtn;
	}
	
}
