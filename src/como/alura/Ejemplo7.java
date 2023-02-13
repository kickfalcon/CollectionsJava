package como.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import model.Aula;
import model.Curso;

public class Ejemplo7 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Java",30);
		curso1.addClase(new Aula("ArrayList"));
		curso1.addClase(new Aula("List"));
		curso1.addClase(new Aula("LinkedList"));
		curso1.addClase(new Aula("Inmutable"));
		
		List<Aula> aulaList=curso1.getAulaList();
		//aulaList.add(new Aula("Inmutable"));
		
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		System.out.println(aulaList);		
	}
}
