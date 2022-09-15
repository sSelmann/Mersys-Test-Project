Feature:  Add-Edit-Delete Document Types under Parameters Setup

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario:Add Document Categories

    Given Click on the element in the left Nav
      | setupOne                     |
      | parameters                   |
      | documentTypesUnderParameters |

    When Click on the element in the Dialog Content
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | Internship Certificate |

    And Click on the element in the Dialog Content
      | arrowThree         |
      | dropDownOptionFour |

    And Click ROBOT TAB on the element in the Dialog Content

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed


  Scenario: Edit Document Categories
    Given Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | documentTypesUnderParameters |

    When User searches for the desired item in the Dialog Content
      | searchInput | Internship Certificate |

    And Click on the element in the Dialog Content
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | nameInput | Documents |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Document Categories

    Given Click on the element in the left Nav
      | setupOne      |
      | parameters    |
      | documentTypesUnderParameters |

    When User searches for the desired item in the Dialog Content
      | searchInput | Documents |

    And Click on the element in the Dialog Content
      | searchButton        |
      | deleteButton        |
      | deleteDialogBtn4 |


    Then Success message should be displayed










