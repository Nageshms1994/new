package Testscript1;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import POM1.POMconcept2;

public class Facebook {
	@Test
	public void test1() throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","./sf/geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com");
		POMconcept2  p=new POMconcept2(driver);
		Thread.sleep(2000);
		p.username("Admin");
		Thread.sleep(2000);p.password("manager");
		Thread.sleep(2000);
		p.login();
		driver.navigate().refresh();
		p.username("Nagesh");
		Thread.sleep(2000);p.password("Software Engineer");
		Thread.sleep(2000);
		p.login();
	}
}
