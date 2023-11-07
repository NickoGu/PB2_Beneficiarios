package ar.edu.unlam.pb2.recuperatorio;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CompaniaDeSeguro {

	String nombre;
	Set<Poliza> polizas;

	public CompaniaDeSeguro(String nombre) {
		this.nombre = nombre;
		this.polizas = new HashSet<Poliza>();

	}

	public void agregarPoliza(Poliza poliza) {

		polizas.add(poliza);
	}

	public int obtenerLaCantidadDePolizasEmitidas() {
		return polizas.size();
	}

	public void denunciarSiniestro(int numeroPoliza) throws PolizaInexistente {
		
		this.getPoliza(numeroPoliza).setFueRobado(true);
		this.getPoliza(numeroPoliza).setTuvoAccidente(true);;
	}

	public Poliza getPoliza(int numeroPoliza) throws PolizaInexistente {
		Poliza polizaEncontrada = null;
		for (Poliza poliza : polizas) {
			if(poliza.getNumeroPoliza().equals(numeroPoliza)) {
				polizaEncontrada = poliza;
				break;
			} else {
				throw new PolizaInexistente();
			}
		}
		
		return polizaEncontrada;
		
	}

	

}
