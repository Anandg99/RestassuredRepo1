package Day1Learning;

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

public class clsLoops {
	@Test
	public void LearnForLoop() 
	{
         for(int i=0;i<5;i++)
         {
        	 System.out.println("Student number is : " + i);
         }
	}
	@Test
	public void LearnForLoop2() 
	{
         for(int i=0;i<10;i=i+2)
         {
        	 System.out.println("Student number is : " + i);
         }
	}
	
	@Test
	public void LearnWhileLoop() 
	{
		int i=0;
         while(i<5)
         {
        	 System.out.println("Student number is : " + i);
        	 i=i+1;
         }
	}
	
	
	
}
