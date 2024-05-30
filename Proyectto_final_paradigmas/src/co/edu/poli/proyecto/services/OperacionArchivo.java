package co.edu.poli.proyecto.services;

import co.edu.poli.proyecto.model.*;

public interface OperacionArchivo {

    public void serializar(Prestamo [] pres, String path, String name);
    
    public Prestamo [] deserializar(String path, String name);

    public void serializarMaterial(Material [] mat, String path, String name);

    public Material [] deserializarMaterial(String path, String name);
    

}