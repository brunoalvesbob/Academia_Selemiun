import org.openqa.selenium.By;
import utils.Constants;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe_5 {


public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chorme.drive", Constants.PATH_CHROMEDRIVER);;
	WebDriver driver = new ChromeDriver();
	
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			Thread.sleep(3000);
	
			WebElement link = driver.findElement(By.linkText("Sign in"));
			String exemplo = link.getText();
			System.out.println(exemplo);
			link.click();
			Thread.sleep(3000);
			 			 
			WebElement txtEmail = driver.findElement(By.id("email_create"));
			txtEmail.sendKeys("dbzbrolly@gmlcom.br");
			 
					
			WebElement createaccount = driver.findElement(By.id("SubmitCreate"));
			createaccount.click();
			Thread.sleep(3000);
			
			WebElement radio = driver.findElement(By.id("id_gender1"));
			Thread.sleep(3000);
			
			boolean estaVisivel = radio.isDisplayed();
			boolean estaHabilitado = radio.isEnabled();
			boolean estaSelecionado = radio.isSelected();
			
			System.out.println(estaVisivel);
			System.out.println(estaHabilitado);
			System.out.println(estaSelecionado);
			
			WebElement radio2 = driver.findElement(By.id("id_gender2"));
				
			boolean estaVisivel1 = radio2.isDisplayed();
			boolean estaHabilitado1 = radio2.isEnabled();
			boolean estaSelecionado1 = radio2.isSelected();
			
			System.out.println(estaVisivel1);
			System.out.println(estaHabilitado1);
			System.out.println(estaSelecionado1);
			
			
			
}

	
}