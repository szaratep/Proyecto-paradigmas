module Proyectto_final_paradigmas {
	requires javafx.controls;
	requires javafx.fxml;
	
	opens co.edu.poli.proyecto.view to javafx.graphics, javafx.fxml;
	opens co.edu.poli.proyecto.controller to javafx.graphics, javafx.fxml;
}
