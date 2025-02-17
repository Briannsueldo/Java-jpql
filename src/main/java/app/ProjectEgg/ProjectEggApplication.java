package app.ProjectEgg;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import app.ProjectEgg.servicio.ClienteService;
import app.ProjectEgg.servicio.EmpleadoServicio;
import app.ProjectEgg.servicio.OficinaServicio;

@SpringBootApplication
public class ProjectEggApplication {

	public static void main(String[] args) throws Exception {
		SpringApplication.run(ProjectEggApplication.class, args);

		/* EntityManagerFactory emf = Persistence.createEntityManagerFactory("vivero2");
		EntityManager em = emf.createEntityManager(); */

		/* Pedido pedido = em.find(Pedido.class, 1);

		System.out.println(pedido.getCodigoPedido()); */

		/* OficinaServicio oficinaServicio = new OficinaServicio();

		oficinaServicio.listarOficinas(); */

		/* EmpleadoServicio empleadoServicio = new EmpleadoServicio(); */

		/* int id = 1; */

		/* empleadoServicio.buscarEmpleadoPorOficina(1); */

		ClienteService clienteService = new ClienteService();

		clienteService.listarPorCiudad("drid");
	}

}
