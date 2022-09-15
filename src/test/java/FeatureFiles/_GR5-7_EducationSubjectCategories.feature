Feature: Position Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Going to Education Setup Subject Categories

  Scenario: GR5-7 Subject Categories Add-Edit-Delete

    And Add
      | addButton |

    And Info
      | nameInput | selamunko11 |
      | codeInput | aleykumko11 |

    And ActiveAndDeactive
      | activeButton |

    And Save
      | saveButton |

    Then User should login successfully2

    And Search Info
      | searchInput | selamunko11 |
      | codeInput2  | aleykumko11 |

    And Search
      | searchButton |

    And ClickEditButton
      | editButton |

    And Info
      | nameInput | haniko11 |
      | codeInput | duduko11 |

    And ActiveAndDeactive
      | activeButton |

    And Save
      | saveButton |

    Then User should login successfully2

    And Search Info
      | searchInput | haniko11 |
      | codeInput2  | duduko11 |

    And Search
      | searchButton |

    And Delete
      | deleteButton |

    And DeleteDialogBtn
      | deleteDialogBtn |

    Then User should login successfully2


