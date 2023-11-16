package hp.SampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class LaunchBrowser {
	
	@Test
	public void openBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32");
		ChromeOptions chrome = new ChromeOptions();
		chrome.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://nexteticket.com/");

}
}
