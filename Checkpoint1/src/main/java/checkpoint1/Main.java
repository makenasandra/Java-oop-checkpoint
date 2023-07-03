package checkpoint1;


public class Main {
    public static void main(String[] args){

        Animal animalia = new Animal("hippo", "dark red", "mammal", 10);
        Animal animal2 = new Animal("elephant", "grey", "mammal", 10);
        Animal animal3 = new Animal("lion", "brown", "mammal", 10);
        Animal animal4 = new Animal("snake", "black", "reptile", 10);

        System.out.println(animalia.toString());

        Zoo zoo1 = new Zoo();

        System.out.println(zoo1.toString());

        zoo1.addAnimal(animalia);
        zoo1.addAnimal(animal2);
        zoo1.addAnimal(animal3);
        zoo1.addAnimal(animal4);

    }
}
