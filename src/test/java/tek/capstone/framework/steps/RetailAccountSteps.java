package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.capstone.framework.pages.*;
import tek.capstone.framework.utilities.CommonUtility;
import tek.capstone.framework.utilities.DataGenerator;

public class RetailAccountSteps extends CommonUtility	{

	POMFactory pomFactory = new POMFactory();
	
	// Updating Info
			@And("User click on Account option")
			public void UserClickOnAccountoption() {
				click(pomFactory.retailAccountPage().accountLink);
				logger.info("Account button is clicked successfully.");
			}

			@And("User update Name {string} and Phone {string}")
			public void userUpdateNameAndPhone(String name, String phoneNumber) {
				pomFactory.retailAccountPage().nameInputField.clear();
				sendText(pomFactory.retailAccountPage().nameInputField, name);
				logger.info("Name was entered successfully. ");
				pomFactory.retailAccountPage().phoneNoInputField.clear();
				sendText(pomFactory.retailAccountPage().phoneNoInputField, DataGenerator.getPhoneNumber());
				logger.info("User name and Phone number are entered successfully.");
			}

			@And("User click on Update button")
			public void userClickOnUpdateButton() {
				click(pomFactory.retailAccountPage().accountUpdateBtn);
				logger.info("update button is clicked successfully.");
			}

			@Then("user profile information should be updated")
			public void userProfileInformationShouldBeUpdated() {
				waitTillPresence(pomFactory.retailAccountPage().personalInfoUpdateMsg);
				Assert.assertTrue(pomFactory.retailAccountPage().personalInfoUpdateMsg.isDisplayed());
				logger.info("Account information was updated successfully");
			}

		// Adding Payment Method
			@And("User click on Add a payment method link")
			public void userClickOnAddAPaymentMethodLink() {
				click(pomFactory.retailAccountPage().addPaymentlink);
				logger.info("Add Payment link clicked successfully.");
			}

			@And("User fill Debit or credit card information")
			public void userFillDebitOrCreditCardInformation(DataTable dataTable) {
				List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
				for (int i = 0; i < cardInfo.size(); i++) {
					sendText(pomFactory.retailAccountPage().cardNumberField, DataGenerator.getCardNumber());
					sendText(pomFactory.retailAccountPage().nameOnCardField, cardInfo.get(0).get("nameOnCard"));
					sendText(pomFactory.retailAccountPage().expMonthInput, cardInfo.get(0).get("expirationMonth"));
					sendText(pomFactory.retailAccountPage().expYearInput, cardInfo.get(0).get("expirationYear"));
					sendText(pomFactory.retailAccountPage().securityCodeInput, cardInfo.get(0).get("securityCode"));
				}
				logger.info("Card information entered successfully.");

			}

			@And("User click on Add your card button")
			public void userClickOnAddYourCardButton() {
				click(pomFactory.retailAccountPage().paymentSubmitBtn);
				logger.info("Add card button clicked successfully");
			}

			@Then("a message should be displayed {string}")
			public void aMessageShouldBeDisplayed(String message) {
				message = pomFactory.retailAccountPage().paymentAddedMsg.getText();
				waitTillPresence(pomFactory.retailAccountPage().paymentAddedMsg);
				Assert.assertTrue(pomFactory.retailAccountPage().paymentAddedMsg.isDisplayed());
				logger.info("Message displayed successfully: " + message);
			}

		// Editing Payment Method
			@And("User click on Edit option of card section")
			public void userClickOnEditOptionOfCardSection() {
				click(pomFactory.retailAccountPage().firstPaymentCard);
				click(pomFactory.retailAccountPage().editPaymentCard);
				logger.info("Payment edit button clicked successfully.");
			}

			@And("user edit information with below data")
			public void userEditInformationWithBelowData(DataTable dataTable) {
				List<Map<String, String>> cardInfo = dataTable.asMaps(String.class, String.class);
				for (int i = 0; i < cardInfo.size(); i++) {
					pomFactory.retailAccountPage().cardNumberField.clear();
					sendText(pomFactory.retailAccountPage().cardNumberField, DataGenerator.getCardNumber());
					pomFactory.retailAccountPage().nameOnCardField.clear();
					sendText(pomFactory.retailAccountPage().nameOnCardField, cardInfo.get(0).get("nameOnCard"));
					sendText(pomFactory.retailAccountPage().expMonthInput, cardInfo.get(0).get("expirationMonth"));
					sendText(pomFactory.retailAccountPage().expYearInput, cardInfo.get(0).get("expirationYear"));
					pomFactory.retailAccountPage().securityCodeInput.clear();
					sendText(pomFactory.retailAccountPage().securityCodeInput, cardInfo.get(0).get("securityCode"));

				}
				logger.info("Payment information updated");
			}

			@And("user click on Update Your Card button")
			public void userClickOnUpdateYourCardButton() {
				click(pomFactory.retailAccountPage().updatePaymentBtn);
				logger.info("update payment button clicked successfully");
			}

			@Then("update message should be displayed {string}")
			public void UpdateMessageShouldBeDisplayed(String actualMsg) {
				waitTillPresence(pomFactory.retailAccountPage().updatePaymentSuccessMsg);
				String expectedMsg = "Payment Method updated sucessfully";
				if (actualMsg == expectedMsg) {
					Assert.assertTrue(pomFactory.retailAccountPage().updatePaymentSuccessMsg.isDisplayed());
					logger.info("payment success message displayed successfully.");
				}
			}

