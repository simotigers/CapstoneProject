package page.object;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RetailPageObject extends Base {

	public RetailPageObject() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//a[text() ='TEST ENVIRONMENT']")
	private WebElement testEnviromentText;

	@FindBy(xpath = "//span[text()='My Account']")
	private WebElement MyAccountButton;

	@FindBy(xpath = "//a[text() ='Login']")
	private WebElement longinlink;

	@FindBy(xpath = "//*[@id=\"input-email\"]")
	private WebElement userNameField;

	@FindBy(xpath = "//input[@id='input-password']")
	private WebElement passwordFiled;

	@FindBy(xpath = "//input [@value='Login']")
	private WebElement loginButton;

	@FindBy(xpath = "//*[@id=\"content\"]/h2[1]")
	private WebElement MyAccountdashboard;

	@FindBy(xpath = "//*[@id=\"content\"]/ul[3]/li/a")
	private WebElement RegisterForAnAffiliateAccount;

	@FindBy(xpath = "//input[@id='input-company']")
	private WebElement CompanyName;

	@FindBy(xpath = "//input[@id='input-website']")
	private WebElement WebSiteName;

	@FindBy(xpath = "//*[@id=\"input-tax\"]")
	private WebElement TaxIdNumber;
	
	@FindBy(xpath = "//*[@id=\"input-cheque\"]")
	private WebElement payeeeName;

	@FindBy(xpath = "//*[@id=\"content\"]/form/div/div/input[1]")
	private WebElement CheckBox;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueButton;

	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement AffiliatSuccessMessage;

	@FindBy(xpath = "//a[text()='Edit your affiliate information']")
	private WebElement EditYourAffiliateInformation;

	@FindBy(xpath = "//*[@id=\"content\"]/form/fieldset[2]/div[2]/div/div[3]/label/input")
	private WebElement BankTransferRadioButton;

	@FindBy(xpath = "//*[@id=\"input-bank-name\"]")
	private WebElement BankNameName;

	@FindBy(xpath = "//input[@name='bank_branch_number']")
	private WebElement AbaNumberNumber;

	@FindBy(xpath = "//input[@name='bank_swift_code']")
	private WebElement SwiftCodeNumber;

	@FindBy(xpath = "//input[@name='bank_account_name']")
	private WebElement AccountNameName;

	@FindBy(xpath = "//input[@name='bank_account_number']")
	private WebElement AccountNumberNumber;

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ClickOnContinueButton;

	@FindBy(xpath = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement EditSuccessMessage;

	@FindBy(xpath = "//a[text()='Edit your account information']")
	private WebElement EditAccountInformation;

	@FindBy(xpath = "//input[@id='input-firstname']")
	private WebElement EditfirstName;

	@FindBy(xpath = "//input[@id='input-lastname']")
	private WebElement EditLastName;

	@FindBy(xpath = "//input[@id='input-email']")
	private WebElement EditEmail;

	@FindBy(xpath = "//input[@id='input-telephone']")
	private WebElement EditTelephone;
	

	@FindBy(xpath = "//input[@value='Continue']")
	private WebElement ContinueButton1;

	@FindBy(xpath = "//*[@id=\"account-account\"]/div[1]")
	private WebElement EditSuccessMessage1;

	
	public String getTextEnvironmentText() {
		String UiText = testEnviromentText.getText();
        return UiText;
	}
	public void ClickmyAccountButton() {
		MyAccountButton.click();
	}
	public void ClickOnlonginlink() {
		longinlink.click();
	}
	public void enterEmailAdress(String email) {
		userNameField.sendKeys(email);
	}
	public void enterPassWord(String password) {
		passwordFiled.sendKeys(password);
	}
	public void clickOnLoginButton() {
		loginButton.click();
	}
	public String loggedInToMyAccountDashBoardText() {
		String DashBoardText = MyAccountdashboard.getText();
		return DashBoardText;
	}
	public void RegisterForAnAffiliateAccount() {
		RegisterForAnAffiliateAccount.click();
	}
	public void enterCompanyName(String company) {
		CompanyName.clear();
		CompanyName.sendKeys(company);
	}
	public void enterWebSite(String WebSite) {
		WebSiteName.clear();
		WebSiteName.sendKeys(WebSite);
	}
	public void enterTaxId(String taxID) {
		TaxIdNumber.clear();
		TaxIdNumber.sendKeys(taxID);
	}
	public void enterpayeeeName(String check) {
		payeeeName.clear();
		payeeeName.sendKeys(check);
	}
	public void clickOnCheckBox() {
		CheckBox.click();
	}
	public void clickOnContinueButton() {
		ContinueButton.click();
	}
	public String getAffiliatSuccessMessage() {
		String actualMessage = AffiliatSuccessMessage.getText();
		return actualMessage;
	}
	public void clickOnEditYourAffiliateInformation() {
		EditYourAffiliateInformation.click();
	}
	public void clickOnBankTransferRadioButton() {
		BankTransferRadioButton.click();
	}
	public void enterBankName(String bankName) {
		BankNameName.clear();
		BankNameName.sendKeys(bankName);
		
	}
	public void enterAbaNumber(String AbaNumber) {
		AbaNumberNumber.clear();
		AbaNumberNumber.sendKeys(AbaNumber);
		
	}
	public void enterSwiftCode(String SwiftCode) {
		SwiftCodeNumber.clear();
		SwiftCodeNumber.sendKeys(SwiftCode);
		
	}
	public void enterAccountName(String AccountName) {
		AccountNameName.clear();
		AccountNameName.sendKeys(AccountName);
		
	}
	public void enterAccountNumber(String AccountNumber) {
		AccountNumberNumber.clear();
		AccountNumberNumber.sendKeys(AccountNumber);
		
	}
	public void clickOnClickOnContinueButton() {
		ClickOnContinueButton.click();
	}
	public String getEditSuccessMessage() {
		String actualMessage = EditSuccessMessage.getText();
		return actualMessage;
	}
	public void clickOnEditAccountInformation() {
		EditAccountInformation.click();
	}
	public void enterEditfirstName(String firstName) {
		EditfirstName.clear();
		EditfirstName.sendKeys(firstName);
		
	}
	public void enterEditLastName(String LastName) {
		EditLastName.clear();
		EditLastName.sendKeys(LastName);
		
	}
	public void EditEmail(String Email) {
		EditEmail.clear();
		EditEmail.sendKeys(Email);
	}
	public void EditTelephone(String Telephone) {
		EditTelephone.clear();
		EditTelephone.sendKeys(Telephone);
	}
	public void ContinueButton1() {
		ContinueButton1.click();
	}
	//public void getEditSuccessMessage1() {
	//	String actualMessage = EditSuccessMessage1.getText();
	//	String strString = actualMessage.substring(0, 51);
	//	Assert.assertEquals(strString, actualMessage);
	//}
	public String getEditSuccessMessage1() {
	String myAccountText = EditSuccessMessage1.getText();
	return myAccountText;
	}
	}
