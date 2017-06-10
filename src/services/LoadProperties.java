package services;

import java.io.FileInputStream;
import java.util.Properties;

public class LoadProperties
{

	private static Properties defaultProp= new Properties();
	static
	{
		try{
			FileInputStream input = new FileInputStream("TestData\\path.properties");
			defaultProp.load(input);
			input.close();
		}

		catch(Exception e)
		{
			e.printStackTrace();

		}

	}

	public String getProperty(String key)
	{

		return defaultProp.getProperty(key);

	}

}
