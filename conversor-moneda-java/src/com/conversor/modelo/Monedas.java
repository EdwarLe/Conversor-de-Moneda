package com.conversor.modelo;

import com.conversor.controlador.control;

public class Monedas {
	
	control miControl;
	
	public String convertirPesosADolares(double input) {		
		double resultado = input / 4325.00;
		return miControl.formatoResultado(resultado);
	}
	
	public String convertirPesosAEuros(double input) {
		double resultado = input / 4416.21;
		return miControl.formatoResultado(resultado);
	}
	
	public String convertirPesosALibrasEsterlinas(double input) {
		double resultado = input / 5175.05;
		return miControl.formatoResultado(resultado);
	}
	
	public String convertirPesosAYenJapones(double input) {
		double resultado = input / 32.30;
		return miControl.formatoResultado(resultado);
	}
	
	public String convertirPesosAWonSurcoreano(double input) {
		double resultado = input / 3.15;
		return miControl.formatoResultado(resultado);
	}
	
	public String convertirDolaresAPesos(double input) {		
		double resultado = input * 4325.00;
		return miControl.formatoResultado(resultado);
	}
	
	public String convertirEurosAPesos(double input) {		
		double resultado = input * 4416.21;
		return miControl.formatoResultado(resultado);
	}
	
	public String convertirLibrasEsterlinasAPesos(double input) {		
		double resultado = input * 5175.05;
		return miControl.formatoResultado(resultado);
	}
	
	public String convertirYenJaponesAPesos(double input) {		
		double resultado = input * 32.30;
		return miControl.formatoResultado(resultado);
	}
	
	public String convertirWonSurcoreanoAPesos(double input) {		
		double resultado = input * 3.15;
		return miControl.formatoResultado(resultado);
	}
	
	public void setCoordinador(control miControl) {
		this.miControl = miControl;
	}	
}