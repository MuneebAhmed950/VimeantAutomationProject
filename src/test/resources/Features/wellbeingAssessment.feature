Feature: User should be able to fill wellbeing assessment survey.

  @smoke
  Scenario: Check User is able to fill wellbeing assessment survey
    Given user is on login page
    When user enters username
    And user enters password
    And clicks on login button
    And user search senior in searchbar
    And user clicks on senior
    And user clicks on assessment
    And user clicks on wellbeing survey
    And click on busy and add comment
    And click on happy and add comment
    And click on purpose and add comment
    And click on social and add comment
    And click on relaxed and add comment
    And click on painfree and add comment
    And click on rested and add comment
    And click on submit button
    Then It shows message in alert window "Wellness Survey has been submitted successfully"



