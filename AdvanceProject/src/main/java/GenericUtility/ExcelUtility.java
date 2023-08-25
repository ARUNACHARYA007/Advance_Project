package GenericUtility;


	import java.io.File;
	import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.EncryptedDocumentException;
	import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.annotations.DataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

	public class ExcelUtility implements Iautoconstants {
		public static Row actualRow;
		public static int rowcount;
		/**
		 * this method is used for fetch the details from excel sheet
		 * @return
		 * @throws InvalidFormatException
		 * @throws IOException
		 */
	//	@DataProvider(name = "testdata")

		//public static Object[][] exceldata(ITestContext context) throws InvalidFormatException, IOException {
		//	String sheetname = context.getCurrentXmlTest().getParameter("sheet");
			public static Object[][] exceldata() throws InvalidFormatException, IOException {
	
			
			File file = new File(EXCELPATHFORADDING);//"./src/test/resources/personaldata.xlsx"
			Workbook workbook = WorkbookFactory.create(file);
			Sheet sheet = workbook.getSheet("Sheet1");
			 rowcount = sheet.getPhysicalNumberOfRows();
			int cellcount = sheet.getRow(0).getPhysicalNumberOfCells();
			Object[][] data=new Object[rowcount][cellcount];
			for (int row = 0; row < rowcount; row++) {
//				data[rowcount][cellcount]=sheet.getRow(i).getCell(i).toString();
				actualRow = sheet.getRow(row);//calculate bthe actual row
				for (int cell = 0; cell < actualRow.getPhysicalNumberOfCells(); cell++) {
					data[row][cell]=actualRow.getCell(cell).toString();
					
				}
			}
//			for (int i = 0; i < rowcount; i++) {
//				for (int j = 0; j <actualRow.getPhysicalNumberOfCells(); j++) {
//			System.out.println(data[i][j]);
//		}}
//			WebDriverManager.chromedriver().setup();
//			WebDriver driver=new ChromeDriver();
//			driver.manage().window().maximize();
//			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//
//			driver.get("https://demowebshop.tricentis.com/login");
//			WebElement emailTF = driver.findElement(By.id("Email"));		
//			for (int i = 0; i < rowcount; i++) {
//		for (int j = 0; j <actualRow.getPhysicalNumberOfCells(); j++) {
//	           //System.out.println(data[i][j]);
//			emailTF.sendKeys( data[i][j].toString());
//}}

return data;
		}
	}



