import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.Constants;


public class Abrir_Fechar {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chorme.drive", Constants.PATH_CHROMEDRIVER);;
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		
		driver.navigate().refresh();
		// driver.quit();
		
	}

}

