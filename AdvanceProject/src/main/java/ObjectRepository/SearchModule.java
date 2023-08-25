package ObjectRepository;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchModule {
	
	public SearchModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "td[onclick='UnifiedSearch_SelectModuleForm(this);']")
	private WebElement searchdownwardkey;

	@FindBy(linkText = "Select All")
	private WebElement selectallbutton;

	@FindBy(css  = "input[class='crmbutton small create']")
	private WebElement applybutton;

	@FindBy(className = "searchBtn")
	private WebElement searchicon;

	@FindBy(linkText = "UnSelect All")
	private WebElement unselectallbutton;

	@FindBy(css = "input[class='crmbutton small cancel']")
	private WebElement cancelbutton;

	@FindBy(css = "a[href='javascript:void(0)']")
	private WebElement closebutton;

	public WebElement getSearchdownwardkey() {
		return searchdownwardkey;
	}

	public WebElement getSelectallbutton() {
		return selectallbutton;
	}

	public WebElement getApplybutton() {
		return applybutton;
	}

	public WebElement getSearchicon() {
		return searchicon;
	}

	public WebElement getUnselectallbutton() {
		return unselectallbutton;
	}

	public WebElement getCancelbutton() {
		return cancelbutton;
	}

	public WebElement getClosebutton() {
		return closebutton;
	}
	
	@FindBy(css = "b[class='big']")
	private WebElement selectedCheckboxname;
	
	
	public WebElement getSelectedCheckboxname() {
		return selectedCheckboxname;
	}
	
	

	@FindBy(css = "input[type='checkbox']")
	private WebElement checkbox;

	public WebElement getCheckbox() {
		return  checkbox;
	}
	
	
}
