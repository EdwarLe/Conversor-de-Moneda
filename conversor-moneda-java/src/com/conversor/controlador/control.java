package com.conversor.controlador;

import com.conversor.modelo.Funciones;
import com.conversor.modelo.Monedas;
import com.conversor.vistas.MainWindow;

public class control {
	
	private MainWindow myMainWindow;
	private Funciones misFunciones;
	private Monedas misPesos;


	
	public void setMainWindow(MainWindow myMainWindow) {
		this.myMainWindow = myMainWindow;
	}
	
	public void setMisFunciones(Funciones misFunciones) {
		this.misFunciones = misFunciones;
	}

	public void setmisPesos(Monedas misPesos) {
		this.misPesos = misPesos;
	}
	

	public void showMainWindow() {
		myMainWindow.iniciarConversor();		
	}

	public double validarNumero(String input) {
		return misFunciones.validarNumero(input);
	}
	
	public String formatoResultado(double resultado) {
		return misFunciones.formatoResultado(resultado);
	}
	
	public String convertirPesosADolares(double numero) {
		return misPesos.convertirPesosADolares(numero);
	}

	public String convertirPesosAEuros(double numero) {
		return misPesos.convertirPesosAEuros(numero);
	}

	public String convertirPesosALibrasEsterlinas(double numero) {
		return misPesos.convertirPesosALibrasEsterlinas(numero);
	}

	public String convertirPesosAYenJapones(double numero) {
		return misPesos.convertirPesosAYenJapones(numero);
	}

	public String convertirPesosAWonSurcoreano(double numero) {
		return misPesos.convertirPesosAWonSurcoreano(numero);
	}

	public String convertirDolaresAPesos(double numero) {
		return misPesos.convertirDolaresAPesos(numero);
	}

	public String convertirEurosAPesos(double numero) {
		return misPesos.convertirEurosAPesos(numero);
	}

	public String convertirLibrasEsterlinasAPesos(double numero) {
		return misPesos.convertirLibrasEsterlinasAPesos(numero);
	}

	public String convertirYenJaponesAPesos(double numero) {
		return misPesos.convertirYenJaponesAPesos(numero);
	}

	public String convertirWonSurcoreanoAPesos(double numero) {
		return misPesos.convertirWonSurcoreanoAPesos(numero);
	}
	

}