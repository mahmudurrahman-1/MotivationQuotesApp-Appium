package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pageObject.Home;
import pageObject.Menu;

public class Menubar_Test {
    /***************
     * Instances
     */
    Home homePage =new Home();
    Menu menuPage =new Menu();
    String textMom = "Mom always says...";

    /***************
     * Test steps
     */
    //opens app
    @Given("^Sujon opens the application$")
    public void test_step_1() throws InterruptedException{
        homePage.firstSkip();
        homePage.secondSkip();
        Thread.sleep(2000);
        menuPage.selectMenu();

    }
    // selects mom headline
    @And("^Sujon finds selects \"([^\"]*)\"$")
    public void test_step_2(String text){
        if (text.equals(textMom)) {
            menuPage.selectsMom();
        }
    }
    //selects second image inside mom
    @When("^Sujon selects second image$")
    public void test_step_3() throws InterruptedException{
            menuPage.selectSecondImage();
    }
    //downloads
    @Then("^Sujon downloads it$")
    public void test_step_4(){
            menuPage.download();
    }
}
