package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewsLetters {

	WebDriver driver;

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");//seting path	
		driver = new ChromeDriver();//intilizing the chrome
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//wait 50 seconda
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

	public void NewsLetter() throws InterruptedException {

		driver.findElement(By.xpath("//input[@id='newsletter-input']")).sendKeys("likhithagudur98@gmail.com");
		driver.findElement(By.xpath("//*[@id=\'newsletter_block_left\']/div/form/div/button")).click();
		String message = driver.findElement(By.xpath("//p[@class='alert alert-danger']")).getText();
		System.out.println(message + "<============>");
		
		Thread.sleep(1000);
		driver.close(); // close the current tab
	}

}