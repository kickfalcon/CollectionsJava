package como.alura;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo11 {
	public static void main(String[] args) {
		String Alumno1 = "Luis Miguel";
		String Alumno2 = "Pepito los Palotes";
		String Alumno3 = "Juan Carlos";
		String Alumno4 = "Pedro Pedrito";
		String Alumno5 = "Gustavo Sanchez";
		String Alumno6 = "Marcia Maria";
		
		Set<String> listaAlumnos = new HashSet<>();// no hay un orden, por lo que obtener una posicion especifica es dificil
		listaAlumnos.add(Alumno1);
		listaAlumnos.add(Alumno2);
		listaAlumnos.add(Alumno3);
		listaAlumnos.add(Alumno4);
		listaAlumnos.add(Alumno5);
		listaAlumnos.add(Alumno6);
		for(String alumno: listaAlumnos) {
			System.out.println(alumno);
		}
		
		
	}
}
