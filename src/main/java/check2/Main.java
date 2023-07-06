package check2;

/**
 * Part One:
 * 1. Create a class called "Product" with properties such as name, price, and quantity. Implement the constructor and appropriate accessor methods for the class.
 * 2. In the main method, create a new product object, set its properties, and print the details of the product.
 *
 * Part Two:
 * 1. Create a class called "Library" with an empty constructor and a list of books as its property.
 * 2. Implement a method called "addBook" that allows you to add a new book to the library.
 * 3. In the main method, create a new instance of the "Library" class and add at least three books of your choice.
 * 4. Print the list of books in the library.
 *
 * Part Three (Bonus):
 * 1. Create a class called "Triangle" with properties like base and height. Implement the constructor and appropriate accessor methods for the class.
 * 2. Add a method called "calculateArea" that calculates and returns the area of the triangle.
 * 3. In the main method, create a new instance of the "Triangle" class, set its properties, and call the "calculateArea" method to calculate and print the area.
 */
public class Main {
    public static void main(String[] args){

        partOne();
        partTwo();
        partThree();
    }

    private static void partOne(){
        System.out.println("\nPart One: ");
        Product bidhaa = new Product();
        bidhaa.setName("Mafuta");
        bidhaa.setPrice(55.67);
        bidhaa.setQuantity(4);

        System.out.println("Product Details: " + bidhaa.toString());
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
        //create a new instance of the "Triangle" class
        Triangle pembetatu = new Triangle();
        pembetatu.setBase(79.85);
        pembetatu.setHeight(57.87);

        System.out.println("Area of Triangle: " + pembetatu.calculateArea());
    }
}

