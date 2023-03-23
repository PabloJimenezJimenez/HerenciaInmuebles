package inmuebles;

//Hereda de Casa Conjunto Cerrado
public class CasaConjuntoCerrado extends Casas{
	private int valorAdm;
	private boolean piscina;
	private boolean campoDep;
	private int precioCasaConj;
	public CasaConjuntoCerrado(int idMobiliario, int area, String direccion, int numWC, int numHab, int numPisos,
			int valorAdm, boolean piscina, boolean campoDep) {
		super(idMobiliario, area, direccion, numWC, numHab, numPisos);
		this.valorAdm = valorAdm;
		this.piscina = piscina;
		this.campoDep = campoDep;
		this.precioCasaConj=2500*area;
	}
	
	//Genero getters y setters
	public int getValorAdm() {
		return valorAdm;
	}
	public void setValorAdm(int valorAdm) {
		this.valorAdm = valorAdm;
	}
	public boolean isPiscina() {
		return piscina;
	}
	public void setPiscina(boolean piscina) {
		this.piscina = piscina;
	}
	public boolean isCampoDep() {
		return campoDep;
	}
	public void setCampoDep(boolean campoDep) {
		this.campoDep = campoDep;
	}
	public int getPrecioCasaConj() {
		return precioCasaConj;
	}
	public void setPrecioCasaConj(int precioCasaConj) {
		this.precioCasaConj = precioCasaConj;
	}
	
	
}
