package com.landsoftwingo.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v93.browser.Browser;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CasoPositivo {

	@Test
	public void buscarPaquete() {
		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		sleep(3000);
		driver.manage().window().maximize();
		String url = "https://www.wingo.com/";
		driver.get(url);
		sleep(2000);
		// elemento origen
		WebElement inputorigen = driver.findElement(By.cssSelector(".styledSelectOrigen"));
		inputorigen.click();
		WebElement inputtext = driver.findElement(By.id("inputOrigen"));
		inputtext.sendKeys("Bogotá");
		WebElement inputReturn = driver.findElement(By.id("inputDestino"));
		inputReturn.sendKeys("Cartagena");
		WebElement selectDepartureDate = driver.findElement(By.xpath(
				"((//div[@class='month-wrapper'])[1]//div[contains(@class, ' valid') and contains(text(),'29')])"));
		selectDepartureDate.click();
		WebElement selectReturnDAte = driver.findElement(By.xpath(
				"((//table[@class='month2'])[2]//tbody//tr//td//div[contains(@class,' valid') and contains(text(), '5')])"));
		selectReturnDAte.click();
		WebElement btnSearchFlight = driver.findElement(By.cssSelector(".btn-search"));
		btnSearchFlight.click();
		driver.close();
	}

	/** Static sleep */
	private void sleep(long millis) {
		try {
			Thread.sleep(millis);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
