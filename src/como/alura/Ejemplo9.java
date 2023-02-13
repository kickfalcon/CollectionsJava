package como.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import model.Curso;

public class Ejemplo9 {
	public static void main(String[] args) {
		Curso curso4 = new Curso("Historia",50);
		Curso curso1 = new Curso("Algebra",30);
		Curso curso3 = new Curso("Aritmetica",20);
		Curso curso2 = new Curso("Geometria",10);
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);

		Collections.sort(cursos,Comparator.comparing(Curso::getName).reversed());
		int mayor = 0;
		for(Curso curso : cursos) {
			if(!curso.getName().equalsIgnoreCase("Historia")) {
				mayor += curso.getTiempo();
			}
		}
		System.out.println(mayor);
		
		List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getName().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getName).reversed()).collect(Collectors.toList());
		System.out.println(cursoList);
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
		System.out.println(cursos.stream().filter(curso -> !curso.getName().equalsIgnoreCase("Historia")).mapToInt(Curso::getTiempo).sum());
	}
}
