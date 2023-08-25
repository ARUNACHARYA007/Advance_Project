package GenericUtility;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

//import ObjectRepository.HomePageModule;
import ObjectRepository.LoginPage;
import ObjectRepository.SearchModule;
import ObjectRepository.SignOutPage;
import ObjectRepository.addModule;
//import ObjectRepository.loginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public PropertyUtility prop;
	public WebDriver driver;
	public LoginPage login;
	public SignOutPage signout;
	public WebDriverUtility utility=new WebDriverUtility();
	public addModule adding;
	public SearchModule search;
	@BeforeClass
	public void launchingBrowser() {
		prop=new PropertyUtility();
		if ((prop.readingDataFromPropertyfile("browser")).contains("chrome")) {
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();

		}
		else if ((prop.readingDataFromPropertyfile("browser")).contains("firefox")) {
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();

		}
		else
		{
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
		}
		
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}
	@BeforeMethod
	public void navigatingToApplication()
	{  	login= new LoginPage(driver);
	    adding=new addModule(driver);
	    search=new SearchModule(driver);
	    try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	    signout=new SignOutPage(driver);
	    
	    
		driver.get(prop.readingDataFromPropertyfile("url"));
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(prop.readingDataFromPropertyfile("username"));
		//System.out.println(prop.readingDataFromPropertyfile("passcode"));
		login.loginToApplication((prop.readingDataFromPropertyfile("username")),(prop.readingDataFromPropertyfile("passcode")));
		//		
		//		driver.findElement(By.name("user_name")).sendKeys(prop.readingDataFromPropertyfile("username"));
		//		driver.findElement(By.cssSelector("input[type='password']")).sendKeys(prop.readingDataFromPropertyfile("password"));
		//		driver.findElement(By.xpath("(//input[@value='Login'])[2]")).click();

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@AfterMethod
	public void signingOutfromthepage()
	
	{		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		utility.mouseoveringOnElement(driver, signout.getAdministratorButton());
		signout.signOutFromWebsite();
		
	}

	@AfterClass
	public void closingTheApplication()
	{
		try {
			Thread.sleep(9000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();

	}



}
