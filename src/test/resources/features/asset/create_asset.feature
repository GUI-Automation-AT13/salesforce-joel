Feature: Create an Asset

  Scenario: Create an asset with required fields
    Given I login to salesforce site as an developer user
    And I navigate to Asset page
    When I create a new Asset with fields
    | Asset name   | Name Asset 1    |
    | Account name | cuenta 13       |
    Then A successful message of creating is display
    And All header fields match
    And All detail fields match
    And The title matches
    And The created date matches

  Scenario: Create an asset with all fields
    Given I login to salesforce site as an developer user
    And I navigate to Asset page
    When I create a new Asset with fields
      | asset name       | New Asset       |
      | account name     | Created Account |
      | contact name     | Created Contact |
      | product name     | Created Product |
      | serial number    | Serial Number   |
      | quantity         | 10              |
      | price            | 100             |
      | description      | Description     |
      | install date     | 22/7/2021       |
      | purchase date    | 30/9/2021       |
      | usage end date   | 17/12/2021      |
      | status           | Shipped         |
      | competitor asset | true            |
    Then A successful message of creating is display
    And All header fields match
    And All detail fields match
    And The title matches
    And The created date matches







