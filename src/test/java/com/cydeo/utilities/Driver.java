package com.cydeo.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class Driver {
    private Driver(){}


    //2. Create static private driver instance to close access and to use with static method
    //private static WebDriver driver;
    private static InheritableThreadLocal<WebDriver> driverPool = new InheritableThreadLocal<>();

    //3. Create getter method to access driver. IF condition to check if driver is null, then to set up browser inside if statement. If driver already created, return same driver.
    public static WebDriver getDriver(){

        if(driverPool.get()==null){
            String browserType = ConfigurationReader.getProperties("browser");
            switch (browserType){
                case"chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
                case"firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
                case"edge":
                    WebDriverManager.edgedriver().setup();
                    driverPool.set(new EdgeDriver());
                    driverPool.get().manage().window().maximize();
                    driverPool.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

            }
        }
        return driverPool.get();
    }

    public static void quitDriver(){
        if(driverPool.get()!=null){
            driverPool.get().quit();
            driverPool.remove();

        }
    }
    public static void closeDriver(){
        if(driverPool.get()!=null){
            driverPool.get().close();
            driverPool.remove();

        }
    }
}
