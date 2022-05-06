package actions;

import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BuyPages;
import utils.DriverContext;

public class BuyAction extends BuyPages {
	protected WebDriverWait wait;
	
		public BuyAction() {
			wait = new WebDriverWait( DriverContext.getDriver(),10);
		}
	
	// Realizar Login 
		public void clicarSignin() {
			wait.until(ExpectedConditions.elementToBeClickable(linkSingIn)).click();
		
		}
	
	
		public void preencherEmaillogin(String txtemail) {
		wait.until(ExpectedConditions.visibilityOf(txtEmailLogin)).sendKeys(txtemail);
		}
	
	
		public void preencherPasswordlogin(String Pass_word) {
			wait.until(ExpectedConditions.visibilityOf(txtPassword)).sendKeys(Pass_word);
		
		}
	
		public void clicarSigninLogin() {
			wait.until(ExpectedConditions.elementToBeClickable(SigninLogin)).click();
		}

	
		public void validarUsuario(String nome) {
			//wait.until(ExpectedConditions.visibilityOf(Password)).sendKeys(Pass_word);
			Assert.assertTrue(nome.equals(lblUser.getText()));
		}
	
	
	//Pesquisar por item
	
		public void preencherBuscaitem(String busca_item) {
			wait.until(ExpectedConditions.elementToBeClickable(txtSearch)).sendKeys(busca_item);
		}
	
		public void clicarBotaoBusca() {
			wait.until(ExpectedConditions.elementToBeClickable(btnSearch)).click();
		}
			
	
	//Adicionar ao Carrinho
		public void clicarProdutoBlouse() {
			wait.until(ExpectedConditions.elementToBeClickable(ImgBlouse)).click();
		}
	
		public void validarpaginadoproduto(String nome) {
			wait.until(ExpectedConditions.elementToBeClickable(btAddCart1));
			Assert.assertTrue(nome.equals(btAddCart1.getText()));
		}
	
		public void preencherQuantidade(String quantidade) {
			btnquantity.clear();
			wait.until(ExpectedConditions.visibilityOf(btnquantity)).sendKeys(quantidade);
		}
		
		public void clicarAddCart() {
			wait.until(ExpectedConditions.elementToBeClickable(btAddCart)).click();
		}
	
		public void clicarbtcheckout() {
			wait.until(ExpectedConditions.elementToBeClickable(btcheckout)).click();
		}
	
		public void validarpaginacarrinho(String string) {
			wait.until(ExpectedConditions.visibilityOf(cart_title));
		}
	
		
	//Informar opções de entrega
			
		public void clicarbtnProceedcheckout() {
			wait.until(ExpectedConditions.elementToBeClickable(btnProceedcheckout)).click();
		}
		
		public void validardeliveryaddress (String string) {
			wait.until(ExpectedConditions.visibilityOf(deliveryaddress));
		}
	
		public void clicarbtnprocessAddress() {
			wait.until(ExpectedConditions.elementToBeClickable(btnprocessAddress)).click();
		}
	
		public void validarMy_addr (String string) {
			wait.until(ExpectedConditions.visibilityOf(My_addr));
		}

		public void clicarbtnTermsservice() {
			//wait.until(ExpectedConditions.elementToBeClickable(btnTermsservice)).click();
			btnTermsservice.click();
		}
	
		public void clicarbtnprocessCarrier() {
			wait.until(ExpectedConditions.elementToBeClickable(btnprocessCarrier)).click();
		}
	
	
	//Informar opções de pagamento
	
		public void validarPayment(String string) {
			wait.until(ExpectedConditions.visibilityOf(Payment));
		}
	
		public void validarPayment_Method(String string) {
			wait.until(ExpectedConditions.visibilityOf(PaymentMethod));
		}
		
		public void clicarbtnbankwire() {
			wait.until(ExpectedConditions.elementToBeClickable(btnBankwire)).click();
		}
	
	
	//Finalizar Compra 
	
		public void validarOrderSummary(String string) {
			wait.until(ExpectedConditions.visibilityOf(OrderSummary));
		}
	
		public void clicarbtnConfirmMyOrder() {
			wait.until(ExpectedConditions.elementToBeClickable(btnConfirm_my_order)).click();
		}
	
		public void validarOrderConfirmation(String string) {
			wait.until(ExpectedConditions.visibilityOf(OrderConfirmation));
		}

}
	
	
	
	
	

	