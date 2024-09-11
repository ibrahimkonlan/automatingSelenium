import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindowsandTabs {public static void main(String[] args) {
    WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://the-internet.herokuapp.com/");

    String MainTab = driver.getWindowHandle();
    System.out.println(MainTab);
    driver.switchTo().newWindow(WindowType.WINDOW);
    driver.get("https://www.google.co.uk/");
    System.out.println(driver.getWindowHandles());
    driver.switchTo().window(MainTab);
    System.out.println(driver.getTitle());


}
}
