package check1;

/**
 * Part One:
 *
 * Create a class called "Person" with properties such as name, age, and address. Implement the constructor and appropriate accessor methods for the class.
 * In the main method, create a new person object, set its properties, and print the details of the person.
 * Part Two:
 *
 * Create a class called "Library" with an empty constructor and a list of books as its property.
 * Implement a method called "addBook" that allows you to add a new book to the library.
 * In the main method, create a new instance of the "Library" class and add at least three books of your choice.
 * Print the list of books in the library.
 * Part Three (Bonus):
 *
 * Create a class called "Rectangle" with properties like length and width. Implement the constructor and appropriate accessor methods for the class.
 * Add a method called "calculatePerimeter" that calculates and returns the perimeter of the rectangle.
 * In the main method, create a new instance of the "Rectangle" class, set its properties, and call the "calculatePerimeter" method to calculate and print the perimeter.
 */
public class Main {
    public static void main(String[] args){

        partOne();
        partTwo();
        partThree();
    }

    private static void partOne(){
        System.out.println("\nPart One: ");

        //create a new person object
        Person mtu = new Person();
        mtu.setName("Njoki");
        mtu.setAge(28);
        mtu.setAddress("Kagundo Rd");

        System.out.println("Details of the person: " +mtu.toString());
    }

    private static void partTwo(){
        System.out.println("\nPart Two: ");
        //create a new instance of the "Library" class
        Library kls = new Library();
        kls.addBook("Man of the people");
        kls.addBook("Kidagaa");
        kls.addBook("Siku Njema");

        System.out.println("Books in library: " + kls.printBooks());
    }
    private static void partThree(){
        System.out.println("\nPart Three: ");
        //create a new instance of the "Rectangle" class
        Rectangle mstatili = new Rectangle();
        mstatili.setLength(89);
        mstatili.setWidth(33);

        System.out.println("Perimeter of Rectangle = " + mstatili.calculatePerimeter());;
    }
}
