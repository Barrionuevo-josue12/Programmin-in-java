package arcor.project.ar;

public class Employee {
	private String idEmployee; // generado automaticamente y debe ser unico
	private String name;
	private String surname;
	private String dni;
	private double salary;
	private int jobSeniority; // antiguedad

	//for make unique id
	private static int id  = 0;

	//constructor
	public Employee(String name, String surname, String dni, double salary, int jobSeniority) {
		if(!checkString(name)) {
			throw new IllegalArgumentException("Name inserted is incorrect");
		}
		if(!checkString(surname)) {
			throw new IllegalArgumentException("Surname inserted is incorrect");
		}
		if(!checkString(dni)) {
			throw new IllegalArgumentException("Dni inserted is incorrect");
		}
		if(salary < 0) {
			throw new IllegalArgumentException("Salary inserted is incorrect");
		}
		if(jobSeniority < 0 ) {
			throw new IllegalArgumentException("Job seniority inserted is incorrect");
		}
		//entra aqui cuando todos los datos ingresados son "correctos"
		this.name = name;
		this.surname = surname;
		this.dni = dni;
		this.salary = salary;
		this.jobSeniority = jobSeniority;
		this.idEmployee = makeIdEmployee(); // le asigno un id unico al empleado creado
	}
	//auxiliary methods
	private String makeIdEmployee() {
		id++;
		//genera una id de modelo EMP-001
		return "EMP-"+String.format("%03d",id);
	}
	private boolean checkString(String value) {
		return (value != null && !value.isBlank());
	}
	public void showEmployee() {
		System.out.println("Id: "+this.idEmployee);
		System.out.println("Name: "+this.name);
		System.out.println("Surname: "+this.surname);
		System.out.println("Dni: "+this.dni);
		System.out.println("Salary: $"+this.salary);
		System.out.println("Job seniority: "+this.jobSeniority);
	}
	public double calculateSalary() {
		return this.salary;
	}
	//getters
	public String getName() {
		return this.name;
	}
	public String getSurname() {
		return this.surname;
	}
	public String getIdEmployee() {
		return this.idEmployee;
}
}
