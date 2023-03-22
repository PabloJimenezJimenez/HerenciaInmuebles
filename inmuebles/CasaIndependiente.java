package inmuebles;

//Hereda de Casas
public class CasaIndependiente extends Casas{
	private int precio;
	public CasaIndependiente(int idMobiliario, int area, String direccion, int numWC, int numHab, int numPisos) {
		super(idMobiliario, area, direccion, numWC, numHab, numPisos);
		this.precio=3000*area;
	}
	
	//Genero geters y setters
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
}
