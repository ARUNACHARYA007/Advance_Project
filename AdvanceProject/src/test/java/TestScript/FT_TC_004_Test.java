package TestScript;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import GenericUtility.BaseClass;
import GenericUtility.ListenerImplementation;
@Listeners(ListenerImplementation.class)

public class FT_TC_004_Test extends BaseClass {
	@Test
	public void vERIFY_THAT_USER_CAN_CLICK_ON_SELECT_ALL_BUTTON_AND_UNSELECT_ALL_BUTTON()
	{
		search.getSearchdownwardkey().click();
		search.getSelectallbutton().click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		search.getUnselectallbutton().click();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		 
		
		search.getClosebutton().click();
	}

}
