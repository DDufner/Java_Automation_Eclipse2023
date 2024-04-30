import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Flight_Booking_Site {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/"); 
		WebElement staticDropdown = driver.findElement(By.name("ctl00$mainContent$DropDownListCurrency"));
		
		//Exercise 52. Handling Static dropdowns with Select webdriver API
		Select dropdown = new Select(staticDropdown);
		//TODO: add random number generator for drop down index. TRY: java.util.Random OR Math.random n
		dropdown.selectByIndex(3);
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("AED"); 
		System.out.println(dropdown.getFirstSelectedOption().getText());
		dropdown.selectByVisibleText("INR"); 
		System.out.println(dropdown.getFirstSelectedOption().getText());
		
		
		//53. Updated lecture on latest Dropdown looping UI
		
		driver.findElement(By.xpath("//div[@id='divpaxinfo']")).click();
			Thread.sleep(1000L);
		int i = 1; 
		while(i < 5) 
		{
			driver.findElement(By.id("hrefIncAdt")).click(); 
			i++;
		}
		// FOR loop = 'for(int i=1; i<5; i++)'...

		driver.findElement(By.xpath("//input[@id='btnclosepaxoption']")).click();
		
		//55. Handle Dynamic dropdowns with Webdriver API & 56. Parent-Child relationship locator to Identify the objects Uniquely
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Varanasi (VNS)')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='CCU']")).click(); 
		//index alternative:  driver.findElement(By.xpath("(//a[@value='CCU'])[2]")).click();
		//63. Handling Calendar UI in travel websites using Selenium 
		driver.findElement(By.xpath("//a[@class='ui-state-default ui-state-highlight']"));
		//64. Validating if UI Elements are disabled or enabled with Attributes 
		driver.findElement(By.className("picker-second")).getAttribute("style");
		if (driver.findElement(By.className("picker-second")).getAttribute("style").contains("0.5")) 
		{
			Assert.assertTrue(true);
			System.out.println("element showed inactive styling");
		}
		else
		{
			Assert.assertTrue(false);
			System.out.println("element showed active styling");
		}
		
		
		//58. Handling AutoSuggestive dropdowns using Selenium
		driver.findElement(By.id("autosuggest")).sendKeys("am");
		Thread.sleep(3000);
		List<WebElement> countries = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));

		for (WebElement country : countries)
		{	
			if (country.getText().equalsIgnoreCase("suriname"))
			{
				//String countryName = country.getText();
				Assert.assertEquals(country.getText(), "Suriname");
				country.click();
				break;
			}
		}
		
		//60. Handling Checkbox and getting the size of them with Selenium
		Assert.assertFalse(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		System.out.println(driver.findElements(By.cssSelector("input[type='checkbox']")).size());
		driver.findElement(By.cssSelector("input[id*='IndArm']")).click();
		Assert.assertTrue(driver.findElement(By.cssSelector("input[id*='IndArm']")).isSelected());
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("input[value='Search']")).click();
		//driver.findElement(By.xpath("//input[@value='Search']")).click();
		System.out.println("All steps completed successfully.");
	}

}
