package Day1Learning;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class clsSeleniumBasics {

	public void DiasplayName()
	{
	  System.out.println("My name is Anand");
	}
	
	@Test
	public void SearchCountry()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		WebDriver dr=new ChromeDriver();
		dr.navigate().to("https://www.google.com");
		dr.findElement(By.name("q")).sendKeys("India");
		dr.findElement(By.name("q")).sendKeys(Keys.ENTER);
		WebElement linkCapital=dr.findElement(By.xpath("//a[text()='New Delhi']"));
		Assert.assertEquals(linkCapital.isDisplayed(), true);
	}
	
	@Test
	public void LearnHashmap()
	{
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("India", "Delhi");
		hm.put("USA","Washinton");
		hm.put("UK","London");
		hm.put("USA","Newyork");
		hm.put(null,"Newjersy");
		
		//loop through hashmap elements
		for (Map.Entry<String, String> entry :
            hm.entrySet()) {
           
           System.out.println(entry.getKey() + " = "
                              + entry.getValue());
       }
		System.out.println(hm.size());
		System.out.println(hm.containsKey("chaina"));
		System.out.println(hm.containsValue("Chicago"));
		
	}
	@Test
	public void LearnArraylist()
	{
		ArrayList<String> cars=new ArrayList<String>();
		cars.add("BMW");
		cars.add("Audi");
		cars.add("Benz");
		
		System.out.println("Size is:" + cars.size()); //size:3
		System.out.println("contains bmw:" + cars.contains("BMW")); //expected : true
		System.out.println("contains Dezire:" + cars.contains("Dezire")); //expected : False
		
		System.out.println("Index of Audi:" + cars.indexOf("Audi")); //Index : 1
		
		
	}
	
	@Test
	public void LearnIfStmt()
	{
		int age=15;
		if(age<18)
		{
			System.out.println("Student is minor");
		}
		else if(age>18 && age < 25)
		{
			System.out.println("Student is major");
		}
		
		else
		{
			System.out.println("Student is Old");
		}
	}
}


