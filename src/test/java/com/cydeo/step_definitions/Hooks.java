package com.cydeo.step_definitions;

import com.cydeo.utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {
    @Before
    public void setupScenario(){

    }

    @After
    public void teardownScenario(Scenario scenarioScreenShot){

        if(scenarioScreenShot.isFailed()){
            byte [] screenshot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenarioScreenShot.attach(screenshot,"image/jpeg",scenarioScreenShot.getName());
        }



        Driver.closeDriver();
    }
}
