package inmuebles;

//Hereda de InmuebleVivienda
public class ApartamentosEstudios extends InmueblesVivienda{
	private int precioApartEst;
	public ApartamentosEstudios(int idMobiliario, int area, String direccion, int numWC) {
		super(idMobiliario, area, direccion, numWC, 1);
		this.precioApartEst=1500*area;
	}
	//Genero getter
	public int getPrecioApartEst() {
		return precioApartEst;
	}
	
}
