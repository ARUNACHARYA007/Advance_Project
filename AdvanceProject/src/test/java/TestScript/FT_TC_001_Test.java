package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ListenerImplementation;
@Listeners(ListenerImplementation.class)
public class FT_TC_001_Test extends BaseClass {
	@Test
	public void vERIFY_THAT_USER_CLICK_ON_THE_DOWNWARD_BUTTON_AND_IT_SHOULD_DISPLAY_ALL_THE_MODULE()
	{
		search.getSearchdownwardkey().click();
//	List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
//	for (WebElement webElement : allCheckboxes) {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
//		String name = webElement.getText();
//		System.out.println(name);
//		
//			//System.out.println("hi");
//		}

//	 List<WebElement> allcheckbox = (List<WebElement>) search.getCheckbox();
//	 for (WebElement webElement : allcheckbox) {
//		 System.out.println(webElement.getText());
//		
//	}
	}

}
