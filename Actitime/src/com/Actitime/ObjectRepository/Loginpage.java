package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	//declaration
@FindBy(id = "username")
private WebElement unbtx;

@FindBy(name= "pwdtx")
private WebElement pwd;

@FindBy(xpath="div[.='Login ']")
private WebElement lbn;

//initilization (we need paramertize constructor for initilization to call contructer we use classname)

public Loginpage(WebDriver drive) 
{
	PageFactory.initElements(drive,this);
	
}
//utilization

public WebElement getUnbtx() {
	return unbtx;
}

public WebElement getPwd() {
	return pwd;
}

public WebElement getLbn() {
	return lbn;
}

}
