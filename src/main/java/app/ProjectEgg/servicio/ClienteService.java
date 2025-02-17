package app.ProjectEgg.servicio;

import java.util.List;

import app.ProjectEgg.Entidades.Cliente;
import app.ProjectEgg.persistencia.ClienteDAO;

public class ClienteService {
    
    private final ClienteDAO clienteDAO;

    public ClienteService () {
        this.clienteDAO = new ClienteDAO();
    }

    public void listarPorCiudad(String ciudad) throws Exception {
        List<Cliente> listaClientes = clienteDAO.listarPorCiudad(ciudad);
        imprimirLista(listaClientes);
    }

    public void imprimirLista(List <Cliente> listaRecibida) throws Exception{
        listaRecibida.forEach(System.out::println);
    }
}
