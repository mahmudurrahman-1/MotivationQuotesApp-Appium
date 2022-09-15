package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

import java.util.List;

public class Menu extends Common {
    public Menu(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }

    /******************
     * Find Locators
     */
    @FindBy(className = "android.widget.Button")
    List<WebElement> btn;
    String scrolling = "android.widget.ScrollView";
    String textMom = "Mom always says...";
    @FindBy(className = "android.view.ViewGroup")
    List<WebElement> button;
    String txt="Alone";
    String textLike ="+27.5k";

    /******************
     * Actions
     */

    //Selects third feature from footer
    public void selectMenu(){btn.get(12).click();
    }
    // Scroll to the given textMom
    public void selectsMom(){
        androidScrollToAnElementByText(textMom);
    }
    // select second image with the given search parameter
    public void selectSecondImage() throws InterruptedException{
        Thread.sleep(6000);
        btn.get(0).click();
        androidScrollByText(textLike);
        Thread.sleep(7000);
    }
    //download that image
    public void download(){
        btn.get(1).click();
    }
}
