Feature: To test the Foreign Exchange rates functionality.

@Test1
  Scenario: To validate the response for foreign exchange rates
    Given user has the API for foreign exchange rates website
    When user enters the API
    Then user will be able to see status code as 200
    
  @Test2
  Scenario:  To validate response for foreign exchange rates
  
  Given : user has rates API for foreign exchange rates
  When : user enters the particular API
  Then : user will able to see the success status of the response
  
@Test3
  Scenario: To validate rates for foreign exchange rates API with incorrect url
    
  Given : User possesses API for foreign exchange rates website
  When : user enters an incorrect or incomplete API
  Then : user will now see an invaild status of the response
  
@Test4
  Scenario: To validate date rates foreign exchange rates
   
  Given : user will have the API for a specific date foreign exchange rates
  When : user enters that API
  Then : user can able to see success status of response
  
@Test5
  Scenario: To validate the rates API for foreign exchange rates
  
  Given : user has the API with a specific date foreign exchange rates
  When : user enters the specific API
  Then : user can able to see valid response
  
@Test6
  Scenario: To validate the rates API for foreign exchange rates by selecting a future date
   
  Given : user has an API for foreign exchange rates
  When : user enters API with some future date
  Then : user can able to see response 
