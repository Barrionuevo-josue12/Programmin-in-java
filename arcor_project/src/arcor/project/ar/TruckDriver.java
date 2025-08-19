package arcor.project.ar;

public class TruckDriver extends Employee{

	private String license;
	private double kilometers;
	//uso una constante para definir su bono por km recorridos
	private static final double Bono_km = 1.50;
	
	//constructor
	private TruckDriver(String name,String surname,String dni,double salary,
			int jobSeniority,String license){
		super(name,surname,dni,salary,jobSeniority);
	}
	
	//uso un metodo estatico para "fabricar camioneros", para crear una instancia valida
	public static  TruckDriver makeTruckDriver(String name,String surname,String dni,double salary,
			int jobSeniority,String license) {
		if(!validLicense(license)) {
			throw new IllegalArgumentException("License inserted is incorrect");
		}
		return new TruckDriver (name,surname,dni,salary,jobSeniority,license);
	}
	
	private static boolean validLicense(String license) {
		return ((license.length()>7) && (!license.isBlank()));
	}
}
