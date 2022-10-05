package BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;


public class LoginTest {
    public static WebDriver driver;
    public static pageUtils.ReadPropertiesFile reader = new pageUtils.ReadPropertiesFile();

    //Method to load the Browser
    public void loadBrowser(String browser)
    {
        if( browser.equalsIgnoreCase("chrome")  )
        {
            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        }

        else if( browser.equalsIgnoreCase("firefox")  )
        {
            WebDriverManager.firefoxdriver().setup();
            driver = new FirefoxDriver();
        }
        else if( browser.equalsIgnoreCase("edge")  )
        {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        }

        else{
            System.out.println("Invalid browser");
        }
    }

    //Method to load the URL
    @Test
    public void loadUrl() throws InterruptedException, IOException {
        reader.loadFile();
        loadBrowser(reader.readFile("Browser"));
        driver.get(reader.readFile("url"));
        driver.manage().window().maximize();
    }



}
