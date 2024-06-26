package Java_Appium.MobileAutomation;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import org.testng.annotations.*;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseClass {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	
	@BeforeClass
	public void configureAppium() throws MalformedURLException, URISyntaxException {
		
	service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\hardi\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
			.withIPAddress("127.0.0.1").usingPort(4723).build();
	service.start();
	
	UiAutomator2Options options = new UiAutomator2Options();
    options.setDeviceName("Pixel 8 Pro API VanillaIceCream");
    options.setApp("");
    
    driver = new AndroidDriver(new URI("http://127.0.0.1:4723").toURL(), options);
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}
}