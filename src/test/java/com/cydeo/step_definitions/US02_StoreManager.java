package com.cydeo.step_definitions;

import com.cydeo.pages.VyTrackLogin_page;
import com.cydeo.pages.VyTrackStoreManager_title_page;
import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.eo.Se;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US02_StoreManager {
    WebDriverWait w1 = new WebDriverWait(Driver.getDriver(),2);
    Actions a1 = new Actions(Driver.getDriver());
    VyTrackLogin_page p1 = new VyTrackLogin_page();

    VyTrackStoreManager_title_page p2 = new VyTrackStoreManager_title_page();

    @Given("user enters login information as a Store Manager")
    public void user_enters_login_information_as_a_store_manager() {

        p1.Login(ConfigurationReader.getProperties("SalesManager1"),ConfigurationReader.getProperties("pssw"));
    }
    @When("user navigates to Fleet module as a Store Manager")
    public void user_navigates_to_fleet_module_as_a_store_manager() {
        WebDriverWait w1 = new WebDriverWait(Driver.getDriver(),3);
        w1.until(ExpectedConditions.invisibilityOf(p1.loading));

        w1.until(ExpectedConditions.visibilityOf(p2.fleet));
        a1.moveToElement(p2.fleet).perform();


    }
    @When("user clicks on Vehicles")
    public void user_clicks_on_vehicles() {
        p2.vehicle.click();

    }
    @When("user clicks on create a car")
    public void user_clicks_on_create_a_car() {
        p2.create_car.click();

    }
    @When("user clicks on a cancel")
    public void user_clicks_on_a_cancel() {
        w1.until(ExpectedConditions.visibilityOf(p2.cancel));
        p2.cancel.click();

    }
    @Then("user is on create-a-car page")
    public void user_is_on_create_a_car_page() {
        String expected="Create Car - Entities - System - Car - Entities - System";
        String actual = Driver.getDriver().getTitle();
        Assert.assertEquals("Assertion-1= Failed",expected,actual);

    }

    //////////////////////////////////////////////////////////////
    @When("user creates a car with Vehicle module and make")
    public void user_creates_a_car_with_vehicle_module_and_make() throws InterruptedException {

        p2.licencePlate.sendKeys("234ER56");
        p2.tags_senior.click();
        p2.driver.sendKeys("John Wick");
        p2.location.sendKeys("New York");
        p2.chassis.sendKeys("5");
        p2.model_year.sendKeys("1962");
        p2.last_odometer.sendKeys("1000000");
        a1.moveToElement(p2.immatriculation).click().perform();
        p2.calendarToday.click();
        a1.moveToElement(p2.firstContactDate).click().perform();
        p2.calendarToday.click();

        p2.catalogValue.sendKeys("140000");
        p2.seatsNumber.sendKeys("7");
        p2.doorNumber.sendKeys("4");
        p2.color.sendKeys("red");
        p2.transmission.click();
        p2.manual.click();
        p2.fuelType.click();
        p2.gasoline.click();

        p2.emission.sendKeys("Clean-idle");
        p2.horsePower.sendKeys("700");
        p2.horsePowerTaxation.sendKeys("300");
        p2.power.sendKeys("1300");

        p2.VModelButton.click();
        p2.ModelAssigned.click();
        p2.selectButton.click();

        p2.VMakeButton.click();
        p2.MakeAssigned.click();
        p2.selectButton.click();
        a1.moveToElement(p2.SaveAndCloseButton).perform();
        p2.SaveAndCloseButton.click();
        Thread.sleep(2000);


//        p2.manageFilter.click();
//
//        p2.licencePlateBox.click();
//
//        p2.filterAll.click();
//
//        p2.filterBox.sendKeys("234ER56");
//
//        p2.update.click();



    }
    @When("user clicks on Create car")
    public void user_clicks_on_create_car() {


    }
    @Then("user is on all-cars page where new car is listed")
    public void user_is_on_all_cars_page_where_new_car_is_listed() {


    }
    ///////////////////////////////////////////////////////////
    @Given("user clicks on created car")
    public void user_clicks_on_created_car() {


    }
    @When("user clicks on edit")
    public void user_clicks_on_edit() {


    }
    @When("user is taken to car preferences where user edits the car parameters")
    public void user_is_taken_to_car_preferences_where_user_edits_the_car_parameters() {


    }
    @When("user clicks on save-and-close")
    public void user_clicks_on_save_and_close() {


    }
    @Then("user should see msg:Entity saved")
    public void userShouldSeeMsgEntitySaved() {

    }
    ///////////////////////////////////////////////////////////

    @When("user clicks on delete car")
    public void user_clicks_on_delete_car() {


    }
    @When("pop up will display {int} options")
    public void pop_up_will_display_options(Integer int1) {


    }
    @When("user click on Yes, delete")
    public void user_click_on_yes_delete() {


    }
    @Then("car is deleted and is no longer on the list of all cars")
    public void car_is_deleted_and_is_no_longer_on_the_list_of_all_cars() {


    }


}
