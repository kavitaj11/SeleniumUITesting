package logger;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class MyLogger
{

	private final static  Logger logr=Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

	public  static void setupLogger()
	{

		LogManager.getLogManager().reset();
		logr.setLevel(Level.ALL);

		ConsoleHandler ch= new ConsoleHandler();
		ch.setLevel(Level.SEVERE);
		logr.addHandler(ch);

		FileHandler fh;
		try {
			fh = new FileHandler("log\\Logger.log");
			fh.setFormatter(new SimpleFormatter());
			fh.setLevel(Level.ALL);
			logr.addHandler(fh);
		} catch (SecurityException | IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
			logr.log(Level.SEVERE,"File Logger is not working Properly",e);
		}


	}


	public static void main(String args[])
	{
		setupLogger();
		logr.info("This is main Logg");
		logr.warning("This is warning");

	}
}
