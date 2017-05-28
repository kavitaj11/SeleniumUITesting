package services;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class GenerateExtentReports
{

	public static ExtentHtmlReporter htmlReporter;
	public static ExtentReports extent;
	public static ExtentTest test;


	@BeforeSuite
	public void setupReport()
	{
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/AutomationResult.html");
		extent= new ExtentReports();
		extent.attachReporter(htmlReporter);


		extent.setSystemInfo("OS","Windows");

		//Setting Report Format
		htmlReporter.config().setDocumentTitle("Automation Testing of UI");
		htmlReporter.config().setReportName("UI Report");
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setTheme(Theme.STANDARD);

	}

	@AfterMethod
	public void getResult(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.fail(MarkupHelper.createLabel(result.getName(),ExtentColor.RED));
			//To Print Whole Stack Trace in Result
			test.fail(result.getThrowable());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.pass(MarkupHelper.createLabel(result.getName(),ExtentColor.GREEN));

		}

		else
		{
			test.skip(MarkupHelper.createLabel(result.getName(),ExtentColor.GREY));
			//To Print Whole Stack Trace in Result
			test.skip(result.getThrowable());
		}



	}


	@AfterSuite
	public void cleanUp()
	{
		extent.flush();
	}

}
