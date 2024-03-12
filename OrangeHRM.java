package Maven_TestNg.Maven_TestNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class OrangeHRM {
	WebDriver driver;
	
	@Test(priority = 1)
	public void LunchApp() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	@Test(priority = 2)
	public void EnterLoginDetails() {	
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test(priority = 3)
	public void MyInfo() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		System.out.println(driver.findElement(By.id("employee-details")).isDisplayed());
	}
	@Test(priority = 4)
	public void VerifyLogin() {
		System.setProperty("webdriver.chrome.driver", "c://chromedriver//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();

		WebElement element=driver.findElement(By.id("Welcome"));
		System.out.println(element.isDisplayed());
		System.out.println(element.getText());
		driver.quit();
	}
}
