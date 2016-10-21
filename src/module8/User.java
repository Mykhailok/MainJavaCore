package module8;

import java.util.ArrayList;
import java.util.List;

public class User<T,I> implements GetById<I>{
    long id;
    String name;
    List<User> db = new ArrayList<User>();
    User user = new User(id, name);
    List<I> newList = new ArrayList<I>();

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

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public I getById(long id) {
        for (User byId : db){
            if (byId.getId() == this.id){
            newList.add((I) byId);
            }

        }
        return (I) newList;
    }


    public I deleteById(long id) {
        for (User delId : db){
            if (delId.getId()==this.id){
                db.remove(delId);
            }
        }
        return (I) db;
    }
}
