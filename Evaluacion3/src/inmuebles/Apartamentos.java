package inmuebles;
//Hereda de inmuebleVivienda
public class Apartamentos extends InmueblesVivienda{
	private int valorAdm;
	private int precio;
	public Apartamentos(int idMobiliario, int area, String direccion, int numWC, int numHab, int valorAdm) {
		super(idMobiliario, area, direccion, numWC, numHab);
		this.valorAdm = valorAdm;
		this.precio=2000*area;
	}
	//Genero getters y setters
	public int getValorAdm() {
		return valorAdm;
	}

	public void setValorAdm(int valorAdm) {
		this.valorAdm = valorAdm;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	
	
}
