package inmuebles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	static Scanner sc=new Scanner(System.in);
	//Creo un metodo que muestre el precio si es una casa independiente y la altura si es 
	//una casa rural
	private static void tipo(Inmuebles inm) {
		if(inm instanceof CasaIndependiente) {
			System.out.println("Precio Casa Independiente: "+((CasaIndependiente)inm).getPrecio()+"€");
		}
		if(inm instanceof CasasRurales) {
			System.out.println("Altura Casa Rural: "+((CasasRurales)inm).getAltitud()+" m");
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Inmuebles>inm= new ArrayList<>();//Inicializo el arraylist de inmuebles
		boolean masProd=true;//Inicializo el booleano a true
		//Bucle que me permite añadir inmuebles al arraylist
		while(masProd==true) {
			menuDef("INMUEBLES", "VIVIENDAS", "LOCALES");//LLamo al menu
			int num=sc.nextInt();//Pido un num
			condicionalInmueble(num,inm);//Llamo al condicional
			System.out.println("Desea Añadir mas inmuebles [S/N]");//Pido si va a añadir mas inmuebles
			String conv=sc.next();
			masProd=masProd(conv);//Cambio el valor de masProd
			
		}
		//Muestro el precio de las casas independientes y la altitud de las casas rurales
		for(int i=0;i<inm.size();i++) {
			tipo(inm.get(i));
		}

	}
	//Menu
	public static void menuDef(String titulo, String camp1,String camp2) {
		System.out.println("******"+titulo+"*******");
		System.out.println("1."+camp1);
		System.out.println("2. "+camp2);
	}
	
	//Procedimiento condicional Inmueble
	public static void condicionalInmueble(int num,ArrayList<Inmuebles>inm) {
		switch (num) {
		case 1:{
			menuDef("VIVIENDA", "CASA", "APARTAMENTO");
			condicionalVivienda(num, inm);
			break;
		}
		case 2:{
			menuDef("LOCAL", "LOCAL COMERCIAL", "OFICINAS");
			condicionalLocal(num, inm);
			break;
		}
		default:System.out.println("Opcion no valida");
		}
	}
	
	//Procedimientoo condicional Vivienda
	public static void condicionalVivienda(int num,ArrayList<Inmuebles>inm) {
		num=sc.nextInt();
		switch (num) {
		case 1:{
			menuDef("CASA", "CASAS RURALES", "CASAS URBANAS");
			condicionalCasa(num, inm);
			break;
		}
		case 2:{
			menuDef("APARTAMENTOS", "APARTAMENTOS FAMILIARES", "APARTAMENTOS ESTUDIO");
			condicionalApart(num, inm);
			break;
		}
		default:System.out.println("Opcion no valida");
		}
	}
	
	//Procedimento condicional Casa
	public static void condicionalCasa(int num,ArrayList<Inmuebles>inm) {
		num=sc.nextInt();
		switch (num) {
		case 1:inm.add(crearCasaRural());break;
		case 2:{
			menuDef("CASA URBANA", "CASA CONJUNTO CERRADO", "CASA INDEPENDIENTE");
			condicionalCasaUrbana(num, inm);
			break;
		}
		default:System.out.println("Opcion no valida");
		}
	}
	
	//Procedimiento condicional Apartamento
	public static void condicionalApart(int num,ArrayList<Inmuebles>inm) {
		num=sc.nextInt();
		switch (num) {
		case 1:inm.add(crearApartamento());break;
		case 2:inm.add(crearApartamentoEstudio());break;
		default:System.out.println("Opcion no valida");
		}
	}
	
	//Procedimiento condicional Local
	public static void condicionalLocal(int num,ArrayList<Inmuebles>inm) {
		num=sc.nextInt();
		switch (num) {
		case 1:inm.add(crearLocalesComerciales());break;
		case 2:inm.add(crearOficinas());break;
		default:System.out.println("Opcion no valida");
		}
	}
	public static void condicionalCasaUrbana(int num,ArrayList<Inmuebles>inm) {
		num=sc.nextInt();
		switch (num) {
		case 1:inm.add(crearCasaConjuntoCerrado());break;
		case 2:inm.add(crearCasaIndependiente());break;
		default:System.out.println("Opcion no valida");
		}
	}
	
	//Funcion que me devuelve una casa rural nueva
	public static CasasRurales crearCasaRural() {
		int idMob=(int)(Math.random()*3102+1);
		int area=(int)(Math.random()*1000+1);
		String direccion=direccion();
		int numWC=(int)(Math.random()*10+1);
		int numHab=(int)(Math.random()*10+1); 
		int numPisos=(int)(Math.random()*3+1);
		int distNucleo=(int)(Math.random()*10000+1);
		int altitud=(int)(Math.random()*3000+1);
		CasasRurales cr= new CasasRurales(idMob, area, direccion, numWC, numHab, numPisos, distNucleo, altitud);
		return cr;
	}
	
	//Funcion que me devuelve una casa independiente nueva
	public static CasaIndependiente crearCasaIndependiente() {
		int idMob=(int)(Math.random()*103+1);
		int area=(int)(Math.random()*1000+1);
		String direccion=direccion();
		int numWC=(int)(Math.random()*5+1);
		int numHab=(int)(Math.random()*5+1); 
		int numPisos=(int)(Math.random()*3+1);
		CasaIndependiente ci= new CasaIndependiente(idMob, area, direccion, numWC, numHab, numPisos);
		return ci;
	}
	
	//Funcion que me devuelve una casa Conjunto Cerrado nueva
	public static CasaConjuntoCerrado crearCasaConjuntoCerrado() {
		int idMob=(int)(Math.random()*301+1);;
		int area=(int)(Math.random()*30+1);;
		String direccion=direccion();
		int numWC=(int)(Math.random()*3+1);
		int numHab=(int)(Math.random()*3+1);; 
		int numPisos=(int)(Math.random()*2+1);;
		int valorAdm=(int)(Math.random()*100+1);;
		System.out.println("Piscina");
		boolean piscina=trueOfalse();
		System.out.println("Instalaciones Dep.");
		boolean campDep=trueOfalse();
		CasaConjuntoCerrado ccc= new CasaConjuntoCerrado(idMob, area, direccion, numWC, numHab, numPisos, valorAdm, piscina, campDep);
		return ccc;
	}
	
	//Funcion que me devuelve un Apartamento Familiar nuevo
	public static Apartamentos crearApartamento() {
		int idMob=(int)(Math.random()*3001+1);;
		int area=(int)(Math.random()*30+1);;
		String direccion=direccion();
		int numWC=(int)(Math.random()*3+1);;
		int numHab=(int)(Math.random()*3+1);; 
		int valorAdm=(int)(Math.random()*100+1);;
		Apartamentos af= new Apartamentos(idMob, area, direccion, numWC, numHab, valorAdm);
		return af;
	}
	
	//Funcion que me devuelve un Apartamento Estudio nuevo
	public static ApartamentosEstudios crearApartamentoEstudio() {
		int idMob=(int)(Math.random()*300+1);
		int area=(int)(Math.random()*130+1);
		String direccion=direccion();
		int numWC=(int)(Math.random()*3+1);
		ApartamentosEstudios af= new ApartamentosEstudios(idMob, area, direccion, numWC);
		return af;
	}
	
	//Funcion que me devuelve un local comercial nuevo
	public static LocalesComerciales crearLocalesComerciales() {
		int idMob=(int)(Math.random()*3010+1);
		int area=(int)(Math.random()*300+1);
		String direccion=direccion();
		String local=localizacion();
		String cc=direccion();
		LocalesComerciales lc= new LocalesComerciales(idMob, area, direccion, local, cc);
		return lc;
	}
	
	//Funcion que me devuelve una oficina nueva
	public static Oficinas crearOficinas() {
		int idMob=(int)(Math.random()*12033+1);
		int area=(int)(Math.random()*300+1);
		String direccion=direccion();
		String local=localizacion();
		System.out.println("Gobierno");
		boolean gob=trueOfalse();
		Oficinas o= new Oficinas(idMob, area, direccion, local, gob);
		return o;
	}
	
	//Funcion que me devuelve un true o un false dependiendo un parametro de tipo String
	public static boolean masProd(String pr) {
		if (pr.equalsIgnoreCase("S")) {
			return true;
		}else return false;
	}
	
	//Funcion que me genera una localizacion
	public static String localizacion() {
		ArrayList<String>localizacion=new ArrayList<>();
		localizacion.addAll(Arrays.asList("Interior","Calle"));
		int random=(int)(Math.random()*2)+1;
		if (random==1) {
			return localizacion.get(0);
		}
		return localizacion.get(1);
	}
	
	//Funcion que me genera una localizacion
		public static String direccion() {
			ArrayList<String>localizacion=new ArrayList<>();
			localizacion.addAll(Arrays.asList("Madrid","Las Rozas","Fuenlabrada","Alcorcon","Mostoles","Vicalvaro"));
			int random=(int)(Math.random()*4);
			return localizacion.get(random);
		}
	//Funcion que me devuelve true o flse dependiendo del num que meta el usuario;
		public static boolean trueOfalse() {
			menuTrueFalse();
			int num=sc.nextInt();
			while(num!=1 && num!=2) {
				num=sc.nextInt();
			}
			if (num==1) {
				return true;
			} 
			return false;
		}
	//Menu true o false
		public static void menuTrueFalse() {
			System.out.println("INTRODUCE UNA OPCION: ");
			System.out.println("1. VERDADERO");
			System.out.println("2. FALSO");
		}

}
