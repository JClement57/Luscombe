# Luscombe

Welcome to Luscombe! A text based adventure generator!

Text based adventures are simple games where users respond to flavor text by typing in actions to perform.

Normally these games are made by professional developers working on a team with writers, or by the writers themselves using complex drag and drop interfaces online. Since text based adventures are story heavy, we hope to simplify this process in order to bring it closer to the creative minds that make the game good. Using Luscombe allows you to worry less about how the game works, and focus more on how the game plays.

By enabling creative writers to quickly and easily transform a story into a fun game, we think this will allow some amazing and original content to be created.

We think Luscombe is easy to pick up by only learning a few simple programming concepts. To this end, Luscombe is meant to be a
simple language that writers with no programming experience can pick up and quickly write a text based adventure in.

## Learn

In order to learn Luscombe, there are five core concepts that you will need to understand. Lets take a look at each one.

### Blocks

A block of code is defined by two symbols, the '**{**' to start the block and the '**}**' to end the block. The purpose of blocks is to both organize the code, and to let the program know what sections of code go with what. For example, this PRINT statement has a block that contains all the text that needs to be printed. Notice had it begins and ends with '**{**' and '**}**' respectively.

```Luscombe
PRINT { this is the text to print }
```

Furthermore, blocks can be nested in order to create more complex structures, take a look at the following IF statement. Notice how there are *two* blocks, one nested inside the other.

```Luscombe
IF keys = 1 {
   PRINT { You have a key! }
}
```

One word of caution, because blocks use the curly braces ('**{**' and '**}**') to start and end, you must be careful NOT to include them inside blocks. For example, the following PRINT statement will cause and error.

```Luscombe
PRINT { Don't try to type a '}' at home kids }
```

### Variables

In a nutshell, variables are just names that hold numbers. Variables are a good way to keep track of the state of the game, like how many keys the character is holding, or like in the example, how many times he/she has hit something. You can use a variable like this.

```Luscombe
keys = 9
```

This says that the number of keys that exist is 9. You can do all sorts of math with variables, like add, subtract, and divide! The following code will result in keys being set to 3!

```Luscombe
keys = 9
keys / 3
```

Lastly, you can use variables in your math equations. For example, here we are adding the number of keys to the number of items a character has.

```Luscombe
keys = 9
items = 1
items + keys
```

The value of keys doesn't change, but items gets set to 10!

### Keywords

Lastly, there are 11 words that mean specific things to the program. This words are always in all caps, and are always followed by a block. The point of these words is to tell the program what each block is. These keywords are defined in the cheat sheet below!

### items

Unlike the previous concepts, items are unique to Luscombe. Items are the building block of how you interact with the world in the game. They are pretty simple once you know how to define them, so lets start by looking at a very simple example.

```Luscombe
Water bottle { }
```

This defines an object called 'Water bottle', but you can't do much with it yet, so lets at some actions.

```Luscombe
Water bottle { 
    drink { }
}
```

Here we added the action 'drink' to the object. The player can activate this by typing 'drink water bottle' in the console, although it doesn't do anything yet. Let's add some meaningful text to display.

```Luscombe
Water bottle { 
    drink { 
        PRINT { You take a sip of your water bottle. }
    }
}
```

There! But what if you want more than just one verb to trigger this response? Well, adding multiple verbs to one action is easy, just make a little comma separated list like this:

```Luscombe
Water bottle { 
    drink, sip, chug { 
        PRINT { You take a sip of your water bottle. }
    }
}
```

Now the player can drink out of the water bottle by tpying 'drink water bottle', 'sip water bottle', or 'chug' water bottle! Now what if you want more actions than just drinking? Well, you just add more actions into the item block, like so.

```Luscombe
Water bottle { 
    drink, sip, chug { 
        PRINT { You take a sip of your water bottle. }
    }
    refill {
        PRINT { You refill the water bottle }
    }
}
```

