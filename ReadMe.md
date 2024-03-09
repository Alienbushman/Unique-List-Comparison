# Get a unique list

This was an experiment to see whether I could improve on the unique groovy library

## Basic premis
Basically mathematically groovy's implementation takes n^2 time, while mine takes n time, and I thought that this would improve the time it would take to get a unique list

### How groovy does it
The groovy library for getting unique item in a collection makes use of a double for loop to test uniqueness (it itterates through the original list, building up a unique list and for each element in the original list it itterates through the unique list)

### How I do it
Itterate through a list and add each element to a hashset then for each element, check whether it contains the the element, if it contains it, remove it from the list, if it does not, remove it from the list

### How to run
The program is in src/main/main.groovy, the enviorment is set up with gradle and needs shell scripting enabled for the timing (Intellij should set up everything automatically). 

## Conclusion
My impementation was slower by around a factor of 2, this is pretty interesting and it does 
