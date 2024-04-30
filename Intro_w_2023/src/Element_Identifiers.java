import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class Element_Identifiers {


public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", "/Users/dominickdufner/Coding/eclipse-2023-workspace/chromedriver");
	WebDriver driver = new ChromeDriver();
	
	//implicit timeout, used for when a wait is needed for element that does not appear on UI yet. 
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	
	//Navigates to the URL 
	driver.get("https://rahulshettyacademy.com/locatorspractice/");
	
	//Find by -> id
	driver.findElement(By.id("inputUsername")).sendKeys("rahul");
	
	//Find by -> name
	driver.findElement(By.name("inputPassword")).sendKeys("hello123");
	
	//Find by -> class name
	driver.findElement(By.className("signInBtn")).click();
	
	System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
	
	//Find by -> link text
	driver.findElement(By.linkText("Forgot your password?")).click();
	
	//thread sleep is used for when an element exists on UI but is not immediately accessible. 
	Thread.sleep(1000);
	
	////Find by -> xpath by input element's placeholder attribute
	driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("John");
	
	//Find by -> CSS selector by input element's placeholder attribute
	driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("john@rsa.com");
	
	//Find by -> xpath by type attribute and using the 2nd index
	driver.findElement(By.xpath("//input[@type='text'][2]")).clear();
	
	//Find by -> CSS selector by type attribute and using the 3rd child element index 
	driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("john@gmail.com");
	
	//Find by -> xpath by 3rd child input element of parent element, form
	driver.findElement(By.xpath("//form/input[3]")).sendKeys("9864353253");
	
	//Find by -> CSS selector by class name 
	driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
	
	//Find by -> CSS selector by parent-child relation of elements
	System.out.println(driver.findElement(By.cssSelector("form p")).getText());
	
	//Find by -> xpath using div that has class named 'forgot-pwd-btn-conainer' and clicking on first button
	driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
	
	//used to wait for element that is on the UI but is not available (other element overlaps it, element is conditionally hidden
	Thread.sleep(1000);
	
	//Find by -> CSS selector by id value
	driver.findElement(By.cssSelector("#inputUsername")).sendKeys("rahul");
	
	//Find by -> CSS selector using RegEx for input that has 'pass' as part of type value  
	driver.findElement(By.cssSelector("input[type*='pass']")).sendKeys("rahulshettyacademy");
	
	//Find by partial Link Text. Example element: <a class="nav-link btn btn-primary"> Checkout ( 0 )<span class="sr-only">(current)</span></a>
	driver.findElement(By.partialLinkText("Checkout")).click();
	
	//Find by -> id
	driver.findElement(By.id("chkboxOne")).click();
	
	//Find by -> xpath by button that contains a class that has value 'submit'
	driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
	//Contains text: //h4[contains(text(),'Cucumber - 1 Kg')] ->from greenkart page
	
	//CODE FOR NEXT PAGE AFTER SUCCESSFUL LOGIN
	//use code to enter correct login data. -> See video '41: Identifying web elements based on unique Tag name locators - example' 
	
	//Find by -> tag name of element.  default to first tag name it finds that matches value
	driver.findElement(By.tagName("p"));
	Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
	
	//Find by - > css class for radio button.  
	/*Example: <label class="customradio"><span class="radiotextsty"> User</span>
	  <input type="radio" value="user" id="usertype" name="radio">
	  <span class="checkmark"></span>
	</label>*/
	driver.findElement(By.cssSelector(".customradio:nth-child(2)")).click();
	
	
	//Find by -> button text
	driver.findElement(By.xpath("//button[text()='Log Out']")).click(); 
	
	//Find by -> any element with listed text using the '*' char  (42. Generating xpaths based on the button texts on the page with the example)
	driver.findElement(By.xpath("//*[text()='Log Out']")).click(); 
	
	//Find by -> sibling to sibling (46. Identify locators using Siblings with Xpath traverse - example)
	driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]")).click();
	
	//Find by -> sibling to parent (47. How to Traverse from child element to parent element with xpath - Example)
	driver.findElement(By.xpath("//header/div/button[1]/parent::div")).click();
	}


}


