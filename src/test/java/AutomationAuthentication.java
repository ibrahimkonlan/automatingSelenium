import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutomationAuthentication {


    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();


        String username = "admin";
        String password = "admin";
        String URL = "https://"+username+":"+password+"@the-internet.herokuapp.com/basic_auth";

        driver.get(URL);
    }
}