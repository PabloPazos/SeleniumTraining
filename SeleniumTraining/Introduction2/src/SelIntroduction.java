import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {

	public static void main(String[] args) {
		// Invoking Browser
		// Chrome - ChromeDriver -> methods close get
		// Firefox - FirefoxDriver -> methods close get
		// Safari - safariDriver -> methods close get
		// WebDriver methods + Class methods
		
		// Chrome
		// System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Documents\\chromedriver\\chromedriver.exe");
		// WebDriver.chrome.driver -> value of path
		// WebDriver driver = new ChromeDriver();
		
		// Firefox Launch
		// webdriver.gecko.driver
		// System.setProperty("webdriver.gecko.driver", "C:\\Users\\pablo\\Documents\\geckodriver\\geckodriver.exe");
		// WebDriver driver = new FirefoxDriver();
		
		// Microsoft Edge
		System.setProperty("webdriver.edge.driver", "C:\\Users\\pablo\\Documents\\edgedriver\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
		
		
		// Navigate to URL
		driver.get("https://google.com");
		// Print page title and URL
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		// System.out.println(driver.getPageSource());
		driver.close();
		//driver.quit();
	}
}
