package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackTruckCarDetails_page extends VyTrackLogin_page{

    @FindBy (xpath = "//a[@title='Add an event to this record']")
    public WebElement addEvent;

    @FindBy (name = "oro_calendar_event_form[title]")
    public WebElement title;

    @FindBy (xpath = "//iframe")
    public WebElement frame;

    @FindBy (id = "tinymce")
    public WebElement description;

    @FindBy (xpath = "//button[@type='submit']")
    public WebElement submit;

    @FindBy (xpath = "//button[.='Cancel']")
    public WebElement cancel;

    @FindBy (xpath = "(//div[@class='message-item message']//strong)[1]")
    public WebElement eventElement;

}
