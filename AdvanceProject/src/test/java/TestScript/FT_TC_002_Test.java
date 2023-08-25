package TestScript;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;

public class FT_TC_002_Test extends BaseClass {
	@Test
	public void vERIFY_THAT_USER_CAN_SELECT_ALLTHE_CHECK_BOX_ARE_CLIKING_OR_NOT()
	{   
		search.getSearchdownwardkey().click();
		List<WebElement> allCheckboxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for(int i=0;i<allCheckboxes.size();i++) {
		allCheckboxes.get(i).click();
		}
		

	}

}
