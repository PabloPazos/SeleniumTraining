import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver -> methods close
		// Firefox - FirefoxDriver -> methods close
		// Safari - safariDriver -> methods close
		// WebDriver methods + Class methods
		
		// ChromeDriver-exe -> Chrome Browser
		// Invoking Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Documents\\chromedriver\\chromedriver.exe");
		// WebDrier.chrome.driver -> value of path
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver(options);
		
		// Navigate to URL
		driver.get("https://rahulshettyacademy.com");
		
		// Print page title and URL
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());

	}

}
