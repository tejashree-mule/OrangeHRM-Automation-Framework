package orangehrm_pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	WebDriver driver;
//Constructor
	public LoginPage (WebDriver driver)
	{
		
		this.driver=driver;
	}
//Locators
	By username = By.name("username");
	By  password= By.name("password");
	By button = By.tagName("button");
	
	
	public void setUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
		
	}
	public void setPassword(String pass)
	{
		
		driver.findElement(password).sendKeys(pass);
	}
	public void clickLogin()
	{
		driver.findElement(button).click();
	}
	
	public void login(String user, String pass)
	{
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOfElementLocated(username));

		setUsername(user);
		setPassword(pass);
		clickLogin();
		
	}
}
