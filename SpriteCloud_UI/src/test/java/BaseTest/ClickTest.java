package BaseTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static BaseTest.LoginTest.driver;


    public class ClickTest {

    @Test
    public void ScenarioClick(){
     driver.findElement(By.xpath("//a[text()='Click']")).click();
     driver.findElement(By.xpath("//button[@id='badButton']")).click();
     driver.findElement(By.xpath("//a[text()='Home']")).click();
    }

}
