Feature: Login with Valid Credentials

  Background: repeat the steps
    Given browser is open
    And User is on Search Page

  @sanity
  Scenario: Validate google search is working
    When User enters a text in a search box
    And hits enter
    Then User is navigate to search results
    
     @sanity
  Scenario: Validate google search is working with selenium text 
    When User enters "sachin tendulkar" text in a search box
    And hits enter
    