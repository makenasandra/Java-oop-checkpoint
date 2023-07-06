package check5;

import javax.swing.*;

/**
 * Part One (Java)
 * Create a Vehicle class which must have the following properties: fuelType, tyresNumber, manufacturer, model, price.
 *
 * Create the constructor and its accessory methods appropriately.
 *
 * In the main create a new vehicle and print it in console.
 *
 * Part Two (Java)
 * Create a class Garage, which has an empty constructor and a list of vehicles as its property.
 *
 * Create a method that allows you to add a new vehicle to the list, create a new garage in the main and insert at least three vehicles of your choice, print the list in the console.
 *
 * Create a method that allows you to filter the list of vehicles by specifying a parameter of your choice, call it in main and print the filtered list that is returned.
 *
 * Create a method that calculates and prints the total value of the garage, call it in main.
 *
 * Bonus: Part Three (Java)
 * Create a Calculator class, which takes two integer values as input.
 *
 * Create a method for each operation, addition, subtraction, multiplication and division, which calculates the result and prints it to the console.
 *
 * *****Hint: Implement toString method to print objects in console*****
 */
public class Main {
    public static void main(String[] args){
        partOne();
        partTwo();
        partThree();
    }

    private static void partOne(){
        System.out.println("\nPart One: ");
        Vehicle gari = new Vehicle();
        gari.setManufacturer("Range Rover");
        gari.setModel("Srome900");
        gari.setFuelType("Petrol");
        gari.setPrice(40_000);
        gari.setTyresNumber(4);

        System.out.println("Vehicle Details: " + gari.toString());
    }

    private static void partTwo(){
        System.out.println("\nPart Two: ");
        Vehicle gari = new Vehicle();
        gari.setManufacturer("Range Rover");
        gari.setModel("Srome900");
        gari.setFuelType("Petrol");
        gari.setPrice(40_000);
        gari.setTyresNumber(4);

        Vehicle gari2 = new Vehicle();
        gari2.setManufacturer("Benz");
        gari2.setModel("Srome900");
        gari2.setFuelType("Diesel");
        gari2.setPrice(40_000);
        gari2.setTyresNumber(4);

        Vehicle gari3 = new Vehicle();
        gari3.setManufacturer("BMW");
        gari3.setModel("Srome900");
        gari3.setFuelType("Petrol");
        gari3.setPrice(40_000);
        gari3.setTyresNumber(4);

        Garage garage = new Garage();
        garage.addVehicle(gari);
        garage.addVehicle(gari2);
        garage.addVehicle(gari3);

        System.out.println("Cars in the garage: " + garage.printVehicles());

        System.out.println("Filter cars that use petrol: " + garage.filterBy("fuelType", "Petrol"));
    }
    private static void partThree(){
        System.out.println("\nPart Three: ");
        //create a new instance of the "Triangle" class
        Calculator kikokotoo = new Calculator(98,37);
        kikokotoo.addition();
        kikokotoo.subtraction();
        kikokotoo.multiplication();
        kikokotoo.division();
    }
}



