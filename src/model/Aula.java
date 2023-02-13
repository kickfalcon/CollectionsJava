package model;

//import java.util.List;

public class Aula{
	private String name;
	public Aula(String name) { this.name= name; }
	public String getName() { return name; }
	public void setName(String name) { this.name = name; }	
	@Override
	public String toString() {
		return this.name;
	}
}
