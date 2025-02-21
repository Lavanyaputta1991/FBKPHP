
Feature: login feature
  Here we are validating the login feature Test cases
  
  

 Scenario Outline:  Validate the login funcationlity with valid username and password
   Given user is on login page
    When user enters valid username "<username>"
    When user enters valid password "<password>"
    And user clicks on submit

      Examples: 
      | username  | password |
      | Testing@gmail.com | P234222 |
      | selenium@gmail.com | P343444 | 
  