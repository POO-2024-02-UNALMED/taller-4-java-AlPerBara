package classroom;

public enum Tipo {
	DISCIPLINAR(10,"Disciplinar"),FUNDAMENTACION(20,"Fundamentación"),ELECTIVA(30,"Electiva"); //Completos atributos
	
	private int codigo;
	private String nombre;
	Tipo(int codigo,String nombre) { //No deja ser publico
		this.codigo = codigo;
		this.nombre = nombre;
	}
}