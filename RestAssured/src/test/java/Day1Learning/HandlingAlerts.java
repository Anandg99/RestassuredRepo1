package Day1Learning;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandlingAlerts {
	WebDriver dr;

	public HandlingAlerts() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Anand.Gummadilli\\Downloads\\chromedriver.exe");
		dr = new ChromeDriver();
	}

	@Test
	public void AcceptAlert() {
		// Alert Message handling
		dr.navigate().to("http://demo.guru99.com/test/delete_customer.php");
		dr.findElement(By.name("cusid")).sendKeys("523190");
		dr.findElement(By.name("submit")).click();
		// Switching to Alert
		Alert alert = dr.switchTo().alert(); // switch to 1st popup
		System.out.print("1st alert text:" + alert.getText());
		alert.accept(); // click on OK button

	}
}
