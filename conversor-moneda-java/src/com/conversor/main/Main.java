package com.conversor.main;
import com.conversor.controlador.control;
import com.conversor.modelo.Funciones;
import com.conversor.modelo.Monedas;
import com.conversor.vistas.MainWindow;

public class Main {

	public static void main(String[] args) {
	
		MainWindow myMainWindow = new MainWindow();
		Funciones misFunciones = new Funciones();
		Monedas misPesos = new Monedas();
		control miControl = new control();
		
		myMainWindow.setCoordinador(miControl);
		misFunciones.setCoordinador(miControl);
		misPesos.setCoordinador(miControl);
		
		miControl.setMainWindow(myMainWindow);
		miControl.setMisFunciones(misFunciones);
		miControl.setmisPesos(misPesos);
		
		miControl.showMainWindow();
	}
}