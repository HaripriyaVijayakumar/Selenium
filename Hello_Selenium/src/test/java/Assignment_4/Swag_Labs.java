package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Swag_Labs {
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement Username = driver.findElement(By.id("user-name"));
		Username.sendKeys("standard_user");
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("secret_sauce");
		WebElement Login = driver.findElement(By.id("login-button"));
		Login.click();
		WebElement AddtoCart = driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
		AddtoCart.click();
		WebElement AddtoCart1 = driver.findElement(By.id("add-to-cart-sauce-labs-bike-light"));
		AddtoCart1.click();
		WebElement AddtoCart2 = driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
		AddtoCart2.click();
		WebElement GoToCart = driver.findElement(By.id("shopping_cart_container"));
		GoToCart.click();
		WebElement checkout = driver.findElement(By.id("checkout"));
		checkout.click();
		WebElement Firstname = driver.findElement(By.id("first-name"));
		Firstname.sendKeys("abcd");
		WebElement Lastname = driver.findElement(By.id("last-name"));
		Lastname.sendKeys("efgh");
		WebElement Postalcode = driver.findElement(By.id("postal-code"));
		Postalcode.sendKeys("12345");
		WebElement Continue = driver.findElement(By.id("continue"));
		Continue.click();
		WebElement Finish = driver.findElement(By.id("finish"));
		Finish.click();
		
		
		 
		
	}

}
