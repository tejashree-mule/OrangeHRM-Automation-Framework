package orangehrm_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class LoginTest {

	WebDriver driver;
	
	@BeforeMethod
	public void setUp()
	{
		driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		}
	
	@Test
	public void testTitle()
	{
		String expectedTitle= "OrangeHRM";
		String actualTitle= driver.getTitle();
		assert actualTitle.contains(expectedTitle);
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	

	}


