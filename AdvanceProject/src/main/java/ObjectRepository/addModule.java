package ObjectRepository;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import GenericUtility.BaseClass;
import GenericUtility.WebDriverUtility;

public class addModule  {
	//	WebDriverUtility util;

	public addModule(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(css = "img[onmouseout='fnRemoveWindow();']")
	private WebElement homePagePlusIcon;

	@FindBy(linkText = "Module")
	private WebElement dropdownModule;

	public WebElement getHomePagePlusIcon() {
		return homePagePlusIcon;
	}

	public WebElement getDropdownModule() {
		return dropdownModule;
	}
	@FindBy(xpath = "//*[@id='stufftitle_id']")
	private WebElement windowTitle;

	public WebElement getWindowTitle() {
		return windowTitle;
	}

	@FindBy(css = "select[name='maxentries']")
	private WebElement show;
	@FindBy(xpath = "(//*[@id='savebtn'])[1]")
	private WebElement saveButton;

	public WebElement getShow() {
		return show;
	}

	public WebElement getSaveButton() {
		return saveButton;
	}
    @FindBy(name = "selmodule")
    private WebElement moduledropdowninchildwindow;
    
    @FindBy(xpath = "//*[@id=\"selFilterid\"]")
    private WebElement filterBydropdown;
    
    @FindBy(name = "PrimeFld")
    private WebElement fildToShow;

	public WebElement getModuledropdowninchildwindow() {
		return moduledropdowninchildwindow;
	}

	public WebElement getFilterBydropdown() {
		return filterBydropdown;
	}

	public WebElement getFildToShow() {
		return fildToShow;
	}
    



	//	public void addingModule() {
	//		getHomePagePlusIcon().click();
	//		getDropdownModule().click();
	//		String parent = driver.getWindowHandle();
	//		Set<String> child = driver.getWindowHandles();
	//		 util=new WebDriverUtility();
	//		util.switchtowindow(driver, parent, child, "Add Module");
	//		
}



