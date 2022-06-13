package org.example.bdd;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions (//plugin = {"pretty", "html:target/cucumber-report.html"},
        features = "classpath:feature/Regular_Card_membership",
        glue="org.example.bdd"
)
public class ShopCardrunner {
}
