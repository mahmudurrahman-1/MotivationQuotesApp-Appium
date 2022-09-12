package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Home;

public class Self_Love_Test {
    Home homePage=new Home();
    String textMotive ="Motivational Quotes";
    String textExplore="Explore";
    String textNature="Nature";
    String textImgQuotes ="Nothing Better....";
    String likebtn = "Like";
    String savebtn="Save";
    String dload ="Download";
    @Given("^Sultan on home page after opening \"([^\"]*)\" app$")
    public void OpenHomePage(String text) throws InterruptedException{
        if(text.equals(textMotive)) {
            homePage.firstSkip();
            homePage.secondSkip();
            Thread.sleep(1000);
        }
    }

    //selects explore
    @When("^Sultan select \"([^\"]*)\" from top list from home page$")
    public void GotoExplore(String text){
        if (text.equals(textExplore)) {
            homePage.selectExplore();
        }    }

    //select nature
    @And("^Sultan enter self-love and select \"([^\"]*)\" image quotes from Self Love category$")
    public void findNature(String text) throws InterruptedException{
        Thread.sleep(3000);
        if(text.equals(textNature)) {
            homePage.exploreNatures();
        }

    }
    @Then("^Sultan click \"([^\"]*)\"$")
    public void findQuotes(String text) throws InterruptedException{
        Thread.sleep(3000);
        if (text.equals(textImgQuotes)){
            homePage.findNothingQuotes();
        }
    }
}
