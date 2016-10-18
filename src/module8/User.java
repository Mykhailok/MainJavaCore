package module8;

public class User {
    long id;
    String name;

    User user1 = new User(100,"Name1");
    User user2 = new User(102,"Name2");
    User user3 = new User(103,"Name3");

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
