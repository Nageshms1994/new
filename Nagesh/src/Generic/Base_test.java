package Generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base_test implements Interface {
	public WebDriver driver;
	@BeforeMethod 
	public void openappln(){
		System.setProperty(gecko_key,gecko_value);
		driver=new FirefoxDriver();
		driver.get(url);
		}
	@AfterMethod
	public void closeappln() {
		driver.close();
	}


}
