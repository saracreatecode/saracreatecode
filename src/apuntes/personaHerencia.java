package apuntes;

/* usariamos abtract en vez de public en caso de que no quisieramos que se
 * puedan crear objetos de la clase padre, por ejemplo en un aula no queremos
 * que haya ningún tipo de persona que no sea ni alumnos ni profesores
 */
abstract class personaHerencia {
	// private son objetos que no se puede manipular desde fuera ni se hereda
	// Mientras que proitected no se puede manipular desde fuera pero si se hereda
	protected String nombre = "";
	protected String apellidos = "";

	public personaHerencia(String nom, String ape) {
		this.nombre = nom;
		this.apellidos = ape;
	}
	
	// ---- CLASES ABSTRACTAS ----
	/* Todas las clases hijas tienen que desarrollar esta clase de manera
	 * obligatoria se hace no abriendo llaves sino cerrando con punto y coma
	 * y añadiendo los parametros que queramos entre paréntesis. Además estas
	 * clases abstractas solo pueden estar desaarrolladas dentro de otras abstractas
	 */
	// abstract void funcionObligatoria();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombreCompleto() {
		return this.nombre + " " + this.apellidos;
	}

}

class Profesor extends personaHerencia {
	public Profesor(String nom, String ape) {
		// Llama al constructor de la clase padre
		super(nom, ape);
	}
	
	/* Podemos sobrescribir la función de getNombreCompleto en alguna clase
	 * si queremos que se muestre de alguna otra manera, las clases hijas
	 * tienen preferencia sobre las clases padre
	 */
	public String getNombreCompleto() {
		//return "Señor Don " + this.nombre + " " + this.apellidos;
		
		/* Podemos llamar a la función padre sin tener que sobreescribirla
		 * para los casos en los que nuestra clase padre sea muy extensa
		 * y los cambios que queramos hacer sean tonterías
		 */
		return "Señor Don " + super.getNombreCompleto();
	}

}

class Alumno extends personaHerencia {
	private int edad;

	// Añado en el constructor el campo edad
	public Alumno(String nom, String ape, int edad) {
		// super se usa para llamar al constructor de la clase padre desde la clase hija
		super(nom, ape);
		// Además del super tengo que añadir el nuevo atributo edad que necesitamos en los alumnos
		this.edad = edad;
	}
}
