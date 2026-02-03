package primos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class main {
	public static void main(String[] args) {
		HashSet<Integer> conjunto1 = devuelveConjuntoPrimos();
		HashSet<Integer> conjunto2 = devuelveConjuntoPrimos();
		System.out.println(conjunto1);
		System.out.println(conjunto2);
		
		ordenarConjunto(conjunto1);
		ordenarConjunto(conjunto2);
		
		System.out.println("Union: ");
		HashSet<Integer> union = new HashSet<>(conjunto1);
		HashSet<Integer> interseccion = new HashSet<>(conjunto1);
		union.addAll(conjunto2);
		ordenarConjunto(union);
		
		System.out.println("Intersección: ");
		interseccion.retainAll(conjunto2);
		ordenarConjunto(interseccion);
		
		System.out.println("Números primos del 1-100 que no están en la unión: ");
		HashSet<Integer> todosPrimosDelUnoAlCien = obtenerTodosLosPrimos(1,100);
		todosPrimosDelUnoAlCien.removeAll(union);
		ordenarConjunto(todosPrimosDelUnoAlCien);
	}
	
	private static HashSet<Integer> obtenerTodosLosPrimos(int n1, int n2) {
		HashSet<Integer> conjunto = new HashSet<>();
		for (int i=n1; i<n2; i++) {
			if (esPrimo(i)) {
				conjunto.add(i);
			}
		}
		return conjunto;
	}

	public static boolean esPrimo(int numero) {
		boolean primo = true;
		int raiz = (int) Math.sqrt(numero) + 1;
		if (numero % 2 != 0 || numero==2) {
			for (int i = 3; i < raiz && primo == true; i += 2) {
				if (numero % i == 0) {
					primo = false;
				}
			}
		} else {
			primo = false;
		}
		return primo;
	}
	
	public static HashSet devuelveConjuntoPrimos() {
		HashSet<Integer> conjunto = new HashSet<>();
		while (conjunto.size()!=10) {
			int numero = (int)(Math.random()*100)+1;
			if (esPrimo(numero)) {
				conjunto.add(numero);
			}
		}
		return conjunto;
	}
	
	public static void ordenarConjunto(HashSet<Integer> conjunto) {
		int[] vector = new int[conjunto.size()];
		int i = 0;
		for (int n:conjunto) {
			vector[i] = n;
			i++;
		}
		Arrays.sort(vector);
		for (int n:vector) {
			if (i == vector.length-1) {
				System.out.print(n);
			} else {
				System.out.print(n + ", ");
			}
			i++;
		}
		System.out.println("\n-----------");
	}
}