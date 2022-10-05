package BaseTest;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import static BaseTest.LoginTest.driver;

public class DynamicIDTest {

    @Test
    public void ScenarioDynamicID(){
       driver.findElement(By.xpath("//a[text()='Dynamic ID']")).click();
       driver.findElement(By.xpath("//button[text()='Button with Dynamic ID']")).click();
       driver.findElement(By.xpath("//a[text()='Home']")).click();
    }

}
