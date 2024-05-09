package Java_Appium.MobileAutomation;

import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import org.openqa.selenium.By;



public class AppTest extends BaseClass
{
    @Test
    public void TestDataApp() throws MalformedURLException, URISyntaxException
    {
       driver.findElement(By.xpath("//android.widget.TextView[@content-desc='Preference']")).click();
       driver.findElement(By.xpath("//android.widget.TextView[@content-desc='3. Preference dependencies']")).click();
       driver.findElement(By.id("android:id/checkbox")).click();
       driver.findElement(By.xpath("(//android.widget.RelativeLayout)[2]")).click();
       driver.findElement(By.id("android:id/edit")).sendKeys("Test Wifi");
       driver.findElement(By.id("android:id/button1")).click();
    }
}
