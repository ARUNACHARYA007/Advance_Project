package ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.aventstack.extentreports.Status;

import GenericUtility.ListenerImplementation;

public class LoginPage  {
    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    
    @FindBy(name = "user_name")
    private WebElement usernameTextField;

    @FindBy(css = "input[type='password']")
    private WebElement passwordTextField;

    @FindBy(xpath = "(//input[@value='Login'])[2]")
    private WebElement loginButton;

    public WebElement getUsernameTextField() {
        return usernameTextField;
    }

    public WebElement getPasswordTextField() {
        return passwordTextField;
    }

    public WebElement getLoginButton() {
        return loginButton;
    }

    public void loginToApplication(String username, String password) {
        getUsernameTextField().sendKeys(username);
       
        getPasswordTextField().sendKeys(password);
       // logger.log(Status.PASS, "password sent");
        getLoginButton().click();
    }
}
