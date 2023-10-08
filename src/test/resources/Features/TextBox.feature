Feature: Checkout the textbox form functionality

  @Smoke
  Scenario: Enter the data into the given fields
    Given User is on Text Box page "https://demoqa.com/text-box"
    When User enters his Fullname as "Lovepreet"
    And Email as "lovepreet123@gmail.com"
    And Current Address as "Mohali" and Permanent Address as "Mohali"
    And Clicks on the submit button
    Then Entered data should display below the form
