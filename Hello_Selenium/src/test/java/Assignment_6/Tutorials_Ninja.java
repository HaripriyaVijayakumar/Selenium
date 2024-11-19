package Assignment_6;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tutorials_Ninja {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/");
	    driver.findElement(By.id("form-currency")).click();
		
	    driver.findElement(By.xpath("//button[@name='EUR']")).click();
	    //. Select the currency in the left top corner to Euro
	    
	   driver.findElement(By.xpath("//div[@id='content']/div[2]/div[4]/div[1]/div[2]/h4/a")).click();
	    //Try to order a canon EOS 5 D camera
	   driver.findElement(By.id("input-option226")).click();
	    
	    //collect the error message occurred due to a
	    //bug in select option by clicking add to cart.

	    driver.findElement(By.id("button-cart")).click();
	    
	    //. Move to the home screen by clicking home icon
	   driver.findElement(By.xpath("//div[@id='product-product']/ul/li[1]/a/i")).click();
	    
	    //Click on iphone 
	   driver.findElement(By.xpath("//div[@id='content']/div[2]/div[2]/div[1]/div[2]/h4/a")).click();
	    
	    //go to details screen, change the quantity to two then add to cart.
	    driver.findElement(By.id("input-quantity")).click();
	    driver.findElement(By.id("input-quantity")).clear();
	    driver.findElement(By.id("input-quantity")).sendKeys("2");
	    driver.findElement(By.id("button-cart")).click(); 
	    
	    //. Print the success message in the console
	    System.out.println("success");
	    
	    // Click on the cart icon (black color) in the right side top then click view cart
	    driver.findElement(By.id("cart-total")).click();
	    //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    WebElement viewcart=driver.findElement(By.xpath("//div[@id='cart']/ul/li[2]/div/p/a/strong"));
	   viewcart.click();
	   
	  // Change the quantity of iphone to 3 and click update button
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input")).clear();
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.findElement(By.xpath("//div[@id='content']/form/div/table/tbody/tr/td[4]/div/input")).sendKeys("3");
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); 
	   driver.findElement(By.xpath("//i[@class='fa fa-refresh']")).click();
	   
	  
	   
	   //Print the Eco tax and VAT Amount in console and click Checkout button
	   WebElement EcoTax=driver.findElement(By.xpath(" //div[@id='content']/div[2]/div/table/tbody/tr[2]/td[2]"));
	   EcoTax.getText();
	   System.out.println( EcoTax.getText());
	   WebElement VAT=driver.findElement(By.xpath(" //div[@id='content']/div[2]/div/table/tbody/tr[3]/td[2]"));
	   VAT.getText();
	   System.out.println( VAT.getText());
	   driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
	   
	   
	   // Print the error message and remove the product from the cart
	   WebElement Error=driver.findElement(By.xpath("//div[@class='alert alert-danger alert-dismissible']"));
	   System.out.println(Error.getText());
	   driver.findElement(By.id("cart-total")).click();
	   driver.findElement(By.xpath("//div[@id='cart']/ul/li[1]/table/tbody/tr/td[5]/button/i")).click();
	   driver.findElement(By.xpath("//div[@id='content']/div/div/a")).click();//continue
	   
	   
	   //Move to the laptops screen and click on HP laptop
	  driver.findElement(By.xpath("//nav[@id='menu']/div[2]/ul/li[2]/a")).click();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  WebElement Laptop=driver.findElement(By.xpath("//nav[@id='menu']/div[2]/ul/li[2]/div/a"));
		Laptop.click();
		driver.findElement(By.xpath("//div[@id='content']/div[4]/div[1]/div/div[2]/div[1]/h4/a")).click();
		
		// check the default quantity is 1 and
		//click add to cart then verify success message
		driver.findElement(By.xpath("//button[@id='button-cart']")).click();
		driver.findElement(By.xpath("//div[@id='top-links']/ul/li[4]/a/i")).click();
		
		// Click on the shopping cart link in the top and apply ABCD123 as coupon code to check,
		//print error message

		driver.findElement(By.xpath("//div[@id='accordion']/div[1]/div[1]/h4/a/i")).click();
		Thread.sleep(2000);
		WebElement Enter=driver.findElement(By.id("input-coupon"));
		Enter.sendKeys("ABCD123");
		driver.findElement(By.id("button-coupon")).click();
		WebElement Error_Message=driver.findElement(By.xpath(("//div[@class='alert alert-danger alert-dismissible']")));
		System.out.println(Error_Message.getText());
		
		//Enter AXDFGH123 as gift certificate and perform apply to check, print error message
		
		driver.findElement(By.xpath("(//i[@class='fa fa-caret-down'])[4]")).click();
		Thread.sleep(2000);
		WebElement Gift=driver.findElement(By.xpath("//input[@id='input-coupon']"));
		Gift.sendKeys("AXDFGH123");
		driver.findElement(By.xpath("//input[@id='button-voucher']")).click();
		WebElement Error_Message1=driver.findElement(By.xpath((("//div[@class='alert alert-danger alert-dismissible'])[1]"))));
		System.out.println(Error_Message1.getText());

		
		//Clear both textbox values and proceed to checkout
		//driver.findElement(By.xpath("//div[@id='accordion']/div[1]/div[1]/h4/a/i")).click();
		driver.findElement(By.xpath("(//i[@class='fa fa-caret-down'])[2]")).click();
		driver.findElement(By.xpath("//input[@id='input-coupon']")).clear();
		driver.findElement(By.xpath("(//i[@class='fa fa-caret-down'])[4]")).click();
		driver.findElement(By.xpath("//input[@id='input-voucher']")).clear();
		
		//Select register account option and enter all account and billing details, click continue
		

	}

}

