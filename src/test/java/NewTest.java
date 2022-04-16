import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import Pages.*;

public class NewTest
{
	WebDriver dr;
	

  @Test()
  public void f1()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	  dr = new FirefoxDriver();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  dr.get("https://www.demo.guru99.com/V4/");
	  new Login_Page(dr).Login("mngr399806" ,"gyjYqat");
	  
  }
  
  @AfterMethod
  public void ExitFirefox()
  {
	  dr.quit();
  }
}
