package hashset;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class hashset {

	public static void main(String[] args) {
	
	// No se pueden guardar elementos duplicados, en ArrayList si
	// No se recuperan los objetos por su orden de introdución
	// Los ordena automáticamente para que la busqueda sea más rápida
		
	// Así creamos uno vacío
	HashSet<String> alumnos = new HashSet<>();
	// Y así uno con contenido
	HashSet<String> profes = new HashSet<>(Arrays.asList("Jose María Moralres", "Yago Navarrete"));
	//System.out.println(alumnos);
	//System.out.println(profes);
	alumnos.add("Sara García Martín");
	alumnos.add("Sergio Serrano Arroyo");
	alumnos.add("Gabriel Alexandru Iacob");
	System.out.println(alumnos);
	
	/* Debido a que el alumno "Sara" ya pertenecía al HashSet aún que intentemos volver a añadirlo
	 * este no se añadirá a la lista e imprimirá el HashSet tal cual estaba antes, al intentar añadir
	 * un elemento a la lista que ya estaba devuelve un false
	 * */
	alumnos.add("Sara García Martín");
	System.out.println(alumnos);
	
	/* El remove funciona diferente al ArrayList ya que el remove por posición no funcionará debido
	 * a que el HashSet guarda los elementos en las posiciones que el cree convenientes, solo podremos
	 * usar el remove con elemento y no por posición
	 * */
	
	// Usamos contains para saber si está o no está igual que en ArrayList
	if (alumnos.contains("Sara García Martín")) {
		System.out.println("Está en la lista");
	} else {
		System.out.println("No está en la lista");
	}
	
	System.out.println("---------------------");
	
	// Para listar todos los elementos del HashSet con comas sin la coma final
	int i=0;
	for (String alumno:alumnos) {
		if (i != alumnos.size()-1) {
			System.out.print(alumno + ", ");
		} else {
			System.out.print(alumno);
		}
		i++;
	}
	
	/* Si quisieramos eliminar duplicados de un ArrayList podríamos pasarla a HashSet y
	 * luego a lista otra vez
	 * */
	System.out.println("");
	ArrayList<Integer> numeros = new ArrayList<>(List.of(1,4,5,6,1,2,3,4,5,5,6,7,3,9,2,5,8,6,1,6,9,0,1));
	System.out.println("Lista completa con todos los números repetidos: " + numeros);
	HashSet<Integer> numerosUnicos = new HashSet<>(numeros); // Lo duplica y lo hace independiente
	System.out.println("HashSet de números no repetidos: " + numerosUnicos);
	numeros = new ArrayList<>(numerosUnicos);
	System.out.println("Lista nueva con los números no repetidos: " + numeros);
	
	HashSet<Integer>otrosNumeros = numerosUnicos; // referencia
	System.out.println(otrosNumeros);
	otrosNumeros.remove(5);
	System.out.println(otrosNumeros);
	System.out.println(numerosUnicos);
	
	
	// OPERACIONES ENTRE CONJUNTOS
	HashSet<Integer>conjunto1 = new HashSet<>(Arrays.asList(1,2,3,4,5,9));
	HashSet<Integer>conjunto2 = new HashSet<>(Arrays.asList(7,8,4,5));
	
	// Unión
	conjunto1.addAll(conjunto2);
	System.out.println(conjunto1);
	
	// Intersección
	conjunto1.retainAll(conjunto2);
	System.out.println(conjunto2);
	
	// Diferencia eliminando del conjunto1 todos los que están en el conjunto2
	conjunto1.removeAll(conjunto2);
	System.out.println(conjunto1);
	// Diferencia eliminando del conjunto2 todos los que están en el conjunto1
	conjunto2.removeAll(conjunto1);
	System.out.println(conjunto2);
	}
}