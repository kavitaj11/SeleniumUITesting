package services;

import org.openqa.selenium.WebElement;

/**
 *
 * @author C5248417
 *Class which have all methods related to size of web elements
 */
public class GetElementSize {

	/**
	 * Return The Width Of Element
	 * @parameter-WebElement
	 */
	public int getWidth(WebElement element) throws Exception
	{
		return element.getSize().getWidth();



	}
	/**
	 * Return The Height Of Element
	 * @parameter-WebElement
	 */

	public int  getHeight(WebElement element) throws Exception
	{
		return element.getSize().getHeight();

	}
	/**
	 * Return The Point Location Of Web Element
	 * @parameter-WebElement
	 */

	public org.openqa.selenium.Point getLocation(WebElement element) throws Exception
	{
		return element.getLocation();
	}

	/**
	 *
	 * @param element=WebElement
	 * @return Color
	 */
	public String getColor(WebElement element)
	{
		return element.getCssValue("color");
	}

	/**
	 *
	 * @param element=WebElement
	 * @return Font Size
	 */
	public String getFontSize(WebElement element)
	{
		return element.getCssValue("font-size");
	}


	/**
	 *
	 * @param element=WebElement
	 * @return Font Family
	 */
	public String getFontFamily(WebElement element)
	{
		return element.getCssValue("font-family");
	}


	/**
	 *
	 * @param element=WebElement
	 * @param inclination=Top,Bottom,Left or Right
	 * @return padding
	 */

	public String getPadding(WebElement element,String inclination)
	{
		String returnValue=null;
		switch (inclination.toLowerCase())
		{

		case "top":
			returnValue= element.getCssValue("padding-top");
			break;

		case "bottom":
			returnValue= element.getCssValue("padding-bottom");
			break;

		case "left":
			returnValue= element.getCssValue("padding-left");
			break;


		case "right":
			returnValue= element.getCssValue("padding-right");
			break;


		default:
			break;

		}
		return returnValue;
	}


}
