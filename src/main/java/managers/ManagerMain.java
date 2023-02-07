package managers;

import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class ManagerMain {
	
	protected static SessionFactory sessionFactory;
	/* Metodo para iniciar una sesión con Hibernate. Se controla posible fallo,
	 * si esta da una excepción durante la creación de la "SessionFactory" se destruye 
	 * y se imprime un mensaje de error*/
	public static void setup() {

		final StandardServiceRegistry registry = new StandardServiceRegistryBuilder().configure().build();
		try {
			sessionFactory = new MetadataSources(registry).buildMetadata().buildSessionFactory();
		} catch (Exception ex) {
			StandardServiceRegistryBuilder.destroy(registry);
			System.out.println(ex);

		}
	}
	
	public static void exit() {
		sessionFactory.close();
	}
}
