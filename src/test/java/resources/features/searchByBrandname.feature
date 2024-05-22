Feature: searchByBrandName

  @searchByBrandName
  Scenario Outline: As  User,I should be able to search any product by brand name
    Given I am On Home Page
    When I type "<Brand_Name>"in search box
    And I click on search button
    Then I should be able to see all the product by given "<brand name>" And  navigated "<url>" page


    Examples:
      | Brand_Name | brand name | url   |
      | nike       | Nike       | =nike |