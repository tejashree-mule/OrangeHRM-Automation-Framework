package orangehrm_tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import orangehrm_pages.LoginPage;

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
	public void testValidLogin() throws InterruptedException 
	{
		LoginPage login=new LoginPage(driver);
		login.login("Admin","admin123");
		Thread.sleep(2000);
		String currentURL= driver.getCurrentUrl(); 
		assert currentURL.contains("dashboard");
		System.out.println("passed");
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
		
	}
	
	

	}


