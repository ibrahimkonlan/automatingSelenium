import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomateCheckBox {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demoqa.com/automation-practice-form");

        WebElement checkbox = driver.findElement(By.xpath("//label[normalize-space()='Sports']"));

        checkbox.clear();

        checkbox.click();
        Thread.sleep(5000);
        checkbox.click();

//        System.out.println(checkbox.getText());
    }
}