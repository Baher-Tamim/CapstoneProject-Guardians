package tek.capstone.framework.steps;

import java.util.List;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import io.cucumber.java.en.*;
import tek.capstone.framework.pages.*;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailOrderSteps extends CommonUtility	{

	POMFactory pomFactory = new POMFactory();

	//add Item
		@And("User change the category to {string}")
		public void userChangeTheCategoryToSmartHome(String category) {
			click(pomFactory.retailOrderPage().allDepartmentOption);
			selectByVisibleText(pomFactory.retailOrderPage().allDepartmentOption, category);
			logger.info("Category is changed to Smart Home successfully");
		}

		@And("User search for an item {string}")
		public void userSearchForAnItem(String item) {
			sendText(pomFactory.retailOrderPage().searchBox, item);
			logger.info("search for kasa outdoor smart plug");
		}

		@And("User click on Search icon")
		public void userClickOnSearchIcon() {
			click(pomFactory.retailOrderPage().searchIcon);
			logger.info("search button clicked successfully");
		}

		@And("User click on item")
		public void userClickOnItem() {
			click(pomFactory.retailOrderPage().kasa);
			logger.info("item clicked successfully");
		}

		@And("User select quantity {string}")
		public void userSelectQuantity(String quantity) {
			click(pomFactory.retailOrderPage().quantityOption);
			selectByVisibleText(pomFactory.retailOrderPage().quantityOption, quantity);
			logger.info("Quantity(2) is selected");
		}

		@And("User click add to Cart button")
		public void userClickAddToCartButton() {
			click(pomFactory.retailOrderPage().addToCartBtn);
			logger.info("Add to cart button clicked successfully");
		}

		@Then("the cart icon quantity should change to {string}")
		public void theCartIconQuantityShouldChangeTo(String quantity) {
			if (pomFactory.retailOrderPage().quantityOption.equals(quantity)) {
			}
			logger.info("quantity is 2");
		}

	// Adding Address for Order
		@And("User changes the category to the {string}")
		public void userChangesTheCategoryToThe(String category) {
			click(pomFactory.retailOrderPage().allDepartmentOption);
			selectByVisibleText(pomFactory.retailOrderPage().allDepartmentOption, category);
			logger.info("Category changed to Electronincs successfully");
		}

		@And("User searchs for an item {string}")
		public void userSearchsForAnItem(String item) {
			sendText(pomFactory.retailOrderPage().searchBox, item);
			logger.info("search for an item");
		}

		@And("User clicks on Search icon")
		public void userClicksOnSearchIcon() {
			clickElementWithJS(pomFactory.retailOrderPage().searchIcon);
			logger.info("search button clicked successfully");
		}

		@And("User clicks on item")
		public void userClicksOnItem() {
			click(pomFactory.retailOrderPage().ApexLegends);
			logger.info("item clicked successfully");
		}

		@And("User selects quantity {string}")
		public void userSelectsQuantity(String quantity) {
			click(pomFactory.retailOrderPage().quantityOption);
			selectByValue(pomFactory.retailOrderPage().quantityOption, quantity);
			logger.info("Quantity selected");
		}

		@And("User clicks add to Cart button")
		public void userClicksAddToCartButton() {
			click(pomFactory.retailOrderPage().addToCartBtn);
			logger.info("add to cart button clicked successfully");
		}

		@And("the carts icon quantity should change to {string}")
		public void theCartsIconQuantityShouldChangeTo(String quantity) {
			if (pomFactory.retailOrderPage().quantityOption.equals(quantity)) {
				logger.info("quantity is 5");
			}
		}

		@And("User click on Cart option")
		public void userClickOnCartOption() {
			click(pomFactory.retailOrderPage().cartBtn);
			logger.info("Cart option clicked successfully");
		}

		@And("User click on Proceed to Checkout button")
		public void userClickOnProceedToCheckoutButton() {
			click(pomFactory.retailOrderPage().proceedCheckoutBtn);
			logger.info("check out option clicked successfully");
		}

		@And("User click on Place Your Order")
		public void userClickOnPlaceYourOrder() {
			click(pomFactory.retailOrderPage().placeOrderBtn);
			logger.info("place order button was clicked successfully");
		}

		@Then("a confirmation message should be displayed {string}") 
		public void aConfirmationMessageShouldBeDisplayed(String message) {
			waitTillPresence(pomFactory.retailOrderPage().orderPlacedSuccessMsg);
			Assert.assertTrue(pomFactory.retailOrderPage().orderPlacedSuccessMsg.isDisplayed());
			logger.info("confirmation Message displayed");
		}

	// Canceling Order
		@And("User click on Orders section")
		public void userClickOnOrdersSection() {
			click(pomFactory.retailOrderPage().orderLink);
			logger.info("order link clicked successfully.");
		}

		@And("User click on first order in list")
		public void userClickOnFirstOrderInList() {
			List<WebElement> listOfOrders = pomFactory.retailOrderPage().listOfOrders;
		         for(int i = 0; i < listOfOrders.size(); i++) {
		             if(listOfOrders.get(i).getText().equalsIgnoreCase("Hide Details")) {
		             }else if (listOfOrders.get(i).getText().equalsIgnoreCase("Show Details")) {
		                click(pomFactory.retailOrderPage().listOfOrders.get(i));
		             }
		         }
			logger.info("first order in list clicked");
		}

		@And("User click on Cancel The Order button")
		public void userClickOnCancelTheOrderButton() {
			click(pomFactory.retailOrderPage().orderCancelBtn);
			logger.info("cancel order button clicked");
		}

		@And("User select the cancelation Reason {string}")
		public void userSelectTheCancelationReason(String reason) {
			clickElementWithJS(pomFactory.retailOrderPage().cancelationReason);
			selectByVisibleText(pomFactory.retailOrderPage().cancelationReason, reason);
			logger.info("cancelation reason selected");
		}

		@And("User click on Cancel Order button")
		public void userClickOnCancelOrderButton() {
			click(pomFactory.retailOrderPage().cancelOrder);
			logger.info("cancel order button clicked");
		}

		@Then("a cancelation message should be displayed {string}")
		public void aCancelationMessageShouldBeDisplayed(String cancellationMsg) {
			waitTillPresence(pomFactory.retailOrderPage().orderCancelationMsg);
			Assert.assertEquals(cancellationMsg, pomFactory.retailOrderPage().orderCancelationMsg.getText());
			logger.info("cancelation message displayed");
		}

	// Returning Order
		@And("User clicks on Orders section")
		public void userClicksOnOrdersSection() {
			click(pomFactory.retailOrderPage().orderLink);
			logger.info("order link clicked successfully.");
		}

		@And("User clicks on first order in list")
		public void userClicksOnFirstOrderInList() {
			click(pomFactory.retailOrderPage().ItemsShowDetails);
			logger.info("first order in list clicked");
		}

		@And("User clicks on Return Items button")
		public void userClicksOnReturnItemsButton() {
			click(pomFactory.retailOrderPage().orderReturnBtn);
			logger.info("order return button clicked");
		}

		@And("User selects the Return Reason {string}")
		public void userSelectsTheReturnReason(String reason) {
			selectByVisibleText(pomFactory.retailOrderPage().cancelationReason, reason);
			logger.info("cancellation reason Bought wrong item.");
		}

		@And("User selects the drop off service {string}")
		public void userSelectsTheDropOffService(String category) {
			selectByVisibleText(pomFactory.retailOrderPage().dropOffService, category);
			logger.info("drop off service selected.");
		}

		@And("User clicks on Return Order button")
		public void userClicksOnReturnOrderButton() {
			click(pomFactory.retailOrderPage().orderReturnAndSubmitBtn);
			logger.info("order return clicked successfuly.");
		}

		@Then("the cancelation message should be displayed {string}")
		public void theCancelationMessageShouldBeDisplayed(String message) {
			Assert.assertTrue(pomFactory.retailOrderPage().orderReturnSuccessMsg.isDisplayed());
			logger.info("Return message was displayed successfuly");
		}

	// Adding Customer Review
		@And("User click on the Orders section")
		public void userClickOnTheOrdersSection() {
			click(pomFactory.retailOrderPage().orderLink);
			logger.info("order link clicked successfully.");
		}

		@And("User click on the first order in list")
		public void userClickOnTheFirstOrderInList() {
			click(pomFactory.retailOrderPage().ItemsShowDetails);
			logger.info("first order in list clicked");
		}

		@And("User click on Review button")
		public void userClickOnReviewButton() {
			click(pomFactory.retailOrderPage().reviewBtn);
			logger.info("Review button clicked");
		}

		@And("User write Review headline {string} and {string}")
		public void userWriteReviewHeadlineAnd(String headline, String comment) {
			headline = "Amazing product";
			comment = " I dont know what to say :) ";
			sendText(pomFactory.retailOrderPage().headlineInputField, headline);
			sendText(pomFactory.retailOrderPage().commentField, comment);
			logger.info("headline and comment added ");
		}

		@And("User click Add your Review button")
		public void userClickAddYourReviewButton() {
			click(pomFactory.retailOrderPage().addReviewBtn);
			logger.info("Review button clicked");
		}

		@Then("a review message should be displayed {string}")
		public void aReviewMessageShouldBeDisplayed(String message) {
			message = "Your review was added successfully"; 
			waitTillPresence(pomFactory.retailOrderPage().reviewAddedSuccessMsg);
			Assert.assertEquals(message,pomFactory.retailOrderPage().reviewAddedSuccessMsg.getText());
			logger.info("Review success message displayed");
		}

}
