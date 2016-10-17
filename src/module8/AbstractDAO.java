package module8;

import java.util.Collection;

public interface AbstractDAO<T> {

    T save(T t);

    void delete(T t);

    void deleteAll(Collection<T> t );

    void saveAll(Collection<T> t );

    T getList(Collection<T> t );



    //void get(long id);

    //void deleteById(long id);

}
