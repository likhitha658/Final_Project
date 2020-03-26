package com.pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountItemsInThePage {

	WebDriver driver;

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();//intilizing chrome driver
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//waait for 50 seconds impilicityly
		driver.get("http://automationpractice.com/index.php?");// using webdriver get visting the testing website
		System.out.println(driver.getTitle());

	}

	public void LoginDeatils() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// loginClick.click();

		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("likhithagudur98@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("likki464");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();

	}

	public void womensBtn() throws InterruptedException {

		driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]")).click(); //click on womens
		Thread.sleep(10000);
	}

	public void dressClick() throws InterruptedException {
		driver.findElement(By.xpath("//div[@id='subcategories']//li[2]//div[1]//a[1]")).click();
		Thread.sleep(10000);
		String items = driver.findElement(By.xpath(
				"//div[@class='top-pagination-content clearfix']//div[@class='product-count'][contains(text(),'Showing 1 - 5 of 5 items')]"))
				.getText();//get text from that
		String actual = items.substring(12, 13);
		System.out.println("=================>>>>" + items + "<<<<<<<<<=================");
		assertEquals("5", actual);
		
		
		Thread.sleep(1000);
		driver.close(); // close the current tab
	}

}