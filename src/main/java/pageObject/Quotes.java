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
    List<WebElement> close;
    String textLove ="Searching for love is an endless journey. The love you seek is already endless inside you.";
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

        androidScrollToAnElementByText(btn1);
       quotesTqo.get(0).click();
    }
    //Sujon enter SBE and waits for some time then close it
     public void exercise(){
        close.get(12).click();
     }
}
