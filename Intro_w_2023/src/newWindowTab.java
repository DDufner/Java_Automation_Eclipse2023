import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class newWindowTab {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
		WebDriver driver = new ChromeDriver(); 

		driver.get("https://rahulshettyacademy.com/loginpagePractise/#");  
		driver.findElement(By.cssSelector(".blinkingText")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> windowTabs = windows.iterator();
		String parentWindow = windowTabs.next();
		String childWindow = windowTabs.next();
		
		driver.switchTo().window(childWindow);
		System.out.println(driver.findElement(By.xpath("//p[@class='im-para red']")).getText());
		String emailAddress = driver.findElement(By.xpath("//p[@class='im-para red']")).getText().split("at")[1].trim().split(" ")[0]; 
		driver.switchTo().window(parentWindow);
		driver.findElement(By.id("username")).sendKeys(emailAddress);
	}

}
