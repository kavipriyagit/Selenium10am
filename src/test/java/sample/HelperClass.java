package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HelperClass {
	 static WebDriver driver;
	public static void launchChromeBrowser()
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\R.KAVINYA\\Priya\\sample\\driver\\chromedriver.exe");
		 driver=new ChromeDriver();
	}
	public  static void loadUrl(String url)
	{
		driver.get(url);
		
	}
	public static void getTitle()
	{
		String title = driver.getTitle();
		System.out.println(title);
		
	}
	public static void getCurrentUrl()
	{
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);
	}
	public static void fill(WebElement e,String value)
	{
		e.sendKeys(value);
	}
	public static void SBI(WebElement e,int index)
	{
		Select s=new Select(e);
		s.selectByIndex(index);
	}
	public static void btnClick(WebElement e)
	{
		e.click();
		
	}
	public static void quitBrowser()
	{
		driver.quit();
	}
	}


