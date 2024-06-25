package Common;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

public class clsCommon {
	
public void ScrollUp(int pixel,WebDriver dr)
{
	JavascriptExecutor js = (JavascriptExecutor) dr;
	js.executeScript("scrollBy(0," + pixel + ")");
}
public void ScrollDown(int pixel,WebDriver dr)
{
	JavascriptExecutor js = (JavascriptExecutor) dr;
	js.executeScript("scrollBy(0," + -pixel + ")");
}

}
