Feature: As an Admin User I should be able to Add-Edit-Delete Positions under Human Resources Setup

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Add
    Given I can edit positions under Human Resources Setup
    When Add new position
      | nameInput | campus1 |
      | shortName | cmps1   |
    Then Success message should be displayed

  Scenario: Edit
    Given I can edit positions under Human Resources Setup
    When Edit new position
      | nameInput | editCampus1 |
      | shortName | ecmps1      |
    Then Success message should be displayed

  Scenario: Delete
    Given I can edit positions under Human Resources Setup
    When Delete new position
      | searchInput | editCampus1 |
    Then Success message should be displayed