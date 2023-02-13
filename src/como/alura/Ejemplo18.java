package como.alura;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

import model.Alumno;
import model.Curso;

public class Ejemplo18 {
	public static void main(String[] args) {
		Curso curso1 = new Curso("Algebra",30);
		
		Alumno alumno1 = new Alumno("Luis Miguel","001");
		Alumno alumno2 = new Alumno("Pepito los Palotes","002");
		Alumno alumno3 = new Alumno("Juan Carlos","003");
		Alumno alumno4 = new Alumno("Pedro Pedrito","004");
		Alumno alumno5 = new Alumno("Gustavo Sanchez","005");
		Alumno alumno6 = new Alumno("Marcia Maria","006");
		Alumno alumno7 = new Alumno("Claudia Patricia","007");
	
		curso1.addAlumno(alumno1);
		curso1.addAlumno(alumno2);
		curso1.addAlumno(alumno3);
		curso1.addAlumno(alumno4);
		curso1.addAlumno(alumno5);
		curso1.addAlumno(alumno6);
		curso1.addAlumno(alumno7);
		
		//curso1.getAlumnos().forEach(alumno ->System.out.println(alumno));
		Alumno alumnoMap = curso1.getAlumnoMap().get("003");
		
		curso1.getAlumnoMap().forEach((code, alumno)->{
			System.out.println(alumno);
		});
		// se usa el map cuando se busca una condicion unica
		// System.out.println(alumnoMap);
		
	}
}
