package step_definition;

import io.cucumber.java.en.Given;
import pageObject.Demo;

public class DemoTest {
    Demo d=new Demo();

    @Given("^test$")
    public void test() throws InterruptedException{
        d.firstSkip();
        d.secondSkip();
        Thread.sleep(1000);
        d.thirdSkip();
        Thread.sleep(3000);
    }
}
