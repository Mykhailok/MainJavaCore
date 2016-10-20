package module9.offline.controller.business;

import module9.offline.data.DataModule;
import module9.offline.model.Animal;

import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;


public class BusinessProcessorImpl implements BusinessProcessor {
    private DataModule dataModule;

    public BusinessProcessorImpl(DataModule dataModule) {
        this.dataModule = dataModule;
    }

    @Override
    public int getSumOfAgeAnimals() {
        //Stream<Animal> s = dataModule.getAnimals().stream();
        //s.reduce((animal, animal2) -> {return animal.getage()+animal2.getage()});
        return 0;
    }

    @Override
    public Animal getOldestAnimal() {
        return null;
    }

    @Override
    public List<Animal> getAnimalsByName(String name) {
        return null;
    }

    @Override
    public void enrichAnimals(String name, int delta) {

    }
}
