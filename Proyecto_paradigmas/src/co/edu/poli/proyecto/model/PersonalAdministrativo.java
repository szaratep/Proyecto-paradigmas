package co.edu.poli.proyecto.model;

public class PersonalAdministrativo extends Usuario {

	public PersonalAdministrativo(int id, String nombre, String correo, int claveAcceso) {
		super(id, nombre);
		this.correo = correo;
		this.claveAcceso = claveAcceso;
	}

	private String correo;

    private int claveAcceso;

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public int getClaveAcceso() {
		return claveAcceso;
	}

	public void setClaveAcceso(int claveAcceso) {
		this.claveAcceso = claveAcceso;
	}

	@Override
	public String toString() {
		return "PersonalAdministrativo [correo=" + correo + ", claveAcceso=" + claveAcceso + "]";
	}

	@Override
	public boolean verificacionPrestamo() {
		// TODO Auto-generated method stub
		return false;
	}
}