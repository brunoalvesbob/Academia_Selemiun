package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;


@SuppressWarnings("unused")
public class BuyPages {
		
	public  BuyPages() {
		PageFactory.initElements( DriverContext.getDriver(), this);
	}
	
	// Realizar Login 
		@FindBy(how=How.LINK_TEXT, using="Sign in")
			protected WebElement linkSingIn;

		@FindBy(how=How.ID, using="email")
			protected WebElement txtEmailLogin;
		
		@FindBy(how=How.ID, using="passwd")
			protected WebElement txtPassword;
	
		@FindBy(how=How.ID, using="SubmitLogin")
			protected WebElement SigninLogin;
	
		@FindBy(how = How.XPATH, using ="//a[@class='account']/span")
			protected WebElement lblUser;
	
		
	// Pesquisar por item
	
		@FindBy(how=How.ID, using="search_query_top")
			protected WebElement txtSearch;
		
		@FindBy(how=How.NAME, using="submit_search")
			protected WebElement btnSearch;
	
		@FindBy(how = How.XPATH, using ="//div[@class='right-block']//a[@class='product-name'][contains(text(),'Blouse')]")
			protected WebElement ImgBlouse;
	
	
	// Adicionar ao Carrinho
		
		@FindBy(how = How.NAME, using ="Submit")
			protected WebElement btAddCart1;
	
		@FindBy(how=How.ID, using="quantity_wanted")
			protected WebElement btnquantity;
		
		@FindBy(how = How.NAME, using ="Submit")
			protected WebElement btAddCart;
	
		@FindBy(how = How.XPATH, using ="//span[contains(text(),'Proceed to checkout')]")
			protected WebElement btcheckout;
	
		@FindBy(how=How.ID, using="cart_title")
			protected WebElement cart_title;
	
	
	//Informar opções de entrega
	
		@FindBy(how = How.XPATH, using ="//a[@class='button btn btn-default standard-checkout button-medium']//span[contains(text(),'Proceed to checkout')]")
			protected WebElement btnProceedcheckout;

		
		@FindBy(how=How.XPATH, using ="//h3[contains(text(),'Your delivery address')]")
			protected WebElement  deliveryaddress;
	
		@FindBy(how=How.XPATH, using ="//button[@name='processAddress']//span[contains(text(),'Proceed to checkout')]")
			protected WebElement  btnprocessAddress;
		
		@FindBy(how=How.XPATH, using = "//p[contains(text(),'Choose a shipping option for this address: My addr')]")
			protected WebElement  My_addr;
	
		@FindBy(how=How.ID, using="cgv")
			protected WebElement btnTermsservice;
	
		@FindBy(how=How.XPATH, using ="//button[@name='processCarrier']//span[contains(text(),'Proceed to checkout')]")
			protected WebElement  btnprocessCarrier;
	
	
	// Informar opções de pagamento

		@FindBy(how=How.XPATH, using ="//span[contains(text(),'Payment')]")
			protected WebElement  Payment;
	
		@FindBy(how = How.XPATH, using ="//h1[@class='page-heading']")
			protected WebElement PaymentMethod;
	 
		@FindBy(how = How.XPATH, using ="//a[@class='bankwire']")
			protected WebElement btnBankwire;
	 
	// Finalizar Compra 
	
		@FindBy(how = How.XPATH, using ="//h1[@class='page-heading']")
			protected WebElement OrderSummary;
	
		@FindBy(how = How.XPATH, using ="//span[contains(text(),'I confirm my order')]")
			protected WebElement btnConfirm_my_order;
	
		@FindBy(how = How.XPATH, using ="//h1[@class='page-heading']")
			protected WebElement OrderConfirmation;
	

}
