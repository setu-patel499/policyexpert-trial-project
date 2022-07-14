@Regression
Feature: Search functionality
  As user I want to verify '73 results for "cheap home insurance' text results into policyExpert website

  Scenario: User should navigate to helpCentre page successfully
    Given I am on homepage
    When I click on helpCentre link
    And I mouse hover and click on searchbar
    Then I entre text "cheap home insurance"
    And I mouse hover and click on searchBtn
    #Then I should able to verify text results