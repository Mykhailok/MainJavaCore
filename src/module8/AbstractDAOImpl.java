package module8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;


public class AbstractDAOImpl<T> implements AbstractDAO<T>, GetById<T> {
    List<T> db = new ArrayList<T>();

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
    public T getById(long id) {
        return null;
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
    public  void  deleteById(long id) {

        deleteById(id);

    }


    @Override
    public T getByIdUsr(long id) {
        return null;
    }
}
