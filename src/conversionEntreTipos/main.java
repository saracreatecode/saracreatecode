package conversionEntreTipos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		// metodo Sort de colecciones investigar
		
		HashSet<Integer> conjuntoNumeros = new HashSet<>(Arrays.asList(1,44,55,67,77,23,15));
		ArrayList<Integer> listaNumeros = new ArrayList<>(List.of(2,55,6,2,3,77,8,55,1,2,6));
		int[] vector = {4,5,6,22,4,1,7,9};
		
		// CONVERSIÓN DE ARRAY A ARRAYLIST O HASHSET
		// 1. Primero creamos un ArrayList o conjunto vacío
		ArrayList<Integer> vectorLista = new ArrayList<>();
		//2. Ahora recorremos el Array para poder ir guardando cada uno de los datos en el conjunto
		for (int n:vector) {
			vectorLista.add(n);
		}
		System.out.println(vectorLista);
		
		// CONVERSIÓN DE ARRAY A HASHSET
		// Funciona de la misma manera
		HashSet<Integer> vectorConjunto = new HashSet<>();
		for (int n:vector) {
			vectorConjunto.add(n);
		}
		System.out.println(vectorConjunto);
		
		// CONVERSIÓN DE ARRAYLIST A ARRAY
		// 1. Primero creamos un Array vacío con el size del ArrayList para asignarle el tamaño necesario
		int[] vectorListaNumeros = new int[listaNumeros.size()];
		// 2. Llevamos el contador fuera y la vamos incrementando guardando la posición
		int i = 0;
		for (int n:listaNumeros) {
			vectorListaNumeros[i] = listaNumeros.get(i);
			i++;
		}
		// 3. Recorremos la lista para comprobar que funciona correctamente
		for (int n:vectorListaNumeros) {
			System.out.print(n + " - ");
		}
		
		// CONVERSIÓN DE HASHSET A ARRAY
		// Funciona de la misma manera
		System.out.println("");
		int[] vectorConjuntoNumeros = new int[listaNumeros.size()];
		int j = 0;
		for (int n:conjuntoNumeros) {
			vectorConjuntoNumeros[j] = n;
			j++;
		}
		for (int n:vectorConjuntoNumeros) {
			System.out.print(n + " - ");
		}
		
		
		
	}
}