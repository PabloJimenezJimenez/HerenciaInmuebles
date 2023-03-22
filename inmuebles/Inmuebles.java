package inmuebles;

public class Inmuebles {
	private int idMobiliario;
	private int area;
	private String direccion;
	public Inmuebles(int idMobiliario, int area, String direccion) {
		this.idMobiliario = idMobiliario;
		this.area = area;
		this.direccion = direccion;
	}
	
	//Genero Getters y Setters
	public int getIdMobiliario() {
		return idMobiliario;
	}
	public void setIdMobiliario(int idMobiliario) {
		this.idMobiliario = idMobiliario;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
	
	
}
