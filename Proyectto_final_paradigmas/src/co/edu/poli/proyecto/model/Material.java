package co.edu.poli.proyecto.model;

public class Material {
	
	private String nombre;
	
	private String noSerieMaterial;

    private String descripcion;

    private boolean disponible;

    private String tipoMaterial;
    
    public Material(String noSerieMaterial, String nombre, String descripcion, boolean disponible,
			String tipoMaterial) {
		super();
		this.noSerieMaterial = noSerieMaterial;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.disponible = disponible;
		this.tipoMaterial = tipoMaterial;
	}

	public String getNoSerieMaterial() {
		return noSerieMaterial;
	}

	public void setNoSerieMaterial(String noSerieMaterial) {
		this.noSerieMaterial = noSerieMaterial;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public boolean isDisponible() {
		return disponible;
	}

	public void setDisponible(boolean disponible) {
		this.disponible = disponible;
	}

	public String getTipoMaterial() {
		return tipoMaterial;
	}

	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}

	@Override
	public String toString() {
		return "Material [noSerieMaterial=" + noSerieMaterial + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", disponible=" + disponible + ", tipoMaterial=" + tipoMaterial + "]";
	}
}