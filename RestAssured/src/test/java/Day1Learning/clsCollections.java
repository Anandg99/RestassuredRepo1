package Day1Learning;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;
import java.util.ArrayList;
import java.util.Dictionary;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class clsCollections 
{
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
		System.out.println(hm.containsValue("Newyork"));
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
	public void LearnDictionary()
	{
		Dictionary<String, String> cars=new Hashtable();
		cars.put("BMW","Germany");
		cars.put("Audi","USA");
		cars.put("Benz","Japan");
		System.out.println("Size is:" + cars.size()); //size:3
		System.out.println("contains bmw:" + cars); //expected : true
		
	}
}


