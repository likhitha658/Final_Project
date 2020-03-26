package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Write_Review_Page {

	WebDriver driver;

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");//set path 	
		driver = new ChromeDriver();//inilize chrome driver
		driver.manage().window().maximize();//maximize window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//50 seconds waiting time 
		driver.get("http://automationpractice.com/index.php?");// using webdriver get visting the testing website
		System.out.println(driver.getTitle());

	}

	public void LoginDeatils() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// loginClick.click();
		//login details
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("likhithagudur98@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("likki464");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();

	}

	public void backToHomePageAndClickOnWomens() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@class='sf-with-ul'][contains(text(),'Women')]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//i[@class='icon-th-list']")).click();
	}

	public void clickOnMoreBtn() throws InterruptedException {
		driver.findElement(By.xpath(
				"//li[@class='ajax_block_product first-in-line first-item-of-tablet-line first-item-of-mobile-line col-xs-12']//span[contains(text(),'More')]"))
				.click();
		Thread.sleep(2000);
	}

	public void write_Review() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='open-comment-form']")).click();
		Actions action = new Actions(driver);
		WebElement star = driver.findElement(By.xpath("//a[contains(text(),'4')]"));
		action.moveToElement(star).click().build().perform();
		driver.findElement(By.xpath("//input[@id='comment_title']")).sendKeys("dresses");
		driver.findElement(By.xpath("//textarea[@id='content']")).sendKeys("good items need more");
		driver.findElement(By.xpath("//button[@id='submitNewMessage']//span[contains(text(),'Send')]")).click();
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'OK')]"))).click().build().perform();
		
		Thread.sleep(10000);
		driver.close(); // close the current tab

	}

}