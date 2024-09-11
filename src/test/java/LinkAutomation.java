import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class LinkAutomation {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.uk/");

        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println(links.size());

        for(int i=0; i<links.size();i++)

        {
            System.out.println(links.get(i).getAttribute("href"));

            System.out.println(links.get(i).getText());
        }
    }
}