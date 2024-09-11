import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AutomateDropdown {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.navigate().to("https://the-internet.herokuapp.com/dropdown");

        Select obj = new Select(driver.findElement(By.id("dropdown")));

//        obj.selectByIndex(2);
//        obj.selectByValue("2");
        obj.selectByVisibleText("Option 1");

//        count number of options available in  dropdown

        List<WebElement> dropdownvaluescount = obj.getOptions();
        System.out.println(dropdownvaluescount.size());

    }
}