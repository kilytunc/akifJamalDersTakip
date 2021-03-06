package com.vytrack.step_definitions;

import com.vytrack.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setUp(){
        System.out.println("\t this is coming from BEFORE");
    }

    @After
    public void tearDown(Scenario scenario){
       // System.out.println("\t this is coming from AFTER");          //   first class action
        if(scenario.isFailed()){
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot,"image/png","screenshot");
        }

        Driver.closeDriver();
    }

    @Before ("@database")
    public void setUpForDatabase(){
        System.out.println("\t this is coming from BEFORE DATABASE ++++++++");
    }

    @After("@database")
    public void tearDownForDatabase(){
        System.out.println("\t this is coming from AFTER  DATABASE --------");
    }





}
