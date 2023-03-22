package inmuebles;

//Hereda de Locales
public class Oficinas extends Locales{
	private boolean gob;
	private int precio;
	public Oficinas(int idMobiliario, int area, String direccion, String localizacion, boolean gob) {
		super(idMobiliario, area, direccion, localizacion);
		this.gob = gob;
		this.precio=350*area;
	}
	
	//Genero getters y setters
	public boolean isGob() {
		return gob;
	}

	public void setGob(boolean gob) {
		this.gob = gob;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

}
