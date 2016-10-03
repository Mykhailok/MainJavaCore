package module7.practice;

public class User implements Comparable<User> {
    private String name;
    private int age;

    @Override
    public int compareTo(User userToCompare) {
        //both ways to compare
        //return name.compareTo(userToCompare.getName());
        return this.getName().compareTo(userToCompare.getName());
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }



}
