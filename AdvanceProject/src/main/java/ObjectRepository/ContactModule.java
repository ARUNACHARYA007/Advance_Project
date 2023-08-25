package ObjectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactModule {
	@FindBy(linkText = "Contacts")
	private WebElement contactModule;
	
	@FindBy(css = "a[href='index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing']")
	private WebElement plusIcon;
	
	@FindBy(name = "firstname")
	private WebElement firstnameTF;
	
	@FindBy(name = "lastname")
	private WebElement lastnameTF;
	
	@FindBy(xpath = "(//img[@src='themes/softed/images/select.gif'])[1]")
	private WebElement orgonizationPlus;
	
	@FindBy(xpath = "//input[contains(@id,'title')]")
	private WebElement titleTF;
	
	@FindBy(id = "department")
    private WebElement depatmentTF;
	
	@FindBy(id = "email")
	private WebElement emailTF;
	
	@FindBy(id = "assistant")
	private WebElement assistantTF;
	
	@FindBy(xpath = "//tr[contains(@style,'height:25px')]/..//input[contains(@name,'emailoptout')]")
	private WebElement emailOptOutCB;
	
	
	
	
	
}
