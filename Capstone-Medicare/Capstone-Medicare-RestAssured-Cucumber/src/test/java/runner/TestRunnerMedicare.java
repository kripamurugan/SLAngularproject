package runner;


import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\user\\seleniumDemo\\Capstone-Medicare-RestAssured\\src\\test\\java\\features\\Medicare.feature",
				glue= {"steps"},
				plugin= {"html:target/CucumberCapstone-Medicare.html",
						"pretty",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
						"timeline:test-output-thread/"		
})

public class TestRunnerMedicare {

}