There you go, you can now define items that you can interact with inside the world!

### locations

What about the environment you are in? Well, in order to define this we use something slightly similar to items called locations. We can define a location like this.

```Luscombe
The Purple House { }
```

Looks familiar doesn't it? You can now fill the location block with an INTRO, ACTIONS, and OBJECTS. We will walk through what each of the above keywords mean and do in the cheat sheet below.

### Cheat sheet

#### INTRO

The INTRO block is used to define a block of code that is executed whenever the location is entered. This can only exist **inside** a location.

```Luscombe
The Purple House {
    INTRO {
        PRINT { The house is cold and quiet, and purple! Very purple. }
    }
}
```

Now, whenever the character enters the purple house, that text will be displayed to the player.

#### ACTIONS

The ACTIONS block defines the actions that can be taken at a given location. Actions in this block are defined in exactly the same way as they are in the item section above. This can only exist **inside** a location.

```Luscombe
The Purple House {
    ACTIONS {
        leave, exit, run, flee { The purple color scares you and you quickly run away from the house. }
    }
}
```

The user can type 'leave', 'exit', 'run', or 'flee' in order to trigger the PRINT statement.

#### OBJECTS

This keyword describes items that are part of the location that you can interact with. This can only exist **inside** a location.

```Luscombe
The Purple House {
    OBJECTS {
        bucket {
            examine { This bucket has a hole in it. }
        }
    }
}
```

The user can type 'examine bucket' to trigger the PRINT statement.

#### INVENTORY

The INVENTORY keyword is used to define an inventory block that defines what items your character starts out with. Example below. Unlike the previous few keywords, the INVENTORY keyword does not go inside a location.

```Luscombe
INVENTORY {
    Badge {
        examine, look at {
            PRINT { You look at your badge and feel prideful of your time on the force. }
        }
    }
}
```

The user can type 'look at badge' in order to trigger the PRINT statement. Furthermore, the user can type 'inventory' in order to see a list of items that they have in the inventory.

#### PRINT

As seen before, this keyword prints the words inside its block to the screen for the user to see.

```Luscombe
PRINT { Words go here! }
```

#### GOTO

GOTO is used to move the character from location to location. Careful! The name in the block must match the name of an existing location!

```Luscombe
GOTO { The Purple House }
```

#### ADD

ADD is used to add items to the inventory. The item to be added is defined inside the ADD block itself.

```Luscombe
ADD Soda {
    drink, sip {
        PRINT { Mmm, bubbles. }
    }
}
```

#### DROP

DROP is used to remove items from the inventory. Like the GOTO, the name inside the block must match the name of an existing item in the inventory.

```Luscombe
DROP { Soda }
```

#### IF

The IF keyword is used to make a conditional statement. For example, you might only want to open a door if some variable is equal to 3. The IF block is only executed if the condition following the IF keyword is true. For this condition, there are a few different forms it can take.

First, a variable compared to a number.

```Luscombe
IF variable1 == 8 { }
```

Notice the '**==**' sign instead of the '**=**' sign. This means that it is comparing the two things, not asigning 0 to variable1. Other options for comparision are '**>**', '**<**', '**>=**', and '**<=**' that each represent greater than, less than, greater than or equal to, and less than or equal to respectively.

Another option for the IF statement is a variable and a variable.

```Luscombe
IF variable1 >= variable2 { }
```

This IF block will only execute if variable 1 is greater than variable2.

Lastly, you can simply state a name of an item and the IF block will execute only if that item is in the inventory. For example:

```Luscombe
IF Soda { }
```

Will only execute if the player has Soda in his/her inventory.

#### ELSE IF

ELSE IF is a keyword that can only follow an IF block. Essentially, if the IF condition isn't true, then this condition will be tested. If it's the other way around, and the IF condition is true, then the ELSE IF will never be tested or run. ELSE IFs can be infinitely stacked on each other.

