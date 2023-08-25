package GenericUtility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ListenerImplementation implements ITestListener,Iautoconstants {
	public static ExtentTest logger;
	public static ExtentReports report;
	public static ScreenShotUtility  util=new ScreenShotUtility();
;

	@Override
	public void onStart(ITestContext context) {

		ExtentSparkReporter reporter = new ExtentSparkReporter("./reports/AD project/report"+" "+TIME+".html");
		reporter.config().setDocumentTitle("Advance Project");
		reporter.config().setTheme(Theme.DARK);
		//reporter.config().setTheme(Theme.valueOf("hiiiiiiiiiiiiiiiiiiiiiiiiii"));

		report = new ExtentReports();
		report.attachReporter(reporter);
		// Create test cases and log messages as needed

		// Adding custom HTML content for logo in the header
		//        reporter.config().setCss(".brand-logo { display: block; text-align: center; margin-bottom: 20px; }");
		//        reporter.config().setJs(".brand-logo { document.querySelector('.brand-logo').innerHTML = '<img src=\\\"https://drive.google.com/file/d/1z6s27stknjQYPMSaAqgrY16xMdHUDSnW/view?usp=drive_link.png\\\" alt=\\\"Logo\\\" width=\\\"150\\\">'; }");
		// 
		report.setSystemInfo("company", "QSP");

		report.setSystemInfo("platform", "windows");
		report.setSystemInfo("author", "arun");
	}

	@Override
	public void onTestStart(ITestResult result) {
		logger = report.createTest(result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		logger.log(Status.PASS, "This test case '" + result.getName() + "' is successful");
		String path = util.takinngScreenShot(result.getName());
		logger.addScreenCaptureFromPath(path);

	}

	@Override
	public void onTestFailure(ITestResult result) {

		String path = util.takinngScreenShot(result.getName());
		logger.log(Status.FAIL, "This test case '" + result.getName() + "' has failed");
		logger.addScreenCaptureFromPath(path);

		//System.out.println(path);
		//        logger.log(Status.FAIL, "This test case '" + result.getName() + "' has failed");
		//        scutil= new ScreenShotUtility();
		//        String path = scutil.takinngScreenShot(result.getName());
		//        logger.addScreenCaptureFromPath(scutil.takinngScreenShot(result.getName())); // Corrected method name
		//        System.out.println(path);
		// You can also consider logging the exception message for better error tracking
		//logger.log(Status.FAIL, result.getThrowable());
		// scutil = new ScreenShotUtility();
		// String path = scutil.takinngScreenShot(result.getName());
		//        logger.addScreenCaptureFromPath(path); // Use the correct variable 'path'
		//        System.out.println(path);
		// logger.log(Status.FAIL, result.getThrowable()); // Log the exception message
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		logger.log(Status.SKIP, "This test case '" + result.getName() + "' has been skipped");
	}

	@Override
	public void onFinish(ITestContext context) {
		report.flush();
	}
	
}

