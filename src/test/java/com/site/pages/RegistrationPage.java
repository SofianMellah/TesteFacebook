package com.site.pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class RegistrationPage {
	
	
	@FindBy(name = "firstname")
	private WebElement firstNameInput;
	
	@FindBy(name = "lastname")
	private WebElement lastNameInput;
	
	@FindBy(id = "u_t_g_vX")
	private WebElement emailInput;
	
	@FindBy(id = "password_step_input")
	private WebElement passwordInput;
	
	@FindBy(id = "day")
	private WebElement daySelect;
	
	@FindBy(id = "month")
	private WebElement monthSelect;
	
	@FindBy(id = "year")
	private WebElement yearSelect;
	
	@FindBy(id = "u_y_4_I6")
	private WebElement genreFemmeInput;
	
	@FindBy(id = "u_y_5_Gp")
	private WebElement genreHommeInput;
	
	@FindBy(id = "u_y_6_Rk")
	private WebElement genrePersoInput;
	
	@FindBy(id = "u_y_s_MN")
	private WebElement registrationButton;
	
	
	

	
	public RegistrationPage() {
		
	}
	
	
	
	
	public void newAccount(String prenom, String nom, String email, String password) {
		
	}
}
