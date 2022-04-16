import java.time.Duration;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import GooglePage.*;

public class NewTest
{
	WebDriver dr;
  @Test()
  public void f1()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	  dr = new FirefoxDriver();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  dr.get("https://www.google.com/");
	  String SearchWord = "Hello World";
	  GoogleHomePage GHP = new GoogleHomePage(dr);
	  GHP.Homepage(SearchWord);
	  GHP.Verify(SearchWord);
  }
  @Test()
  public void f2()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	  dr = new FirefoxDriver();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  dr.get("https://www.google.com/");
	  String SearchWord = "Hello Java";
	  GoogleHomePage GHP = new GoogleHomePage(dr);
	  GHP.Homepage(SearchWord);
	  GHP.Verify(SearchWord);
  }
  @Test()
  public void f3()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	  dr = new FirefoxDriver();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  dr.get("https://www.google.com/");
	  String SearchWord = "Hello Java";
	  GoogleHomePage GHP = new GoogleHomePage(dr);
	  GHP.Homepage(SearchWord);
	  GHP.Verify(SearchWord);
  }
  @Test()
  public void f4()
  {
	  System.setProperty("webdriver.gecko.driver", "D:\\Software\\geckodriver.exe");
	  dr = new FirefoxDriver();
	  dr.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
	  dr.get("https://www.google.com/");
	  String SearchWord = "Hello Java";
	  GoogleHomePage GHP = new GoogleHomePage(dr);
	  GHP.Homepage(SearchWord);
	  GHP.Verify(SearchWord);
  }
  @AfterMethod
  public void ExitFirefox()
  {
	  dr.quit();
  }
}
