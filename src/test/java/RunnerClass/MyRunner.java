package RunnerClass;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
                  
       @CucumberOptions(
                        features="src/test/resources/features/Search.feature",
                        glue="stepdefinations",
                        plugin= {"pretty","html:target/CucumberReport.html"}
                       )


public class MyRunner {
	
	
}
