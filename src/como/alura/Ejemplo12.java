package como.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Ejemplo12 {
	public static void main(String[] args) {
		String Alumno1 = "Luis Miguel";
		String Alumno2 = "Pepito los Palotes";
		String Alumno3 = "Juan Carlos";
		String Alumno4 = "Pedro Pedrito";
		String Alumno5 = "Gustavo Sanchez";
		String Alumno6 = "Marcia Maria";
		String Alumno7 = "Gustavo Sanchez";
		String Alumno8 = "Marcia Maria";
		
		Collection<String> listaAlumnos = new HashSet<>();// no permite objetos duplicados
		listaAlumnos.add(Alumno1);
		listaAlumnos.add(Alumno2);
		listaAlumnos.add(Alumno3);
		listaAlumnos.add(Alumno4);
		listaAlumnos.add(Alumno5);
		listaAlumnos.add(Alumno6);
		listaAlumnos.add(Alumno7);
		listaAlumnos.add(Alumno8);
		
		listaAlumnos.forEach(alumno -> {
			System.out.println(alumno);
		});
		
	}
}
