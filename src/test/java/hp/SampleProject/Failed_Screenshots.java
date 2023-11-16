package hp.SampleProject;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Failed_Screenshots {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\WebDrivers\\chromedriver_win32/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.className("_2KpZ6l _2doB4z")).click();
		
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		TakesScreenshot TS = (TakesScreenshot)driver;
		File file = TS.getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(file, new File("./ScreenShots.Image1.png"));
		
		
		driver.close();
		
	}
}
		
		
		
			
			
			
		
		
		

	


