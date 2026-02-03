package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		// Cada elemento del diccionario tienen Clave y valor
		// Las claves tienen que ser únicas si incluimos una pareja con la misma clave, remplaza el contenido
		// Buscamos a partir de la clave
		
		// El primero elemento es la clave y el segundo el valor
		HashMap<String, Double> sueldos = new HashMap<>();
		sueldos.put("Jose María", 3000.0);
		sueldos.put("Sara García", 2500.0);
		sueldos.put("Sergio Serrano", 1000.0);
		sueldos.put("Gabriel Alexandru Iacob", 1200.0);
		// Los muestra separados cada elemento por comas y separa clave y valor por un "=" y usa llaves
		System.out.println(sueldos);
		
		// Si queremos actualizar datos sobre escribe
		sueldos.put("Sara García", 2800.5);
		System.out.println(sueldos);
		
		String nombre = "Sara García";
		System.out.printf("El sueldo de %s es de %.2f\n", nombre, sueldos.get(nombre));
		
		// Dice si un elemento existe o no existe
		System.out.println("Saber si un elemento existe o no con containsKey");
		if (sueldos.containsKey(nombre)) {
			System.out.printf("El sueldo de %s es de %.2f\n", nombre, sueldos.get(nombre));
		} else {
			System.out.println("Esa clave no existe");
		}
		
		//Eliminar
		sueldos.remove(nombre);
		
		// RECORRIDOS E ITERACIONES
		
		// Iterar y recorrer el diccionario: Iterator es mejor que for si se realizan cambios dentro del recorrido
		System.out.println("Recorrido con MapEntry:");
		for(Map.Entry<String, Double> persona:sueldos.entrySet()) {
			System.out.printf("%s: %.2f\n", persona.getKey(), persona.getValue());
		}
		
		// Iterar a partir de las claves para poder recuperar con eso el valor con get -FAV
		System.out.println("Recorrido de solo las claves:");
		for (String persona: sueldos.keySet()) {
			System.out.printf("%s: %.2f\n", persona, sueldos.get(persona));
		}
		
		// Iterar si solo necesito los valores sabiendo que no hay manera de extraer las claves de los valores iterando así -FAV
		System.out.println("Recorrido de solo los valores:");
		for (Double sueldo: sueldos.values()) {
			System.out.printf("%.2f\n", sueldo);
		}
		
		// Recorrer con función lambda
		System.out.println("Recorrido con función lambda:");
		sueldos.forEach((nombre2, sueldo2) -> System.out.printf("%s: %.2f\n", nombre2, sueldo2));
	
		// Recorrer cuando hacemos cambios dentro del bucle con Iterator
		System.out.println("Recorrido con Iterator");
		Iterator<Map.Entry<String, Double>> iterador = sueldos.entrySet().iterator();
		while (iterador.hasNext()) {
			Map.Entry<String, Double> persona = iterador.next();
			System.out.printf("%s: %.2f\n", persona.getKey(), persona.getValue());
		}
		
		// Recorrer con Iterator solo clave o valor -FAV
		System.out.println("Recorrido con Iterator pero solo para extraer la clave o valor");
		Iterator<String> iterador2 = sueldos.keySet().iterator();
		while (iterador2.hasNext()) {
			String nombre3 = iterador2.next();
			System.out.printf("%s: %.2f\n", nombre3, sueldos.get(nombre3));
		}
	}	
}
