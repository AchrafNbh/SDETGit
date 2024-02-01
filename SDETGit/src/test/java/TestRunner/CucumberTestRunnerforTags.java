package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags="@smoke and @regression or @perf",
features= {"src/test/resources/FeaturesWithTags"},
glue= {"StepDefinition"},
plugin= {"pretty", "html:target/htmlreport.html"})


public class CucumberTestRunnerforTags extends AbstractTestNGCucumberTests {

}
