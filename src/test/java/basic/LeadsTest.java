package basic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LeadsTest {

@Test
	
	public void CreateLeadsTest()
	{
		WebDriver driver = new ChromeDriver();
		//Login to the application
		driver.get("http://localhost:8888/");
		 //To login in apllication (Read the data from propertyFile)
        driver.findElement(By.name("user_name")).sendKeys("admin");
        
        driver.findElement(By.name("user_password")).sendKeys("admin");
        
        driver.findElement(By.id("submitButton")).click();
        
        
      //To find WE Leads and click on it
		driver.findElement(By.xpath("(//a[text()='Leads'])[1]")).click();
        
		
	}
}
