package co.edu.poli.proyecto.model;

import java.util.Arrays;

public class Prestamo {

	private Usuario usuarioPrestamo;

    private Material [ ] materialPrestamo;

    private String inicioPrestamo;

    private String finPrestamo;
    
    public Prestamo(Usuario usuarioPrestamo, Material[] materialPrestamo, String inicioPrestamo, String finPrestamo) {
  		super();
  		this.usuarioPrestamo = usuarioPrestamo;
  		this.materialPrestamo = materialPrestamo;
  		this.inicioPrestamo = inicioPrestamo;
  		this.finPrestamo = finPrestamo;
  	}

	public Usuario getUsuarioPrestamo() {
		return usuarioPrestamo;
	}

	public void setUsuarioPrestamo(Usuario usuarioPrestamo) {
		this.usuarioPrestamo = usuarioPrestamo;
	}

	public Material[] getMaterialPrestamo() {
		return materialPrestamo;
	}

	public void setMaterialPrestamo(Material[] materialPrestamo) {
		this.materialPrestamo = materialPrestamo;
	}

	public String getInicioPrestamo() {
		return inicioPrestamo;
	}

	public void setInicioPrestamo(String inicioPrestamo) {
		this.inicioPrestamo = inicioPrestamo;
	}

	public String getFinPrestamo() {
		return finPrestamo;
	}

	public void setFinPrestamo(String finPrestamo) {
		this.finPrestamo = finPrestamo;
	}

	@Override
	public String toString() {
		return "Prestamo [usuarioPrestamo=" + usuarioPrestamo + ", materialPrestamo="
				+ Arrays.toString(materialPrestamo) + ", inicioPrestamo=" + inicioPrestamo + ", finPrestamo="
				+ finPrestamo + "]";
	}
}