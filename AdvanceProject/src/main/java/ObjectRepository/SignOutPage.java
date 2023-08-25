package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignOutPage {
	
	public SignOutPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath = "(//img[@style='padding: 0px;padding-left:5px'])[1]")
	private WebElement administratorButton;
	@FindBy(linkText = "Sign Out")
	private WebElement signOut;
	public WebElement getAdministratorButton() {
		return administratorButton;
	}
	public WebElement getSignOut() {
		return signOut;
	}
	
	public void signOutFromWebsite() {
		//getAdministratorButton().click();
		getSignOut().click(); 
	}

}
