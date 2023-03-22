package inmuebles;

//Hereda de locales
public class LocalesComerciales extends Locales{
	private String cc;
	private int precio;
	public LocalesComerciales(int idMobiliario, int area, String direccion, String localizacion, String cc) {
		super(idMobiliario, area, direccion, localizacion);
		this.cc = cc;
		this.precio=3000*area;
	}

	//Genero getters y setters
	public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
}
