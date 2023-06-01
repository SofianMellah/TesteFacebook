package com.site.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class HomePage {

	@FindBy(id = "email")
	private WebElement emailInput;
	
	@FindBy(id = "pass")
	private WebElement passInput;
	
	@FindBy(id = "u_0_5_pz")
	private WebElement connectButton;
	
	@FindBy(xpath = "//div[3]/a")
	private WebElement forgetPasswordA;
	
	@FindBy(id = "u_0_0_Dj")
	private WebElement createNewAccountButton;
	
	
	
	public HomePage() {
		
	}
	
	
	public void connexion(String email, String password) {
		emailInput.sendKeys(email);
	}
}
