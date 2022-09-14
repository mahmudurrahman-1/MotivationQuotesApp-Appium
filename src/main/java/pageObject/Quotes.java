package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

import java.util.List;

public class Quotes extends Common {
    public Quotes(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }
    /******************
     * Locators
     */
    @FindBy(className = "android.widget.Button")
    List<WebElement> quotesTqo;
    @FindBy(className = "android.widget.ScrollView")
    WebElement scrolling;
    String btn1 = "START BREATHING EXERCISE";
    @FindBy(className = "android.view.ViewGroup")
    WebElement thinking;
    @FindBy(className = "")
    WebElement ;
    @FindBy(className = "")
    WebElement ;
    @FindBy(className = "")
    WebElement ;
}
