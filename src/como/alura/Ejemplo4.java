package como.alura;

import java.util.ArrayList;

import model.Curso;

public class Ejemplo4 {
	public static void main(String[] args) {
		// Añadir objetos a una lista
		Curso curso1 = new Curso("Geometria",30);
		Curso curso2 = new Curso("Fisica",10);
		Curso curso3 = new Curso("Quimica",20);
		Curso curso4 = new Curso("Historia",50);
		ArrayList<Curso> cursos = new ArrayList<>();
		cursos.add(curso1);
		cursos.add(curso2);
		cursos.add(curso3);
		cursos.add(curso4);
		System.out.println(cursos);
	}
}
