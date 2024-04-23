package co.edu.poli.proyecto.services;

import co.edu.poli.proyecto.model.*;

public class ImpleOperacion implements Operacion {

	private Material [] arreglo = new Material[3];
	
    public ImpleOperacion(Material[] arreglo) {
	super();
	this.arreglo = arreglo;
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
		return "El objeto no se a logrado crear.";
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
}