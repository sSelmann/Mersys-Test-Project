Feature: Position Categories
  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Going to Human Resources Setup Attestations

  Scenario: GR5-2 Attestations Add-Edit-Delete

    And Add
      | addButton |

    And Info
      | nameInput | selamunko |

    And Save
      | saveButton |

    Then User should login successfully2

    And Search Info
      | searchInput | selamunko |

    And Search
      | searchButton |

    And ClickEditButton
      | editButton |

    And Info
      | nameInput | haniko |

    And Save
      | saveButton |

    Then User should login successfully2

    And Search Info
      | searchInput | haniko |

    And Search
      | searchButton |

    And Delete
      | deleteButton |

    And DeleteDialogBtn
      | deleteDialogBtn |

    Then User should login successfully2