package app.ProjectEgg.persistencia;

import java.util.List;

import app.ProjectEgg.Entidades.Oficina;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class OficinaDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("vivero2");
	EntityManager em = emf.createEntityManager();

    public void guardaOficina(Oficina oficina) throws Exception {
        em.getTransaction().begin();
        em.persist(oficina);
        em.getTransaction().commit();
    }

    public void buscarOficinaPorId(int id) {
        Oficina oficina = em.find(Oficina.class, id);

        System.out.println(oficina.toString());
    }

    public List <Oficina> listarTodas() throws Exception{
        return em.createQuery("SELECT o FROM Oficina o", Oficina.class)
        .getResultList();
    }
}
