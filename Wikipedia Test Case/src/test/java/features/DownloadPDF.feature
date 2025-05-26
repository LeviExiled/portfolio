Feature: Download PDF
  As a user
  I want to download articles in PDF format
  So that I can save them for offline reading

  Scenario: Downloading a PDF from an article
    Then I verify if the Main Page is open
    When I input "Albert Einstein" in search field
    And I click submit button
    And I navigate to Download as PDF page
    Then I download the article as a PDF
