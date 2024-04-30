import java.time.Duration;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class FluentWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("http://the-internet.herokuapp.com/dynamic_loading/1"); 
		
		driver.findElement(By.id("start")).click();
		
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
				.pollingEvery(Duration.ofSeconds(3)).ignoring(NoSuchElementException.class);
		
		WebElement findElement = wait.until(new Function<WebDriver, WebElement>()
			{
				public WebElement apply(WebDriver driver) 
			{
				return driver.findElement(By.cssSelector("[id='finish'] h4"));
		}
	});

}
}