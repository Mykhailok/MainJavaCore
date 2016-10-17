package module8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class AbstractDAOImpl<T> implements AbstractDAO<T> {

    List<T> db = new ArrayList<T>();

    @Override
    public void save(T t) {
        db.add(t);
    }

    @Override
    public void delete(T t) {
        db.remove(t);
    }

    @Override
    public void deleteAll(Collection<T> t) {

        db.removeAll(t);

    }

    @Override
    public void saveAll(Collection<T> t) {

        db.addAll(t);

    }

    @Override
    public void getList(Collection<T> t) {


    }
}
