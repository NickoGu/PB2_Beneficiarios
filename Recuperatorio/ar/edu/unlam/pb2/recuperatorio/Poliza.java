package ar.edu.unlam.pb2.recuperatorio;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Poliza {
	private Integer numeroPoliza;
	private Persona asegurado;
	private Double sumaAsegurada;
	private Double prima;
	private Set<BienesGenerales> bienes;
	private Boolean fueRobado = false;
	private Boolean tuvoAccidente = false;
	private Double impuestos;
	private Map<Integer, TipoDeBeneficiario> personasAseguradas;

	public Poliza(Integer numeroPoliza, Persona asegurado, Double sumaAsegurada, Double prima) {
		this.numeroPoliza = numeroPoliza;
		this.asegurado = asegurado;
		this.sumaAsegurada = sumaAsegurada;
		this.prima = prima;
		this.bienes = new HashSet<BienesGenerales>();
		this.impuestos = 1000.0;
		this.personasAseguradas = new HashMap<Integer, TipoDeBeneficiario>();
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(numeroPoliza);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
//		if (getClass() != obj.getClass())
//			return false;
		Poliza other = (Poliza) obj;
		return Objects.equals(numeroPoliza, other.numeroPoliza);
	}



	public Integer getNumeroPoliza() {
		return numeroPoliza;
	}

	public void setNumeroPoliza(Integer numeroPoliza) {
		this.numeroPoliza = numeroPoliza;
	}

	public Persona getAsegurado() {
		return asegurado;
	}

	public void setAsegurado(Persona asegurado) {
		this.asegurado = asegurado;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

	public Double getPrima() {
		return prima;
	}

	public void setPrima(Double prima) {
		this.prima = prima;
	}

	public Double getPremio() {
		// TODO Auto-generated method stub
		return prima + impuestos;
	}

	public void agregarBienAsegurado(BienesGenerales bien) {

		bienes.add(bien);

	}

	public Set<BienesGenerales> getBienes() {
		return bienes;
	}
	public void agregarBeneficiario(Persona persona, TipoDeBeneficiario tipoBeneficiario) {

		personasAseguradas.put(persona.getDni(), tipoBeneficiario);

	}

	public Object obtenerCantidadDeBeneficiarios() {
		return personasAseguradas.size();
	}



	public Boolean getFueRobado() {
		return fueRobado;
	}



	public void setFueRobado(Boolean fueRobado) {
		this.fueRobado = fueRobado;
	}



	public Double getImpuestos() {
		return impuestos;
	}



	public void setImpuestos(Double impuestos) {
		this.impuestos = impuestos;
	}



	public Map<Integer, TipoDeBeneficiario> getPersonasAseguradas() {
		return personasAseguradas;
	}



	public void setPersonasAseguradas(Map<Integer, TipoDeBeneficiario> personasAseguradas) {
		this.personasAseguradas = personasAseguradas;
	}



	public void setBienes(Set<BienesGenerales> bienes) {
		this.bienes = bienes;
	}



	public Boolean getTuvoAccidente() {
		return tuvoAccidente;
	}



	public void setTuvoAccidente(Boolean tuvoAccidente) {
		this.tuvoAccidente = tuvoAccidente;
	}


	
	
	
	

}
