package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hello_world {

	public static void main(String[] args) {
		
		//System.setProperty("WebDriver.chrome.driver", "\"C:\\Users\\vijay\\OneDrive\\Desktop\\chromedriver-linux64.exe");
		System.setProperty("WebDriver.chrome.driver","user/vijay/onedrive/Desktop/Hello_world/src/test/resources/Driver/chromedriver.exe");
		WebDriver chromeDriver= new ChromeDriver();
		chromeDriver.get("https://amazon.com");
	}

}
