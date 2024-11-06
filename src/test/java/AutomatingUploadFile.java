import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomatingUploadFile {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/upload");

       WebElement UploadFile = driver.findElement(By.id("file-upload"));
       UploadFile.sendKeys("C:\\Users\\HarunaIbrahimKonlan\\Desktop\\SeleniumTest.txt");

       driver.findElement(By.id("file-submit")).click();


    }
}