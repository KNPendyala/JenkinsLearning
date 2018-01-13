package JenkinsLearn;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class  JenkinsLearning {
	
	@Test
	public void jenkinsDemo() {
<<<<<<< HEAD
		System.out.println("Hello, Welcome Jenkins..");
=======
		System.out.println("Hello Jenkins");
>>>>>>> parent of 60c7420... Project modified
		
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Kumar\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://www.bcbsm.com"); 
		System.out.println(driver.getTitle());
		driver.quit();
		
	}
}
