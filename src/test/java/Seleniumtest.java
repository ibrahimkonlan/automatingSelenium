import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Seleniumtest<WebDriver> {
	public static void main(String[]args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://login.yahoo.com");

		WebElement username = driver.findElement(By.id("login-username"));
		username.isDisplayed();
		username.isEnabled();
		username.sendKeys("ibrahikonlan");
		
		WebElement loginButton = driver.findElement(By.id("login-signin"));
        loginButton.isDisplayed();
        loginButton.isEnabled();
        loginButton.click();
	
        driver.navigate().to("https://login.yahoo.com/account/challenge/password?done=https%3A%2F%2Fwww.yahoo.com%2F&sessionIndex=QQ--&acrumb=lBg2Nzmk&display=login&authMechanism=primary");
    	WebElement password = driver.findElement(By.id("login-passwd"));
		password.isDisplayed();
		password.isEnabled();
		password.sendKeys("Damire356@k");
		
		WebElement nextButton = driver.findElement(By.id("login-signin"));
		nextButton.isDisplayed();
		nextButton.isEnabled();
		nextButton.click();
	}
	

}
