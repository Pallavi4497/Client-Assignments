package Runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\resources\\ForeignExcRates.feature"
		, glue={"Runnerpackage"} 
		
		 )

public class testRunner {

}
