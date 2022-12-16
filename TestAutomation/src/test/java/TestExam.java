import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.Collections;

public class TestExam {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\Selenium Prj\\selenium-java-4.7.2\\chromedriver.exe");
		ChromeOptions options = new ChromeOptions();
		// Hide control by automation
				options.setExperimentalOption("useAutomationExtension", false);
				options.setExperimentalOption("excludeSwitches",Collections.singletonList("enable-automation"));    
				WebDriver driver = new ChromeDriver(options);
				// Maximize window size
				driver.manage().window().maximize();
				driver.get("https://itera-qa.azurewebsites.net/home/automation");
				driver.findElement(By.id("name")).sendKeys("Md. Abu Shaleh");
				driver.findElement(By.id("phone")).sendKeys("01521436109");
				driver.findElement(By.id("email")).sendKeys("abushaleh4185@gmail.com");
				driver.findElement(By.id("password")).sendKeys("#Test1001");
				driver.findElement(By.id("address")).sendKeys("abc rd, dhaka-1207");
				driver.findElement(By.name("submit")).click();
				driver.quit();
			
	}

}
