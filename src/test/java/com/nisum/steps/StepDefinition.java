package com.nisum.steps;

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
    public WebDriver driver ;
    @Given("^open firefox$")
    public void open_firefox(){
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
    }
    @Given("^open ie$")
    public void open_ie(){
        System.setProperty("webdriver.ie.driver", "src/test/resources/IEDriverServer.exe");
        driver = new InternetExplorerDriver();
        driver.manage().window().maximize();
    }
    @And("^browse google$")
    public void browse_google(){
        driver.get("http://www.google.cl");
    }
    @When("^I enter the keyword$")
    public void I_enter_the_keyword(){

        WebElement searchBox = driver.findElement(By.xpath(".//*[@id='lst-ib']"));
        WebElement searchBtn = driver.findElement(By.xpath(".//*[@id='sblsbb']/button"));
        searchBox.clear();
        searchBox.sendKeys("Jorge");
        searchBtn.click();

    }
    @And("^take first website from the result$")
    public void take_first_website_from_the_result() throws InterruptedException{
        Thread.sleep(3000);
        WebElement firstResult = driver.findElement(By.linkText("Jorge - Wikipedia, la enciclopedia libre"));
        firstResult.click();

    }
    @Then("^I should be my desired page$")
    public void I_should_be_my_desired_page(){
        System.out.println("Page Title should contain Jorge : " + driver.getTitle().contains("Jorge"));
        driver.quit();
    }
}
