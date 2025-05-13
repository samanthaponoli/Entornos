
package monlau;

import monlau.dao.ProductoDAO;
import monlau.dao.ProductoDAOImpl;
import monlau.model.Producto;

public class ProductoManager {
    public static void main(String[] args) {
        //VAMOS A SEGUIR LA ESTRUCTURA DEL CRUD (Create, Read, Update, Delete)
        
        //crear un nuevo producto
        
        ProductoDAO producto =new ProductoDAOImpl();
        
        
        //agregar nuevo producto
        producto.insert(new Producto(1,"pollo", 10.0));
        producto.insert(new Producto(2,"carne", 20.0)); 
        producto.insert(new Producto(3,"lapiz", 10.0));  

    }
}
