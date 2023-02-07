package entidades;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="alumnos")
public class Alumno{
	
	@Id
	@Column(name ="alumno_id")//Referencia para mapeo,configuración previa en hibernate.cfg.xml
	@GeneratedValue(strategy = GenerationType.IDENTITY)//Indica id como auto_increment
	private int id;
	
	private String nombre;
	private String apellidos;
	private String curso;
	private int numAsig;
	private int edad;

	//CONSTRUCTORS
	public Alumno() {
		super();
	}
	public Alumno(String nombre, String apellidos, String curso, int numAsig, int edad) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.curso = curso;
		this.numAsig = numAsig;
		this.edad = edad;
	}
	// GETTERS AND SETTERS
	public int getId() {
		return id;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCurso() {
		return curso;
	}
	public void setCurso(String curso) {
		this.curso = curso;
	}
	public int getNumAsig() {
		return numAsig;
	}
	public void setNumAsig(int numAsig) {
		this.numAsig = numAsig;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/*-----------------------------------------*/
}
