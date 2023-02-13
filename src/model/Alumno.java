package model;

//import java.util.List;

public class Alumno{
	private String name, code;
	public Alumno(String name, String code) { 
		this.name= name;
		this.code =code;
	}
	public String getName() { return name; }	
	public String getCode() { return code; }
	@Override
	public String toString() {
		return this.name;
	}
	@Override
	public boolean equals(Object obj) {
		Alumno alumno = (Alumno) obj;
		return this.name.equals(alumno.getName());
	}
	@Override
	public int hashCode() {
		return this.name.hashCode();
	}
}
