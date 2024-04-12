@tag
Feature: As a Amazon user I should be able to login and logout with valid credentials

  @tag1
  Scenario: Check homepage
    Given user in home page 
    When user clicks on signin
    Then user enters details and continue
    And user in cart page 
    And user in products page 
    Then user search macbook pro
    And user add available item
    Then user goto cart page 
    And user click checkout
    Then user click account
  
  

