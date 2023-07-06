package checkpoint1;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private List<Animal> animals;

    Zoo(){
        this.animals = new ArrayList();
    }

    public void addAnimal(Animal animal){
      this.animals.add(animal);
    }

    public List filterBy(String animalType){
        List<Animal> filteredList = new ArrayList();

        for (Animal animal: this.animals) {
            if(animal.getType().equals(animalType.toLowerCase())){
                filteredList.add(animal);
            }
        }
        return filteredList;
    }

    public int findAverageAge(String type){
        int sum = 0;
        List<Animal> filteredAnimalList = filterBy(type);

        for (Animal animal: filteredAnimalList) {
            sum += animal.getAge();
        }
        System.out.println(filteredAnimalList);
        int averageAge = sum/filteredAnimalList.size();
        return averageAge;
    }

    @Override
    public String toString() {
        return  "animals=" + animals;
    }
}
