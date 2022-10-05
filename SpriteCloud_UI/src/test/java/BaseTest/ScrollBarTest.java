package BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import static BaseTest.LoginTest.driver;


public class ScrollBarTest {

    @Test
    public void ScenarioScrollBar() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        driver.findElement(By.xpath("//a[text()='Scrollbars']")).click();
        js.executeScript("document.querySelector(\"body > section > div > div\").scrollBy(150,100)");
        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[text()='Hiding Button']")).click();
        driver.findElement(By.xpath("//a[text()='Home']")).click();
        driver.close();
    }
}
