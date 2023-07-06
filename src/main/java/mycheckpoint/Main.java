package mycheckpoint;

/**
 * Part One
 * Create an Animal class containing the following properties: name, color, type, age.
 *
 * Create a proper constructor with its accessory methods (getter, setter).
 *
 * Be careful to specify the visibility modifiers correctly (public, private, protected), also check if the properties are final (they don't change their value after initialization) or not (they can change their value after being initialized).
 *
 * In main create a new object of type Animal and print it in console.
 *
 * Part Two
 * Create a Zoo class, it must contain a list of animals as a property.
 *
 * In main create a new zoo and print it in console.
 *
 * Add a method to the class that allows you to add an animal to the zoo (the method takes an animal as input and adds it to the list).
 *
 * In main, add animals to the zoo, then print the list of animals in the zoo to the console.
 *
 * Add a method to the class that allows us to filter the list of animals in a zoo by type, ex: I want to have the list of all pandas in the zoo.
 *
 * Call the method in main and print the list that is returned to you.
 *
 * Add a method to the class that returns the average age of a certain type of animal in the zoo, eg: I want to have the average age of the pandas in the zoo.
 *
 * Invoke the method in the main and print the value that is returned to you.
 *
 *
 * Hint: Implement toString method to print objects in console
 */

public class Main {
    public static void main(String[] args){

        Animal animalia = new Animal("hippo", "dark red", "mammal", 15);
        Animal animal2 = new Animal("elephant", "grey", "mammal", 6);
        Animal animal3 = new Animal("lion", "brown", "mammal", 4);
        Animal animal4 = new Animal("snake", "black", "reptile", 3);
        Animal animal5 = new Animal("snake", "green", "reptile", 7);

        System.out.println(animalia.toString());

        Zoo zoo1 = new Zoo();

        System.out.println(zoo1.toString());

        zoo1.addAnimal(animalia);
        zoo1.addAnimal(animal2);
        zoo1.addAnimal(animal3);
        zoo1.addAnimal(animal4);
        zoo1.addAnimal(animal5);

        System.out.println(zoo1.toString());
        System.out.println("Filtered list" + zoo1.filterBy("Mammal"));
        System.out.println("Average age = "+ zoo1.findAverageAge("reptile"));

    }
}
