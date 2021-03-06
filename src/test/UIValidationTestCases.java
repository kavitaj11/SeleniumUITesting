package test;

import java.io.IOException;
import java.util.LinkedHashMap;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import model.Record;
import services.CompareValues;
import services.ExcelProcessor;
import services.GenerateExtentReports;
import services.LoadProperties;

public class UIValidationTestCases extends GenerateExtentReports
{
	public static WebDriver Browser_session;

	static LoadProperties prop=new LoadProperties();

	/**
	 *To Setup Common Browser for All Windows Validation
	 * @throws IOException
	 */
	public static void setupBrowser() throws IOException
	{
		/*Properties prop=new Properties();
		InputStream input=new FileInputStream("TestData\\path.properties");
		prop.load(input);*/


		//Setting Web Drivers
		System.setProperty("webdriver.chrome.driver",prop.getProperty("chromeDriver"));
		Browser_session=new ChromeDriver();


	}

	/**
	 * Before Class Initialization
	 * @throws IOException
	 */
	@BeforeClass
	public  void  beforeSuite() throws IOException
	{

		setupBrowser();

		/*	Properties prop=new Properties();
		InputStream input=new FileInputStream("TestData\\path.properties");
		prop.load(input);*/

		//Opening New Page

		//Browser_session.get("https://www.facebook.com/");
		Browser_session.get(prop.getProperty("url"));
		Browser_session.findElement(By.tagName("html")).sendKeys(Keys.F11);
		//Browser_session.manage().window().fullscreen();

	}

	@AfterClass
	public   void afterSuite()
	{
		Browser_session.close();
	}


	@Test
	public void validateFontSize() throws IOException
	{
		test=extent.createTest("Validate Font Size");

		//Storing Excel Data As LinkedHashMap
		LinkedHashMap dataMap=ExcelProcessor.readExcel(prop.getProperty("ExcelPath"),"Test");

		for(Object key :dataMap.keySet())
		{
			Record record=(Record) dataMap.get(key);
			WebElement webElement=Browser_session.findElement(By.id(record.getElementFindByValue()));
			Assert.assertTrue(CompareValues.verifyFontSize(webElement.getCssValue("font-size"), record.getFontSize())
					,"Failed For Web Element :"+record.elementName +" Expected Value :"+record.getFontSize()+
					" Actual Value :"+webElement.getCssValue("font-size"));



		}

	}


	@Test
	/**
	 *
	 * Validate Font Family
	 */
	public void validateFontFamily1()
	{
		test=extent.createTest("Validate Font Family");

		//Storing Excel Data As LinkedHashMap
		LinkedHashMap dataMap=ExcelProcessor.readExcel(prop.getProperty("ExcelPath"),"Test");


		for(Object key :dataMap.keySet())
		{
			Record record=(Record) dataMap.get(key);
			WebElement webElement=Browser_session.findElement(By.id(record.getElementFindByValue()));
			Assert.assertTrue(CompareValues.verifyFontSize(webElement.getCssValue("font-family"), record.getFontFamily()),
					"Failed For Web Element :"+record.elementName +" Expected Value :"+record.getFontFamily()+
					" Actual Value :"+webElement.getCssValue("font-family")	);

		}
	}



	@Test
	/**
	 *
	 * Validate Font Color
	 */
	public void validateColor()
	{
		test=extent.createTest("Validate Color");

		//Storing Excel Data As LinkedHashMap
		LinkedHashMap dataMap=ExcelProcessor.readExcel(prop.getProperty("ExcelPath"),"Test");


		for(Object key :dataMap.keySet())
		{
			Record record=(Record) dataMap.get(key);
			WebElement webElement=Browser_session.findElement(By.id(record.getElementFindByValue()));
			Assert.assertTrue(CompareValues.verifyColor(webElement.getCssValue("color"), record.getColor()),
					"Failed For Web Element :"+record.elementName +" Expected Value :"+record.getColor()+
					" Actual Value :"+webElement.getCssValue("color"));

		}
	}



