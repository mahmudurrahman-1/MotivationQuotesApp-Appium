package driver;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.devtools.v85.page.Page;

public class PageDriver {
    private static final ThreadLocal<AndroidDriver> adriver = new ThreadLocal<>();
    private static PageDriver instance = null;

    private PageDriver() {

    }

    public static PageDriver getInstance() {
        if (instance == null) {
            instance = new PageDriver();
        }
        return instance;
    }

    //set driver
    public void setAndroiddriver(AndroidDriver driver) {
        adriver.set(driver);
    }

    //get
    public AndroidDriver getDriver() {
        return adriver.get();
    }

    // Get current driver
    public static AndroidDriver getCurrentDriver() {
        return getInstance().getDriver();
    }
}
