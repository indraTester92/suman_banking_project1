package Banking_Test.basic_bankUtility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public class Base_Test {
    
    public static WebDriver driver;

    @BeforeTest
    public void setup(){
        driver = new ChromeDriver();
        driver.get("https://para.testar.org/parabank/services.htm");
        driver.manage().window().maximize();
    }

}
