package Day1Learning;
import org.testng.annotations.Test;

public class clsArrays {

	@Test
	public void LearnInTArray()
	{
		int arrNums[]=new int[3];
		arrNums[0]=100;
		arrNums[1]=200;
		arrNums[2]=300;
		System.out.println(arrNums[2]);
	}

	@Test
	public void LearnStringArray()
	{
		String arrCities[]=new String[3];
		arrCities[0]="Hyderabad";
		arrCities[1]="Chennai";
		arrCities[2]="Mumbai";
		
		System.out.println("Length is:" + arrCities.length);
		for(int i=0;i<arrCities.length;i++)
		{
			System.out.println(arrCities[i]);	
		}
		
	}
	@Test
	public void Learn2DArray()
	{
		String[][] arrCities=new String[2][2];
		arrCities[0][0]="Hyderabad";
		arrCities[0][1]="Chennai";
		arrCities[1][0]="Mumbai";
		arrCities[1][1]="Delhi";
		
		System.out.println("Length is:" + arrCities.length);
		for(int i=0;i<arrCities.length;i++)
		{
			System.out.println(arrCities[i][0]);	
		}
		
	}
	
	
}
