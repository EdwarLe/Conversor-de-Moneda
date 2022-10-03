package com.conversor.vistas;

import javax.swing.JOptionPane;
import com.conversor.controlador.control;

public class MainWindow {
	
	control miControl;
	boolean continua = true;

	public void iniciarConversor() {
		
		while(continua) {
			String opciones = (JOptionPane.showInputDialog(
					null, 
					"Presiona Aceptar para iniciar",
					"Conversor valores con codigo Java",
					JOptionPane.INFORMATION_MESSAGE, 
					null, 
					new Object[] {
							"Conversor de Moneda", 
					},
					"Seleccion"
			)).toString();
			
			if(opciones == "Conversor de Moneda") {
				String input = JOptionPane.showInputDialog(
						"Por favor ingresa la cantidad de dinero que deseas convertir: "
				);
				
				double numero = miControl.validarNumero(input);
				
				if( numero > 0 ) {
					String tipoConversion = (JOptionPane.showInputDialog(
							null, 
							"Elije una opción de moneda para convertir", 
							"Conversor de Moneda",
							JOptionPane.QUESTION_MESSAGE,
							null,
							new Object[] {
									"De Pesos Colombianos a Dolares",
									"De Pesos Colombianos a Euros",
									"De Pesos Colombianos a Libras Esterlinas",
									"De Pesos Colombianos a Yen Japones",
									"De Pesos Colombianos a Won Surcoreano",
									"De Dolares a Pesos Colombianos",
									"De Euros a Pesos Colombianos",
									"De Libras Esterlinas a Pesos Colombianos",
									"De Yen Japones a Pesos Colombianos",
									"De Won Surcoreano a Pesos Colombianos",
							}, 
							"Seleccion"
					)).toString();
					
					if(tipoConversion == "De Pesos Colombianos a Dolares") {
						String resultado = (miControl.convertirPesosADolares(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Dolares"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Pesos Colombianos a Euros") {
						String resultado = (miControl.convertirPesosAEuros(numero));
						JOptionPane.showMessageDialog(
								null, 
								"Tienes "+resultado +" Euros"
						);
						
						continuaEjecucion();
						
					}
					
					if(tipoConversion == "De Pesos Colombianos a Libras Esterlinas") {
						String resultado = (miControl.convertirPesosALibrasEsterlinas(numero));
						JOptionPane.showMessageDialog(
								null, 
								"Tienes "+resultado +" Libras Esterlinas"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Pesos Colombianos a Yen Japones") {
						String resultado = (miControl.convertirPesosAYenJapones(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Yenes Japoneses"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Pesos Colombianos a Won Surcoreano") {
						String resultado = (miControl.convertirPesosAWonSurcoreano(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Wones Surcoreanos"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Dolares a Pesos Colombianos") {
						String resultado = (miControl.convertirDolaresAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos Colombiano"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Euros a Pesos Colombianos") {
						String resultado = (miControl.convertirEurosAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos Colombianos"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Libras Esterlinas a Pesos Colombianos") {
						String resultado = (miControl.convertirLibrasEsterlinasAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos Colombianos"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Yen Japones a Pesos Colombianos") {
						String resultado = (miControl.convertirYenJaponesAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos Colombianos"
						);
						
						continuaEjecucion();
					}
					
					if(tipoConversion == "De Won Surcoreano a Pesos Colombianos") {
						String resultado = (miControl.convertirWonSurcoreanoAPesos(numero));
						JOptionPane.showMessageDialog(
								null,
								"Tienes "+resultado +" Pesos Colombianos"
						);
						
						continuaEjecucion();
					}
				} else {
					JOptionPane.showMessageDialog(
							null, 
							"Por favor ingresa un número valido"
					);
				}
			}
		} 
	}
			
	private void continuaEjecucion() {
		int respuesta = JOptionPane.showConfirmDialog(
				null,
				"Deseas realizar otra conversión?"
		);
		
		if(JOptionPane.OK_OPTION != respuesta) {
			JOptionPane.showMessageDialog(null, "Programa terminado");
			continua = false;
		}
	}
	
	public void setCoordinador(control miControl) {
		this.miControl = miControl;
	}
}