```Luscombe
IF 5 > variable { PRINT { 5 is greater than the variable } }
ELSE IF 5 < variable { PRINT { 5 is smaller than the variable } }
ELSE IF 5 == variable { PRINT { 5 is equal to the variable } }
```

#### ELSE

Lastly, the ELSE keyword is used only after an IF or an ELSE IF. If the previous conditions are false, then the ELSE block will run, otherwise it will not. There can only be one ELSE per IF statement.

```Luscombe
IF 5 == variable { PRINT { 5 is equal to the variable } }
ELSE { PRINT { 5 is NOT equal to the variable } }
```

### Comments

The last thing that might be helpful to know is how to comment. Sometimes it helps to put in some english explanations of what your code is doing. To do this, simply put '**//**' and everything on the rest of the line will be ignored.

```Luscombe
PRINT { Hola } // 'Hello' in Spanish
```

## Requirements

In order to run the Luscombe translator on your Luscombe code, you will need to install a few things.

First, you need to get both Antlr 4 and Antlr 3 (for String Templates) from [Antlr's offical site.](https://www.antlr.org/)

Then, you will need to get String Templates from [their offical site.](https://www.stringtemplate.org)

## Run

Simply run Luscombe.java.

For now it doesn't take any command line arguments, so the input file is hard coded in the Luscombe.java file. This will be changed in later updates.

The output will be called 'output.html' and you can simply open that up in any web browser to play the game!

## Examples

Below is a small example program that can also be found in 'pirates.txt' in this repository.

```Luscombe
INVENTORY {
    Eyepatch {
        examine, look at {
            PRINT { You recall when you lost your eye in a game of poker on Tortuga. }
        }
    }
}

Cell {
    INTRO {
        PRINT { You are locked in a prison cell after getting captured by Captain Denning. The world has come to know him as... Captain Redbeard.}
    }
    ACTIONS {
        look, look around, examine {
            PRINT { You see an empty bottle of whiskey and a splintered plank }
        }
        open door, open gate, open cell, unlock door, unlock gate {
            IF door == 0 {
                PRINT { The door is locked }
            } ELSE {
                PRINT { The door is already open }
            }
        }
        hit door, attack door, hit gate, attack gate {
            IF Plank {
                IF hits == 0 {
                    PRINT { You hit the door with the Plank. It budges a little. }
                    hits + 1 // Increment hits by 1.
                }
                ELSE IF hits == 1 {
                    PRINT { You hit the door again. You can feel it giving way. }
                    hits + 1 // Increment hits by 1.
                }
                ELSE IF hits == 2 {
                    // Double line print statement
                    PRINT { 
                        The door crashes open. 
                        You better get out soon or Captain Redbeard's men will find you.
                    }
                    hits + 1
                    door = 1 // Increment hits by 1.
                }
                ELSE IF hits >= 3 {
                    PRINT { You hit the open door... Nothing Happens. }
                } 
            } ELSE {
                PRINT { You punch the iron gate and immediately regret it. }
            }
        } 
        leave, exit, flee {
            IF door == 1 {
                PRINT { You leave the cell }
                GOTO { Hull }
            } ELSE {
                PRINT { The gate is locked }
            }
        }
    }
    
    OBJECTS {
        Whiskey {
            take, pick up, grab {
                PRINT { You take the bottle. Too bad it's empty... }
                ADD Whiskey {
                    examine, look at {
                        PRINT { An empty bottle of whiskey. }
                    }
                    drink {
                        PRINT { You wish... }
                    }
                }
            }
        }
        Plank {
            take, pick up, grab {
                PRINT { You grab the plank. It's heavy }
                ADD Plank {
                    examine, look at {
                        PRINT { A sturdy wooden plank. }
                    }
                }
            }
        }
    }
}

Hull {
    INTRO {
        PRINT { 
            You escape to the hull of the ship.
            All of Redbeard's goons are here and they kill you. RIP
        }
    }
}
```
