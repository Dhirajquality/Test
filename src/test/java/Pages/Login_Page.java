package Pages;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import CustomPackage.Customclass;


public class Login_Page extends Customclass
{
	WebDriver dr;
	private By User_Name = By.name("uid");
	private By Password = By.name("password");
	private By Login_button = By.name("btnLogin");

	public void Login(String UserName,String password) 
	{
		Set_Text("NAME", User_Name,UserName );
		Set_Text("NAME",Password ,password );
		Click_Button("NAME", Login_button);
	}	
	public Login_Page(WebDriver dr) 
	{
		super(dr);		
	}
}	
