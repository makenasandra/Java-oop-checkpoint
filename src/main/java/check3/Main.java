package check3;

/**
 * Part One:
 * 1. Create a class called "Student" with properties such as name, age, and major. Implement the constructor and appropriate accessor methods for the class.
 * 2. In the main method, create a new student object, set its properties, and print the details of the student.
 *
 * Part Two:
 * 1. Create a class called "Bank" with an empty constructor and a list of customers as its property.
 * 2. Implement a method called "addCustomer" that allows you to add a new customer to the bank.
 * 3. In the main method, create a new instance of the "Bank" class and add at least three customers of your choice.
 * 4. Print the list of customers in the bank.
 *
 * Part Three (Bonus):
 * 1. Create a class called "Circle" with properties like radius. Implement the constructor and appropriate accessor methods for the class.
 * 2. Add a method called "calculateCircumference" that calculates and returns the circumference of the circle.
 * 3. In the main method, create a new instance of the "Circle" class, set its properties, and call the "calculateCircumference" method to calculate and print the circumference.
 */
public class Main {
    public static void main(String[] args){
        partOne();
        partTwo();
        partThree();
    }

    private static void partOne(){
        System.out.println("\nPart One: ");
        Student mwanafunzi = new Student();
        mwanafunzi.setName("Wafula");
        mwanafunzi.setAge(45);
        mwanafunzi.setMajor("Law");

        System.out.println("Student Details: " + mwanafunzi.toString());
    }

    private static void partTwo(){
        System.out.println("\nPart Two: ");
        //create a new instance of the "Library" class
        Bank benki = new Bank();
        benki.addCustomer("Ken Walibora");
        benki.addCustomer("Steve Kari");
        benki.addCustomer("Sydney Otieno");

        System.out.println("Customers in the bank: " + benki.printCustomers());
    }
    private static void partThree(){
        System.out.println("\nPart Three: ");
        //create a new instance of the "Triangle" class
        Circle duara = new Circle();
        duara.setRadius(79.85);


        System.out.println("Circumference of Circle: " + duara.calculateCircumference());
    }
}


