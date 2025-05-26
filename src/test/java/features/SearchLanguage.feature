Feature: Search Language
  As a user
  I want to change the search language
  So that I can search in any language I prefer

  Scenario: Changing search Language
    Then I verify if the Main Page is open
    When I input "Gabriel García Márquez" in search field
    And I change search language to "Spanish"
    And I click submit button
    Then I verify if the article page is open
