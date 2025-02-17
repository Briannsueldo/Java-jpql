package app.ProjectEgg.servicio;

import java.util.List;

import app.ProjectEgg.Entidades.Oficina;
import app.ProjectEgg.persistencia.OficinaDAO;

public class OficinaServicio {
    
    private final OficinaDAO oficinaDAO;

    public OficinaServicio() {
        this.oficinaDAO = new OficinaDAO();
    }

    public void buscarOficina(int id) {
        oficinaDAO.buscarOficinaPorId(id);
    }

    public void listarOficinas() throws Exception{
        List<Oficina> todasOficinas = oficinaDAO.listarTodas();
        imprimirLista(todasOficinas);
    }

    public void imprimirLista(List <Oficina> listaRecibida)throws Exception{
        for (Oficina unitariaOficina : listaRecibida){
            System.out.println(unitariaOficina.getCodigodOficina() + " - " + unitariaOficina.getCiudad() + " - " + unitariaOficina.getPais());
        }
    }
}
