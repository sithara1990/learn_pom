package tests;

import org.testng.annotations.Test;

import airtel.pages.LoginPage;

public class LoginTest {
	@Test
	public void login(){
		LoginPage loginpage=new LoginPage();
		loginpage.login();
	}

}
