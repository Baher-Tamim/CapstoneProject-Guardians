package tek.capstone.framework.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.capstone.framework.base.BaseSetup;

public class RetailAccountPage extends BaseSetup	{

	public RetailAccountPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// Updating Info
		@FindBy(xpath = "//h1[@class='account__personal-title']")
		public WebElement yourProfile;
		@FindBy(xpath = "//div//a[@id='accountLink']")
		public WebElement accountLink;
		@FindBy(id = "nameInput")
		public WebElement nameInputField;
		@FindBy(id = "personalPhoneInput")
		public WebElement phoneNoInputField;
		@FindBy(id = "emailInput")
		public WebElement emailInputField;
		@FindBy(xpath = "//button[@id='personalUpdateBtn']")
		public WebElement accountUpdateBtn;
		@FindBy(xpath = "//div[text()='Personal Information Updated Successfully']")
		public WebElement personalInfoUpdateMsg;

	// Adding Payment Method
		@FindBy(xpath = "//p[contains(text(),'payment')]")
		public WebElement addPaymentlink;
		@FindBy(id = "cardNumberInput")
		public WebElement cardNumberField;
		@FindBy(id = "nameOnCardInput")
		public WebElement nameOnCardField;
		@FindBy(id = "expirationMonthInput")
		public WebElement expMonthInput;
		@FindBy(id = "expirationYearInput")
		public WebElement expYearInput;
		@FindBy(id = "securityCodeInput")
		public WebElement securityCodeInput;
		@FindBy(id = "paymentSubmitBtn")
		public WebElement paymentSubmitBtn;
		@FindBy(xpath = "//div[text()='Payment Method added sucessfully']")
		public WebElement paymentAddedMsg;

	// Editing Payment Method
		@FindBy(xpath = "//div[@class='false account__payment-item']")
		public WebElement firstPaymentCard;
		@FindBy(xpath = "//button[text()='remove']")
		public WebElement removeCardBtn;
		@FindBy(xpath = "//button[@class='text-blue-800 cursor-pointer hover:underline' and text()='Edit']")
		public WebElement editPaymentCard;
		@FindBy(id = "paymentSubmitBtn")
		public WebElement updatePaymentBtn;
		@FindBy(xpath = "//div[text()='Payment Method updated Successfully']")
		public WebElement updatePaymentSuccessMsg;

	// Removing Card on File
		@FindBy(xpath = "//button[text()='remove']")
		public WebElement cardRemoveBtn;
		@FindBy(xpath = "//h1[@class='account__payment-new-title']")
		public WebElement addCardHeader;
		@FindBy(xpath = "//p[@class='account__payment-sub-title']")
		public WebElement paymentList;

	// Adding Address to File
		@FindBy(xpath = "//p[text()='Add Address']")
		public WebElement addAddressLink;
		@FindBy(id = "countryDropdown")
		public WebElement countryDropdown;
		@FindBy(id = "fullNameInput")
		public WebElement fullNameInput;
		@FindBy(id = "phoneNumberInput")
		public WebElement phoneNumberInput;
		@FindBy(id = "streetInput")
		public WebElement streetInput;
		@FindBy(id = "apartmentInput")
		public WebElement apartmentInput;
		@FindBy(id = "cityInput")
		public WebElement cityInput;
		@FindBy(name = "state")
		public WebElement stateField;
		@FindBy(id = "zipCodeInput")
		public WebElement zipCodeInput;
		@FindBy(id = "addressBtn")
		public WebElement addressBtn;
		@FindBy(xpath = "//div[text()='Address Added Successfully']")
		public WebElement addAddressSuccessMsg;

	// Editing Address on File
		@FindBy(xpath = "//button[@class='account__address-btn' and text()='Edit']")
		public WebElement editAddressLink;
		@FindBy(xpath = "//button[@id='addressBtn']")
		public WebElement updateAddressBtn;
		@FindBy(xpath = "//div[contains(text(),'Address Updated Successfully')]")
		public WebElement addressUpdateSuccessMsg;

	// Removing Address on File
		@FindBy(xpath="//div[@class='account__address-single']")
		public WebElement firstAddressBox;
		@FindBy(xpath= "//div//button[@class='account__address-btn' and text()='Remove']")
		public WebElement RemoveAddressBtn;

}
