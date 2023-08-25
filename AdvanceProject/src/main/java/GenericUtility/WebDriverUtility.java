package GenericUtility;

import java.util.NoSuchElementException;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtility {

	/**
	 * this method is used for entering the data into tf
	 * @param driver
	 * @param data
	 * @param element
	 */
	public void enteringDataIntoTF(WebDriver driver ,String data,WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].value='"+data+"';",element );

	}
	/**
	 * this methods is used for click on the web element 
	 * @param driver
	 * @param element
	 */
	public void clickingOntheElement(WebDriver driver, WebElement element)
	{
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}
	/**
	 * this method is used for switch the driver control to i frame 
	 * @param driver
	 * @param index
	 */
	public void switchingToFrame(WebDriver driver,int index)
	{
		driver.switchTo().frame(index);
	}
	/**
	 * this method is used for switch the driver control to i frame
	 * @param driver
	 * @param name
	 */
	public void switchingToFrame(WebDriver driver,String name)
	{
		driver.switchTo().frame(name);

	}
	/**
	 * this method is used for switch the driver control to i frame
	 * @param driver
	 * @param element
	 */
	public void switchingToFrame(WebDriver driver, WebElement element)
	{
		driver.switchTo().frame(element);
	}
	/**
	 * this method is used for switch the driver control to alert popup
	 * @param driver
	 * @return
	 */
	public Alert switchingToAlert(WebDriver driver)
	{

		return driver.switchTo().alert();
	}
	/**
	 * this method is used for handle the mouseover on the element
	 * @param driver
	 * @param Element
	 */
	public void mouseoveringOnElement(WebDriver driver, WebElement Element)
	{
		Actions act=new Actions(driver);
		act.moveToElement(Element).perform();
	}
	/**
	 * This method used for handle the dropdown
	 * @param dropdown
	 * @param value
	 */
	public void handlingDropdown(WebElement dropdown,String value)
	{
		Select select=new Select(dropdown);
		try {
			select.selectByValue(value);
		}
		catch (NoSuchElementException e) {
			select.selectByVisibleText(value);

		}
		catch (Exception e) {
			select.selectByIndex(Integer.valueOf((String)value));
			// TODO: handle exception
		}

	}
	public void handlingDropdown(WebElement dropdown,int value)
	{
		Select select=new Select(dropdown);
		select.selectByIndex(value);
	}

	
	/**
	 * this method is used for switching the window from main to child
	 * @param driver
	 * @param parentwindowid
	 * @param allwindowid
	 * @param title
	 */
	public void switchtowindow(WebDriver driver,String parentwindowid,Set<String> allwindowid,String title)
	{
		allwindowid.remove(parentwindowid);
		for (String id : allwindowid) {
			driver.switchTo().window(id);
			if (driver.getTitle().equalsIgnoreCase(title)) {
				break;

			}

		}
	}
	/**
	 * this method is used for switching the back to window from child
	 * @param driver
	 * @param parentwindow
	 */
	public void switchbacktomainwindow(WebDriver driver,String parentwindow)
	{
		driver.switchTo().window(parentwindow);
	}
}

