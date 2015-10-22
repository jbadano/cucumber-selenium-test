package com.nisum.steps;

import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


/**
 * Created by jbadano on 21-10-2015.
 */
public class ResultPageSteps {



    @Given("^A logged user with username \"([^\"]*)\" and password \"([^\"]*)\"$")
    public void A_logged_user_with_username_and_password(String user, String password) throws Throwable {
        StepDefinition.driver.get("http://localhost:8080/#/");
        Thread.sleep(3000);
        StepDefinition.driver.findElement(By.cssSelector("a.dropdown-toggle > span")).click();
        StepDefinition.driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[2]/ul/li/a/span[2]")).click();
        Thread.sleep(3000);
        StepDefinition.driver.findElement(By.id("username")).clear();
        StepDefinition.driver.findElement(By.id("username")).sendKeys(user);
        StepDefinition.driver.findElement(By.id("password")).clear();
        StepDefinition.driver.findElement(By.id("password")).sendKeys(password);
        StepDefinition.driver.findElement(By.cssSelector("button.btn.btn-primary")).click();
        Thread.sleep(3000);
    }

    @When("^I enter into the results$")
    public void I_enter_into_the_results() throws Throwable {
        StepDefinition.driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/a/span[2]")).click();
        Thread.sleep(3000);
    }

    @Then("^Should be display the Results$")
    public void Should_be_display_the_Results() throws Throwable {
        assertThat(StepDefinition.driver.getTitle(), is("Results"));
    }

    @Given("^A user into the results page$")
    public void A_user_into_the_results_page() throws Throwable {
        StepDefinition.driver.get("http://localhost:8080/#/");
        StepDefinition.driver.findElement(By.xpath("//div[@id='navbar-collapse']/ul/li[3]/a/span[2]")).click();
        Thread.sleep(3000);
    }

    @When("^I click in the \"([^\"]*)\" link$")
    public void I_click_in_the_link(String linkName) throws Throwable {
        switch (linkName){
            case "Before And After":
                StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[1]/ul[1]/li/a")).click();
                break;
            case "Best Couple":
                StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[1]/ul[2]/li/a")).click();
                break;
            case "Best Fellow":
                StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[1]/ul[3]/li/a")).click();
                break;
            case "Best Pretender":
                StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[1]/ul[4]/li/a")).click();
                break;
            case "Fancy dress":
                StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[1]/ul[5]/li/a")).click();
                break;
            case "Look Alike":
                StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[1]/ul[6]/li/a")).click();
                break;
            case "The Most Beautiful":
                StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[1]/ul[7]/li/a")).click();
                break;
            case "Ugly King":
                StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[1]/ul[8]/li/a")).click();
                break;

        }
        Thread.sleep(3000);
    }

    @Then("^Should display the first category winner name \"([^\"]*)\"")
    public void Should_display_first_winner_name(String winnerName) throws Throwable {
        assertThat(StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/h4")).getText(),is(winnerName));
    }
    @Then("^Should display the second category winner name \"([^\"]*)\"")
    public void Should_display_second_winner_name(String winnerName) throws Throwable {
        assertThat(StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/h4")).getText(),is(winnerName));
    }
    @Then("^Should display the third category winner name \"([^\"]*)\"")
    public void Should_display_third_winner_name(String winnerName) throws Throwable {
        assertThat(StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/h4")).getText(),is(winnerName));
    }
    @Then("^Should display the fourth category winner name \"([^\"]*)\"")
    public void Should_display_fourth_winner_name(String winnerName) throws Throwable {
        assertThat(StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[2]")).getText(),is(winnerName));
    }
    @Then("^Should display the fifth category winner name \"([^\"]*)\"")
    public void Should_display_fifth_winner_name(String winnerName) throws Throwable {
        assertThat(StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/h4")).getText(),is(winnerName));
    }
    @Then("^Should display the sixth category winner name \"([^\"]*)\"")
    public void Should_display_sixth_winner_name(String winnerName) throws Throwable {
        assertThat(StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div[1]/div/div[1]/h4")).getText(),is(winnerName));
    }
    @Then("^Should display the seventh category winner name \"([^\"]*)\"")
    public void Should_display_seventh_winner_name(String winnerName) throws Throwable {
        assertThat(StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[2]/div[2]/div/div/div[1]/h4")).getText(),is(winnerName));
    }
    @Then("^Should display the eighth category winner name \"([^\"]*)\"")
    public void Should_display_eighth_winner_name(String winnerName) throws Throwable {
        assertThat(StepDefinition.driver.findElement(By.xpath("/html/body/div[3]/div[1]/div/div[2]/div/div[2]")).getText(),is(winnerName));
    }




}
