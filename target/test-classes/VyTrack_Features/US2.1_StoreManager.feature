@smoke
Feature: Create a vehicle as a store manager
@S2.1
  Scenario: user should be able to: click on create a car, click on cancel a car
    Given user enters login information as a Store Manager
    When user navigates to Fleet module as a Store Manager
    And user clicks on Vehicles
    And user clicks on create a car
    And user clicks on a cancel
    Then user is on create-a-car page

@S2.2
  Scenario: user should be able to: create a car, add Vehicle module, add Vehicle make, save and close
    Given user enters login information as a Store Manager
    When user navigates to Fleet module as a Store Manager
    And user clicks on Vehicles
    And user clicks on create a car
    When user creates a car with Vehicle module and make
    Then user navigates to Fleet module as a Store Manager
    And user clicks on Vehicles
    Then user is on all-cars page where new car is listed


@S2.3
  Scenario: user should be able to: edit a car
    Given user clicks on created car
    When user clicks on edit
    And user is taken to car preferences where user edits the car parameters
    And user clicks on save-and-close
    Then user should see msg:Entity saved


@S2.4
  Scenario: user should be able to: delete a car
    Given user clicks on created car
    When user clicks on delete car
    When pop up will display 2 options
    And user click on Yes, delete
    Then car is deleted and is no longer on the list of all cars
