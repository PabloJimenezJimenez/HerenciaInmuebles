package inmuebles;

//Hereda de Inmuebles
public class Locales extends Inmuebles{
	private String localizacion;

	public Locales(int idMobiliario, int area, String direccion, String localizacion) {
		super(idMobiliario, area, direccion);
		this.localizacion = localizacion;
	}
	//Genero getters y setters
	public String getLocalizacion() {
		return localizacion;
	}

	public void setLocalizacion(String localizacion) {
		this.localizacion = localizacion;
	}

	
}
