package daos;

import java.util.List;

public class DAO<T> {


    public void findById(int id){};

    public List findAll(){return null;};
    public T update(T dto){return null;}
    public T create(T dto){return null;}
    public void delete(int id){}


}
