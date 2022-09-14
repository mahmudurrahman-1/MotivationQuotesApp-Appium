package pageObject;

import driver.PageDriver;
import io.cucumber.java.sl.In;
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
    String scrolling = "android.widget.ScrollView";
    @FindBy(className = "android.widget.ScrollView")
    WebElement scroll;
    String btn1 = "START BREATHING EXERCISE";
    @FindBy(className = "android.view.ViewGroup")
    List<WebElement> button;
    String txt="Alone";
    String textSituation ="+1.2k";
//    @FindBy(className = "")
//    WebElement ;
//    @FindBy(className = "")
//    WebElement ;

    /****************
     * Actions
     */
    //select quotes feature
    public void openAppQuotes(){
        quotesTqo.get(11).click();
        System.out.println(quotesTqo.size());
    }
    //scroll down and click SBE btn
    public void SBE() throws InterruptedException {
        Thread.sleep(15000);
        quotesTqo.get(0).click();
        androidScrollToAnElementByText(btn1);
        Thread.sleep(10000);

    }
    //Sujon enter SBE and waits for some time then close it
     public void exercise(){
        button.get(12).click();
     }
     //Sujon selects Be Yourself from trending topics
    public void beYourself(){
        androidScrollToAnElementByText(textSituation);
    }
    //Sujon enters the image container and start sliding
    public void imageSlide(){
        button.get(3).click();
        button.get(3).click();
        button.get(3).click();
    }
}
