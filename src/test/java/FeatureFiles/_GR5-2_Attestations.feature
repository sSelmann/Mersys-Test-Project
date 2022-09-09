Feature: Position Categories
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario: Add Attestation

    When  Navigate To Attestations Page
    Then User Add A Attestation
    And  Success message should be displayed

  Scenario: Edit Attestation

    When  Navigate To Attestations Page
    Then User Edit A Attestation
    And Success message should be displayed

  Scenario: Delete Attestation

    When  Navigate To Attestations Page
    Then  User Delete A Attestation
    And  Success message should be displayed