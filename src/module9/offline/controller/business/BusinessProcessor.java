package module9.offline.controller.business;

import module9.offline.model.Animal;

import java.util.List;

/**
 * Created by MihaelKO on 19.10.2016.
 */
public interface BusinessProcessor {
    public int getSumOfAgeAnimals();

    public Animal getOldestAnimal();

    public List<Animal> getAnimalsByName(String name);

    public void enrichAnimals (String name, int delta);
}
