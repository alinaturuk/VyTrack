package com.cydeo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VyTrackTruckCar_page extends VyTrackLogin_page{

    @FindBy (xpath = "//tr[@class='grid-row row-click-action'][1]")
    public WebElement car;


}
