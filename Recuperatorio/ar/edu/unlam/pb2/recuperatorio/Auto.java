package ar.edu.unlam.pb2.recuperatorio;

public class Auto extends BienesGenerales {

	private String nombre;
	private String modelo;
	private Integer año;
	private Double sumaAsegurada;

	public Auto(String nombre, String modelo, int año, Double sumaAsegurada) {
		this.nombre = nombre;
		this.modelo = modelo;
		this.año = año;
		this.sumaAsegurada = sumaAsegurada;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getAño() {
		return año;
	}

	public void setAño(Integer año) {
		this.año = año;
	}

	public Double getSumaAsegurada() {
		return sumaAsegurada;
	}

	public void setSumaAsegurada(Double sumaAsegurada) {
		this.sumaAsegurada = sumaAsegurada;
	}

}
