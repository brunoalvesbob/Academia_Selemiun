package actions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import pages.CreateAccountPage;
import utils.DriverContext;

public class CreateAccountAction extends CreateAccountPage {
	protected WebDriverWait wait;
	
	
	public CreateAccountAction() {
		wait = new WebDriverWait( DriverContext.getDriver(),10);
		//PageFactory.initElements( DriverContext.getDriver(), this);
		}
	
	
			
	public void clicarSignin() {
		wait.until(ExpectedConditions.elementToBeClickable(linkSingIn)).click();
		//linkSingIn.click();
	}

	public void preencherEmail(String email) {
		wait.until(ExpectedConditions.visibilityOf(txtEmail)).sendKeys(email);
		//txtEmail.sendKeys(email);
	}
			
	public void clicarCreateAccount() {
		wait.until(ExpectedConditions.elementToBeClickable(btCreateAccount)).click();
		//btCreateAccount.click();
	}
	
	
	public void clicarGeneroMasculino() {
		wait.until(ExpectedConditions.elementToBeClickable(selGeneroMasculino)).click();
		//selGeneroMasculino.click();
	}
		
	public void clicarGeneroFeminio() {
		wait.until(ExpectedConditions.elementToBeClickable(selGeneroFemino)).click();
		//selGeneroFemino.click();
	}
		
	public void preencherFisrtName(String Fisrt_Name) {
		wait.until(ExpectedConditions.visibilityOf(FisrtName)).sendKeys(Fisrt_Name);
		//FisrtName.sendKeys(Fisrt_Name);
	
	}
	
	public void preencherLastName(String Last_Name) {
		wait.until(ExpectedConditions.visibilityOf(LastName)).sendKeys(Last_Name);
		//LastName.sendKeys(Last_Name);
	}
	
	
	public void preencherPassword(String Pass_word) {
		wait.until(ExpectedConditions.visibilityOf(Password)).sendKeys(Pass_word);
		//Password.sendKeys(Pass_word);
	}
	
	
	public void selecionarDays(String days) {
		Select cdDay = new Select(cdDays);
		cdDay.selectByValue(days);
	}
	
	public void selecionarMonth(String month) {
		Select cbMonth = new Select(cbMonths);
		cbMonth.selectByValue(month);
	}
	
	public void selecionarYears(String years) {
		Select cbYear = new Select(cbYears);
		cbYear.selectByValue(years);
	}
	
	public void  clicarNewsletter() {
		//wait.until(ExpectedConditions.elementToBeClickable(chbnewsletter));
				chbnewsletter.click();
		
		}
	
	public void  clicarcheckoptin() {
		//wait.until(ExpectedConditions.elementToBeClickable(checkoptin)).click();
		checkoptin.click();
		}
				
		public void preencherEmpresa(String nome_empresa) {
			wait.until(ExpectedConditions.visibilityOf(Name_Empresa)).sendKeys(nome_empresa);
		//	Name_Empresa.sendKeys(nome_empresa);
				}
	
		public void preencherEndereço(String endereço_1) {
			wait.until(ExpectedConditions.visibilityOf(Endereço)).sendKeys(endereço_1);
			//Endereço.sendKeys(endereço_1);
			}
	
	public void preencherCidade(String cidade) {
		wait.until(ExpectedConditions.visibilityOf(Cidade)).sendKeys(cidade);
		//	Cidade.sendKeys(cidade);
				}
	
	public void selecionarState(String state) {
		Select cbState = new Select(cbStates);
		cbState.selectByValue(state);
				}

	public void preencherZip(String cep) {
		wait.until(ExpectedConditions.visibilityOf(ZIP)).sendKeys(cep);
		//ZIP.sendKeys(cep);
	}
	
	public void preencherMobilePhone(String Mobile) {
		wait.until(ExpectedConditions.visibilityOf(MobilePhone)).sendKeys(Mobile);
		//MobilePhone.sendKeys(Mobile);
				}
	
	
	public void clicarRegister() {
		wait.until(ExpectedConditions.elementToBeClickable(btSubmitAccount)).click();
		//btSubmitAccount.click();
			}
			
	public void validarUsuario(String nome) {
		//wait.until(ExpectedConditions.visibilityOf(Password)).sendKeys(Pass_word);
		Assert.assertTrue(nome.equals(lblUser.getText()));
		}
	
		
}

	

