package PGObjmodel;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonProductTestBase {
	
	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent1;
	//public ExtentReports extent2;
	//public ExtentReports extent3;
	//public ExtentReports extent4;
	
	public ExtentTest extentTest;

	
	 WebDriver driver = null;
	 
	// ExtentReports extent;

		/*@BeforeClass
		public void extentTest() throws Exception {
			ExtentReports extent = new ExtentReports();
			String path = System.getProperty("user.dir") + "\\reports\\extent1.html";
			ExtentSparkReporter spark = new ExtentSparkReporter("extent1.html");
			spark.config().setReportName("OpenMRS login Report");
			spark.config().setDocumentTitle("OPenMRS login Test Results");
			spark.config().setTheme(Theme.DARK);
			extent.attachReporter(spark);

			ExtentTest test = extent.createTest("Successfully login OpenMRS").assignAuthor("madhuri");
			test.pass("Successfull login page");
			test.info("User name is entered");
			test.info("Password is  entered");
			test.pass("OpenMRS.com is login successfully");
			
			ExtentTest test1 = extent.createTest("OpenMRS.com");
			System.out.println("Login webpage is testing");
			
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			driver.get("https://demo.openmrs.org/openmrs/login.htm");
		}*/
	/*@BeforeSuite
	public void initialize() throws Exception {
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);

		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.get("https://demo.openmrs.org/openmrs/login.htm");

	}*/
	@BeforeClass
	public void beforeClass() {
		htmlReporter = new ExtentHtmlReporter("./reports/extent.html");
		htmlReporter.config().setDocumentTitle("Amazon Sale Report");
		htmlReporter.config().setReportName(" Amazon sale product Results ");
		htmlReporter.config().setTheme(Theme.DARK);

		extent1 = new ExtentReports();
		extent1.setSystemInfo("Tester", "Madhuri");
		extent1.setSystemInfo("Browser", "Chrome");
		extent1.attachReporter(htmlReporter);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		driver.get("https://www.amazon.com");
	}
	@BeforeMethod
	public void TestSuccessfull() {

		//driver.get("https://demo.openmrs.org/openmrs/login.htm");
		extentTest = extent1.createTest("Selling by product successfull");
		//extentTest = extent.createTest("Username is entered success");
		//extentTest = extent3.createTest("Password is entered is success");
		//extentTest = extent4.createTest("Click on Submitbtn success");
		extentTest.log(Status.PASS, "Sale by computer mouse successfull");
		extentTest.log(Status.PASS, "Entered on computer mouse");
		extentTest.log(Status.PASS, "click on search btn");
		extentTest.log(Status.PASS, "click on product link");
		extentTest.log(Status.PASS, "add to cart product");

	}

	public void Testfailed() {

		extentTest = extent1.createTest("Failed Test");
		extentTest.log(Status.FAIL, "Test method is failed");
		Assert.fail("Executing fail Login Test");

	}
	/*@AfterMethod
	public void TestSkipped() {

		extentTest = extent.createTest("Skipped Test");
		extentTest.log(Status.SKIP, "Test method is Skipped");
		throw new SkipException("Executing Skipped Login Test");

	}*/


	
	@AfterClass
	public void afterClass()
	{
		driver.quit();
		extent1.flush();
		
	}

}
