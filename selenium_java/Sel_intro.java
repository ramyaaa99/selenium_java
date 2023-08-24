import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class sel_introduction {

	public static void main(String[] args) {
		
		
		//invoking browser
		//chrome- chromedriver--> methods close,get
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAMYAGUR\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		//System.setProperty("webdriver.gecko.driver","C:\\Users\\RAMYAGUR\\Downloads\\geckodriver-v0.33.0-win64 (1)\\geckodriver.exe");
		//FirefoxDriver driver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver","C:\\Users\\RAMYAGUR\\Downloads\\edgedriver_win64 (2)\\msedgedriver.exe");
		EdgeDriver driver = new EdgeDriver();
		
		driver.get("https://www.udemy.com/");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();

	}

}
