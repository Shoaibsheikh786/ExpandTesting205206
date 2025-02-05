package com.ExpandTesing.base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.ExpandTesting.timeunits.TimeUnits;

public class Setup {
	
	public static WebDriver driver; //null
	public static File file;
	public static FileInputStream fis;
	public static Properties pr;
	public static String url;
	public static String browsername;
	public Setup()
	{  
		System.out.println("i am Setup");
		file=new File("./Config/config.properties");
		pr=new Properties();
	
		try {
			fis=new FileInputStream(file);
			pr.load(fis);
		} catch (FileNotFoundException e) {
			System.out.println("Config File is Missing ");
			e.printStackTrace();
			return;
		}
		 catch (IOException e) {
			
			System.out.println("Property file did not load");
			e.printStackTrace();
		}		
	}
	public static void  initialization()
	{
		browsername=pr.getProperty("browser");
		url=pr.getProperty("url");
		
		if(browsername.equalsIgnoreCase("chrome"))
		{
			driver=new ChromeDriver();
		}
		else if(browsername.equalsIgnoreCase("firefox"))
		{
			driver=new FirefoxDriver();
		}
		else if (browsername.equalsIgnoreCase("egde"))
		{
			driver=new EdgeDriver();
		}
		else
		{
			// CustomException 
			System.out.println("Driver not found");
			return ;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(TimeUnits.IMP_WAIT));
		driver.manage().deleteAllCookies();
	}
	


}