	@Test
	/**
	 *
	 * Validate padding-top
	 */
	public void validatePaddingTop()
	{
		test=extent.createTest("Validate Padding Top");

		//Storing Excel Data As LinkedHashMap
		LinkedHashMap dataMap=ExcelProcessor.readExcel(prop.getProperty("ExcelPath"),"Test");


		for(Object key :dataMap.keySet())
		{
			Record record=(Record) dataMap.get(key);
			WebElement webElement=Browser_session.findElement(By.id(record.getElementFindByValue()));
			Assert.assertTrue(CompareValues.verifyPadding(webElement.getCssValue("padding-top"), record.getPaddingTop(),"Top"),
					"Failed For Web Element :"+record.elementName +" Expected Value :"+record.getPaddingTop()+
					" Actual Value :"+webElement.getCssValue("padding-top"));


		}
	}



	@Test
	/**
	 *
	 * Validate Padding Bottom
	 */
	public void validatePaddingBottom()
	{
		test=extent.createTest("Validate Padding Bottom");

		//Storing Excel Data As LinkedHashMap
		LinkedHashMap dataMap=ExcelProcessor.readExcel(prop.getProperty("ExcelPath"),"Test");


		for(Object key :dataMap.keySet())
		{
			Record record=(Record) dataMap.get(key);
			WebElement webElement=Browser_session.findElement(By.id(record.getElementFindByValue()));
			Assert.assertTrue(CompareValues.verifyPadding(webElement.getCssValue("padding-bottom"), record.getPaddingBottom(),"Bottom"),
					"Failed For Web Element :"+record.elementName +" Expected Value :"+record.getPaddingBottom()+
					" Actual Value :"+webElement.getCssValue("padding-bottom"));

		}
	}



	@Test
	/**
	 *
	 * Validate Padding Left
	 */
	public void validatePaddingLeft()
	{
		test=extent.createTest("Validate Padding Left");

		//Storing Excel Data As LinkedHashMap
		LinkedHashMap dataMap=ExcelProcessor.readExcel(prop.getProperty("ExcelPath"),"Test");


		for(Object key :dataMap.keySet())
		{
			Record record=(Record) dataMap.get(key);
			WebElement webElement=Browser_session.findElement(By.id(record.getElementFindByValue()));
			Assert.assertTrue(CompareValues.verifyPadding(webElement.getCssValue("padding-left"), record.getPaddingLeft(),"Left"),
					"Failed For Web Element :"+record.elementName +" Expected Value :"+record.getPaddingLeft()+
					" Actual Value :"+webElement.getCssValue("padding-left"));

		}

	}


	@Test
	/**
	 *
	 * Validate Padding Right
	 */
	public void validatePaddingRight()
	{
		test=extent.createTest("Validate Padding Right");

		//Storing Excel Data As LinkedHashMap
		LinkedHashMap dataMap=ExcelProcessor.readExcel(prop.getProperty("ExcelPath"),"Test");


		for(Object key :dataMap.keySet())
		{
			Record record=(Record) dataMap.get(key);
			WebElement webElement=Browser_session.findElement(By.id(record.getElementFindByValue()));
			Assert.assertTrue(CompareValues.verifyPadding(webElement.getCssValue("padding-right"), record.getPaddingRight(),"right"),
					"Failed For Web Element :"+record.elementName +" Expected Value :"+record.getPaddingRight()+
					" Actual Value :"+webElement.getCssValue("padding-right"));

		}
	}


	@Test
	/**
	 *
	 * Validate WebElement Location
	 */
	public void validateLocation()
	{
		test=extent.createTest("Validate Location");

		//Storing Excel Data As LinkedHashMap
		LinkedHashMap dataMap=ExcelProcessor.readExcel(prop.getProperty("ExcelPath"),"Test");


		for(Object key :dataMap.keySet())
		{
			Record record=(Record) dataMap.get(key);
			WebElement webElement=Browser_session.findElement(By.id(record.getElementFindByValue()));

			//Validating X Location
			Assert.assertTrue(CompareValues.verifyXLocation(webElement.getLocation().getX(), record.getxLocation()),
					"Failed For Web Element :"+record.elementName +" Expected Value :"+record.getxLocation()+
					" Actual Value :"+webElement.getLocation().getX());


			//Validating Y Location
			Assert.assertTrue(CompareValues.verifyXLocation(webElement.getLocation().getY(), record.getyLocation()),
					"Failed For Web Element :"+record.elementName +" Expected Value :"+record.getyLocation()+
					" Actual Value :"+webElement.getLocation().getY());

		}
	}





}



