import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By.ByCssSelector;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Shopping_Kart {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS); --> deprecated version 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String[] itemsNeeded = {"Cucumber","Brocolli", "Onion", "Walnuts"};
		
		addItems(driver, itemsNeeded);
		//if method is not static, you need to create an object of the class you want to use with it, in this case the 'Shopping_Kart' class. 
		//Shopping_Kart kart = new Shopping_Kart();
		//kart.addItems(driver, itemsNeeded); 
		String numberOfItems = "";
		String totalPrice ="";
		//driver.findElement(By.xpath("//td[text()='Items']/td[1]/strong")).getText();
		//numberOfItems = driver.findElement(By.xpath("//body/div[@id='root']/div[@class='container']/header[@style='margin-left: -121px;']/div[@class='container']/div[@class='cart']/div[@class='cart-info']/table/tbody/tr[1]/td[3]/strong[1]")).getText();
		numberOfItems = driver.findElement(By.xpath("//div[@class='cart-info']/table/tbody/tr[1]/td[3]/strong")).getText();
		
		System.out.println("Number of items in cart: " + numberOfItems);
		
		driver.findElement(By.xpath("//a[@class='cart-icon']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector("input[placeholder='Enter promo code']")).sendKeys("rahulshetty");
		driver.findElement(By.xpath("//button[contains(text(),'APPLY')]")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("button.promoInfo")));
		
		System.out.println(driver.findElement(By.cssSelector("button.promoInfo")).getText());
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) 
	{
		int numberOfItemsFound = 0; 
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
		for (int i = 0; i < products.size(); i++)
		{
			
			String[] productName = products.get(i).getText().split("-");
			String formattedProductName = productName[0].trim();
			List itemsNeededList = Arrays.asList(itemsNeeded);
			
			if(itemsNeededList.contains(formattedProductName))
			{
				numberOfItemsFound ++;
				//driver.findElements(By.xpath("//button[text()='ADD TO CART']")).get(i).click(); ->less dynamic method that can be prone to issues is text changes. 
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				
				if (numberOfItemsFound == itemsNeededList.size()) 
				{
					break;
				}
			}
			
		}
		System.out.println("addItems method executed");
	}
	
	
	//TODO: create method to check number of items and total price of cart. 
	
	//public static void getCartItemsAndPrice (WebDriver) {
		//int numberOfItems = 0;
		//int totalPrice = 0;
		
		
}
