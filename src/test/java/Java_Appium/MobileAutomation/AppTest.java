package Java_Appium.MobileAutomation;

import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import org.testng.annotations.Test;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;

public class AppTest 
{

    @Test
    public void TestDataApp() throws MalformedURLException, URISyntaxException
    {
       UiAutomator2Options options = new UiAutomator2Options();
       options.setDeviceName("Pixel 3a API 34");
       options.setApp("");
       
       AndroidDriver driver = new AndroidDriver(new URI("http://192.168.1.17:4723").toURL(), options);
    }
}
