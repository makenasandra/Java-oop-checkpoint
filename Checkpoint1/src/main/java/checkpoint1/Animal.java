package checkpoint1;

public class Animal {
    String name;
    String color;
    String type;
    int age;

    public Animal(String name, String color, String type, int age){
        this.name = name;
        this.color = color;
        this.type = type;
        this.age = age;

    }

    @Override
    public String toString() {
        return  "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type='" + type + '\'' +
                ", age=" + age;
    }
}
