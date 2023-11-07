package ar.edu.unlam.pb2.recuperatorio;

public class Vivienda extends BienesGenerales {

	private String calle;
	private String localidad;
	private String partido;
	private String provincia;

	public Vivienda(String calle, String localidad, String partido, String provincia) {
		this.calle = calle;
		this.localidad = localidad;
		this.partido = partido;
		this.provincia = provincia;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getPartido() {
		return partido;
	}

	public void setPartido(String partido) {
		this.partido = partido;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

}
