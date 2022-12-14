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
    List<WebElement> button;

    //Strings
    String scrollCategory = "android.widget.ScrollView";
    String horizontalContainer = "android.widget.HorizontalScrollView";
    String textNature = "Nature";
    String textSelfLove = "Self Love";


    /***********
     * Actions
     */
    //skips first popup
    public void firstSkip() {

        button.get(1).click();
    }

    //skips second popup
    public void secondSkip() {
        button.get(0).click();
    }

    //selects explore
    public void selectExplore() {

        button.get(0).click();
    }

    //selects selfLove
    public void selectSelfLove() {

        androidHorizontalScrollToTextByclassName(horizontalContainer, textSelfLove);
    }

    //Explore self-love
    public void exploreSelfLove() throws InterruptedException {
        Thread.sleep(5000);
        button.get(0).click();
        androidScrollToAnElementByText("+630");
        Thread.sleep(5000);
    }

    //download img
    public void downLoadSelfLuvImg() {
        button.get(0).click();
    }

    //exploring natures
    public void exploreNatures() {
        androidVerticalScrollToTextByclassName(scrollCategory, textNature);

    }

    // find img quotes by text
    public void findNothingQuotes() throws InterruptedException {
        Thread.sleep(3000);

        button.get(0).click();

        androidScrollToAnElementByText("+13.8k");
    }

    // like save and download
    public void finaOperation() throws InterruptedException {

        System.out.println(button.size());
        button.get(6).click();
        Thread.sleep(3000);
        button.get(7).click();
        Thread.sleep(3000);
        button.get(8).click();

    }
}
