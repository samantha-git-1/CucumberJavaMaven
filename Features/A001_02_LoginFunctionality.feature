# Author: Samantha Lee
# Created / Updated: 8-31-2022 / 
# Description: Feature to validate login functionalities

Feature: Test user sign on functionalities

  Scenario: Validate login is successful with valid credentials
    Given browser is open
    And user is on login page
    When user enters Username and Password
    And clicks on Login button
    Then user is navigated to the landing page
    
  Example 
  