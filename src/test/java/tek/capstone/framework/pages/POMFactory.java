package tek.capstone.framework.pages;

import tek.capstone.framework.base.BaseSetup;

public class POMFactory extends BaseSetup	{

	private RetailHomePage homePage;
	private RetailSignInPage retailSignInPage;
	private RetailAccountPage retailAccountPage;
	private RetailOrderPage retailOrderPage;
	
	public POMFactory() {
		this.homePage = new RetailHomePage();
		this.retailSignInPage = new RetailSignInPage();
		this.retailAccountPage = new RetailAccountPage();
		this.retailOrderPage = new RetailOrderPage();
	}
	
	public RetailHomePage homePage() {
		return this.homePage;
	}
	
	public RetailSignInPage retailSignInPage() {
		return this.retailSignInPage;
	}
	
	public RetailAccountPage retailAccountPage() {
		return this.retailAccountPage;
	}
	
	public RetailOrderPage retailOrderPage() {
		return this.retailOrderPage;
	}
}
