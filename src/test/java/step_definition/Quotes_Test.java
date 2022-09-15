package step_definition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import pageObject.Home;
import pageObject.Quotes;

public class Quotes_Test {
    /******************
     * All the instances
     */
    Home homepage =new Home();
   Quotes quotespage = new Quotes();
    String btn1 = "START BREATHING EXERCISE";

    /*****************
     * Test Steps
     * @throws InterruptedException
     */
    //open app
    @Given("^Sujon opens the app and select Quotes$")
    public void test_step_1() throws InterruptedException{
        homepage.firstSkip();
        homepage.secondSkip();
        Thread.sleep(2000);
        quotespage.openAppQuotes();
    }
    // click the SBE button
    @And("^Sujon clicks on \"([^\"]*)\"$")
    public void test_step_2(String text) throws InterruptedException{

        if(text.equals(btn1)) {
            quotespage.SBE();
        }

    }
    //after exercise is done close it
    @And("^Sujon start exercising and close it$")
    public void test_step_3(){
          quotespage.exercise();
    }
    // find images quotes
    @And("^Sujon goes to first image$")
    public void test_step_4(){

            quotespage.beYourself();

    }
    // slide after images
    @And("^Sujon enters and he goes to next image$")
    public void test_step_5() throws InterruptedException{
        Thread.sleep(10000);
        quotespage.imageSlideafter();

    }
    // slide before images
    @And("^Sujon slides 1 times before image$")
    public void test_step_6() throws InterruptedException{
        Thread.sleep(2000);
        quotespage.imageSlidebefore();

    }
}
