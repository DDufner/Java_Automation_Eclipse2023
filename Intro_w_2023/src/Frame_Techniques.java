import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frame_Techniques {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://jqueryui.com/droppable/"); 
		//driver.switchTo().frame(driver.findElement(By.className("demo-frame")));
		driver.switchTo().frame(0);
		driver.findElement(By.id("draggable")).click(); 
		Actions action = new Actions(driver);
		WebElement elementToMove = driver.findElement(By.id("draggable"));
		WebElement targetElement = driver.findElement(By.id("droppable"));
		action.dragAndDrop(elementToMove, targetElement).build().perform();
		
	}

}
