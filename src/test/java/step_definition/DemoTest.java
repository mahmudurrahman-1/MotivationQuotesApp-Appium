package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObject.Home;

public class DemoTest {
    Home homePage=new Home();
    String textMotive ="Motivational Quotes";
    String textExplore="Explore";
    String textNature="Nature";

    @Given("^Sultan on home page after opening \"([^\"]*)\" mobile app$")
    public void OpenHomePage(String text) throws InterruptedException{
        if(text.equals(textMotive)) {
            homePage.firstSkip();
            homePage.secondSkip();
            Thread.sleep(1000);
        }
    }

    //selects explore
    @When("^Sultan click \"([^\"]*)\" from top list from home page$")
    public void GotoExplore(String text){
        if (text.equals(textExplore)) {
            homePage.selectExplore();
        }    }

   //select nature
    @And("^Sultan click to \"([^\"]*)\" from categories$")
    public void findNature(String text) throws InterruptedException{
        Thread.sleep(3000);
        if(text.equals(textNature)) {
            homePage.exploreNatures();
        }
    }
}
