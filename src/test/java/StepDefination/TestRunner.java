package StepDefination;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features/Test.feature",glue = {"StepDefination"} ,plugin= {"html:target/cucumber.html", "json:target/cucumber.json"}
,monochrome=true)
public class TestRunner {

}

