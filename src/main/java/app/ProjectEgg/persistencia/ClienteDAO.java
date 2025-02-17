package app.ProjectEgg.persistencia;

import java.util.List;

import app.ProjectEgg.Entidades.Cliente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class ClienteDAO {

    EntityManagerFactory emf = Persistence.createEntityManagerFactory("vivero2");
	EntityManager em = emf.createEntityManager();

    public List<Cliente> listarPorCiudad(String ciudad) throws Exception {
        return em.createQuery("SELECT cl FROM Cliente cl WHERE cl.ciudad LIKE :ciudad", Cliente.class)
        .setParameter("ciudad", "%" + ciudad + "%")
        .getResultList();
    }
}
