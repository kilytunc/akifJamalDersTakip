package com.vytrack.runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(                                             // there has to be coma between the options
        plugin = {"json:target/cucumber.json",
        "html:target/default-html-reports"   ,                // this line is for reports
        "rerun:target/rerun.txt"
        },

        features = "src/test/resources/features",       // no semicoma after them THEY ARE NOT CODE !!!!
        glue = "com/vytrack/step_definitions",
        dryRun = false,
        tags = "@wip"
)
public class CukesRunner {
}


