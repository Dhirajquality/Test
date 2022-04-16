package GooglePage;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import CustomPackage.Customclass;

public class GoogleHomePage extends Customclass
{
private WebDriver driver ;
private String Searchbox_Text_Xpath = "//input[@name='q']";
private String SearchButton_Button_Xpath = "(//input[@type='submit'])[3]";
private String Verify_Label_xpath = "//div[@class='zLaXBc OSrXXb RES9jf q8U8x']";
public GoogleHomePage(WebDriver dr) 
{
	this.driver = dr;
}
	

  public void Homepage(String Searchword)
  {
	Set_Text("XPATH",Searchbox_Text_Xpath, Searchword,driver);
	Click_Button("XPATH", SearchButton_Button_Xpath, driver);
	
  }
  public void Verify(String Searchword) 
  {
	assertEquals("Hello World", driver.findElement(By.xpath(Verify_Label_xpath)).getText());
  }
}
