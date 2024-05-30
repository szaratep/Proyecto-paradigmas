package co.edu.poli.proyecto.model;

public class Estudiante extends Usuario {

	private String correoInstitucional;

    private int numeroTelefonico;
    
    public Estudiante(int id, String nombre, String correoInstitucional, int numeroTelefonico) {
		super(id, nombre);
		this.correoInstitucional = correoInstitucional;
		this.numeroTelefonico = numeroTelefonico;
	}

	public String getCorreoInstitucional() {
		return correoInstitucional;
	}

	public void setCorreoInstitucional(String correoInstitucional) {
		this.correoInstitucional = correoInstitucional;
	}

	public int getNumeroTelefonico() {
		return numeroTelefonico;
	}

	public void setNumeroTelefonico(int numeroTelefonico) {
		this.numeroTelefonico = numeroTelefonico;
	}

	@Override
	public String toString() {
		return "Estudiante [correoInstitucional=" + correoInstitucional + ", numeroTelefonico=" + numeroTelefonico
				+ "]";
	}

	@Override
	public boolean verificacionPrestamo() {
		// TODO Auto-generated method stub
		return false;
	}
    
    

}