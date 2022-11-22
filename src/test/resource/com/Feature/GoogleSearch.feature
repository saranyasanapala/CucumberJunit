
Feature: Feature to test google search page functinality
 Scenario: Validate google search is working
    Given browser is open
    When user is on google search page
    When user enters text in the searchBox
    And hit enter
    Then user is navigates to search results
   

  