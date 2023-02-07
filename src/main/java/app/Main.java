package app;

import java.util.Scanner;

import entidades.Alumno;
import managers.Acceso;
import managers.ManagerMain;


public class Main {

	public static void main(String[] args) {
		
		ManagerMain.setup();
		Acceso acceso = new Acceso();
		Scanner scanner = new Scanner(System.in);
		
		
		// Insertar alumno
		System.out.println("Introduce el nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Introduce los apellidos: ");
		String apellidos = scanner.nextLine();
		
		System.out.println("Introduce el curso: ");
		String curso = scanner.nextLine();
		
		System.out.println("Introduce el número de asignaturas matriculado: ");
		int numAsig = scanner.nextInt();
		
		System.out.println("Introduce la edad: ");
		int edad = scanner.nextInt();
		scanner.close();
		
		//Alumno a = new Alumno("Fran","Gomez","dam",5,22);
		Alumno a = new Alumno(nombre,apellidos,curso,numAsig,edad);
		acceso.insertarAlumno(a);
		acceso.listarAlumnos();
		
	}

}
