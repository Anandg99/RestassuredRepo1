package CoreJava;

import org.testng.annotations.*;

public class clsExceptionHandling {
	@Test
	public void LearnExceptionHandling() {
		int a = 5;
		int b = 0;
		try {
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println(e.getStackTrace().toString());

		}
	}
	@Test
	public void LearnException1()
	{
		try
		{
		   // Taking an empty string
        String str = null;
        // Getting length of a string
        System.out.println(str.length());
		}
		catch(Exception ex)
		{
			System.out.println(ex.getMessage());
		}
	}
}
