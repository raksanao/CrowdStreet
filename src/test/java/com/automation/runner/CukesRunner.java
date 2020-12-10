package com.automation.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {//"html:target/default-cucumber-reports",
                "rerun:target/rerun.txt",
                "json:target/cucumber.json"
        },

        features = "src/test/resources/features",
        glue = "com/automation/step_definitions",
        dryRun = false,
        tags = "@signUp"


)



public class CukesRunner {

}
