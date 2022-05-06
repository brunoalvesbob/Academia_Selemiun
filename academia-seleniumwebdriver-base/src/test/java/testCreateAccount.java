import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import actions.CreateAccountAction;
import utils.Constants;
import utils.DriverContext;


@SuppressWarnings("unused")
class testCreateAccount {

	WebDriver driver;
		CreateAccountAction account;

		@BeforeEach
			void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			DriverContext.setDriver(driver);
			account = new CreateAccountAction();
}
		
		@Test
			void test() throws InterruptedException {
			account.clicarSignin();
			account.preencherEmail("accebrunoalves454534@gmail.com");
			account.clicarCreateAccount();
			account.clicarGeneroMasculino();
			account.preencherFisrtName("Bruno");
			account.preencherLastName("Alves");
			account.preencherPassword("Teste0115");
			account.selecionarDays("24");
			account.selecionarMonth("2");
			account.selecionarYears("1988");
			Thread.sleep(3000);
			account.clicarNewsletter();
			Thread.sleep(3000);
			account.clicarcheckoptin();
			Thread.sleep(3000);
			account.preencherEmpresa("Acce");
			account.preencherEndereço("Rua 11 A Stress");
			account.preencherCidade("Charlotte");
			account.selecionarState("33");
			account.preencherZip("28105");
			account.preencherMobilePhone("351658797");
			account.clicarRegister();
			account.validarUsuario("Bruno Alves");
	
		}

		
		@AfterEach
	void tearDown() throws Exception {
			// acoes que serao chamadas após da execucao de cada teste
			//driver.quit();


}

}



