Feature: Position Categories
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
     | humanResources |
     | setupUnderHumanResource |
     | positionCategoriesUnderHR |

  Scenario: Use Add function on Position Categories
    And Click on the element in the Dialog Content
      | addButton |
    Then User sending the keys in Dialog content
      | nameInput | sel1a11s3o1s |
    And Click on the element in the Dialog Content
      | saveButton |
    Then Success message should be displayed



  Scenario: Edit
    When User sending the keys in Dialog content
      | searchInput | sel1a11s3o1s |
    Then Click on the element in the Dialog Content
      | searchButton |
      | editButton   |
    And User sending the keys in Dialog content
      | nameInput | Fesla121s21 |
    And Click on the element in the Dialog Content
      | saveButton |
    Then Success message should be displayed


  Scenario: Delete
    When User sending the keys in Dialog content
      | searchInput | Fesla121s21 |
    Then Click on the element in the Dialog Content
      | searchButton |
      | deleteButton   |

    And Click delete on Popup
      | deleteDialogBtn4   |
