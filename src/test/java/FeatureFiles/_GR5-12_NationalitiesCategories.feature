Feature:  Add-Edit-Delete Nationalities

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly

  Scenario:Add

    Given Click on the element in the left Nav
      | setupOne                     |
      | parameters                   |
      | nationalitiesSetupParameters |

    When Click on the element in the Dialog Content
      | addButton |

    And User sending the keys in Dialog content
      | nameInput | Canadian |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Edit

    Given Click on the element in the left Nav
      | setupOne                     |
      | parameters                   |
      | nationalitiesSetupParameters |


    When User searches for the desired item in the Dialog Content
      | searchInput2 | Canadian |

    And Click on the element in the Dialog Content
      | searchButton |
      | editButton   |

    And User sending the keys in Dialog content
      | nameInput | Mexican |

    And Click on the element in the Dialog Content
      | saveButton |

    Then Success message should be displayed

  Scenario: Delete

    Given Click on the element in the left Nav
      | setupOne                     |
      | parameters                   |
      | nationalitiesSetupParameters |

    When User searches for the desired item in the Dialog Content
      | searchInput2 | Mexican |

    And Click on the element in the Dialog Content
      | searchButton |

    And Click delete Button on Dialog Content
      | deleteButton |

    Then Click delete on Popup
      | deleteDialogBtn4 |

    Then Success message should be displayed
