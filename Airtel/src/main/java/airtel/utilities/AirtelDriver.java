package airtel.utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class AirtelDriver {
	public WebDriver driver;
	
	public AirtelDriver(){
		System.setProperty("webdriver.gecko.driver","C:\\Sithara\\Softwares\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://www.airtel.in/s/selfcare/");
		PageFactory.initElements(driver,this);
	}

}
