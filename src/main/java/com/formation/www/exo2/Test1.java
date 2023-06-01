package com.formation.www.exo2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;


public class Test1 {
	
        // TODO Auto-generated method stub
//    	WebDriver driver;
//		final String driverLocation = "src/main/resources/drivers/chromedriver.exe";
		
    	@Test
		public void testPays() {
						
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.deel.com/employee-cost-calculator");
        
        
        
        WebElement reject_alll = driver.findElement
                    (By.xpath("//*[@id=\"CybotCookiebotDialogBodyButtonAccept\"]"));
            reject_alll.click();
            
        WebElement iframe = driver.findElement(By.id("idIframe"));
        driver.switchTo().frame(iframe);
        
        WebElement pays1 = driver
                .findElement(By.xpath("//label[text()=\"Country\"]/following-sibling::div/input[@type=\"text\"]"));
        pays1.sendKeys("Morocco");
        pays1.sendKeys(Keys.DOWN);
        pays1.sendKeys(Keys.ENTER);
        
//        WebElement select1 = driver
//                .findElement(By.xpath("//h4[text()=\"Morocco\"]"));
//        select1.click();
        WebElement pays2 = driver
                .findElement(By.xpath("//label[text()=\"Second country for comparison (optional)\"]/following-sibling::div/input[@type=\"text\"]"));
        pays2.sendKeys("France");
        pays2.sendKeys(Keys.DOWN);
        pays2.sendKeys(Keys.ENTER);
        
//        WebElement select2 = driver
//                .findElement(By.xpath("//h4[text()=\"France\"]"));
//        select2.sendKeys("France");
//        devise.sendKeys(Keys.DOWN);
//        devise.sendKeys(Keys.ENTER);

        WebElement devise = driver
                .findElement(By.xpath("//label[text()=\"Currency\"]/following-sibling::div/input[@type=\"text\"]"));
        devise.sendKeys("MAD");
        devise.sendKeys(Keys.DOWN);
        devise.sendKeys(Keys.ENTER);
                
//        WebElement select3 = driver
//                .findElement(By.xpath("//h4[text()=\"MAD\"]"));
//        devise.sendKeys(Keys.DOWN);
//        devise.sendKeys(Keys.ENTER);
        
        WebElement salary = driver
                .findElement(By.xpath("//input[@type=\"number\"]"));
        salary.sendKeys("30000");
        
        WebElement calculer = driver 
                .findElement(By.xpath("//button[text()=\"Calculate\"]"));
        calculer.click();
        
        
        
        
   // Test //
        String result_pays1 = driver
        		.findElement(By.xpath("//label[text()=\"Country\"]/following-sibling::div/input[@type=\"text\"]")).getAttribute("value");
        
        System.out.println(result_pays1);
        
        assertEquals(result_pays1, "Morocco");
        
        
        
        
        String result_pays2 = driver
        		.findElement(By.xpath("//label[text()=\"Second country for comparison (optional)\"]/following-sibling::div/input[@type=\"text\"]")).getAttribute("value");
        
        System.out.println(result_pays2);
        
        assertEquals(result_pays2, "France");
        
        
        
        String result_devise = driver
        		.findElement(By.xpath("//label[text()=\"Currency\"]/following-sibling::div/input[@type=\"text\"]")).getAttribute("value");
        
        System.out.println(result_devise);
        
        assertEquals(result_devise, "MAD");
        
        
        
        String result_salary = driver
        		.findElement(By.xpath("//input[@type=\"number\"]")).getAttribute("value");
        
        System.out.println(result_salary);
        
        assertEquals(result_salary, "30000");
        
        
        
        String result_pays1maroc = driver
        		.findElement(By.xpath("//div[text()=\"Refine your view\"]/following-sibling::div/following-sibling::div/child::div/table/tbody/tr/td/following-sibling::td/div/div/following-sibling::div")).getText();
        
        System.out.println(result_pays1maroc);
        
        assertEquals(result_pays1maroc, "Morocco");
        
    	
    	
    	String result_pays2france = driver
        		.findElement(By.xpath("//div[text()=\"Refine your view\"]/following-sibling::div/following-sibling::div/child::div/table/tbody/tr/td/following-sibling::td/following-sibling::td/div/div/following-sibling::div")).getText();
        
        System.out.println(result_pays2france);
        
        assertEquals(result_pays2france, "France");
        
        
        
        String result_devise1 = driver
        		.findElement(By.xpath("//div[text()=\"Refine your view\"]/following-sibling::div/div/div/div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/div/div/div/div/h6")).getText();
        
        System.out.println(result_devise1);
        
        assertEquals(result_devise1, "MAD");
        
        
        
        String result_salary1 = driver
        		.findElement(By.xpath("//div[text()=\"Refine your view\"]/following-sibling::div/div/div/div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/following-sibling::div/div/div/h6")).getText();
        
        System.out.println(result_salary1);
        
        assertEquals(result_salary1, "30,000");
        
		}
        
	}
