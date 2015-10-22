package com.nisum.steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
/**
 * Created by koke on 21/10/2015.
 */
public class StepDefinition {
    public static WebDriver driver;

    @Before()
    public void open_firefox(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }

    @After()
    public void closeBrowser(){
        driver.quit();
    }
}
