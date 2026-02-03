package apuntes;
/* Dentro del mismo package guardamos todas las clases relacionadas con el
 * mismo programa,  tendría que tener una main SI O SI y las clases private
 * que se relacionen con la main
 * */

public class Persona {
	// Ponemos private delante de las variables para que no se puedan manipular
	private String nombre;
	private String apellidos;
	private int edad;
	/*Esto es una variable común a todos los objetos que se creen de esta clase
	 * para poder por ejemplo contar todos los objetos persona creados con esta clase
	 * */
	private static int numPersonas = 0;
	/* Se puede inicializar los datos aquí 
	 * private int endad = 0;
	 * pero no se suele hacer ya que se usan los contrstructores
	 * (diferencia entre objeto y clase)
	 * */

	// Nos devolverá el numero de personas incrementado en la función Persona
	public int getNumPersonas() {
		return numPersonas;
	}
	
	// CONSTRUCTOR:
	// Siempre tienen que llamarse igual que la clase
	/* Creamos un objeto para que reciba los datos que necesitamos, en caso de
	 * que algún dato no nos fuera relevante podremos decidir no pasarselo al
	 * constructor, como por ejemplo en este caso el dato "edad".
	 * This define que ese nombre y apellido es único para el objeto que vayamos
	 * a crear por ejemplo cada alumno tendrá su único nombre y apellido
	 * */
	public Persona(String nom, String ape) {
		this.nombre = nom;
		this.apellidos = ape;
		// Aquí podemos incrementar que cada vez se cree una persona sume uno
		numPersonas++;
	}
	
	/* CONSTRUCTOR QUE RECIBE DATOS:
	 * Siempre tienen que llamarse igual que la clase, puedes tener tantos constructores
	 * como quieras solo que tienen que tener alguna diferencia entre ellos de tipo de dato
	 * */
	public Persona(String nom, String ape, int eda) {
		this.nombre = nom;
		this.apellidos = ape;
		this.edad = eda;
		numPersonas++;
	}
	
	/* Método para recuperar y escribir de manera automñatica la info
	 * */
	
	/* creamos un método(función) que incrementa la edad, no ponemos el
	 * static delante. Si ponemos private en vez de public no podremos ejecutar
	 * la función. Normlamnete las funciones en programación son públicas
	 * mientras que los datos en clases son privados
	*/
	public void incrementaEdad() {
		/* "this" Simboliza el elemento con el que estámos trabajando,
		 * se usa dentro de los métodos */
		this.edad++;
	}
	
	
	public void mostrar() {
		System.out.println(this.apellidos + ", " + this.nombre);
	}
	
	// Creamos otro método para que nos muestre el nombre por pantalla Source > Generate Getters and Setters
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

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public static void setNumPersonas(int numPersonas) {
		Persona.numPersonas = numPersonas;
	}
}
