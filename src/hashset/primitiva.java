package hashset;

import java.util.HashSet;

public class primitiva {

	public static void main(String[] args) {
		HashSet<Integer> primitiva = new HashSet<>();
		while (primitiva.size() != 6 ) {
			primitiva.add((int)(Math.random()*49+1));
		}
		System.out.println(primitiva);
	}
}