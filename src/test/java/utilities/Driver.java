package utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.OperaDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class Driver {

    static WebDriver driver; // maybe an interview question What is WebDriver?


    public static WebDriver getDriver() {

        String browser = ConfigReader.getProperty("browser");

        if (driver == null) {
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case "edge":
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case "opera":
                    WebDriverManager.operadriver().setup();
                    driver = (WebDriver) new OperaDriverManager();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
            }
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        }
        return driver;
    }


    public static void closeDriver(){
        if (driver != null){
            driver.close();
            driver = null ;
        }
    }
    public static void quitDriver(){
        if (driver != null){
            driver.quit();
            driver = null ;
        }
    }

}
