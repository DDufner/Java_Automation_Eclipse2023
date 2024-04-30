import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowActivities_48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		
		driver.manage().window().maximize(); //maximizes browser window size. 
		
		driver.get("https://google.com"); //'get()' will wait for all page elements to load. 
		
		driver.navigate().to("https://rahulshettyacademy.com/locatorspractice/"); //'navigate().to()' will not wait for all elements to load.  
		
		driver.navigate().back(); //navigates a page back using browser back functionality. 

		driver.navigate().forward(); //navigates a page forward using browser forward functionality. 
		
	}

}
