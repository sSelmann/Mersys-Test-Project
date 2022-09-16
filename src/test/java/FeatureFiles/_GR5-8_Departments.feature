Feature: Position Categories
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Click on the element in the left Nav
     | setupOne |
     | schoolSetupUnderSetup |
     | departmentsUnderSchoolSetup |

  Scenario: Use Add function on Position Categories
    And Click on the element in the Dialog Content
      | addButton |
    Then User sending the keys in Dialog content
      | nameInput | Felsala34 |
      | codeInput | 2446456 |
    And Click on the element in the Dialog Content
      | saveButton |
    Then Success message should be displayed



  Scenario: Edit
    When Click on the element in the Dialog Content
      | searchButton |

    And Click edit button on Dialog Content
      | editButton   |

    Then User sending the keys in Dialog content
      | nameInput | Ba1t1tle |
    And Click on the element in the Dialog Content
      | saveButton |
    Then Success message should be displayed


  Scenario: Delete
    When Click on the element in the Dialog Content
      | searchButton |

    And Click delete Button on Dialog Content
      | deleteButton   |

    Then Click delete on Popup
      | deleteDialogBtn4   |
