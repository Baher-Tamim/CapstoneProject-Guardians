package tek.capstone.framework.steps;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.*;
import tek.capstone.framework.pages.*;
import tek.capstone.framework.utilities.CommonUtility;

public class RetailHomePageSteps extends CommonUtility	{

POMFactory pomFactory = new POMFactory();
	
	// Department Sidebar
		@When("User click on All section")
		public void userClickOnAllSection() {
			click(pomFactory.homePage().allOptions);
			logger.info("All sections clicked.");
		}

		@Then("below options are present in Shop by Department sidebar")
		public void belowOptionsArePresentInShopByDepartmentSidebar(DataTable dataTable) {
			List<List<String>> shopByDepartment = dataTable.asLists(String.class);

			for (int i = 0; i < shopByDepartment.get(0).size(); i++) {
				Assert.assertTrue(isElementDisplayed(
						getDriver().findElement(By.xpath("//div[@class='modal__content h-screen w-80 ']//span[text()='"
								+ shopByDepartment.get(0).get(i) + "']"))));
				logger.info("Option " + shopByDepartment.get(0).get(i) + " is displayed");
			}
		}

	// Verifying SideBar
		@And("User on {string}")
		public void userOnDepartment(String department) {
			List<WebElement> departmentList = pomFactory.homePage().sideBarOptions;
			for (int i = 0; i < departmentList.size(); i++) {
				if (departmentList.get(i).getText().equalsIgnoreCase(department)) {
					departmentList.get(i).click();
					break;
				}
				logger.info("User is on All Department");
			}

		}

		@Then("below options are present in department")
		public void belowOptionsArePresentInDepartment(DataTable dataTable) {
			List<Map<String, String>> sideBarOptions = dataTable.asMaps(String.class, String.class);
			for (int i = 0; i < sideBarOptions.size(); i++) {
				Assert.assertTrue(pomFactory.homePage().sideBarAllOptions.isDisplayed());

			}
			logger.info("Options are present in Department");
		}
}
