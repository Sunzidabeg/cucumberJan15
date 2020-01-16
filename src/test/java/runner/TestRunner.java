package runner;




import cucumber.api.CucumberOptions;

import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)

@CucumberOptions(features = {"C:\\Users\\Sunzida\\IdeaProjects\\Cucu\\src\\test\\java\\feature\\search.feature"} ,
        format = {"pretty","json:reporting/cucumber.json","html:reporting/cucumber-pretty","junit:reporting/junit_xml/cucumber.xml"},
        glue = "steps",
        strict = false,
        monochrome = true,
        //tags = {"@search"}, //@SmokeTest, @FunctionalTest, @DocString
        dryRun =false)
public class TestRunner {
}
