package pageObject;

import driver.PageDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Common;

import java.util.List;

public class Home extends Common {
    public Home() {
        PageFactory.initElements(PageDriver.getCurrentDriver(), this);
    }

    /***********
     * Locators
     */
    @FindBy(className = "android.widget.Button")
    List<WebElement> skipButton;

    //Strings
    String scrollCategory = "android.widget.ScrollView";
    String textNature = "Nature";


    /***********
     * Actions
     */
    //skips first popup
    public void firstSkip() {

        skipButton.get(1).click();
    }

    //skips second popup
    public void secondSkip() {
        skipButton.get(0).click();
    }

    //selects explore
    public void selectExplore() {

        skipButton.get(0).click();
    }

    //exploring natures
    public void exploreNatures() {
        androidVerticalScrollToTextByclassName(scrollCategory,textNature);

    }
    // find img quotes by text
    public void findNothingQuotes() throws InterruptedException{
        Thread.sleep(5000);

        skipButton.get(0).click();

        androidScrollToAnElementByText("+11.2k");
    }
}
