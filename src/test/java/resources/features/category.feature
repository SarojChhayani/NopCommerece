Feature: category

  @category
  Scenario Outline: As user, I should able to each category page successfully
    Given I am On Home Page
    When I click on "<category_name>" button
    Then I should able to verify that user navigated to"<url>" page
    Examples:
      | category_name     | url                |
      | Computers         | /computers         |
      | Electronics       | /electronics       |
      | Apparel           | /apparel           |
      | Digital downloads | /digital-downloads |
      | Books             | /books             |
      | Jewelry           | /jewelry           |
      | Gift Cards        | /gift-cards        |