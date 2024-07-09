package TestCases;


import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import Pages.GoogleHomePage;

public class HomepageTests
{

	WebDriver dr;
	GoogleHomePage _gpage=null;
	
	public HomepageTests()
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		//dr=new ChromeDriver();
		//_gpage=new GoogleHomePage(dr);
		
		
	}
	public void DiasplayName()
	{
	  System.out.println("My name is Anand");
	}
	
	@Test
	public void SearchCountry()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr=new ChromeDriver();
		_gpage=new GoogleHomePage(dr);
		dr.navigate().to("https://www.google.com");
		_gpage.txtSrch.sendKeys("Chaina");
		_gpage.txtSrch.sendKeys(Keys.ENTER);
		
		//dr.findElement(By.name("q")).sendKeys("India");
		//dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		//_gpage.txtSrc.sendKeys(Keys.ENTER);
		//_gpage.SearchKeyword();
		
		//WebElement linkCapital=dr.findElement(By.xpath("//a[text()='New Delhi']"));
		Assert.assertEquals(_gpage.linkCapital.isDisplayed(), true);
	}
	
	//Get the URL, title
	@Test
	public void LearnGettingTitleURL()
	{
		dr.navigate().to("https://www.google.com");
		dr.manage().window().maximize();
		System.out.println("Current URL is:" + dr.getCurrentUrl());
		System.out.println("Title is:" + dr.getTitle());
	}

}


