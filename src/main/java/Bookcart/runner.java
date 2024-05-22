package Bookcart;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.testng.AbstractTestNGCucumberTests;

@CucumberOptions(
        features = {"src/test/Features/login.feature"},
        dryRun = true,
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        glue="steps"
)
public class runner extends AbstractTestNGCucumberTests {

}
