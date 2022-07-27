@Smoke
Feature: Login as a Truck Driver to access vehicles
  Scenario: Login, navigate to Fleet, select vehicles, click on any car, add event, reset settings.


    Given user enters login information
    When user clicks on Login button
    Then user navigates to Fleet module
    Then user can access Vehicles under Fleet module

    Given user clicks on a car
    When user clicks on add event
    When user enter event information and clicks on Save button
    Then user is able to see new event added

