package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> alumnos = new ArrayList<>();
		ArrayList<Integer> numeros = new ArrayList<>();
		
		// El metodo collections no devuelve nada por lo que no podemos meterlo en un syso
		Collections.addAll(numeros, 44, 56, 1, 2, 55, 7, 3, 3, 44, 2, 36, 25);
		Collections.addAll(alumnos, "Sara", "Sergio", "Alex", "Jordan", "Mario");
		System.out.println(numeros);
		System.out.println(alumnos);
		
		System.out.println("Ordenadas con sort");
		Collections.sort(numeros);
		Collections.sort(alumnos);
		System.out.println(numeros);
		System.out.println(alumnos);
		
		System.out.println("Mezcladas de manera aleatoria con shuffle");
		Collections.shuffle(numeros);
		Collections.shuffle(alumnos);
		System.out.println(numeros);
		System.out.println(alumnos);
		
		// En caso de que queramos ordenarlo de manera alfabética inversa hacemos un sort primero
		System.out.println("Le da la vuelta a la lista con reverse");
		// Primero ordenamos de manera correcta y luego hacemos el reverse
		Collections.sort(numeros);
		Collections.sort(alumnos);
		Collections.reverse(numeros);
		Collections.reverse(alumnos);
		System.out.println(numeros);
		System.out.println(alumnos);
		
		// Aún que la lista esté desordenada devuelve el máx y el minimo
		System.out.println("Máximo y mínimo de cada uno de los ArrayList");
		System.out.println(Collections.min(numeros) + " - " + Collections.max(numeros));
		System.out.println(Collections.min(alumnos) + " - " + Collections.max(alumnos));
		
		
		// El número de veces que aparece un elemento en una lista
		System.out.println("Número de veces que aparece un elemento en la lista con frequency");
		System.out.println("El numero 3 aparece " + Collections.frequency(numeros, 3) + " veces.");
		System.out.println("El alumno Sara aparece " + Collections.frequency(alumnos, "Sara") + " vez.");
		
		// Posición de un elemento de manera muy rápida que funciona SOLO si el ArrayList está ordenado
		// Cuando el elemento no está en la lista devuelve un negativo
		System.out.println("Posición de un elemento de manera rápida con binarySearch");
		Collections.sort(numeros);
		Collections.sort(alumnos);
		System.out.println("Posición del elemento 44: " + Collections.binarySearch(numeros, 44));
		System.out.println("Posición del elemento 93: " + Collections.binarySearch(numeros, 93));
		System.out.println("Posición del elemento Sara: " + Collections.binarySearch(alumnos, "Sara"));
		
		
	}
}
