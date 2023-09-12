package tek.capstone.framework.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.capstone.framework.base.BaseSetup;

public class RetailOrderPage extends BaseSetup	{

	public RetailOrderPage() {
		PageFactory.initElements(getDriver(), this);
	}

	// Adding Item to Cart
		@FindBy(xpath="//select[@id='search']") public WebElement allDepartmentOption;
		@FindBy(xpath="//input[@id='searchInput']") public WebElement searchBox;
		@FindBy(xpath = "//button[@class='search__btn']") public WebElement searchIcon;
		@FindBy(xpath="//p[contains(text(),'Kasa Outdoor Smart Plug')]")public WebElement kasa;
		@FindBy (xpath ="//select[@class='product__select']") public WebElement quantityOption;
		@FindBy(xpath="//button[@id='addToCartBtn']") public WebElement addToCartBtn;
		
	// Adding Address on Order
		@FindBy(xpath="//p[@class='products__name']") public WebElement ApexLegends;
		@FindBy(id="cartBtn") public WebElement cartBtn;
		@FindBy (id="proceedBtn") public WebElement proceedCheckoutBtn;
		@FindBy(xpath="//div[text()='Order Placed Successfully']")
		public WebElement orderPlacedSuccessMsg;
		

		@FindBy(id="placeOrderBtn") public WebElement placeOrderBtn;
		@FindBy (xpath="//div[@class='shadow md:w-3/4 bg-white p-4']")
		public WebElement orderConfirmationNumber;
		@FindBy(id="cancelBtn") public WebElement orderCancelBtn;
		@FindBy(id="buyAgainBtn") public WebElement orderBuyAgainBtn;
		
	// Canceling Order
		@FindBy (xpath="//a[@id='orderLink']") public WebElement orderLink;
		@FindBy(xpath ="//div[@class='order']") public WebElement firstOrderPlaced;
		@FindBy(xpath="//select[@id='reasonInput']") public WebElement cancelationReason;
		@FindBy(xpath="//select[@id='reasonInput']//option[@value='damage']") public WebElement itemDamageOption;
		@FindBy(xpath="//button[@id='orderSubmitBtn']") public WebElement cancelOrder;
		@FindBy(xpath="//div[@class='cancel__confirm-message']") public WebElement orderCancelationMsg;
		@FindBy(xpath = "//div[@class='order']//descendant::p[7]")
	    public List<WebElement> listOfOrders;
		
	// Returning Order	
		@FindBy (xpath="//p[@class='order__header-btn' and text()='Show Details']")
		public WebElement ItemsShowDetails;
		@FindBy(id="returnBtn") public WebElement orderReturnBtn;
		@FindBy(xpath="//select[@id='dropOffInput']") public WebElement dropOffService;
		@FindBy(xpath="//select[@id='dropOffInput']//option[text()='FedEx']") public WebElement fedExDropoffOption;
		@FindBy(xpath="//button[@id='orderSubmitBtn']") public WebElement orderReturnAndSubmitBtn;
		@FindBy(xpath="//p[text()='Return was successfull']") public WebElement orderReturnSuccessMsg;
		
	// Add Customer Review
		@FindBy(xpath="//button[@id='reviewBtn']") public WebElement reviewBtn;
		@FindBy(xpath="//input[@id='headlineInput']") public WebElement headlineInputField;
		@FindBy(xpath="//textarea[@name='comment']") public WebElement commentField;
		@FindBy(xpath="//button[@id='reviewSubmitBtn']") public WebElement addReviewBtn;
		@FindBy(xpath="//div[text()='Your review was added successfully']") public WebElement reviewAddedSuccessMsg;
		
	// Deleting Item on Shopping Cart
		@FindBy(xpath="//span[text()='Delete']") public WebElement deleteOrderList;
}
