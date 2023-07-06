package checkpoint1;


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
