package app.ProjectEgg.persistencia;

import java.util.List;

import app.ProjectEgg.Entidades.Empleado;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class EmpleadoDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("vivero2");
	EntityManager em = emf.createEntityManager();

    public List <Empleado> listarEmpleadosPorOficina(int oficina) throws Exception{
        return em.createQuery("SELECT emp FROM Empleado emp WHERE emp.Oficina.idOficina = :oficina", Empleado.class)
        .setParameter("oficina", oficina)
        .getResultList();
    }
}
