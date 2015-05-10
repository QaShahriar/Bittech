import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Keyboard;


public class BaseTest 
{

	
		static FirefoxDriver dr;
		static Logger log= Logger.getLogger(BaseTest.class);
		
		
		@BeforeClass
		public static void start() throws Throwable
		{
			
			
			DOMConfigurator.configure("log4j.xml");	
			
			
			log.info("========================");
			log.info("=====OPENING BROWSER====");
			log.info("========================");
			
			
			
			dr=new FirefoxDriver();
			dr.manage().window().maximize();
			dr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			dr.get("http://www.bluefly.com");
			Keyboard kb= dr.getKeyboard();
			kb.sendKeys(Keys.COMMAND, "r");
			Thread.sleep(2000);
			long startTime= System.currentTimeMillis();
			long endTime= System.currentTimeMillis();
			
			
			
			
			log.info("======================================");
			log.info(           endTime-startTime            );
			log.info("======================================");
			log.info(dr.getTitle());
			
			
			
			
			
		}
		
		
		
	
		@AfterClass 
		public static void end()
		{
			
			log.info("===========================");
			log.info("====== CLOSING BROWSER ====");
			log.info("===========================");
			dr.quit();
			
			
		}
		
		
	
	
	
	
	

}
