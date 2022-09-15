package driver;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class BaseDriver {
    //all declared variables
    public static AndroidDriver driver = null;
    URL url = null;
    DesiredCapabilities capabilities = new DesiredCapabilities();

    public AndroidDriver setup() {
        //setting up everything
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "8.1.0");
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI Y9 2019");
        capabilities.setCapability(MobileCapabilityType.UDID, "DEFNW18B08002204");
        capabilities.setCapability("appPackage", "net.sumitk.quotesmeditation");
        capabilities.setCapability("appActivity", "net.sumitk.quotesmeditation.MainActivity");


        // capabilities.setCapability(MobileCapabilityType.BROWSER_NAME,"Chrome");
        capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, "uiautomator2");


//appium start in the server given below
        try {
            url = new URL("http://0.0.0.0:4723/wd/hub/");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
        //passing server and capabilities through AndroidDriver constructor
        driver = new AndroidDriver(url, capabilities);
        //Implicitlty wait for 10 seconds
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //driver passing through pagedriver
        PageDriver.getInstance().setAndroiddriver(driver);
        //return driver
        return driver;
    }
}
