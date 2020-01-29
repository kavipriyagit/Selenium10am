package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MainClass extends HelperClass {
	
	public static void main(String[]args)
	{
		launchChromeBrowser();
		loadUrl("https://www.facebook.com/");
		getTitle();
		getCurrentUrl();
		WebElement u = driver.findElement(By.id("email"));
		fill(u,"suresh");
		WebElement p = driver.findElement(By.id("pass"));
		fill(p,"priya");
		
		WebElement date=driver.findElement(By.id("day"));
		SBI(date,5);
		
		WebElement month = driver.findElement(By.id("month"));
		SBI(month,8);
		
		WebElement button = driver.findElement(By.id("loginbutton"));
		
		btnClick(button);
		getCurrentUrl();
		quitBrowser();
		
		
	}

}
