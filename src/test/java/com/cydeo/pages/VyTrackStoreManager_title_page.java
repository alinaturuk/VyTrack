package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackStoreManager_title_page extends VyTrackLogin_page{

    @FindBy (xpath = "(//li[@class='dropdown dropdown-level-1'])[1]")
    public WebElement fleet;

    @FindBy (xpath = "(//li[@class='dropdown-menu-single-item first'])[2]")
    public WebElement vehicle;

    @FindBy (xpath = "//a[@title='Create Car']")
    public WebElement create_car;

    @FindBy (xpath = "//div[@class='pull-right title-buttons-container']//a[@data-action='cancel']")
    public WebElement cancel;

    @FindBy (name = "custom_entity_type[LicensePlate]")
    public WebElement licencePlate;

    @FindBy (xpath = "//input[@value='senior']")
    public WebElement tags_senior;

    @FindBy (xpath = "//input[@data-name='field__driver']")
    public WebElement driver;

    @FindBy (xpath = "//input[@data-name='field__location']")
    public WebElement location;

    @FindBy (xpath = "//input[@data-name='field__chassis-number']")
    public WebElement chassis;

    @FindBy (xpath = "//input[@data-name='field__model-year']")
    public WebElement model_year;

    @FindBy (xpath = "//input[@data-name='field__last-odometer']")
    public WebElement last_odometer;


    @FindBy (xpath = "//button[.='Today']")
    public WebElement calendarToday;

    @FindBy (xpath = "(//input[@placeholder='Choose a date'])[1]")
    public WebElement immatriculation;

    @FindBy (xpath = "(//input[@placeholder='Choose a date'])[2]")
    public WebElement firstContactDate;

    @FindBy (xpath = "//input[@data-name='field__catalog-value']")
    public WebElement catalogValue;

    @FindBy (xpath = "//input[@data-name='field__seats-number']")
    public WebElement seatsNumber;

    @FindBy (xpath = "//input[@data-name='field__doors-number']")
    public WebElement doorNumber;


    @FindBy (xpath = "//input[@data-name='field__color']")
    public WebElement color;

    @FindBy (xpath = "(//a[@class='select2-choice select2-default']/span[.='Choose a value...'])[1]")
    public WebElement transmission;

    @FindBy (xpath = "//div[.='Manual']")
    public WebElement manual;

    @FindBy (xpath = "//div[.='Gasoline']")
    public WebElement gasoline;

    @FindBy (xpath = "//a[@class='select2-choice select2-default']/span[.='Choose a value...']")
    public WebElement fuelType;

    @FindBy (xpath = "//input[@data-name='field__c-o2-emissions']")
    public WebElement emission;

    @FindBy (xpath = "//input[@data-name='field__horsepower']")
    public WebElement horsePower;

    @FindBy (xpath = "//input[@data-name='field__horsepower-taxation']")
    public WebElement horsePowerTaxation;

    @FindBy (xpath = "//input[@data-name='field__power']")
    public WebElement power;

    @FindBy (xpath = "(//button[@class='btn btn-medium add-btn'])[1]")
    public WebElement VModelButton;

    @FindBy (xpath = "(//button[@class='btn btn-medium add-btn'])[2]")
    public WebElement VMakeButton;

    @FindBy (xpath = "(//tbody[@class='grid-body']/tr/td/input)[1]")
    public WebElement MakeAssigned;

    @FindBy (xpath = "//button[@data-action-name='select']")
    public WebElement selectButton;

    @FindBy (xpath = "(//tr[@class='grid-row']/td/input)[1]")
    public WebElement ModelAssigned;

    @FindBy (xpath = "//div[@class='pull-right pinned-dropdown']/div[@class='btn-group pull-right']/button")
    public WebElement SaveAndCloseButton;

    @FindBy (xpath = "//div[@class='btn-group pull-right']//a[@data-toggle='dropdown']")
    public WebElement saveAndCloseDropdown;

    @FindBy (xpath = "(//ul[@class='dropdown-menu']/li/button[@type='submit'])[1]")
    public WebElement saveSelection;

    @FindBy (xpath = "//a[@class='add-filter-button']")
    public WebElement manageFilter;

    @FindBy (xpath = "//input[@value='LicensePlate']")
    public WebElement licencePlateBox;

    @FindBy (xpath = "//div[@class='btn filter-criteria-selector oro-drop-opener oro-dropdown-toggle filter-default-value']")
    public WebElement filterAll;

    @FindBy (xpath = "//input[@name='value']")
    public WebElement filterBox;

    @FindBy (xpath = "//button[@class='btn btn-primary filter-update']")
    public WebElement update;



















}
