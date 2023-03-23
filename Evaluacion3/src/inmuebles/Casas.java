package inmuebles;

//Hereda de Inmuebles Vivienda
public class Casas extends InmueblesVivienda{
	private int numPisos;

	public Casas(int idMobiliario, int area, String direccion, int numWC, int numHab, int numPisos) {
		super(idMobiliario, area, direccion, numWC, numHab);
		this.numPisos = numPisos;
	}
	
	//Genero Getters y Setters
	public int getNumPisos() {
		return numPisos;
	}

	public void setNumPisos(int numPisos) {
		this.numPisos = numPisos;
	}
	
	
}
