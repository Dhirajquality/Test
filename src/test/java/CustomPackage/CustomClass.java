package CustomPackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CustomClass
{
WebDriver dr;
public CustomClass(WebDriver dr)
{
	this.dr = dr;
    
}
    
public void Set_Text(String Bys,By Locator,String fieldText) 
    {
        switch (Bys) 
        {
        case "XPATH":
                dr.findElement(Locator).sendKeys(fieldText);
            break;
        case "ID":
                dr.findElement(Locator).sendKeys(fieldText);
            break;
        case "NAME":
            dr.findElement(Locator).sendKeys(fieldText);
        break;
        }
    }
    public void Click_Button(String Bys,By Locator) 
    {
        switch (Bys) 
        {
        case "XPATH":
               dr.findElement(Locator).click();
            break;
        case "ID":
                dr.findElement(Locator).click();;
            break;
        case "NAME":
            dr.findElement(Locator).click();;
        break;
        }
    }
}
