package com.landsoftwingo.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v93.browser.Browser;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Objects {
	
	WebDriver driver;
	WebDriverWait wait;
	
	By inputorigen = By.cssSelector(".styledSelectOrigen");
	By inputtext = By.id("inputOrigen");
	By originSelection = By.cssSelector(".textCity");
	By inputReturn = By.id("inputDestino"); 
	By returnSelection = By.xpath("(//span[@class='textCity'])[2]");
	By selectDepartureDate = By.xpath("((//div[@class='month-wrapper'])[1]//div[contains(@class, ' valid') and contains(text(),'29')])");
	By selectReturnDAte = By.xpath("((//table[@class='month2'])[2]//tbody//tr//td//div[contains(@class,' valid') and contains(text(),'5')])");
	By btnSearchFlight = By.cssSelector(".btn-search");
		
	public void webDriver(WebDriver driver) {
		this.driver = driver;
	}
	
	public void time(WebDriverWait wait) {
		this.wait = wait;
	}
	
	public void flightSelection(String a, String b) {
		wait.until(ExpectedConditions.elementToBeClickable(inputorigen));
		driver.findElement(inputorigen).click();
		driver.findElement(inputtext).sendKeys(a);
		driver.findElement(originSelection).click();
		driver.findElement(inputReturn).sendKeys(b);
		driver.findElement(returnSelection).click();
	}
	
	public void dateSelection() {
		wait.until(ExpectedConditions.elementToBeClickable(selectDepartureDate));
		driver.findElement(selectDepartureDate).click();
		wait.until(ExpectedConditions.elementToBeClickable(selectReturnDAte));
		driver.findElement(selectReturnDAte).click();
		driver.findElement(btnSearchFlight).click();
	}
	
	/* Static sleep */
	public void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}