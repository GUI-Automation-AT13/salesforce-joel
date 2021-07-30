Feature: Create an Asset

  Scenario: Create an asset with required fields
    Given I login to salesforce site as a developer user
    And I navigate to Asset page
    When I create a new Asset with fields
      | Name        | Name Asset 1 |
      | AccountName | cuenta 13    |
    Then Validate successful message of creating that is display
    And Validate All header fields match
    And Validate All detail fields match
    And Validate The title matches
    And Validate The created date matches

  Scenario: Create an asset with all fields
    Given I login to salesforce site as an developer user
    And I navigate to Asset page
    When I create a new Asset with fields
      | Name                | Name Asset 1  |
      | AccountName         | cuenta 13     |
      | ContactName         | contact 2     |
      | ProductName         | producto 2    |
      | SerialNumber        | Serial Number |
      | Quantity            | 10            |
      | Price               | 100           |
      | Description         | Description   |
      | InstallDate         | 22/7/2021     |
      | PurchaseDate        | 30/9/2021     |
      | UsageEndDate        | 17/12/2021    |
      | Status              | Shipped       |
      | IsCompetitorProduct | true          |
    Then Validate successful message of creating that is display
    And Validate All header fields match
    And Validate All detail fields match
    And Validate The title matches
    And Validate The created date matches







