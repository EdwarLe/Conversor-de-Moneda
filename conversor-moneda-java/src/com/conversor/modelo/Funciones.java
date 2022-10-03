package com.conversor.modelo;
import java.text.DecimalFormat;
import com.conversor.controlador.control;

public class Funciones {
	
	control miControl;
	
	public double validarNumero(String input) {
        try {
        	return Double.parseDouble(input);
        } catch(NumberFormatException e) {
            return 0;
        }
	}
	
	public void setCoordinador(control miControl) {
		this.miControl = miControl;
	}
	
	public String formatoResultado(double resultado) {
		String formato = "#.###";
        DecimalFormat decimalFormat =  new DecimalFormat(formato);
        return decimalFormat.format(resultado);
	}
}