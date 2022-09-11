package step_definition;

import driver.BaseDriver;
import driver.PageDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Driver extends BaseDriver {
    @Before
    public void browserInit(){
        driver=setup();
    }
    @After
    public void tearDown(){
        PageDriver.getCurrentDriver().quit();
    }

}
