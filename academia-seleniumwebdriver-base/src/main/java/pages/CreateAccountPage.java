package pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import utils.DriverContext;


@SuppressWarnings("unused")
public class CreateAccountPage {
		
	public  CreateAccountPage() {
		PageFactory.initElements( DriverContext.getDriver(), this);
	}

	@FindBy(how=How.LINK_TEXT, using="Sign in")
	protected WebElement linkSingIn;

	@FindBy(how=How.ID, using="email_create")
	protected WebElement txtEmail;

	@FindBy(how=How.ID, using="SubmitCreate")
	protected WebElement btCreateAccount;
		
	@FindBy(how=How.ID, using="id_gender1")
	protected WebElement selGeneroMasculino;

	@FindBy(how=How.ID, using="id_gender2")
	protected WebElement selGeneroFemino;
	
	@FindBy(how=How.ID, using="customer_firstname")
	protected WebElement FisrtName;
	
	
	@FindBy(how=How.ID, using="customer_lastname")
	protected WebElement LastName;
	
	
	@FindBy(how=How.ID, using="passwd")
	protected WebElement Password;
	
	
	@FindBy(how=How.ID, using="days")
	protected WebElement cdDays;
	
	@FindBy(how = How.ID, using = "months")
	protected WebElement cbMonths;
	
	
	@FindBy(how=How.ID, using="years")
	protected WebElement cbYears;
	
	@FindBy(how=How.ID, using="newsletter")
	protected WebElement chbnewsletter;
	
	@FindBy(how=How.ID, using="optin")
	protected WebElement checkoptin;
			
	@FindBy(how=How.ID, using="company")
	protected WebElement Name_Empresa;
	
	@FindBy(how=How.ID, using="address1")
	protected WebElement Endereço;
	
	@FindBy(how=How.ID, using="city")
	protected WebElement Cidade;
	
	@FindBy(how=How.ID, using="id_state")
	protected WebElement cbStates;
	
	@FindBy(how=How.ID, using="postcode")
	protected WebElement ZIP;
	
	@FindBy(how=How.ID, using="phone_mobile")
	protected WebElement MobilePhone;
		
	@FindBy(how=How.ID, using="submitAccount")
	protected WebElement btSubmitAccount;
	
	@FindBy(how = How.XPATH, using = "//a[@class='account']/span")
	protected WebElement lblUser;
	
	
	
	
	
	
	
	
	
}