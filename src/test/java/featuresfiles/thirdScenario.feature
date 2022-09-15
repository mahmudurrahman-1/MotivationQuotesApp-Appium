Feature: Quotes Feature

  Scenario: Sujon selects the given image and perform actions
    Given Sujon opens the app and select Quotes
    And Sujon clicks on "START BREATHING EXERCISE"
    And Sujon start exercising and close it
    And Sujon goes to first image
    When Sujon enters and he goes to next image
    And Sujon slides 1 times before image
    Then Sujon save copy and share
