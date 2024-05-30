package co.edu.poli.proyecto.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;

import java.net.URL;
import java.util.Iterator;
import java.util.ResourceBundle;
import co.edu.poli.proyecto.model.*;
import co.edu.poli.proyecto.services.*;

public class ClassController implements Initializable {
	
	ImpleOperacion objetos = new ImpleOperacion();
	Alert a = new Alert(AlertType.INFORMATION);

	@FXML
    private Button Create_us;

    @FXML
    private ToggleGroup Dispo;

    @FXML
    private ToggleGroup Dispo_update;

    @FXML
    private TextField Email_us;

    @FXML
    private TextField Id_us;

    @FXML
    private TextField Name_equipment;

    @FXML
    private TextField Name_us;

    @FXML
    private TextField Number_us;

    @FXML
    private Button Update;

    @FXML
    private RadioButton available;

    @FXML
    private RadioButton available_update;

    @FXML
    private Button buttonConsult;

    @FXML
    private Button buttonConsultLoan;

    @FXML
    private Button create_equipment;

    @FXML
    private DatePicker date_end;

    @FXML
    private DatePicker date_start;

    @FXML
    private Button delete;

    @FXML
    private TextArea description;

    @FXML
    private TextArea description_update;

    @FXML
    private Button generate_loan;

    @FXML
    private TextField id_usuar;

    @FXML
    private TextField noSerie_equipment;

    @FXML
    private TextField noSerie_equipment_update;

    @FXML
    private TextField noSerie_loan;

    @FXML
    private RadioButton not_available;

    @FXML
    private RadioButton not_available_update;

    @FXML
    private TextArea textArea_consult;

    @FXML
    private TextArea textarea_loan;

    @FXML
    private ComboBox<String> tipe_equpment;

    @FXML
    private ComboBox<String> tipe_equpment_update;
       
    private Material equipo;
    
    private boolean disponible;
    
    private Material [] mat = new Material [3];

    @FXML
    void pres_create_us(ActionEvent event) {
    	try {
    		Usuario estudiante = new Estudiante(Integer.parseInt(Id_us.getText()), Name_us.getText(), Email_us.getText(), Integer.parseInt(Number_us.getText()));
        	a.setContentText(objetos.createEstud(estudiante)+": "+ "\n"+estudiante.toString());
    		a.setHeight(300);
			a.setWidth(700);
    		a.showAndWait();
    	}catch(NumberFormatException e) {
    		a.setContentText("Ingresa numeros no letras: " + e);
    		a.showAndWait();
    	}
    }

    @FXML
    void pressConsult(ActionEvent event) {
    	try {
    		textArea_consult.setEditable(false);
    		Material [] mat = objetos.getArreglo();
    		for (int i = 0; i < mat.length; i++) {
    			textArea_consult.appendText(mat[i].toString()+"\n");
			}
    	}catch(NullPointerException e) {
    		a.setContentText("El Arreglo esta vacio: "+e);
    		a.showAndWait();
    	}
    }

    @FXML
    void pressConsultLoan(ActionEvent event) {
    	try {
    		textarea_loan.setEditable(false);
    		Prestamo [] pres = objetos.getArrPrestamo();
    		for (int i = 0; i < pres.length; i++) {
    			textarea_loan.appendText(pres[i].toString()+"\n");
			}
    	}catch(NullPointerException e) {
    		a.setContentText("El Arreglo esta vacio: "+e);
    		a.showAndWait();
    	}
    }

    @FXML
    void pressCreate_equipment(ActionEvent event) {
    	if(available == null && not_available == null && tipe_equpment == null) {
    		a.setContentText("selecciona una de las opciones, disponible o no disponible o tecnologico, analogo");
    		a.showAndWait();
    		return;
    	}else {
    		equipo = new Material(Name_equipment.getText(), noSerie_equipment.getText(), description.getText(), disponible, tipe_equpment.getSelectionModel().getSelectedItem());
    		a.setContentText(objetos.create(equipo)+": "+ "\n"+equipo.toString());
    		a.setHeight(300);
			a.setWidth(700);
    		a.showAndWait();
    	}
    }
    
    @FXML
    void pressDelete(ActionEvent event) {
    	try {
    		a.setContentText(objetos.delete(noSerie_equipment_update.getText()).toString());
    		a.setHeight(300);
			a.setWidth(700);
    		a.showAndWait();
    	}catch(NullPointerException e) {
    		a.setContentText("El Objeto no existe: "+e);
    		a.showAndWait();
    	}
    }

    @FXML
    void pressGenerate(ActionEvent event) {
    	for(int i= 0; i<mat.length; i++) {
			if (mat[i]==null) {
				mat[i] = objetos.read(noSerie_loan.getText());
				break;
			}
		}
		if (mat.length==3) {
			Material [ ] arr = new Material [mat.length*2];
			for (int j = 0; j<mat.length;j++) {
				arr [j] = mat [j];
			}
			mat = arr;				
			for(int c= 0; c<mat.length; c++) {
				if (mat[c]==null) {
					mat[c] = objetos.read(noSerie_loan.getText());
				}
			}
		}
		
		Usuario estu = null;
		Usuario [] us = objetos.getArrEstudiante();
		for (int i = 0 ; i<us.length;i++) {
			 if (us[i].getId() == Integer.parseInt(id_usuar.getText())) {
				 estu = us[i];
				 break;
			 }
		}
		if( date_start == null && date_end ==  null) {
			a.setContentText("Se requieren las fechas para crear el prestamo: ");
    		a.showAndWait();
    		return;
		}
    	Prestamo loan = new Prestamo(estu, mat, date_start.getValue().toString(), date_end.getValue().toString());
    	a.setContentText(objetos.createPrestamo(loan)+": "+ "\n"+loan.toString());
		a.showAndWait();
    }
    
    @FXML
    void pressUpdate(ActionEvent event) {
    	if(available == null && not_available == null && tipe_equpment_update == null) {
    		a.setContentText("selecciona una de las opciones, disponible o no disponible o tecnologico, analogo");
    		a.showAndWait();
    		return;
    	}else {
    		Material newEquipo = new Material(equipo.getNombre(), noSerie_equipment.getText(), description_update.getText(), disponible, tipe_equpment_update.getSelectionModel().getSelectedItem());
    		a.setContentText(objetos.update(newEquipo, noSerie_equipment_update.getText()));
    		a.setHeight(300);
			a.setWidth(700);
    		a.showAndWait();
    	}
    }

    @FXML
    void selectAvailable(ActionEvent event) {
    	if(available.isSelected() || available_update.isSelected()) {
    		disponible = true;
    	}else if(not_available.isSelected() || not_available_update.isSelected()){
    		disponible = false;
    	}
    }

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		if (tipe_equpment != null && tipe_equpment_update != null) {
            ObservableList<String> items = FXCollections.observableArrayList("Tecnologico", "Analogo");
            tipe_equpment.setItems(items);
            tipe_equpment_update.setItems(items);
        } else {
            System.err.println("Combo_box_devito es nulo. Verifica la asociación en el FXML.");
        		
        }
	}
}
