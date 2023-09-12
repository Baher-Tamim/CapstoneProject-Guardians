package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.capstone.framework.pages.POMFactory;
import tek.capstone.framework.utilities.CommonUtility;
import tek.capstone.framework.utilities.DataGenerator;

public class SignInSteps extends CommonUtility	{

	POMFactory pomFactory = new POMFactory();

	// Signing in
		@Given("User is on retail website")
		public void userIsOnRetailWebsite() {
			Assert.assertTrue(pomFactory.homePage().tekTitle.isDisplayed());
			logger.info("TEKSCHOOL logo is displayed.");
		}

		@When("User click on Sign in option")
		public void userClickOnSignInOption() {
			click(pomFactory.homePage().signInLink);
			logger.info("Sign in button is clicked");
		}

		@And("User enter email {string} and password {string}")
		public void userEnterEmailAndPassword(String email, String password) {
			sendText(pomFactory.retailSignInPage().emailField, email);
			sendText(pomFactory.retailSignInPage().passwordField, password);
			logger.info("Email and password entered successfully");
		}

		@And("User click on login button")
		public void userClickOnLoginButton() {
			click(pomFactory.retailSignInPage().loginBtn);
			logger.info("Login button clicked");
		}

		@Then("User should be logged in into Account")
		public void userShouldBeLoggedInIntoAccount() {
			Assert.assertTrue(pomFactory.retailAccountPage().accountLink.isDisplayed());
			logger.info("user is logged in");
		}

	// Creating Account
		@And("User click on Create New Account button")
		public void userClickOnCreateNewAccountButton() {
			click(pomFactory.retailSignInPage().newAccountBtn);
			logger.info("Create new account button clicked successfully.");
		}

		@And("User fill the signUp information with below data")
		public void userFillTheSignUpInformationWithBelowData(DataTable dataTable) {
			List<Map<String, String>> accountInfo = dataTable.asMaps(String.class, String.class);
			sendText(pomFactory.retailSignInPage().accountnameInput, accountInfo.get(0).get("name"));
			sendText(pomFactory.retailSignInPage().accountemailInput, DataGenerator.emailGenerator());
			sendText(pomFactory.retailSignInPage().accountpasswordInput, accountInfo.get(0).get("password"));
			sendText(pomFactory.retailSignInPage().confirmPasswordInput, accountInfo.get(0).get("confirmPassword"));
			logger.info("Information was successfully entered");
		}

		@And("User click on SignUp button")
		public void userClickOnSignUpButton() {
			click(pomFactory.retailSignInPage().signupBtn);
			logger.info("Signup button clicked Successfully");
		}

		@Then("User should be logged into account page")
		public void userShouldBeLoggedIntoAccountPage() {
			Assert.assertTrue(pomFactory.retailAccountPage().yourProfile.isDisplayed());
			logger.info("Account page displayed");
		}

}
