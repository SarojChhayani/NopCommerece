Feature: registration


    @register
  Scenario: as user,I should able to Register Successfully
    Given I am On Home Page
    And  I Click On Register Button
    When I Enter registration details
    Then I should be able to register successfully
