import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class LoginAutomation {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.manage().window().maximize();
            driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

            // Wait for the username field to be visible and enabled
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement username = wait.until(ExpectedConditions.elementToBeClickable(By.name("username")));

            username.clear();

            username.sendKeys("Admin");

            
             WebElement password = driver.findElement(By.name("password"));
             password.sendKeys("admin123");

             WebElement loginButton = driver.findElement(By.tagName("button"));
             loginButton.click();

        } finally {
            // Close the browser after the test
//            driver.quit();
        }
    }
}