		// Removing Card from File
			@And("User click on remove option of card section")
			public void userClickOnRemoveOptionOfCardSection() {
				click(pomFactory.retailAccountPage().paymentList);
				click(pomFactory.retailAccountPage().cardRemoveBtn);
				logger.info("card remove button clicked successfully");
			}

			@Then("payment details should be removed")
			public void paymentDetailsShouldBeRemoved() {
				Assert.assertTrue(pomFactory.retailAccountPage().addCardHeader.isDisplayed());
				logger.info("payment card removed successfully.");
			}

		// Adding Address on File
			@And("User click on Add address option")
			public void userClickOnAddAddressOption() {
				scrollPageDownWithJS();
				click(pomFactory.retailAccountPage().addAddressLink);
				logger.info("add address link clicked.");
			}

			@And("user fill new address form with below information")
			public void userFillNewAddressFormWithBelowInformation(DataTable dataTable) {
				List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
				for (int i = 0; i < addressInfo.size(); i++) {
					selectByVisibleText(pomFactory.retailAccountPage().countryDropdown, addressInfo.get(0).get("country"));
					sendText(pomFactory.retailAccountPage().fullNameInput, addressInfo.get(0).get("fullName"));
					sendText(pomFactory.retailAccountPage().phoneNumberInput, DataGenerator.getPhoneNumber());
					sendText(pomFactory.retailAccountPage().streetInput, addressInfo.get(0).get("streetAddress"));
					sendText(pomFactory.retailAccountPage().apartmentInput, addressInfo.get(0).get("apt"));
					sendText(pomFactory.retailAccountPage().cityInput, addressInfo.get(0).get("city"));
					selectByVisibleText(pomFactory.retailAccountPage().stateField, addressInfo.get(0).get("state"));
					sendText(pomFactory.retailAccountPage().zipCodeInput, DataGenerator.getZipCode());

				}
				logger.info("Address form filled");
			}

			@And("User click Add Your Address button")
			public void userClickAddYourAddressButton() {
				click(pomFactory.retailAccountPage().addressBtn);
				logger.info("Add address button clicked successfully");
			}

			@Then("address message should be displayed {string}")
			public void addressMessageShouldBeDisplayed(String message) {
				waitTillPresence(pomFactory.retailAccountPage().addAddressSuccessMsg);
				Assert.assertTrue(message, pomFactory.retailAccountPage().addAddressSuccessMsg.isDisplayed());
				logger.info("Address Added Successfully message displayed");
			}

		// Editing Address on File
//			@And("User click on edit address option")
//			public void userClickOnEditAddressOption() {
//				clickElementWithJS(pomFactory.retailAccountPage().editAddressLink);
//				logger.info("address edit link clicked successfully");
//		
//			}
//		
//			@And("user fill new address form with below informations")
//			public void userFillNewAddressFormWithBelowInformations(DataTable dataTable) {
//		
//				List<Map<String, String>> addressInfo = dataTable.asMaps(String.class, String.class);
//				selectByVisibleText(pomFactory.retailAccountPage().countryDropdown, addressInfo.get(0).get("country"));
//				clearTextUsingSendKeys(pomFactory.retailAccountPage().fullNameInput);
//				sendValueUsingJS(pomFactory.retailAccountPage().fullNameInput, addressInfo.get(0).get("fullName"));
//				clearTextUsingSendKeys(pomFactory.retailAccountPage().phoneNumberInput);
//				sendText(pomFactory.retailAccountPage().phoneNumberInput, DataGenerator.getPhoneNumber());
//				clearTextUsingSendKeys(pomFactory.retailAccountPage().streetInput);
//				sendText(pomFactory.retailAccountPage().streetInput, addressInfo.get(0).get("streetAddress"));
//				clearTextUsingSendKeys(pomFactory.retailAccountPage().apartmentInput);
//				sendText(pomFactory.retailAccountPage().apartmentInput, addressInfo.get(0).get("apt"));
//				clearTextUsingSendKeys(pomFactory.retailAccountPage().cityInput);
//				sendText(pomFactory.retailAccountPage().cityInput, addressInfo.get(0).get("city"));
//				selectByVisibleText(pomFactory.retailAccountPage().stateField, addressInfo.get(0).get("state"));
//				clearTextUsingSendKeys(pomFactory.retailAccountPage().zipCodeInput);
//				sendText(pomFactory.retailAccountPage().zipCodeInput, DataGenerator.getZipCode());
//				logger.info("new address form filled successfully");
//			}
//		
//			@And("User click update Your Address button")
//			public void userClickUpdateYourAddressButton() {
//				scrollPageDownWithJS();
//				click(pomFactory.retailAccountPage().updateAddressBtn);
//				logger.info("update address button clicked successfully");
//			}
//		
//			@And("update address message should be displayed {string}")
//			public void updateAddressMessageShouldBeDisplayed(String message) {
//				waitTillPresence(pomFactory.retailAccountPage().addressUpdateSuccessMsg);
//				Assert.assertTrue(message, pomFactory.retailAccountPage().addressUpdateSuccessMsg.isDisplayed());
//				logger.info("update address message displayed");
//			}

		// Removing Address on File
			@And("User click on remove option of Address section")
			public void userClickOnRemoveOptionOfAddressSection() {
				scrollPageDownWithJS();
				click(pomFactory.retailAccountPage().RemoveAddressBtn);
				logger.info("remove address button clicked");
			}

			@Then("Address details should be removed")
			public void addressDetailsShouldBeRemoved() {
				Assert.assertNotNull(pomFactory.retailAccountPage().firstAddressBox);
				logger.info("address details removed");
			}
}
