package com.formation.www.exo1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String driverLocation = "src/main/resources/drivers/chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", driverLocation);
		
		
		WebDriver driver = new ChromeDriver();		
		driver.manage().window().maximize();		
		driver.get("https://www.amazon.fr");
		
		WebElement search_bar = driver.findElement
				(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search_bar.sendKeys("iPhone");
		
		WebElement reject_all = driver.findElement
				(By.xpath("//*[@id=\"sp-cc-rejectall-link\"]"));
		reject_all.click();
		
		WebElement submit_button = driver.findElement
				(By.xpath("//*[@id=\"nav-search-submit-button\"]"));
		submit_button.click();
		
		WebElement text_result = driver.findElement
				(By.xpath("//*[@id=\"search\"]/span/div/h1/div/div[1]/div/div/span[3]"));
		text_result.getText();
		
		System.out.println(text_result.getText());
		
		assertEquals(text_result.getText(), "\"iPhone\""); 

		driver.close();
	}

}


