import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {

		
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://rahulshettyacademy.com/loginpagePractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.id("username")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("password")).sendKeys("learning");
		driver.findElement(By.xpath("//div[@class='form-check-inline']/label[2]/span[2]")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='okayBtn']")));
		driver.findElement(By.xpath("//button[@id='okayBtn']")).click();
		WebElement dropdownOptions = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select dropdown = new Select(dropdownOptions);
		dropdown.selectByValue("consult");
	
		driver.findElement(By.id("terms")).click();
		driver.findElement(By.id("signInBtn")).click();
		//navigates to shop page
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[@class='my-4']")));
   
		List <WebElement> addProductButtons = driver.findElements(By.className("btn-info"));
		for (int i = 0; i <addProductButtons.size(); i++)
		{
			for (WebElement addProductButton : addProductButtons) 
			{
				addProductButton.click();
				i++;
			}	
		}
		
		driver.findElement(By.xpath("//li[@class='nav-item active']")).click();
		
	}

}
