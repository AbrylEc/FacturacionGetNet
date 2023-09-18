package sys.dao;

import java.util.List;
import sys.modelo.Cliente;

public interface ClienteDAO {
    
     /*Los métodos abstractos no tienen un cuerpo */
    public List<Cliente> select();
    
    /*variable cliente: Un objeto de tipo Cliente */
    public void insert (Cliente cliente);
    public void update (Cliente cliente);
    public void delete (Cliente cliente);
    
}
