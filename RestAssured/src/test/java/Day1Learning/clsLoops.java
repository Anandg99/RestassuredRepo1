package Day1Learning;
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
