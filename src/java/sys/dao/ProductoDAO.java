package sys.dao;

import java.util.List;
import sys.modelo.Producto;

public interface ProductoDAO {

    /*Los métodos abstractos no tienen un cuerpo */
    public List<Producto> select();

    /*variable cliente: Un objeto de tipo Cliente */
    public void insert(Producto producto);

    public void update(Producto producto);

    public void delete(Producto producto);

}
