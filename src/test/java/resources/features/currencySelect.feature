Feature: currency

  @currency
  Scenario Outline:As User, I should be able to select currency and verify each product contain selected currency symbol
    Given I am On Home Page
    When I select "<currency>" from header bar
    Then each product contain "<currency_symbol>"

    Examples:
      | currency  | currency_symbol |
      | Euro      | €               |
      | US Dollar | $               |