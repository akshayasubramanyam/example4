package com.example4.example4;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
public class NewCode {
	@Test
	public void pearson() throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.pearson.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElement(By.id("search-box-input")).sendKeys("java");

		List<WebElement> ele = driver.findElements(By.xpath("//ul[@id='ui-id-6']//li"));
		Thread.sleep(500);
		for(WebElement ele1:ele)
		{
			if(ele1.getText().equalsIgnoreCase("java"))
			{
				ele1.click();
				break;
			}
		}
		List<WebElement> elements = driver.findElements(By.xpath("//h3//a"));
		if(elements.size()>=10)
		{
			for(WebElement value:elements)
			{
				System.out.println(value.getText());
			}
		}
		driver.findElement(By.xpath("//button[contains(text(),'Close this')]")).click();;

		driver.findElement(By.xpath("//a[@rel='next']")).click();
		Thread.sleep(1000);

		System.out.println("2nd page elements");
		System.out.println("===================");
		List<WebElement> element = driver.findElements(By.xpath("//h3//a"));
		if(element.size()>=10)
		{
			for(WebElement value:element)
			{
				System.out.println(value.getText());
				if(value.getText().equalsIgnoreCase("Revel for Deitel Java"))
				{
					value.click();
					break;
				}
			}
			
		}
		
		

	}
}