package Demotest;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page_object.LoginPom1;
import utility.Demo_Baseclass;



public class Login_facebook extends Demo_Baseclass {
	
	@Test
	public void Login2()
	{
		
		LoginPom1 login=PageFactory.initElements(driver, LoginPom1.class);
		login.getTxt_email().sendKeys("trst");
		login.getTxt_pass().sendKeys("131314");
		login.getTxt_Login().click();
		
	}
	

}
