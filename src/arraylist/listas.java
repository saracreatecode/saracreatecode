package arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class listas {
	public static void main(String[] args) {
		// ArraLists vacíos
		ArrayList<String> textos = new ArrayList<>();
		ArrayList<Double> notas = new ArrayList<>();
		// También se pueden crear ArrayList de objetos
		
		// Esto es una lista con contenido
		ArrayList<Integer> numeros = new ArrayList<>(List.of(9,8,7,6,5,4,3,2,1));
		ArrayList<Double> precios = new ArrayList<>(List.of(33.5, 56.33, 175.0));
		ArrayList<String> asignaturas = new ArrayList<>(List.of("Programación", "Marcas", "Bases"));
	
		// Nos muestra por pantalla entre corchetes el contenido
		System.out.println(numeros);
		System.out.println(precios);
		System.out.println(asignaturas);
		
		// Para añadir elementos a los ArrayList usamos add de uno en uno
		textos.add("Hola mundo");
		textos.add("Adios");
		notas.add(9.5);
		precios.add(23.12);
		// Comprobamos que se han añadido:
		System.out.println(textos);
		System.out.println(notas);
		System.out.println(precios);
		
		// Para obtener los elementos del array podemos usar su posición con get
		System.out.println(textos.get(1));
		/* Si pusieramos una posición que no existe genera una excepción así que
		 * lo trataremos por medio de try catch para que esto no suceda
		 * */
		
		// Para saber el tamaño de un ArrayList usamos size
		System.out.println(textos.size());
		
		//Para comprobar si un elemento está o no en un ArrayList usamos contains
		ArrayList<String> alumnos = new ArrayList<>(List.of("Jaime", "Adrián", "Lucía", "Óscar", "Lucía"));
		if (alumnos.contains("Lucía")) {
			System.out.println("Está en la lista");
		} else {
			System.out.println("No está en la lista");
		}
		
		// Para mostrar un ArrayList sin corchetes y con comas
		ArrayList<Integer> listaNumeros = new ArrayList<>(List.of(2,55,6,2,3,77,8,55,1,2,6));
		System.out.println(listaNumeros);
		int i = 0;
		for (int n:listaNumeros) {
			if (i == listaNumeros.size()-1) {
				System.out.print(n);
			} else {
				System.out.print(n + ", ");
			}
			i++;
		}
		
		/* Para saber la posición de un elemento en concreto usamos el método
		 * index of si preguntamos por un elemento que no exite nos devuelve un
		 * -1 Este método devuelve la primera posición en la que se encuentra el elemento
		 * */
		System.out.println(alumnos.indexOf("Lucía"));
		// Si queremos encontrar la última posición usaremos lastIndexOf
		System.out.println(alumnos.lastIndexOf("Lucía"));
		
		/* Para eliminar elementos de un ArayList usamos remove, podemos poner un
		 * número y nos eliminaría el elemento que se encuentre en esa posición
		 * si queremos eliminar a la primera lucía especificaríamos el nombre del
		 * elemento
		 * Para saber si una función remove funciona o no con syso comprobamos que
		 * devuelve si falla devuelve false, si funciona devuelve un true, en caso
		 * de que el remove lo hagamos con un entero devolverá el nombre del elemento
		 * borrado
		 * */
		alumnos.remove("Lucía");
		System.out.println(alumnos.remove("Carlos"));
		System.out.println(alumnos.remove(2));
		System.out.println(alumnos);
		
		/* Para borrar numeros enteos de un ArrayList de números enteros tenemos que
		 * poner un cast para poder borrar el número y no el número que se encuentre
		 * en esa posición
		 * */
		numeros.remove((Integer)3);
		System.out.println(numeros.remove((Integer)3));
		
		// Para borrar totalmente un ArrayList usamos clear
		numeros.clear();
		
		// Para comprobar si un ArrayList etá vacío podemos usar size pero también empty
		System.out.println(numeros.size());
		if (numeros.isEmpty()) {
			System.out.println("El ArrayList está vacío");
		}
		
		// Para hacer una copia independiente exacta de un ArrayList usamos el método clone
		ArrayList alumnos2 = (ArrayList) alumnos.clone();
		System.out.println(alumnos2);
		
		/* ArrayList inmutable (no modificable), igual que las tuplas de Python,
		 * se llaman List y no ArrayList
		 * */
		List<Integer> tupla = List.of(9,8,7,6,5,4,3,2,1);
		System.out.println(tupla);
		
		// Para recorrer un ArrayList podemos hacerlo de 2 maneras:
		for (int i1= 0; i1<alumnos.size(); i1++) {
			System.out.println(alumnos.get(i1));
		}
	
		// Recorremos con la clase iterator que sirve para recorrer el ArrayList
		Iterator<String> iterador = textos.iterator();
		// Esto devolvera un false cuando llegue al final del ArrayList
		while(iterador.hasNext()) {
			// Next devolverá el siguiente elemento del ArayList por lo que irá avanzando
			System.out.println(iterador.next());
		}
		
	}
}