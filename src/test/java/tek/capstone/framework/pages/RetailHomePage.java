package tek.capstone.framework.pages;

import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import tek.capstone.framework.base.BaseSetup;

public class RetailHomePage extends BaseSetup	{

	public RetailHomePage() {
		PageFactory.initElements(getDriver(), this);
	}

	// Department Sidebar
		@FindBy(linkText = "TEKSCHOOL")
		public WebElement tekTitle;
		@FindBy(id = "signinLink")
		public WebElement signInLink;
		@FindBy(id = "hamburgerBtn")
		public WebElement allOptions;

	// Verifing Sidebar
		@FindBy(xpath = "//div[@class='modal__content h-screen w-80 ']//span")
		public List<WebElement> sideBarOptions;
		@FindBy(id = "contentHeader")
		public WebElement shopByDepartmentHeader;
		@FindBy(xpath = "//div[@class='sidebar__content']//span")
		public WebElement sideBarAllOptions;
}
