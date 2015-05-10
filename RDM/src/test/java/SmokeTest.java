import org.junit.Test;
import org.openqa.selenium.By;


public class SmokeTest extends BaseTest
{
	
	
	
	
	@Test
	public void women()
	{
		log.info("==========================");
		log.info("=====NOW-AT-WOMENT-PAGE===");
		log.info("==========================");
		
		
				dr.findElement(By.cssSelector(".main-nav-link.main-nav-link-women")).click();
		
		
	}
	
	
	
	
	

}
