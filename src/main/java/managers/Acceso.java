package managers;

import java.util.List;

import org.hibernate.Session;

import entidades.Alumno;

public class Acceso {
	
	Alumno a = new Alumno();
	public void insertarAlumno(Alumno a) {
		/*El método llama a los métodos getter del objeto alumno para recuperar sus propiedades*/
		a.getNombre();
		a.getApellidos();
		a.getCurso();
		a.getNumAsig();
		a.getEdad();
		//Se abre una sesión
		Session session = ManagerMain.sessionFactory.openSession();
		//Se inicia una transacción
		session.beginTransaction();
		//Se guarda el objeto de Alumno en la base de datos
		session.persist(a);
		//Se comitea la transacción
		session.getTransaction().commit();
		//Se cierra la sesión
		session.close();
		System.out.println("Alumno insertado con exito");
	}
	
	public void listarAlumnos() {
		//Se abre una sesión	
		Session session = ManagerMain.sessionFactory.openSession();
		//Ejecuta una consulta SELECT para obtener todos los objetos de Alumno de la base de datos
		List<Alumno> alumnos = session.createQuery("SELECT a FROM Alumno a", Alumno.class).getResultList();
		//Recorre la lista de objetos de Alumno
		for (Alumno a : alumnos) {
			//Imprime las propiedades elegidas
			System.out.println(a.getId()+" "+a.getNombre() + " " + a.getApellidos() + " " + a.getCurso() + " " + a.getNumAsig()+ " " + a.getEdad());
		}
		//Se cierra la sesión
		session.close();
	}
}
