package services;

import java.util.logging.Logger;

import logger.MyLogger;

/**
 *
 * @author C5248417
 *
 */

public class CompareValues {

	private final static  Logger logr=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);


	/**
	 *
	 * @param actualValue-Value Come from Application
	 * @param expectedValue-Value We get from Excel Sheet
	 * @param measurenmentId-define what we are measuring eg. Height,width or padding
	 * @return
	 * @return Pass or fail as boolean
	 */

	public static  boolean verifySize(String actualValue,String expectedValue,String measurenmentId)
	{
		//Setup Logger
		MyLogger.setupLogger();

		if (actualValue==null||expectedValue==null)
		{
			System.out.println("No Validation Done For Size");
			logr.info("No Validation Done For Size");
		}

		if (actualValue.equals(expectedValue))
		{
			logr.info("Passed-Test Case Passed as Value Matched for  " + measurenmentId);
			logr.info("Original Value is : " +actualValue+"  Expected Value is :"+expectedValue);
			System.out.println("Test Case Passed as Value Matched for  " + measurenmentId);
			System.out.println("Original Value is : " +actualValue+"  Expected Value is :"+expectedValue);
			return true;
		}
		else
		{
			logr.severe("Failed-Test Cas failed as Value is different from expected for " + measurenmentId);
			logr.info("Original Value is : " +actualValue+"  Expected Value is :"+expectedValue);
			System.out.println("Test Cas failed as Value is different from expected for " + measurenmentId);
			System.out.println("Original Value is : " +actualValue+"  Expected Value is :"+expectedValue);
			return false;


		}


	}




	/**
	 *
	 * @param actualText-Text which comes from application.
	 * @param expectedText-Text which we get from excel sheet.
	 * @param measurenmentId-define what we are measuring eg. Height,width or padding
	 * @return-Pass or Fail as boolean
	 */

	public static boolean verifyText(String actualText,String expectedText,String measurenmentId)
	{
		MyLogger.setupLogger();

		if (actualText==null||expectedText==null)
		{
			logr.info("No Validation Done For Text");
			System.out.println("No Validation Done For Text");
		}



		if (actualText.equals(expectedText))
		{
			logr.info("Passed-Test Case Passed as Value Matched for  " + measurenmentId);
			logr.info(" Original Value is : " +actualText+"  Expected Value is :"+expectedText);

			System.out.println("Passed-Test Case Passed as Value Matched for  " + measurenmentId);
			System.out.println(" Original Value is : " +actualText+"  Expected Value is :"+expectedText);
			return true;
		}
		else
		{
			logr.severe("Failed-Test Cas failed as Value is different from expected for " + measurenmentId);
			logr.severe("Original Value is : " +actualText+"  Expected Value is :"+expectedText);

			System.out.println("Failed-Test Cas failed as Value is different from expected for " + measurenmentId);
			System.out.println("Original Value is : " +actualText+"  Expected Value is :"+expectedText);
			return false;
		}


	}
	/**
	 *
	 * @param actualSize
	 * @param expectedSize
	 * @return True=Pass or False=Fail
	 */


	public static boolean verifyFontSize(String actualSize,String expectedSize)
	{
		MyLogger.setupLogger();

		if (actualSize==null||expectedSize==null)
		{
			logr.warning("No Validation Done For Font Size");
			System.out.println("No Validation Done For Font Size");
		}


		if (actualSize.equals(expectedSize))
		{
			logr.info("Passed-Font Size Matched ");
			System.out.println("Font Size Matched ");
			return true;
		}
		else
		{
			logr.severe("Failed-Font Size Mismatched");
			System.out.println("Font Size Mismatched");
			System.out.println("Expcted:" +expectedSize + "Actual :"+actualSize);
			return false;
		}
	}
	/**
	 *
	 * @param actualFontFamily
	 * @param expectedFontFamily
	 * @return True=Pass or False=Fail
	 */

	public static boolean verifyFontFamily(String actualFontFamily,String expectedFontFamily)
	{
		MyLogger.setupLogger();
		if (actualFontFamily==null||expectedFontFamily==null)
		{
			logr.info("No Validation Done For Font Family");
			System.out.println("No Validation Done For Font Family");
		}

		if (actualFontFamily.equals(expectedFontFamily))
		{
			logr.info("Passed-Font Family Matched ");
			System.out.println("Font Family Matched ");
			return true;
		}
		else
		{
			logr.severe("Failed-Font Family Mismatched");
			System.out.println("Font Family Mismatched");
			return false;
		}
	}
	/**
	 *
	 * @param actualPadding
	 * @param expectedPadding
	 * @param inclination eg Top,Bottom,Left,Right
	 * @return True=Pass or False=Fail
	 */

	public static boolean verifyPadding(String actualPadding,String expectedPadding,String inclination)
	{
		MyLogger.setupLogger();
		if (actualPadding==null||expectedPadding==null)
		{
			logr.info("No Validation Done For Padding");
			System.out.println("No Validation Done For Padding");
		}

		if (actualPadding.equals(expectedPadding))
		{
			logr.info("Passed-"+inclination +" Padding Matched  ");
			System.out.println(inclination +" Padding Matched  ");
			return true;
		}
		else
		{
			logr.severe("Failed-"+inclination +" Padding Mismatched  ");
			System.out.println(inclination +" Padding Mismatched  ");
			return false;
		}
	}
	/**
	 *
	 * @param actualColor
	 * @param expectedColor
	 * @return True=Pass or False=Fail
	 **/

	public static boolean verifyColor(String actualColor,String expectedColor)
	{
		MyLogger.setupLogger();
		if (actualColor==null||expectedColor==null)
		{
			logr.info("No Validation Done For Color");
			System.out.println("No Validation Done For Color");
		}
		if (actualColor.equals(expectedColor))
		{
			logr.info("Passed-Color  Matched  ");
			System.out.println("Color  Matched  ");
			return true;
		}
		else
		{
			logr.severe("Failed-Color Mismatched  ");
			System.out.println("Color Mismatched  ");
			return false;
		}
	}

	/**
	 *
	 * @param actualSizeValue-Actual Value of Height or Width
	 * @param expectedSizeValue-Expected Value of Height or Width
	 * @param sizeMeasurenmentId-What we are measuring eg Height or width
	 * @param actualText-Actual Text
	 * @param expectedText-Expected text
	 * @param textMeasurenmentId-What we are measuring eg Text Of what element.
	 *
	 * This function is created to verify all aspects at one go.
	 * In future we can add more function from above
	 *//*
	//@Test
	public static void verifyAll(Optional<String> actualSizeValue ,Optional<String> expectedSizeValue,Optional<String> sizeMeasurenmentId,
			Optional<String> actualText,Optional<String> expectedText,Optional<String> textMeasurenmentId,
			Optional<String> actualColor,Optional<String> expectedColor,
			Optional<String>actualPadding,Optional<String> expectedPadding,Optional<String> inclination,
			Optional<String> actualFontFamily,Optional<String> expectedFontFamily,
			Optional<String> actualFontSize,Optional<String> expectedFontSize)
	{
		MyLogger.setupLogger();
		String  aSize=actualSizeValue.isPresent()?actualSizeValue.get():null;
		String  eSize=expectedSizeValue.isPresent()?expectedSizeValue.get():null;
		String  sMeasurementId=sizeMeasurenmentId.isPresent()?sizeMeasurenmentId.get():null;

		String  aText=actualText.isPresent()?actualText.get():null;
		String  eText=expectedText.isPresent()?expectedText.get():null;
		String  tMeasurementId=textMeasurenmentId.isPresent()?textMeasurenmentId.get():null;

		String  aColor=actualColor.isPresent()?actualColor.get():null;
		String  eColor=expectedColor.isPresent()?expectedColor.get():null;

		String  aPadding=actualPadding.isPresent()?actualPadding.get():null;
		String  ePadding=expectedPadding.isPresent()?expectedPadding.get():null;
		String  pInclination=inclination.isPresent()?inclination.get():null;

		String  aFontFamily=actualFontFamily.isPresent()?actualFontFamily.get():null;
		String  eFontFamily=expectedFontFamily.isPresent()?expectedFontFamily.get():null;

		String  aFontSize=actualFontSize.isPresent()?actualFontSize.get():null;
		String  eFontSize=expectedFontSize.isPresent()?expectedFontSize.get():null;


		//Verify Size
		verifySize(aSize, eSize, sMeasurementId);

		//Verify Text
		verifyText(aText,eText,tMeasurementId);

		//Verify Color
		verifyColor(aColor,eColor);

		//Verify Padding
		verifyPadding(aPadding,ePadding,pInclination);

		//Verify Font Family
		verifyFontFamily(aFontFamily,eFontFamily);


		//Verify Font Size
		verifyFontSize(aFontSize,eFontSize);



	}

	  /**
	  *
	  * @param actualSizeValue-Actual Value of Height or Width
	  * @param expectedSizeValue-Expected Value of Height or Width
	  * @param sizeMeasurenmentId-What we are measuring eg Height or width
	  * @param actualText-Actual Text
	  * @param expectedText-Expected text
	  * @param textMeasurenmentId-What we are measuring eg Text Of what element.
	  *
	  * This function is created to verify all aspects at one go.
	  * In future we can add more function from above
	  */


	public void verifyAll(String actualSizeValue ,String expectedSizeValue,String sizeMeasurenmentId,
			String actualText,String expectedText,String textMeasurenmentId,
			String actualColor,String expectedColor,
			String actualPadding,String expectedPadding,String inclination,
			String  actualFontFamily,String expectedFontFamily,
			String actualFontSize,String expectedFontSize)
	{
		MyLogger.setupLogger();
		String  aSize=actualSizeValue;
		String  eSize=expectedSizeValue;
		String  sMeasurementId=sizeMeasurenmentId;

		String  aText=actualText;
		String  eText=expectedText;
		String  tMeasurementId=textMeasurenmentId;

		String  aColor=actualColor;
		String  eColor=expectedColor;

		String  aPadding=actualPadding;
		String  ePadding=expectedPadding;
		String  pInclination=inclination;

		String  aFontFamily=actualFontFamily;
		String  eFontFamily=expectedFontFamily;

		String  aFontSize=actualFontSize;
		String  eFontSize=expectedFontSize;


		//Verify Size
		verifySize(aSize, eSize, sMeasurementId);

		//Verify Text
		verifyText(aText,eText,tMeasurementId);

		//Verify Color
		verifyColor(aColor,eColor);

		//Verify Padding
		verifyPadding(aPadding,ePadding,pInclination);

		//Verify Font Family
		verifyFontFamily(aFontFamily,eFontFamily);


		//Verify Font Size
		verifyFontSize(aFontSize,eFontSize);


	}


}

