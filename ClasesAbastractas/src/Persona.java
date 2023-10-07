
public abstract class Persona {
	
	public Persona(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();

	private String nombre;
}
