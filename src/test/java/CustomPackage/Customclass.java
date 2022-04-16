package CustomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Customclass
{
//	WebDriver dr ;
	public void Set_Text(String Bys,String Locator,String fieldText,WebDriver dr) 
	{
		switch (Bys) 
		{
		case "XPATH":
				dr.findElement(By.xpath(Locator)).sendKeys(fieldText);
			break;
		case "ID":
				dr.findElement(By.id(Locator)).sendKeys(fieldText);
			break;
		}
	}
	public void Click_Button(String Bys,String Locator,WebDriver dr) 
	{
		switch (Bys) 
		{
		case "XPATH":
				dr.findElement(By.xpath(Locator)).click();;
			break;
		case "ID":
				dr.findElement(By.id(Locator)).click();;
			break;
		}
	}
}

