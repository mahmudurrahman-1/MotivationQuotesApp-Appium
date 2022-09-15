package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Home;

public class Self_Love_Test {

    /**************
     * Instances
     */
    Home homePage = new Home();
    String textMotive = "Motivational Quotes";
    String textSelfLove = "Self-Love";
    String textNature = "Nature";
    String liveLife = "Live your life";
    String textImgQuotes = "Nothing Better....";
    String likebtn = "Like";
    String savebtn = "Save";
    String dload = "Download";

    /******************
     * Test steps
     * @param text
     * @throws InterruptedException
     */
    //Opens app
    @Given("^Sultan on home page after opening \"([^\"]*)\" mobile application$")
    public void openHomePage(String text) throws InterruptedException {
        if (text.equals(textMotive)) {
            homePage.firstSkip();
            homePage.secondSkip();
            Thread.sleep(1000);
        }
    }

    //selects selflove
    @When("^Sultan select \"([^\"]*)\" from top list from home page$")
    public void gotoSelfLuv(String text) {
        if (text.equals(textSelfLove)) {
            homePage.selectSelfLove();
        }
    }

    //select quotes by name
    @And("^Sultan enter self-love and select \"([^\"]*)\" image quotes from Self Love category$")
    public void findQuotes(String text) throws InterruptedException {

        if (text.equals(liveLife)) {
            homePage.exploreSelfLove();
        }

    }

    //download images
    @Then("^Sultan click \"([^\"]*)\"$")
    public void downloadQuotes(String text) throws InterruptedException {
        Thread.sleep(3000);
        if (text.equals(textImgQuotes)) {
            homePage.downLoadSelfLuvImg();
        }
    }
}
