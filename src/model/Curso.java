package model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
//import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class Curso{
	private String name;
	private int tiempo;
	private List<Aula> aulaList= new ArrayList<>();
	private Collection<Alumno> alumnos = new HashSet<>();
	//private Collection<Alumno> alumnos = new LinkedHashSet<>();
	private Map<String,Alumno> alumnoMap = new HashMap<>();
	
	public Curso(String name, int tiempo) {
		this.name = name;
		this.tiempo = tiempo;
	}
	public Curso(String name, int tiempo,List<Aula> aulaList) {
		this.name = name;
		this.tiempo = tiempo;
		this.aulaList = aulaList;
	}
	public List<Aula> getAulaList() {	return Collections.unmodifiableList(aulaList); }
	public void setAulaList(List<Aula> claseList) { this.aulaList = claseList; }
	
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }
	
	public int getTiempo() { return tiempo;	}
	public void setTiempo(int tiempo) { this.tiempo = tiempo; }
	
	public void addClase(Aula clase) {
		this.aulaList.add(clase);
	}	
	public void addAlumno(Alumno alumno) { this.alumnos.add(alumno); this.alumnoMap.put(alumno.getCode(), alumno); }
	public boolean verificaAlumno(Alumno alumno) { return this.alumnos.contains(alumno); }
	public Collection<Alumno> getAlumnos(){ return alumnos; }
	public Map<String, Alumno> getAlumnoMap() { return alumnoMap; }
	@Override
	public String toString() {
		return this.name;
	}
}
