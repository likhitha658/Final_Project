package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Search {

	WebDriver driver;

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	public void LoginPage() // using webdriver get visting the testing website
	{
		driver.get("http://automationpractice.com/index.php?");
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

	public void search() throws InterruptedException {
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys("dresses");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='search_query_top']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(1000);
		driver.close(); // close the current tab
	}

	public void submit() throws InterruptedException {

		Thread.sleep(3000);
		 driver.close(); // close the current tab
	}
}