import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Assert; 


public class Fatal_Exposure_Play {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.youtube.com/");
		
		/*youtube test acct info:
		 * email: dominick.dufner+selenium_testing@gmail.com
		 */
		
		
		driver.findElement(By.xpath("//div[@id='buttons']//ytd-button-renderer[@class='style-scope ytd-masthead']")).click();
		try {
			driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test");
			//driver.findElement(By.xpath("//span[text()='Next']")).click();
			driver.findElement(By.cssSelector("#Next")).click();
		} finally {
			driver.findElement(By.xpath("//span[text()='Next']")).click();
		};
		
	
			
		
		
		

		
		//driver.findElement(By.xpath("//input[@id='search']")).sendKeys("fatal exposure 1989");
		
		

	}

}

