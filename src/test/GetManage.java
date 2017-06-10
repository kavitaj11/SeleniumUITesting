package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetManage {

	public static void main(String args[])
	{

		System.setProperty("webdriver.chrome.driver","C:\\Work\\SeleniumWebDriver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();driver.get("https://www.facebook.com/");

		System.out.println("Email"+driver.findElement(By.id("email")).getLocation());

		System.out.println("Email"+driver.findElement(By.id("pass")).getLocation());

		System.out.println("Email"+driver.findElement(By.id("u_0_1")).getLocation());

		System.out.println("Email"+driver.findElement(By.id("u_0_3")).getLocation());


	}

}
