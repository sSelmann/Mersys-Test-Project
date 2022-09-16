Feature: Position Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Going to Document


  Scenario: GR5-10 Fields Add-Edit-Delete
    And DocumentAdd
    |addButton|

    And Documentinfo
    |nameInput |Adana|

    And DocumentStage
    |stage2|
    |dropDownOptionFour|

    Then Click ROBOT TAB on the element in the Dialog Content

    And Save
    |saveButton|

    Then User should login successfully2

    And ClickEditButton
      | Edi4 |

    And Documentinfo
      |nameInput |Astanbul|

    And Save
      | saveButton |

    Then User should login successfully2

    And Delete
      | deleteButton |

    Then User should login successfully2

    And DeleteDialogBtn
      | deleteDialogBtn4 |
