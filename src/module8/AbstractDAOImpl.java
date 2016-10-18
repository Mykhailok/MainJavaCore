package module8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static javafx.scene.input.KeyCode.M;


public class AbstractDAOImpl<T> implements AbstractDAO<T>{
    List<T> db = new ArrayList<T>();
    User user1 = new User(100, "Name");
    User user2 = new User(102,"Name2");
    User user3 = new User(103,"Name3");

    @Override
    public T save(T t) {
        db.add(t);
        return t;
    }

    @Override
    public void delete(T t) {
        db.remove(t);
    }

    @Override
    public T get(long id) {
        for (int i = 0; i < db.size(); i++){
            if (db.get(i).equals(id)){
                System.out.println(id);
            }
        }
        return null;
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public void deleteAll(Collection t) {
        db.removeAll(t);

    }

    @Override
    public void saveAll(Collection t) {

        db.addAll(t);

    }

    @Override
    public T getList(Collection t) {

        db.addAll(t);

        return (T) db;

    }
}
