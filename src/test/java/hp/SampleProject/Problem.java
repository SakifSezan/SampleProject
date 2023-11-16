package hp.SampleProject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Problem {
	@Test
	public void Sakif() {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chrome-win64.exe");
		ChromeOptions TX = new ChromeOptions();
		TX.addArguments("--remote-allow-origins=*");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		
	}

}
