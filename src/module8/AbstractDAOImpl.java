package module8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class AbstractDAOImpl<T> implements AbstractDAO<T>{

    List<T> db = new ArrayList<T>();
    long id;
    String name;

    public AbstractDAOImpl(long id, String name) {
        this.id = id;
        this.name = name;
    }

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
}
