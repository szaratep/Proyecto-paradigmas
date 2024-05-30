package co.edu.poli.proyecto.services;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import co.edu.poli.proyecto.model.*;

public class ImpleOperacionArchivo implements OperacionArchivo {

	@Override
	public void serializar(Prestamo[] pres, String path, String name) {
		try {
			FileOutputStream fos = new FileOutputStream (path + name);
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(pres);
			oos.close();
			fos.close();
		}catch (IOException ioe){
			ioe.printStackTrace();
			
			}
	}

	@Override
	public void serializarMaterial(Material[] mat, String path, String name) {
		try {
			FileOutputStream fos = new FileOutputStream (path + name);
			ObjectOutputStream oos = new ObjectOutputStream (fos);
			oos.writeObject(mat);
			oos.close();
			fos.close();
		}catch (IOException ioe){
			ioe.printStackTrace();
			
			}
	}
	
	@Override
	public Prestamo[] deserializar(String path, String name) {
		
		Prestamo [] a = null;
		
		try {
			FileInputStream fis = new FileInputStream(path + name);
			ObjectInputStream ois = new ObjectInputStream (fis);
			
			a = (Prestamo[]) ois.readObject();
			
			ois.close();
			fis.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(ClassNotFoundException c) {
			System.out.println("class no found");
			c.printStackTrace();
		}
		
		return a;
	}

	@Override
	public Material[] deserializarMaterial(String path, String name) {
        Material [] a = null;
		
		try {
			FileInputStream fis = new FileInputStream(path + name);
			ObjectInputStream ois = new ObjectInputStream (fis);
			
			a = (Material[]) ois.readObject();
			
			ois.close();
			fis.close();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}catch(ClassNotFoundException c) {
			System.out.println("class no found");
			c.printStackTrace();
		}
		
		return a;
	}

}