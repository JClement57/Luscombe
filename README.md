# Luscombe

A choose your own adventure generator DSL.

## Specs

TBD

### Examples

WORK IN PROGRESS

```
Title: Example Game

# A House location that you can leave

Location: House

Intro: "Hello World!"

Actions:
    leave: "You walk out of the house." goto yard
End Actions

# A yard location that you can rake

Location: Yard

Intro: "Welcome to the yard, there is a rake in front of you."

Actions:
    leave: "You go back into the house." goto house
    rake: pick up, take, use "You use the rake."
End Actions
```
