package module9.offline.data;

import module9.offline.model.Animal;
import module9.offline.model.Dog;

import java.util.ArrayList;
import java.util.List;


public class DataModule {

    private List<Animal> animals = new ArrayList<>();

    public DataModule(){
        for (int i=0; i<10;i++) {
            animals.add(new Dog("Name"+i, i));
        }
    }

    public void add(Animal a){
        animals.add(a);
    }

    public void remove(Animal a){
        animals.remove(a);
    }
    public List<Animal> getAnimals(Animal a){
        return animals;
    }
}
