package pageObject;

import driver.PageDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Demo {
    public Demo(){
        PageFactory.initElements(PageDriver.getCurrentDriver(),this);
    }

    /***********
     * Locators
     */
    @FindBy(className = "android.widget.Button")
    List<WebElement> skipButton;
    public void firstSkip(){

       skipButton.get(1).click();
    }
    public void secondSkip(){
        skipButton.get(0).click();
    }
    public void thirdSkip(){
        skipButton.get(0).click();
    }
}
