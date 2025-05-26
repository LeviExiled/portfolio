Feature: Information Page
  As a user
  I want to search for information on specific topics
  So that I can navigate to detailed pages about those topics

  Scenario: Navigating to Information Page
    Then I verify if the Main Page is open
    When I input "Bengal tiger" in search field
    And I click submit button
    And I navigate to the Page Information
    Then I verify if the Information Page is open
