package com.pages;

import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImagesInPage {

	WebDriver driver;

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");//set path
		driver = new ChromeDriver();//driver intilization
		driver.manage().window().maximize();//maximize window	
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//wait 50 seconds

		// using webdriver get visting the testing website

		driver.get("http://automationpractice.com/index.php?");
		System.out.println(driver.getTitle());//get title
	}

	public void LoginDeatils() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// loginClick.click();

		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("likhithagudur98@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("likki464");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();

	}

	public void imagesInThePageCount() throws InterruptedException {
		List<WebElement> img = driver.findElements(By.tagName("img"));//by tag name img
		System.out.println("No of images in a page ===>>" + img.size());//printing sizes
		
		Thread.sleep(1000);
		driver.close(); // close the current tab
	}

}