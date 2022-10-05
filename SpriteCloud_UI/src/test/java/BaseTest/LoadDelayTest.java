package BaseTest;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import static BaseTest.LoginTest.driver;

public class LoadDelayTest {

    @Test
    public void ScenarioLoadDelay(){
        WebDriverWait wait = new WebDriverWait(driver, 10);
        driver.findElement(By.xpath("//a[text()='Load Delay']")).click();
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//button[text()='Button Appearing After Delay']")));
        driver.findElement(By.xpath("//button[text()='Button Appearing After Delay']")).click();
        driver.findElement(By.xpath("//a[text()='Home']")).click();
    }
}
