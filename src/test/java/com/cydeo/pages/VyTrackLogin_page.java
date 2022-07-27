package com.cydeo.pages;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VyTrackLogin_page {
    public VyTrackLogin_page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (name = "_username")
    public WebElement username;

    @FindBy (name = "_password")
    public WebElement password;

    @FindBy (xpath = "//button[.='Log in']")
    public WebElement login;

    @FindBy (xpath = "//h3[.='Loading...']")
    public WebElement loading;



    public void Login(String userName,String passWord){
    Driver.getDriver().get(ConfigurationReader.getProperties("env"));
    username.sendKeys(userName);
    password.sendKeys(passWord);
    login.click();
    }










}
