package co.edu.poli.proyecto.services;

import co.edu.poli.proyecto.model.*;

public class ImpleOperacion implements Operacion {

	private Material [] arreglo;
	
	private Usuario [] arrEstudiante;
	
	private Prestamo [] arrPrestamo;
	
	public ImpleOperacion() {
		super();
		this.arreglo = new Material[3];
		this.arrEstudiante = new Estudiante [3];
		this.arrPrestamo = new Prestamo [3];
	}

	public String create(Material material) {
		for(int i= 0; i<arreglo.length; i++) {
			if (arreglo[i]==null) {
				arreglo[i] = material;
				return "El objeto se agrego correctamente.";
			}
		}
		if (arreglo.length==3) {
			Material [ ] arr = new Material [arreglo.length*2];
			for (int j = 0; j<arreglo.length;j++) {
				arr [j] = arreglo [j];
			}
			arreglo = arr;				
			for(int c= 0; c<arreglo.length; c++) {
				if (arreglo[c]==null) {
					arreglo[c] = material;
					return "El objeto se agrego correctamente.";
				}
			}
		}
		return "El objeto no se a logrado agregar.";
    }
	
	@Override
	public String createEstud(Usuario estud) {
		for(int i= 0; i<arrEstudiante.length; i++) {
			if (arrEstudiante[i] == null) {
				arrEstudiante[i] = estud;
				return "El objeto se agrego correctamente.";
			}
		}
		if (arrEstudiante.length == 3) {
			Usuario [ ] arr = new Estudiante [arrEstudiante.length*2];
			for (int j = 0; j<arrEstudiante.length;j++) {
				arr [j] = arrEstudiante [j];
			}
			arrEstudiante = arr;				
			for(int c= 0; c<arrEstudiante.length; c++) {
				if (arrEstudiante[c] == null) {
					arrEstudiante[c] = estud;
					return "El objeto se agrego correctamente.";
				}
			}
		}
		return "El objeto no se a logrado agregar.";
	}

	@Override
	public String createPrestamo(Prestamo pres) {
		for(int i= 0; i<arrPrestamo.length; i++) {
			if (arrPrestamo[i] == null) {
				arrPrestamo[i] = pres;
				return "El objeto se agrego correctamente.";
			}
		}
		if (arrPrestamo.length == 3) {
			Prestamo [ ] arr = new Prestamo [arrPrestamo.length*2];
			for (int j = 0; j<arrPrestamo.length;j++) {
				arr [j] = arrPrestamo[j];
			}
			arrPrestamo = arr;				
			for(int c= 0; c<arrPrestamo.length; c++) {
				if (arrPrestamo[c] == null) {
					arrPrestamo[c] = pres;
					return "El objeto se agrego correctamente.";
				}
			}
		}
		return "El objeto no se a logrado agregar.";
	}
	
    public Material read(String noSerieMaterial) {
    	for (int i = 0 ; i<arreglo.length;i++) {
			 if (arreglo[i].getNoSerieMaterial().equals(noSerieMaterial)) {
				 return arreglo[i];
			 }
		}
    	return null;
    }

    public String update(Material material, String noSerieMaterial) {
    	for (int i = 0 ; i<arreglo.length;i++) {
			 if (arreglo[i].getNoSerieMaterial().equals(noSerieMaterial)) {
				 arreglo [i] = material;
				 return "El objeto se a modificado correctamente";
			 }
		}
    	return "El objeto no existe";
    }

    public Material delete(String noSerieMaterial) {
    	for (int i = 0 ; i<arreglo.length;i++) {
			 Material n = arreglo[i];
			 if (n.getNoSerieMaterial().equals(noSerieMaterial)) {
				 arreglo [i] = null;
				 return n;
			 }
		}
    	return null;
    }

	public Material[] getArreglo() {
		return arreglo;
	}

	@Override
	public Usuario[] getArrEstudiante() {
		return arrEstudiante;
	}

	@Override
	public Prestamo[] getArrPrestamo() {
		return arrPrestamo;
	}

	
}