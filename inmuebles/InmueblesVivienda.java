package inmuebles;

//Hereda de Innmuebles
public class InmueblesVivienda extends Inmuebles{
	private int numWC;
	private int numHab;
	public InmueblesVivienda(int idMobiliario, int area, String direccion, int numWC, int numHab) {
		super(idMobiliario, area, direccion);
		this.numWC = numWC;
		this.numHab = numHab;
	}
	
	//Genero getters y setters
	public int getNumWC() {
		return numWC;
	}
	public void setNumWC(int numWC) {
		this.numWC = numWC;
	}
	public int getNumHab() {
		return numHab;
	}
	public void setNumHab(int numHab) {
		this.numHab = numHab;
	}
	
	
}
