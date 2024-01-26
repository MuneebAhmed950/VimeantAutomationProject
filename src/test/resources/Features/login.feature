Feature: User should be able to login in vimeant portal by entering his/her credentials.

  @smoke
  Scenario: Check Login is successfull with valid credentials
    Given user is on login page
    When user enters username
    And user enters password
    And clicks on login button
    Then the user should see the message "Login Successfull !"

