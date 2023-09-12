package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.capstone.framework.base.BaseSetup;

public class RetailSignInPage extends BaseSetup {

	public RetailSignInPage() {
		PageFactory.initElements(getDriver(), this);
	}
	
	// Signing in
		@FindBy(id = "signinBtn")
		public WebElement SignInBtn;
		@FindBy(id = "email")
		public WebElement emailField;
		@FindBy(id = "password")
		public WebElement passwordField;
		@FindBy(id = "loginBtn")
		public WebElement loginBtn;

	// Creating New Account
		@FindBy(id = "newAccountBtn")
		public WebElement newAccountBtn;
		@FindBy(id = "newCompanyAccount")
		public WebElement sellSomethingLink;
		@FindBy(id = "nameInput")
		public WebElement accountnameInput;
		@FindBy(id = "emailInput")
		public WebElement accountemailInput;
		@FindBy(id = "passwordInput")
		public WebElement accountpasswordInput;
		@FindBy(id = "confirmPasswordInput")
		public WebElement confirmPasswordInput;
		@FindBy(id = "signupBtn")
		public WebElement signupBtn;

}
