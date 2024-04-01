#Author: josejulian_ramos@hotmail.com
Feature: Validate the purchase functionality in the swagsLabs app
  As a Certification Analyst from the swagsLabs app
  I need to test the purchase functionality
  to validate its correct operation

  Scenario: Buying products at swagLabs
    Given that Analyst logged into the SwagLabs app
    When he adds products to the cart
      | products                 |
      | Sauce Labs Onesie        |
      | Sauce Labs Bolt T-Shirt  |
      | Sauce Labs Fleece Jacket |
    And he checks out his purchase
    Then he should see the successful purchase message

