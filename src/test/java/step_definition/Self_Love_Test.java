package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Home;

public class Self_Love_Test {
    Home homePage=new Home();
    String textMotive ="Motivational Quotes";
    String textSelfLove="Self-Love";
    String textNature="Nature";
    String liveLife="Live your life";
    String textImgQuotes ="Nothing Better....";
    String likebtn = "Like";
    String savebtn="Save";
    String dload ="Download";
    @Given("^Sultan on home page after opening \"([^\"]*)\" mobile application$")
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
        if (text.equals(textSelfLove)) {
            homePage.selectSelfLove();
        }    }

    //select nature
//    @And("^Sultan enter self-love and select \"([^\"]*)\" image quotes from Self Love category$")
//    public void findNature(String text) throws InterruptedException{
//       Thread.sleep(10000);
//        if(text.equals(liveLife)) {
//            homePage.exploreSelfLove();
//        }
//
//    }
//    @Then("^Sultan click \"([^\"]*)\"$")
//    public void findQuotes(String text) throws InterruptedException{
//        Thread.sleep(3000);
//        if (text.equals(textImgQuotes)){
//            homePage.downLoadSelfLuvImg();
//        }
//    }
}
