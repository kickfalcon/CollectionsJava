package como.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import model.Aula;
import model.Curso;

public class Ejemplo8 {
	
	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<>());
			add(new ArrayList<>());
		}
	};
	public static void main(String[] args) {
		for(List<Integer> lista: listas) {
			final String nombreImplementacion = lista.getClass().getSimpleName();
			long inicio = System.currentTimeMillis();
			for(int i = 0;i < 100000;i++) {
				lista.add(i);
			}
			long fin = System.currentTimeMillis();
			long duracion = fin-inicio;
			System.out.println(nombreImplementacion + " add: "+duracion );
			//get <- proceso lento
			inicio = System.currentTimeMillis();
			for(int i = 0; i < 100000; i++) {
				lista.get(i);
			}
			fin = System.currentTimeMillis();
			duracion = fin - inicio;
			System.out.println(nombreImplementacion + " get: "+duracion );
			//remove
			inicio = System.currentTimeMillis();
			for(int i = 99999; i >= 0; i--) {
				lista.remove(i);
			}
			fin = System.currentTimeMillis();
			duracion = fin - inicio;
			System.out.println(nombreImplementacion + " remove: "+duracion );
			
			// LinkedList A<->B<->C<->D: genera un entrelazamiento, es lento con el get
			//ArrayListA->B->C->D>: relacion en un solo sentido
		}
	}
}
