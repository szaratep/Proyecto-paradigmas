package co.edu.poli.proyecto.model;

public class Profesor extends Usuario {
	
	public Profesor(int id, String nombre, int codigoMaestro, String materiaDictada) {
		super(id, nombre);
		this.codigoMaestro = codigoMaestro;
		this.materiaDictada = materiaDictada;
	}

	private int codigoMaestro;

    private String materiaDictada;

	public int getCodigoMaestro() {
		return codigoMaestro;
	}

	public void setCodigoMaestro(int codigoMaestro) {
		this.codigoMaestro = codigoMaestro;
	}

	public String getMateriaDictada() {
		return materiaDictada;
	}

	public void setMateriaDictada(String materiaDictada) {
		this.materiaDictada = materiaDictada;
	}

	@Override
	public String toString() {
		return "Profesor [codigoMaestro=" + codigoMaestro + ", materiaDictada=" + materiaDictada + "]";
	}

	@Override
	public boolean verificacionPrestamo() {
		// TODO Auto-generated method stub
		return false;
	}

}