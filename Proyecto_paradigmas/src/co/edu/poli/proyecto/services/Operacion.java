package co.edu.poli.proyecto.services;

import co.edu.poli.proyecto.model.Material;

public interface Operacion {

    public String create(Material material);

    public Material read(String noSerieMaterial);

    public String update(Material material, String noSerieMaterial);

    public Material delete(String noSerieMaterial);
    
    public Material [] getArreglo();

}