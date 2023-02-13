package como.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import model.Curso;

public class Ejemplo10 {
	public static void main(String[] args) {
		Curso curso4 = new Curso("Historia",50);
		Curso curso1 = new Curso("Algebra",30);
		Curso curso3 = new Curso("Aritmetica",20);
		Curso curso2 = new Curso("Geometria",10);
		Curso curso5 = new Curso("Fisica",60);
		Curso curso6 = new Curso("Quimica",80);
		Curso curso7 = new Curso("Quimica",70);
		Curso curso8 = new Curso("Fisica",30);
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		cursos.add(curso5);
		cursos.add(curso6);
		cursos.add(curso7);
		cursos.add(curso8);
		
		List<Curso> cursoList = cursos.stream().filter(curso -> !curso.getName().equalsIgnoreCase("PHP")).sorted(Comparator.comparing(Curso::getName).reversed()).collect(Collectors.toList());
		System.out.println(cursoList);
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).sum());
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).average().getAsDouble());
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).max().getAsInt());
		System.out.println(cursos.stream().mapToInt(Curso::getTiempo).min().getAsInt());
		Map<String, List<Curso>> groupCurso = cursos.stream().collect(Collectors.groupingBy(Curso::getName));
		groupCurso.forEach((key,value) -> System.out.println(key + "-" + value.size()));
		System.out.println(cursos.parallelStream().mapToInt(Curso::getTiempo).sum());
	}
}
