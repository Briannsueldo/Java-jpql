package app.ProjectEgg.servicio;

import java.util.List;

import app.ProjectEgg.Entidades.Empleado;
import app.ProjectEgg.persistencia.EmpleadoDAO;

public class EmpleadoServicio {
    
    private final EmpleadoDAO empleadoDAO;

    public EmpleadoServicio () {
        this.empleadoDAO = new EmpleadoDAO();
    }

    public void buscarEmpleadoPorOficina(int oficina) throws Exception {
        List<Empleado> empleadoPorOficina = empleadoDAO.listarEmpleadosPorOficina(oficina);
        imprimirLista(empleadoPorOficina);

    }

    public void imprimirLista(List <Empleado> listaRecibida)throws Exception{
        listaRecibida.forEach(System.out::println);
    }
}
