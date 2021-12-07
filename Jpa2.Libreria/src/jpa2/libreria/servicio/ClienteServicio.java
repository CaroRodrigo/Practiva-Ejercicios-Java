
package jpa2.libreria.servicio;

import java.util.List;
import javax.persistence.NoResultException;
import jpa2.libreria.dao.ClienteDao;
import jpa2.libreria.entidades.Cliente;


public class ClienteServicio {
    ClienteDao clientedao = new ClienteDao();
    
    public void crearCliente(Long dni, String nombre) throws Exception{
        if (nombre == null || nombre.isEmpty()) {
            System.out.println("Debe ingresar el nombre del cliente");
        }
        
        
        Cliente cliente = new Cliente(dni,nombre);
        clientedao.crearCliente(cliente);
    }
    
    public void mostrarClientes() throws Exception{
            List<Cliente> cliente = clientedao.mostrarClientees();
            for (Cliente cliente1 : cliente) {
                System.out.println(cliente1.toString());
        }
    }
    
    public void eliminarClientePorId(Long dni) throws Exception{
        if (dni == null || dni < 0) {
            System.out.println("Debe ingresar el DNI del cliente a eliminar");
        }
        Cliente cliente = new Cliente(dni);
        clientedao.EliminarCliente(cliente);
    }
    
    public void buscarClientePorDni(Long dni) throws NoResultException{
        if (dni == null || dni < 0) {
            System.out.println("Debe ingresar el nombre del cliente");
        }
        Cliente cliente = new Cliente(dni);
        System.out.println(clientedao.buscarClientePorDni(dni).toString());
    }
}
