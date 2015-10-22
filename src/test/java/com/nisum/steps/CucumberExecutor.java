package com.nisum.steps;

import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

/**
 * Created by koke on 21/10/2015.
 */
@RunWith(Cucumber.class)
@Cucumber.Options(format={"pretty","html:reports/test-report"},tags= "@resultPageTest", features="src/test/resources")
public class CucumberExecutor {

}
