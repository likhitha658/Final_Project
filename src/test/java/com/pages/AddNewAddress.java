package com.pages;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import BrowserDetails.BrowserDetails;

public class AddNewAddress extends BrowserDetails{

	

	public void url() { // url for launch the chrome
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe"); //driver location 
		driver = new ChromeDriver();//intilizing browser
		driver.manage().window().maximize();//maximizing sceen
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);//wait for 50 seconds

		// using webdriver get visting the testing website

		driver.get("http://automationpractice.com/index.php?");//open url
		System.out.println(driver.getTitle());//title of page
	}

	public void LoginDeatils() throws IOException, InterruptedException {
		Thread.sleep(1000);
		// loginClick.click();

		driver.findElement(By.xpath("//a[@class='login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("likhithagudur98@gmail.com");//user name	
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("likki464");//password
		driver.findElement(By.xpath("//p[@class='submit']//span[1]")).click();//submit btn

	}

	public void myAddress() throws InterruptedException {
		driver.findElement(By.xpath("//span[contains(text(),'My addresses')]")).click();//click on my address
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Add a new address')]")).click();//click on add address

	}

	public void addAddress() throws InterruptedException, IOException {
		//giving all mandatory details
		driver.findElement(By.xpath("//input[@id='firstname']")).sendKeys("vamsi");//name
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("sholiganur");//address
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("chennai");//city
		WebElement drop = driver.findElement(By.xpath("//select[@id='id_state']"));//state
		drop.click();
		WebElement ind = driver.findElement(By.xpath("//option[contains(text(),'Indiana')]"));//dropdown
		ind.click();
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("50000");//postalcode
		driver.findElement(By.xpath("//input[@id='phone']")).sendKeys("04022004689");//phoe
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("7702828488");//mobile
		driver.findElement(By.xpath("//input[@id='alias']")).sendKeys("homeaddress");//aliasaname
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[contains(text(),'Save')]")).click();//save btn
		screenshot(".screenshot//image.png");
		Thread.sleep(1000);
		driver.close(); // close the current tab

	}

}