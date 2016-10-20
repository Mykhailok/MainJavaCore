package module9.offline.model;

/**
 * Created by MihaelKO on 19.10.2016.
 */
public class Dog implements Animal {
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int getage() {
        return age;
    }

    @Override
    public String getName() {
        return name;
    }
}
