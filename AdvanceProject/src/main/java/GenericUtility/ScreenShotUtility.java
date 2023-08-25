package GenericUtility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShotUtility extends BaseClass implements Iautoconstants {
	/**
	 * this method is used for taking the screenshot of webpage
	 * 
	 * @param scshotname
	 */
	
	public static  String  path;
	public File dest;
	public File photo;
	public String  takinngScreenShot( String scshotname)
	{    
		TakesScreenshot takesscshot=(TakesScreenshot) driver;
		 photo = takesscshot.getScreenshotAs(OutputType.FILE);
		//String time = LocalDateTime.now().toString().replace(":", "-");
		//String path=SSPATH+scshotname+" "+time+".png";
		 path=DIRECTORY+""+SSPATH+scshotname+" "+TIME+".png";

		 dest=new File(path);
		try {
			FileUtils.copyFile(photo, dest);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return path;
		
	}

}
