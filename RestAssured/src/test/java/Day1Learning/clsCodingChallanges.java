package Day1Learning;
import java.util.Arrays;

import org.testng.annotations.Test;

public class clsCodingChallanges 
{

	@Test
	public void StringSplit()
	{
		String str1="I am from Hyderabas";
		String arrWords[]=str1.split("\\s");
		
		System.out.println("Word count is:" + arrWords.length);
	}
@Test
public void StringReverse()
{
	String originalStr = "Helloworld";
	String reversedStr = "";

	for (int i = 0; i < originalStr.length(); i++) {
	  reversedStr = originalStr.charAt(i) + reversedStr;
	}

	System.out.println("Reversed string: "+ reversedStr);
}
@Test
public void LearnSortArray()
{
	 String[] cars = {"Volvo", "BMW", "Tesla", "Ford", "Fiat", "Mazda", "Audi"};
	    Arrays.sort(cars);
	    for (String carName : cars) 
	    {
	      System.out.println(carName);
	    }
}
@Test
public void FindLowestNumberFromArray()
{
	int ages[] = {20, 22, 18, 35, 48, 26, 87, 70,03};
	int smallest=ages[0];
	for(int i=0;i<ages.length;i++)
	{
		if(smallest>ages[i])
		{
			smallest=ages[i];
		}
	}
	System.out.println("Smallest number is:" + smallest);
}
@Test
public void FindEvenOddNumbers()
{
	int number = 30;

	// Find out if the number above is even or odd
	if (number % 2 == 0) {
	  System.out.println(number + " is even.");
	} else {
	  System.out.println(number + " is odd.");
	}
}
}
