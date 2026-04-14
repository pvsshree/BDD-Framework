package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	private WebDriver driver;
	//By locators using inspect or OR
	private By username = By.xpath("//div[contains(@class,'oxd-input-group')]//input[@name='username']");
	private By password = By.xpath("//div//*[@name='password']");
	private By loginButton 
= By.cssSelector("//div//button[@type='submit']");
	By forgotPwdLink = By.xpath("//div//p//*[@class='oxd-text oxd-text--p orangehrm-login-forgot-header']");
	


//Constructor of page class
public LoginPage(WebDriver driver) {
	this.driver = driver;
}

//page actions : features (behaviour) of page the form of methods
public String getLoginPageTitle() {
	return driver.getTitle();
	
}

public boolean isForgotPswdLinkExist() 
{
	return driver.findElement(forgotPwdLink).isDisplayed();
}

public void enterUsername(String Username)
{
driver.findElement(username).sendKeys(Username);
}

public void enterPassword(String pwd)
{
driver.findElement(password).sendKeys(pwd);
}

public void ClickOnLogin() {
	driver.findElement(loginButton).click();
}






}