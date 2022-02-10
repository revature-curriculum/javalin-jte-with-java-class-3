## JTE with Java Classes 4: Method Calls
---
### Description
In this lab we will cover how to iterate through an ArrayList of Java Objects using JTE. While iterating through the list, we will also cover using conditional statements and method calls. For reference, please look at the table implementation.

---
### Steps

1. In src -> main -> java -> objects -> SeaCreature.java add at least two fields. One should be the name of the animal (string), and another the hunger of the animal (int - 0 is starving and 100 is full). You can add more if you want.
2. Create a constructor for the class.
3. Create getters for all the fields. These getters should be public so other files can access them.
4. Create a feed method that will set the value of hunger to 100 (full).
5. Create a timeSkip method that will decrease the hunger by a set amount (or set the hunger to 0 if hunger is lower than the set amount).
6. In src -> main -> java -> Main.java, create an ArrayList of SeaCreature objects. This arraylist should be static and be created outside the main method.
7. Add at least 4 SeaCreature objects to your list. This should be done in the main method. See the ShoppingItems reference example in the same file.
8. Create a handler that will render seaCreatures.jte and send it your list of SeaCreature objects.
9. Create a route for the handler.
10. Create a handler that will render timeSkipSeaCreature.jte and call the timeSkip method for all sea creatures in the arraylist.
11. Create a route for the timeSkipSeaCreature that will render timeSkipSeaCreature.jte.
12. In src -> main -> jte -> seaCreatures.jte add the required imports and parameters.
    * Remember to import java.util.* for the arraylist.
    * Remember to use the same name for the parameter and the key for the singletonMap.
13. Add one link that will return to the index page (the default route for this is "/")
14. Create another link that will be set to your timeSkipSeaCreature.jte route.
15. Create a for loop inside the body tags. This for loop should iterate through all the sea creatures.
16. Within your for loop, add a conditional statement with conditions based on the SeaCreature's hunger:
    * If the SeaCreature is hungry, then have the webpage display that it's hungry, feed the SeaCreature (this can be done using ${seaCreature.feed()} and display that it's full now
    * else, then have the webpage display the SeaCreature is not hungry.
    * Note: The sea creature hunger can be checked using ${seaCreature.getHunger()}. You can put this into an if statement and check if the hunger is lower than a certain threshold (that you will decide).
17. In src -> main -> jte -> timeSkipSeaCreature.jte file write text to display a certain amount of time pass by
18. Create a link set to the seaCreature.jte route to check if any sea creature is hungry after the time skip.
---
### Sample Output
In my vast pen for sea creatures

* The hunger for Blobfish is 45 and they don't need feeding yet.
* The hunger for Sea Angel is 30 and they don't need feeding yet.
* The hunger for Peacock Mantis Shrimp is 10 and they need feeding! *Feeding* They are full now.
* The hunger for Firefly Squid is 35 and they don't need feeding yet.
---
