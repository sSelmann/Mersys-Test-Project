Feature: Position Categories

  Background:
    Given Navigate to basqar
    When Enter username and password and click login button
    Then User should login successfuly
    And Going To Fields

  Scenario: GR5-4 Fields Add-Edit-Delete
    And Fields Add
    | Add4  |

    And Fields İnfo
    | nameInput | AGR5-4Deneme |
    | codeInput | AK       |

    And Save
    | saveButton |

    Then User should login successfully2

    And ClickEditButton
    | Edi4 |

    And Fields İnfo
    | nameInput | Asim |
    | codeInput | Ankara |

    And Save
    | saveButton |

    Then User should login successfully2

    And Delete
    | deleteButton |

    Then User should login successfully2

    And DeleteDialogBtn
    | deleteDialogBtn4 |
