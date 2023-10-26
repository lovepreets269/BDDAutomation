Feature: Check the Functionality of different windows and tabs

  @Important
  Scenario: Check the Functionality of different windows and tabs
    Given User is on Browser Window page "https://demoqa.com/browser-windows"
    When User clicks on new tab button
    And User advances to next tab of the browser and comes back to the main page "https://demoqa.com/browser-windows"
    When User clicks on new window button
    Then a new window opens up in the browser and user closes the window and returns to the main page "https://demoqa.com/browser-windows"
    Then user clicks on the new window message button
    And a new window with some message opens up in the browser
    And user returns to the main page "https://demoqa.com/browser-windows"
