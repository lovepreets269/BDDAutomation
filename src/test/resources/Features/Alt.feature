Feature: Verify Diff. Alerts

  @Smoke
  Scenario: Verify Diff. Alerts
    Given User is on Alert Page "https://demoqa.com/alerts"
    When User clicks on Simple Alert
    And User clicks on Time Based Alert
    And User clicks on Confirmation Alert
    And User clicks on the Prompt Alert and Enters Value as "Lovepreet"
