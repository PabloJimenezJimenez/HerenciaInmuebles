package inmuebles;

//Hereda de Casas
public class CasasRurales extends Casas{
	private int distNucleo;
	private int altitud;
	private int precio;
	public CasasRurales(int idMobiliario, int area, String direccion, int numWC, int numHab, int numPisos,
			int distNucleo, int altitud) {
		super(idMobiliario, area, direccion, numWC, numHab, numPisos);
		this.distNucleo = distNucleo;
		this.altitud = altitud;
		this.precio=1500*area;
	}
	
	//Genero Getters y Setters
	public int getDistNucleo() {
		return distNucleo;
	}
	public void setDistNucleo(int distNucleo) {
		this.distNucleo = distNucleo;
	}
	public int getAltitud() {
		return altitud;
	}
	public void setAltitud(int altitud) {
		this.altitud = altitud;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	
	
}
