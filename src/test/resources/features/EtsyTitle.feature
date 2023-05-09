@regression @smoke @ui
Feature: Validating etsy titles

  @EAV-1
  Scenario: Validating etsy home page title
    Given user navigates to "EtsyApp"
    When user gets the title
    Then user validates expected title vs actual

