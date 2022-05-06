import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exe_4{
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chorme.drive" ,"C:\\Users\\bruno.moreno.alves\\OneDrive - Accenture\\Bruno\\Cursos\\Selenium\\academia-seleniumwebdriver-base_\\academia-seleniumwebdriver-base\\src\\test\\resources\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		//Busca por  xpath relativo por  findElement
		WebElement campo_busca = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		campo_busca.sendKeys("dbzbrolly");
		Thread.sleep(2000);
		
		// Busca por xpath relativo por  findElement e limpa conteudo
		WebElement campo_busca1 = driver.findElement(By.xpath("//input[@id='search_query_top']"));
		campo_busca1.clear();
		Thread.sleep(1000);
						
		// Busca por LinkText por  findElement
		 WebElement link = driver.findElement(By.linkText("Sign in"));
		 String exemplo = link.getText();
		 System.out.println(exemplo);
		 link.click();
		 Thread.sleep(3000);
							
		// Busca por ID por  findElement
		 WebElement txtEmail = driver.findElement(By.id("email_create"));
		 txtEmail.sendKeys("dbzbrolly@gmlcom.br");
				 		 
		// Busca por ID por findElement
		WebElement createaccount = driver.findElement(By.id("SubmitCreate"));
		createaccount.click();
		Thread.sleep(3000);
				
		// Busca pelo campo email e mostra o que esta escrito
		WebElement campo_email = driver.findElement(By.name("email"));
		System.out.println(campo_email.getAttribute("value"));
		

			
		
		
			}

}

