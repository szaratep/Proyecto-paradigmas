package co.edu.poli.proyecto.services;

import co.edu.poli.proyecto.model.*;

public interface Operacion {

    public String create(Material material);
    
    public String createEstud(Usuario estud);
    
    public String createPrestamo(Prestamo pres);

    public Material read(String noSerieMaterial);
    
    public String update(Material material, String noSerieMaterial);

    public Material delete(String noSerieMaterial);
    
    public Material [] getArreglo();
    
    public Usuario [] getArrEstudiante();
    
    public Prestamo [] getArrPrestamo();

}