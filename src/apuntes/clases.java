package apuntes;

import java.util.*;

public class clases {

	public static void main(String[] args) {
		Persona persona1 = new Persona("Sara", "García");
		persona1.mostrar();
		
		// Creamos una variable de tipo persona pero nos dará un error al mostrar ya que no llamamos al constructor
		Persona persona2;
		// Esto es la llamada al constructor para que la persona2 ya existe
		persona2 = new Persona ("Miriam", "García", 57);
		// con esto mostramos a persona2 con la función mostrar hecho por nosotros
		persona2.mostrar();
		
		/* Así podemos destruir el objeto persona2
		 * tenemos que hacerlo a mano ya que java no tiene función que actue como destructor
		 * */
		persona2 = null;
		/* También podemos de alguna manera "sobrescribir" sobre el objeto persona2 y entonces el anterior
		 * registro no se reconocería, pero sigue en memoria solo que ya no es referenciado
		 * */
		persona2 = new Persona ("Laura", "García", 57);
		
		// Nos muestra 3 porque al no tener destructor tiene en cuena la persona que ya hemos "borrado"
		System.out.println(persona1.getNumPersonas());
		System.out.println(persona2.getNumPersonas());
		
		Profesor profesor1 = new Profesor("Jose María","Morales");
		System.out.println(profesor1.getNombre());
		
		Alumno alumno1 = new Alumno("Sara","García",19);
		System.out.println(alumno1.getNombre());
		
		System.out.println("---- Diferenciar entre alumno y profesor ----");
		System.out.println(alumno1.getNombreCompleto());
		System.out.println(profesor1.getNombreCompleto());

	}
}
