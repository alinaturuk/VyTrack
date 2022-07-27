package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackTruckDriverUser_page extends VyTrackLogin_page{

    @FindBy(xpath = "(//span[@class='title title-level-1'])[1]")
    public WebElement fleet;

    @FindBy (xpath = "//span[.='Vehicles']")
    public WebElement vehicles;

}
