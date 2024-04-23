package co.edu.poli.proyecto.model;

public abstract class Usuario {
	
    public Usuario(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}

	private int id;

    private String nombre;

    public abstract boolean verificacionPrestamo();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nombre=" + nombre + "]";
	}
}