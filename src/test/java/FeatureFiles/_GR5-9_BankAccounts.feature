Feature:  Add-Edit-Delete Bank Accounts under Parameters Setup

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario:Add Bank Accounts

    Given Click on the element in the left Nav
      | setupOne                         |
      | parameters                       |
      | bankAccountsUnderSetupParameters |

    When Click on the element in the Dialog Content
      | addButton |

    And User sending the keys in Dialog content
      | nameInput           | Study                    |
      | ibanInput           | TR12 3654 9874 4444 4444 |
      | integrationCodeBank | 987456                   |


    And Click on the element in the Dialog Content
      | currency    |
      | currencyUsa |
      | saveButton  |


    Then Success message should be displayed

  Scenario:  Edit Bank Accounts

    Given Click on the element in the left Nav
      | setupOne                         |
      | parameters                       |
      | bankAccountsUnderSetupParameters |

    When User searches for the desired item in the Dialog Content
      | searchInput2 | Study |

    And Click on the element in the Dialog Content
      | searchButton |
    And Click on the element in the Dialog Content
      | editButton |

    And User sending the keys in Dialog content
      | nameInput | Human |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Bank Accounts

    Given Click on the element in the left Nav
      | setupOne                         |
      | parameters                       |
      | bankAccountsUnderSetupParameters |

    When User searches for the desired item in the Dialog Content
      | searchInput2 | Human |

    And Click on the element in the Dialog Content
      | searchButton |

    And Click delete Button on Dialog Content
      | deleteButton |

    Then Click delete on Popup
      | deleteDialogBtn4 |

    Then Success message should be displayed



