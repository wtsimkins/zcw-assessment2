# Interface & Abstract

1. Create the following animals:
    1. `Horse` is a concrete class which implements Animal.
        - `move` will return `gallop`
        - `color` will return `brown` (Yes I am aware not all horses are brown.)
        - Uncomment the `src/test/java/com/zipcodewilmington/part3/HorseTest` code. All the test should pass.
    2. `Bird` is an abstract class that implements Animal.
        1. `move` will return `fly` (Yes I am aware not all birds fly.)
    3. `BlueJay` is a concrete class which extends from Bird
        1. `color` will return `blue`
        - Uncomment the `src/test/java/com/zipcodewilmington/part3/BlueJayTest`
    4. `RedRobin` is a concrete class which extends from Bird
        1. `color` will return `red`
        2. Add a String migrationMonth field. Add a getter and setter for it.
        - Uncomment the `src/test/java/com/zipcodewilmington/part3/RedRobinTest` 