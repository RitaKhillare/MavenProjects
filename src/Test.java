import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		By username = By.name("txtUsername");
		WebElement searchbox=driver.findElement(username);
		searchbox.sendKeys("Admin");
		
		
		By password=By.name("txtPassword");
		WebElement passwordbox=driver.findElement(password);
		passwordbox.sendKeys("admin123");
		
		driver.close();
		

	}

}
