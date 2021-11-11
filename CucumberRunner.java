package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features = "src/test/java/features", 
                 glue = "steps", 
                 monochrome = true,
                 publish = true
                 //tags = "@smoke",
                 //tags = "not@regression" //except regression all other cases are executed
                 //tags = "@functional or @smoke"
                 )
public class CucumberRunner extends AbstractTestNGCucumberTests {

}