package com.pages;

import static org.junit.Assert.assertEquals;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import junit.framework.Assert;

public class ProfileDetails {

	WebDriver driver;

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);
		driver.get("http://automationpractice.com/index.php?");// using webdriver get visting the testing website
		System.out.println(driver.getTitle());

	}

	public void LoginPage() {

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
		// driver.findElement(By.xpath("//span[contains(text(),'My personal
		// information')]")).click();;
		// Thread.sleep(1000);
		System.out.println("user email-id ===>>"
				+ driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText());
		Thread.sleep(10000);
		String actual = driver.findElement(By.xpath("//*[@id=\"header\"]/div[2]/div/div/nav/div[1]/a/span")).getText();
		String expected = "likhitha likki";
		assertEquals(expected, actual);

	}

	public void submit() throws InterruptedException {
		driver.findElement(By.xpath("//a[@class='logout']")).click();
		Thread.sleep(3000);
		driver.close(); // close the current tab
	}

}