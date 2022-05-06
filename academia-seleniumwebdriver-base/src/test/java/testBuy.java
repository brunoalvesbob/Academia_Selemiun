import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import actions.BuyAction;
import actions.CreateAccountAction;
import utils.Constants;
import utils.DriverContext;


@SuppressWarnings("unused")
class testBuy {

	WebDriver driver;
		BuyAction account;

		@BeforeEach
			void setUp() throws Exception {
			System.setProperty("webdriver.chrome.driver", Constants.PATH_CHROMEDRIVER);
			driver = new ChromeDriver();
			driver.get("http://automationpractice.com/index.php");
			driver.manage().window().maximize();
			DriverContext.setDriver(driver);
			account = new BuyAction();
}
		
		@Test
			void test() throws InterruptedException {
			
		// Realizar Login 
			account.clicarSignin();
			account.preencherEmaillogin("accebrunoalves454534@gmail.com");
			account.preencherPasswordlogin("Teste0115");
			account.clicarSigninLogin();
			account.validarUsuario("Bruno Alves");
			
			
		// Pesquisar por item
			account.preencherBuscaitem("Blouse");
			account.clicarBotaoBusca();
						
			
		// Adicionar ao Carrinho
			account.clicarProdutoBlouse();
			account.validarpaginadoproduto("Add to cart");
			account.preencherQuantidade("5");
			account.clicarAddCart();
			account.clicarbtcheckout();
			account.validarpaginacarrinho("Proceed to checkout");
			
			
		// Informar opções de entrega
			account.clicarbtnProceedcheckout();
			account.validardeliveryaddress("Your delivery address");
			account.clicarbtnprocessAddress();
			account.validarMy_addr("My addr");
			account.clicarbtnTermsservice();
			account.clicarbtnprocessCarrier();
			
			
		// Informar opções de pagamento
			account.validarPayment("Payment");
			account.validarPayment_Method("Please choose your payment method");
			account.clicarbtnbankwire();
			
			
		// Finalizar Compra 
			account.validarOrderSummary("Order summary");
			account.clicarbtnConfirmMyOrder();
			account.validarOrderConfirmation("Order confirmation");
			
			}
		
		
		@AfterEach
			void tearDown() throws Exception {
				// acoes que serao chamadas após da execucao de cada teste
					driver.quit();

			}

}

