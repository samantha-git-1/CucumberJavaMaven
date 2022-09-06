package com.co.project.app.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com.co.project.base.BasePage;

public class A001_LoginPage extends BasePage {

	public A001_LoginPage(WebDriver driver) {
		super(driver);
	}

	// ----------------------------------------------------------------------------------------------------------
	// STARTS => Element locator
	// ----------------------------------------------------------------------------------------------------------

	// Username
	@FindBy(name = "username")
	private WebElement txt_userName;
	public WebElement getInputUsername() {
		return txt_userName;
	}

	// Password
	@FindBy(name = "password")
	private WebElement txt_password;
	public WebElement getInputPassword() {
		return txt_password;
	}
	
	// 'Login' button
	@FindBy(xpath = "//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")
	private WebElement btn_Login;
	public WebElement getBtnLogin() {
		return btn_Login;
	}
	
	 
	//@FindBy(xpath = "//span[contains(text(), 'Commercial Electronic Office')]")
	
	// ----------------------------------------------------------------------------------------------------------
	// ENDS => Element locator
	// ----------------------------------------------------------------------------------------------------------

	
	
	//----------------------------------------------------------------------------------------------------------
	// STARTS => Actions
	//----------------------------------------------------------------------------------------------------------	
	
	public void enterUsername(String userName) {
		getInputUsername().sendKeys(userName);
	}
	
	public void enterPassword(String password) {
		getInputPassword().sendKeys(password);
	}
	
	public void clickLogin() {
		getBtnLogin().click();
	}
	
	
	//----------------------------------------------------------------------------------------------------------
	// ENDS => Actions
	//----------------------------------------------------------------------------------------------------------	
	
	
	
} // Ends class