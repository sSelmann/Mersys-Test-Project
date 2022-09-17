Feature:  Add-Edit-Delete Subject Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario:Add Subject Categories

    Given Click on the element in the left Nav
      | education                       |
      | setupUnderEducation             |
      | subjectCategoriesUnderEducation |

    When Click on the element in the Dialog Content
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | grup5 |
      | codeInput | 8523  |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario:  Edit Subject Categories

    Given Click on the element in the left Nav
      | education                       |
      | setupUnderEducation             |
      | subjectCategoriesUnderEducation |

    When User searches for the desired item in the Dialog Content

      | searchInput2 | grup5 |

    And Click on the element in the Dialog Content
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | nameInput | Human |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete Subject Categories

    Given Click on the element in the left Nav
      | education                       |
      | setupUnderEducation             |
      | subjectCategoriesUnderEducation |


    When User searches for the desired item in the Dialog Content
      | searchInput2 | Human |

    And Click on the element in the Dialog Content
      | searchButton |

    And Click delete Button on Dialog Content
      | deleteButton |

    Then Click delete on Popup
      | deleteDialogBtn4 |

    Then Success message should be displayed



