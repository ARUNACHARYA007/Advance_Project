package TestScript;

import java.util.Set;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ExcelUtility;
import GenericUtility.Iautoconstants;
import GenericUtility.ListenerImplementation;
import GenericUtility.WebDriverUtility;
@Listeners(ListenerImplementation.class)

public class ST_TC_006  extends BaseClass  {
	WebDriverUtility util;

	//@Test(dataProvider = "testdata",dataProviderClass = ExcelUtility.class)
	public void vERIFY_THAT_USER_CAN_ADD_MODULE_AND_CHECK(String windowtitle)
	{
		util=new WebDriverUtility();

		adding.getHomePagePlusIcon().click();
		adding.getDropdownModule().click();
		String parent = driver.getWindowHandle();
		Set<String> child = driver.getWindowHandles();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		util.switchtowindow(driver, parent, child, "Add Module");
		adding.getWindowTitle().sendKeys(windowtitle);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		///adding.getShow().click();
		util.handlingDropdown(adding.getShow(), "5");
		util.handlingDropdown(adding.getModuledropdowninchildwindow(), "Leads");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i <=1; i++) {
		
			util.handlingDropdown(adding.getFildToShow(), i);
		//	util.handlingDropdown(adding.getFildToShow(), 2);

		

		}
		//util.handlingDropdown(adding.getFildToShow(), "Asset Name");
		adding.getSaveButton().click();


	}

}