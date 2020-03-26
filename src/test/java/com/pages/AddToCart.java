package com.pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AddToCart {

	WebDriver driver;

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");//seting path of browser
		driver = new ChromeDriver();//chrome driver intilization
		driver.manage().window().maximize();//maximize the window
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//implicit wait

		// using webdriver get visting the testing website

		driver.get("http://automationpractice.com/index.php?");//open url
		System.out.println(driver.getTitle());//get title of page
	}

	public void LoginDeatils() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// loginClick.click();
				//	login page 	
		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("likhithagudur98@gmail.com");
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("likki464");
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();

	}

	public void addToCart() throws InterruptedException {
			//back to home page
		driver.findElement(By.xpath("//span[contains(text(),'Home')]")).click();
		Thread.sleep(1000);
		//select item and add to cat

		WebElement img = driver.findElement(By.xpath(
				"//ul[@id='homefeatured']//li[@class='ajax_block_product col-xs-12 col-sm-4 col-md-3 first-in-line first-item-of-tablet-line first-item-of-mobile-line']//img[@class='replace-2x img-responsive']"));
		Actions action = new Actions(driver);
		action.moveToElement(img).build().perform();
		
		action.moveToElement(
				driver.findElement(By.xpath("//*[@id=\"homefeatured\"]/li[1]/div/div[2]/div[2]/a[1]/span"))).click()
				.build().perform();
		Thread.sleep(10000);
		action.moveToElement(driver.findElement(By.xpath("//div[@class='layer_cart_cart col-xs-12 col-md-6']")));
		action.moveToElement(driver.findElement(By.xpath("//span[contains(text(),'Proceed to checkout')]"))).click()
				.build().perform();

		driver.findElement(By.xpath(
				"//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//textarea[@name='message']")).sendKeys("gift items");
		driver.findElement(By.xpath("//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[@id='cgv']")).click();
		driver.findElement(By.xpath("//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]"))
				.click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@class='cheque']")).click();
		Thread.sleep(10000);
		driver.findElement(By.xpath("//span[contains(text(),'I confirm my order')]")).click();
		String expected = "Your order on My Store is complete.";
		String actual = driver.findElement(By.xpath("//p[@class='alert alert-success']")).getText();
		assertEquals(expected, actual);
		
		Thread.sleep(1000);
		driver.close(); // close the current tab

	}

}