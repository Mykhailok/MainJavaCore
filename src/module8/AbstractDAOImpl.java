package module8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class AbstractDAOImpl<T> implements AbstractDAO<T>, GetById<T> {
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

    @Override
    public T getById(long id) {
        getById(id);
        return (T) db;
    }

    @Override
    public void deleteById(long id) {



    }

}
