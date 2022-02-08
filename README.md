## JTE with Java Classes 4: Method Calls Answer
---
### Description
In this lab we will cover how to iterate through an ArrayList of Java Objects using JTE. While iterating through the list, we will also cover using conditional statements and method calls. For reference, please look at the table implementation.

---
### Steps

1. In src -> main -> java -> objects, add your fields and getters to your SeaCreature.java file. Make sure to have at least 3 fields in this file. 
2. In the same file, create a feed method and timeSkip method.
3. In src -> main -> java -> Main.java, create an ArrayList of SeaCreature objects. Add at least 4 SeaCreature objects to your list.
4. In the same file, create a new route and handler for your list of SeaCreature objects.
5. In src -> main -> jte, add your implementation in the seaCreature.jte file where you will iterate through your list with a for loop. Make sure to add the imports and parameters required. Add your for loop inside the body tag. Add one link that will be set to the index.jte. as your return link and another link that will be set to your timeSkipSeaCreature.jte
6. Within your for loop, add a conditional statement with conditions based on the SeaCreature's hunger:
* if the SeaCreature is hungry, then have the webpage display that it's hungry, feed the SeaCreature and display that it's full now
* else, then have the webpage display the SeaCreature is full
7. In src -> main -> java -> Main.java, create another route and handler for your timeSkip.
8. In src -> main -> jte, add your implementation in the timeSkipSeaCreature.jte file where you'll display a certain amount of time pass by and have a link set to the seaCreature.jte.
---
### Sample Output
In my vast pen for sea creatures

* Blue Whales are hungry...*feeding...now they're full!
* Starfish are full
* Anglerfish are full
* Bottlenose Dolphins are hungry...*feeding...now they're full!
---
