Feature: User should be able to search senior citizen on home page

  @smoke
  Scenario: Check user is able to search senior on homepage
    Given user is on login page
    When user enters username
    And user enters password
    And clicks on login button
    And user search senior in searchbar
    Then it should show search result
