Feature: newReleaseComment
  @newReleaseComment
  Scenario: As User, I should be able to add comment and it should display at last
    Given I am On Home Page
    When I click on Details button under news release Section
    And I enter Comment Details
    Then verify new comment msg display verify added new comment is display at last
