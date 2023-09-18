package sys.dao;

import java.util.List;
import sys.modelo.Vendedor;

public interface VendedorDAO {

    /*Los métodos abstractos no tienen un cuerpo */
    public List<Vendedor> select();

    /*variable cliente: Un objeto de tipo Cliente */
    public void insert(Vendedor vendedor);

    public void update(Vendedor vendedor);

    public void delete(Vendedor vendedor);

}
