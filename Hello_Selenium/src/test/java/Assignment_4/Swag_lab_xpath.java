package Assignment_4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;





public class Swag_lab_xpath {

public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		WebElement Username = driver.findElement(By.xpath("//input[@name='user-name']"));
		Username.sendKeys("standard_user");
		WebElement Password = driver.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("secret_sauce");
		WebElement Login = driver.findElement(By.xpath("//input[@value='Login']"));
		Login.click();
		WebElement AddtoCart = driver.findElement(By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']"));
		AddtoCart.click();
		WebElement AddtoCart1 = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bike-light']"));
		AddtoCart1.click();
		WebElement AddtoCart2 = driver.findElement(By.xpath("//button[@data-test='add-to-cart-sauce-labs-bolt-t-shirt']"));
		AddtoCart2.click();
		WebElement GoToCart = driver.findElement(By.xpath("//div[@class='shopping_cart_container']"));
		GoToCart.click();
		WebElement checkout = driver.findElement(By.xpath("//button[@data-test='checkout']"));
		checkout.click();
		WebElement Firstname = driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		Firstname.sendKeys("Sami");
		WebElement Lastname = driver.findElement(By.xpath("//input[@placeholder='Last Name']"));
		Lastname.sendKeys("Ayya");
		WebElement Postalcode = driver.findElement(By.xpath("//input[@placeholder='Zip/Postal Code']"));
		Postalcode.sendKeys("12345");
		WebElement Continue = driver.findElement(By.xpath("//input[@data-test='continue']"));
		Continue.click();
		WebElement Finish = driver.findElement(By.xpath("//button[@id='finish']"));
		Finish.click();
		}

}
