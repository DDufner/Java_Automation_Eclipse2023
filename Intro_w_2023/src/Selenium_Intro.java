import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver; 

public class Selenium_Intro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://rahulshettyacademy.com"); 
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
	}

}