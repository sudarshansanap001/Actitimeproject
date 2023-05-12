package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	@FindBy(id="container_tasks")
	private WebElement taskbt;
	
	@FindBy(id="container_reports")
	private WebElement reports;
	
	@FindBy(id="container_users")
	private WebElement users;
	
	@FindBy(id="logoutLink")
	private WebElement logout;
	
	//initilization
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//utlization
	
	public WebElement getTaskbt() {
		return taskbt;
	}
	
	public WebElement getReports() {
		return reports;
	}
	
	public WebElement getUsers() {
		return users;
	}
	
	public WebElement getLogout() {
		return logout;
	}
	
	
	}
