package page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPom1 {
	
	//using concept of encapsulation.

		@FindBy(how=How.XPATH,using="//input[@id='email']") private WebElement txt_email;
		@FindBy(how=How.XPATH,using="//input[@id='pass']") private WebElement txt_pwd;
		@FindBy(how=How.XPATH,using="//button[@name='login']") private WebElement txt_Login;
		public WebElement getTxt_email() {
			return txt_email;
		}
	
		
		public WebElement getTxt_pass() {
			return txt_pwd;
		}
		
		public WebElement getTxt_Login() {
			return txt_Login;
		}
	

}
