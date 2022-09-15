Feature: As an Admin User I should be able to Add-Edit-Delete Discounts under Parameters Setup

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Add
    Given i can edit the discounts under parameters
    When Add new Discount
      | description     | campus2 |
      | integrationCode | 124     |
      | priorityCode    | 12      |
    Then Success message should be displayed

  Scenario: Edit
    Given i can edit the discounts under parameters
    When Edit new Discount
      | description      | editCampus2 |
      | integrationCode  | 125         |
      | priorityCode     | 13          |
    Then Success message should be displayed

  Scenario: Delete
    Given i can edit the discounts under parameters
    When Delete new Discount
      | descriptionInput | editCampus2 |
    Then Success message should be displayed