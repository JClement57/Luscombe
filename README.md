# Luscombe

A choose your own adventure generator DSL.

## Specs

### Examples

```Luscombe
INVENTORY {
    Cloak {
        Put on, use {
            PRINT { You are invisible now }
        }
    }
}

// this is a comment and this is the house location
House {
    COUNTERS {
        times in yard = 0 // spaces in variable names (eww)
    }

    INTRO {
        PRINT { Hello World! }
    }

    ACTIONS {
        Leave {
            GOTO { yard } // case insensitive
            PRINT { You walk out of the house. }
            times in yard + 1 // add one to times in yard
        }
    }
}

Yard {
    COUNTERS {
        timesRakeUsed + 0 // Initilize timesRakeUsed to 0, then add 0 to it
    }

    INTRO {
        PRINT { Welcome to the yard, there is a rake in front of you. }
    }

    ACTIONS {
        Leave {
            GOTO { house }
            PRINT { You walk out of the yard. }
        }
    }

    OBJECTS {
        rake {
            use, pick up {
                PRINT { You use the rake }
                timesRakeUsed + 1
            }
        }
    }
}
```
