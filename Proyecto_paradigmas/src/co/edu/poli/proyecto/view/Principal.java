package co.edu.poli.proyecto.view;

import java.util.Scanner;
import co.edu.poli.proyecto.model.*;
import co.edu.poli.proyecto.services.*;

public class Principal {
    public static void main(String [ ] args) {
    	Scanner sc = new Scanner(System.in);
    	ImpleOperacion op = new ImpleOperacion(null);
    	ImpleOperacionArchivo arc = new ImpleOperacionArchivo();
    	
    	System.out.println("Crea un nuevo usuario: \n1. Docente\n2.Estudiante\n3.Administrativo\4. salir");
    	int usuar = sc.nextInt();
    	
    	do {
    		if (usuar == 1) {
        		System.out.println("Ingresa: \n1. No de identificacion\n2. Nombre completo\n3. Codigo de maestro\n4. Materia que dicta");
    			Usuario us = new Profesor(Integer.parseInt(sc.next()), sc.next(), Integer.parseInt(sc.next()), sc.next());
    			System.out.println("Su usuario es: "+us.toString());
        	}else if (usuar == 2) {
        		System.out.println("Ingresa: \n1. No de identificacion\n2. Nombre completo\n3. Correo institucional\n4. Numero telefonico");
    			Usuario us = new Estudiante(Integer.parseInt(sc.next()), sc.next(), sc.next(), Integer.parseInt(sc.next()));
    			System.out.println("Su usuario es: "+us.toString());
        	}else{
        		System.out.println("Ingresa: \n1. No de identificacion\n2. Nombre completo\n3. Correo institucional\n4. clave de acceso");
    			Usuario us = new PersonalAdministrativo(Integer.parseInt(sc.next()), sc.next(), sc.next(), Integer.parseInt(sc.next()));
    			System.out.println("Su usuario es: "+us.toString());
        	}
    		
    		System.out.println("Crea un nuevo usuario: \n1. Docente\n2.Estudiante\n3.Administrativo\4. salir");
        	usuar = sc.nextInt();
        	
    	}while(usuar != 3);
    	
    	
    	
    	System.out.println("Que tipo de usuario eres: \n1. Administrativo \n2. Estudiante\n3. Docente\n4. Salir");
    	int n = sc.nextInt();
    	
    	do {
    		if (n == 1) {
        		System.out.println("Que quieres hacer: \n1. Crear un nuevo equipo\n2. Consultar equipo\n3. Actualizar equipo\4. Eliminar un equipo\n5. Actualizar la disponivilidad\n6. Agregar a base de datos\n7. Salir");
        		int opcion = sc.nextInt();
        		switch(opcion){
        		case 1:
        			System.out.println("Ingresa: \n1. no Serie material\n2. Nombre del qeuipo\n3. Descripcion\n4. Disponivilidad(true or false)\n5. Tipo de material");
        			Material mat = new Material(sc.next(), sc.next(), sc.next(), Boolean.parseBoolean(sc.next()), sc.next());
        			System.out.println(op.create(mat));
        			break;
        		case 2:
        			System.out.println("Ingresa el no Serie del material:");
        			String serie = sc.next();
        			System.out.println(op.read(serie));
        			break;
        		case 3:
        			System.out.println("Ingresa: \n1. no Serie material\n2. Nombre del qeuipo\n3. Descripcion\n4. Disponivilidad(true or false)\n5. Tipo de material");
        			Material mat2 = new Material(sc.next(), sc.next(), sc.next(), Boolean.parseBoolean(sc.next()), sc.next());
        			System.out.println("Ingresa el no Serie del material:");
        			serie = sc.next();
        			System.out.println(op.update(mat2, serie));
        			break;
        		case 4:
        			System.out.println("Ingresa el no Serie del material:");
        			serie = sc.next();
        			System.out.println(op.delete(serie));
        			break;
        		case 5: 
        			System.out.println("Ingresa el no Serie del material:");
        			serie = sc.next();
        			Material obj = op.read(serie);
        			System.out.println("Ingresa la disponivilidad del objeto:");
        			boolean disponible = Boolean.parseBoolean(sc.next()); 
        			obj.setDisponible(disponible);
        			System.out.println("la disponiblilidad a cambiado a: " + disponible);
        			break;
        		case 6:
        			arc.serializarMaterial(op.getArreglo(), "", "Materiales.bin");
        			System.out.println("Los Prestamos se han guardado corrrectamente");
        			break;
        		case 7:
        			Material[] arrMat = arc.deserializarMaterial("", "Materiales.bin");
        			for (int i = 0; i < arrMat.length; i++) {
    					System.out.println(arrMat[i]);
    				}
        			break;
        		}
        	}
    	}while(n != 4);
    }
}