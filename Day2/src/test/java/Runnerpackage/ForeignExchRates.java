package Runnerpackage;

import static org.junit.Assert.assertEquals;

import org.hamcrest.core.Is;
import org.junit.Assert;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.equalTo;
import static io.restassured.RestAssured.get;

import static org.hamcrest.Matchers.*;


import cucumber.api.Scenario;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

public class ForeignExchRates {
	String responseBody;
	String baseuri="https://api.ratesapi.io";
	RequestSpecification requestspec;
	Response response;
	String uri="https://api.ratesapi.io/api/2010-01-12";
	Scenario scn;	
//	//--------------------------Test1---------------------------------------

	@Given("^user has the API for foreign exchange rates website$")
	public void user_has_the_API_for_foreign_exchange_rates_website() throws Throwable {
		Response response= RestAssured.given().get(); 	

	}

	@When("^user enters the API$")
	public void user_enters_the_API() throws Throwable {
		response=RestAssured.when().get("https://exchangeratesapi.io/");
		  System.out.println("Response is:"+ response.asString());
	}

	@Then("^user will be able to see status code as (\\d+)$")
	public void user_will_be_able_to_see_status_code_as(int arg1) throws Throwable {
		 int code=response.getStatusCode();
		   Assert.assertEquals(code, 200);
	}
	
	//--------------------------Test2---------------------------------------
	
	@Given("^: user has rates API for foreign exchange rates$")
	public void user_has_rates_API_for_foreign_exchange_rates() throws Exception {
		requestspec= RestAssured.given();

	}
	
	@When("^: user enters the particular API$")
	public void user_enters_the_particular_API() throws Exception {
		response=RestAssured.when().get("https://api.ratesapi.io/api/latest");

	}

	@Then("^: user will able to see the success status of the response$")
	public void user_will_able_to_see_the_success_status_of_the_response() throws Exception {
				
		 String status= response.getBody().asString();
		  
		  Assert.assertTrue(status.contains("GBP") && status.contains("0.90675"));
		
	}
	
//	//----------------------------Test3-----------------------------------

	@Given("^: User possesses API for foreign exchange rates website$")
	public void user_possesses_API_for_foreign_exchange_rates_website() throws Exception {
	    Response res=RestAssured.given().get();

	}

	@When("^: user enters an incorrect or incomplete API$")
	public void user_enters_an_incorrect_or_incomplete_API() throws Exception {
		response=RestAssured.when().get(" https://api.ratesapi.io/api/");
	}

	@Then("^: user will now see an invaild status of the response$")
	public void user_will_now_see_an_invaild_status_of_the_response() throws Exception {

			 int code=response.getStatusCode();
		   Assert.assertEquals(code, 400);
	}
	
//	//----------------------------Test4-----------------------------------

	@Given("^: user will have the API for a specific date foreign exchange rates$")
	public void user_will_have_the_API_for_a_specific_date_foreign_exchange_rates() throws Exception {
		Response res=RestAssured.given().get();

	}

	@When("^: user enters that API$")
	public void user_enters_that_API() throws Exception {
		response=RestAssured.when()
				.get(" https://api.ratesapi.io/api/2010-01-12");
	}

	@Then("^: user can able to see success status of response$")
	public void user_can_able_to_see_success_status_of_response() throws Exception {
		int httpstatus= response.getStatusCode();
		Assert.assertEquals(httpstatus, 200);
			
	}

//	//----------------------------Test5-----------------------------------

	@Given("^: user has the API with a specific date foreign exchange rates$")
	public void user_has_the_API_with_a_specific_date_foreign_exchange_rates() throws Exception {
		Response res=RestAssured.given().get();

	}
	
	@When("^: user enters the specific API$")
	public void user_enters_the_specific_API() throws Exception {
		response=RestAssured.when()
				.get("https://api.ratesapi.io/api/2010-01-12");
	}
	
	@Then("^: user can able to see valid response$")
	public void user_can_able_to_see_valid_response() throws Exception {
		  String status= response.getBody().asString();
		  
		  Assert.assertTrue(status.contains("AUD"));
	}

//	//----------------------------Test6-----------------------------------

	@Given("^: user has an API for foreign exchange rates$")
	public void user_has_an_API_for_foreign_exchange_rates() throws Exception {
		Response res=RestAssured.given().get();

	}

	@When("^: user enters API with some future date$")
	public void user_enters_API_with_some_future_date() throws Exception {
		response=RestAssured.get("https://api.ratesapi.io/api/2020-11-12");
	}

	@Then("^: user can able to see response$")
	public void user_can_able_to_see_response() throws Exception {
		
		System.out.println(response.getBody().asString());
		Assert.assertEquals(response.getStatusCode(),200);
		
	}
	
}


