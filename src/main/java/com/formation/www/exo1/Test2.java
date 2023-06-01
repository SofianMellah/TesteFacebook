package com.formation.www.exo1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import java.util.List;

public class Test2 {
	WebDriver driver;
	final String driverLocation = "src/main/resources/drivers/chromedriver.exe"; 
		
	@Test 
	public void afficherNombreResultatRecherche() { 
	System.setProperty("webdriver.chrome.driver", driverLocation); 
	driver = new ChromeDriver(); 
	driver.manage().window().maximize(); 
	driver.get("https://www.amazon.fr"); 
	WebElement search_bar = driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")); search_bar.sendKeys("iphone"); 
	WebElement reject_all = driver.findElement(By.xpath("//*[@id=\"sp-cc-rejectall-link\"]")); reject_all.click(); 
	WebElement submit_button = driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")); submit_button.click(); 
	List<WebElement> results = driver.findElements(By.xpath("//div[contains(@class,\"s-card-container\")]")); 
	int numberOfResults = results.size(); 
	System.out.println(numberOfResults); 
	assertEquals(numberOfResults,52); 
	}
	

}
