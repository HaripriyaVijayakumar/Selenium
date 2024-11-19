package day_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloSelenium {

	static void testselenium() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.numpyninja.com/contact");
		
		WebElement firstNameBox = driver.findElement(By.id("input_comp-l1c0ktzj1"));
		firstNameBox.sendKeys("Haripriya");
		
		WebElement lastNameBox = driver.findElement(By.name("last-name"));
		lastNameBox.sendKeys("Vijayakumar");
		
		WebElement emailbox = driver.findElement(By.name("email"));
		emailbox.sendKeys("Haripriya@vijayakumar.com");
		
		WebElement Phonebox = driver.findElement(By.name("phone"));
		Phonebox.sendKeys("1234567890");
		
		WebElement enquirybox = driver.findElement(By.id("textarea_comp-l1c0ku07"));
		enquirybox.sendKeys("when is next class?");
		
		WebElement sendbtn= driver.findElement(By.id("comp-l1c0ku0e3"));
		sendbtn.click();
		
		
		
	}
	public static void main(String[] args) {
		testselenium();
		
	}
		
	}

