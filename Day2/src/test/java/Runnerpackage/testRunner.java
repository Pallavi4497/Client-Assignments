package Runnerpackage;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= "src\\test\\resources\\ForeignExcRates.feature"
		, glue={"Runnerpackage"} 
		,plugin= {"html:src\\Reports\\Rep1.html",
				"junit: src\\Reports\\Rep2.xml",
				"json:src\\Reports\\Rep3.json"}
		
		 )

public class testRunner {

}
