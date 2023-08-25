package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ListenerImplementation;
import GenericUtility.WebDriverUtility;
@Listeners(ListenerImplementation.class)
public class ST_TC_007_Test extends BaseClass {
	public static WebDriverUtility util=new WebDriverUtility();
@Test
	public void vERIFY_THAT_ADDED_MODULE_IS_DISPLAYED_AND_CAN_ABLE_TO_DELETE_IT() {
	String data="leads adding";

		WebElement element = driver.findElement(By.xpath("//b[contains(text(),'"+data+"')]"));

		if (element.isDisplayed()) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//a[@id='deletelink']")).click();

			util.switchingToAlert(driver).accept();
		}
	}

}
