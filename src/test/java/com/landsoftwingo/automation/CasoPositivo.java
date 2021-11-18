package com.landsoftwingo.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v93.browser.Browser;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.landsoftwingo.automation.Objects;

public class CasoPositivo {

	String url = "https://www.wingo.com/";

	@Test
	public void buscarPaquete() {

		System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver, 20);
		Objects obj = new Objects();

		driver.manage().window().maximize();
		driver.get(url);

		obj.time(wait);
		obj.webDriver(driver);

		obj.flightSelection("Bogotá", "Cartagena");
		obj.dateSelection();
		obj.sleep(2000);
		driver.quit();

	}
}