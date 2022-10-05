package BaseTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static BaseTest.LoginTest.driver;

public class TextInputTest {
    @Test
    public void ScenarioTextInput(){
        driver.findElement(By.xpath("//a[text()='Text Input']")).click();
        driver.findElement(By.xpath("//input[@id='newButtonName']")).sendKeys("Test");
        driver.findElement(By.xpath("//button[@id='updatingButton']")).click();
        driver.findElement(By.xpath("//a[text()='Home']")).click();
    }
}
