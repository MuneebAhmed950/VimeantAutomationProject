Feature: User should be able to logout from vimeant portal.

  @smoke
  Scenario: Check Logout is successfull
    Given user is on login page
    When user enters username
    And user enters password
    And clicks on login button
    And user must wait
    And clicks on dropdown arrow on top right corner
    And user clicks on logout button
    Then user see logout message "User logged out successfully!"

