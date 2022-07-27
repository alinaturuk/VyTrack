package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLogin_page;
import com.cydeo.pages.VyTrackTruckCarDetails_page;
import com.cydeo.pages.VyTrackTruckCar_page;
import com.cydeo.pages.VyTrackTruckDriverUser_page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VyTrack_US1_Login {
        VyTrackLogin_page p1 = new VyTrackLogin_page();
        VyTrackTruckDriverUser_page p2 = new VyTrackTruckDriverUser_page();
        VyTrackTruckCar_page p3 = new VyTrackTruckCar_page();
        VyTrackTruckCarDetails_page p4 = new VyTrackTruckCarDetails_page();
        WebDriverWait w1 = new WebDriverWait(Driver.getDriver(),2);
        Actions a1 = new Actions(Driver.getDriver());
    @Given("user enters login information")
    public void user_enters_login_information() {
        Driver.getDriver().get(ConfigurationReader.getProperties("env"));

        p1.username.sendKeys(ConfigurationReader.getProperties("TruckDriver1"));

        p1.password.sendKeys(ConfigurationReader.getProperties("pssw"));
    }
    @When("user clicks on Login button")
    public void user_clicks_on_login_button() {
        p1.login.click();
    }
    @Then("user navigates to Fleet module")
    public void user_navigates_to_vehicle_information_page() {
        String actual = Driver.getDriver().getTitle();
        WebDriverWait w1 = new WebDriverWait(Driver.getDriver(),3);
        w1.until(ExpectedConditions.invisibilityOf(p1.loading));
        String expected = "Dashboard";
        Assert.assertEquals("Test Failed",expected,Driver.getDriver().getTitle());
    }

    @Then("user can access Vehicles under Fleet module")
    public void userCanAccessVehiclesUnderFleetModule() {
        w1.until(ExpectedConditions.visibilityOf(p2.fleet));
        a1.moveToElement(p2.fleet).perform();
        p2.vehicles.click();

        String expected = "Car - Entities - System - Car - Entities - System";
        w1.until(ExpectedConditions.titleIs(expected));

        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals("Test failed",expected,actual);


    }

    @Given("user clicks on a car")
    public void userClicksOnACar() {
        if(p3.car.isSelected()){
            p3.car.click();
        }else{
            a1.moveToElement(p4.cancel).perform();
            p4.cancel.click();
        }
        p3.car.click();
    }

    @When("user clicks on add event")
    public void userClicksOnAddEvent() {
        p4.addEvent.click();

    }

    @When("user enter event information and clicks on Save button")
    public void userEnterEventInformationAndClicksOnSaveButton() {
        w1.until(ExpectedConditions.visibilityOf(p4.title));
        a1.moveToElement(p4.title).perform();
        p4.title.sendKeys(ConfigurationReader.getProperties("NewTruckEventUS1"));

        Driver.getDriver().switchTo().frame(p4.frame);
        p4.description.sendKeys("Car description");
        Driver.getDriver().switchTo().parentFrame();

        p4.submit.click();
          //p4.cancel.click();

    }

    @Then("user is able to see new event added")
    public void userIsAbleToSeeNewEventAdded() {
        String expected = ConfigurationReader.getProperties("NewTruckEvent");
        String actual = p4.eventElement.getAttribute("strong");
        Assert.assertEquals("Test failed",expected,actual);
    }
}
