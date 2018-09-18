package automationFramework;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class automationTest {
	String baseUrl = "http://localhost:8080/DevOpsExample/";
	//String baseUrl = "http://ec2-18-223-176-66.us-east-2.compute.amazonaws.com";
	String expectedTitle = "My Addition Application";
	String actualTitle = "";
	WebDriver driver;
	
	public automationTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		//launch Chrome and direct it to the base URL
		driver.get(baseUrl);
	}

	public void TitleTest() {
		// get the actual value of the title
		actualTitle = driver.getTitle();
		System.out.println("Actual Title = " + actualTitle);
		if(actualTitle.equals(expectedTitle)) System.out.println("Test passed!");
		else System.out.println("Test Failed");
		Assert.assertEquals(expectedTitle, actualTitle);
	}
	
	public void UITest() {
		driver.findElement(By.name("a")).sendKeys("25");
		  driver.findElement(By.name("b")).sendKeys("300");
		  driver.findElement(By.name("sb")).click();
		  String result = driver.findElement(By.name("result")).getText();
		  System.out.println("result = " + result);
		  if(Integer.parseInt(result) == 325) System.out.println("Test passed!");
		  else System.out.println("Test Failed!");
		  Assert.assertEquals(Integer.parseInt(result), 325);	
	}
	
	public static void main(String[] args) {
		automationTest test = new automationTest();
		test.TitleTest();
		test.UITest();
		test.driver.close();
	}
}
