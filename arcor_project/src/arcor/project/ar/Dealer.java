package arcor.project.ar;

import java.util.ArrayList;
import java.util.List;

public class Dealer extends Employee{
	private List <String> deliveryArea; // para identificar las localidades de reparto
	private int successfulDeliveries; //cantidad de entregas exitosas
	//lo defino como una constante 
	private static final int Bono_Succesful_Deliveries = 2000; // bono por una entrega exitosa
	
	//constructor
	public Dealer(String name, String surname, String dni, double salary, int jobSeniority) {
		super(name,surname,dni,salary,jobSeniority);
		this.deliveryArea = new ArrayList <String>(); //para almacenar las zonas de reparto
		this.successfulDeliveries = 0; // entregas exitosas del repartidor
	}
	
	//methods
	@Override
	public double calculateSalary() {
		//retornar el salario mas las entregas exitosas
		return super.calculateSalary()+(deliveryArea.size()*Bono_Succesful_Deliveries);
	}
	public void addDeliveryArea(String newArea) {
		//aqui deberia controles, ejemplo: que el area sea unica, que el area sea valida
		if(uniqueArea(newArea)) {
		this.deliveryArea.add(newArea);
		}
		else {
			System.out.println("Area inserted exist, try again");
		}
	}
	public void showDeliveryAreas() {
		System.out.println("Name: "+super.getName());
		System.out.println("Surname: "+super.getSurname());
		System.out.println("Id: "+super.getIdEmployee());
		System.out.println("Area: ");
		for(String area: deliveryArea) {
			System.out.println(area);
		}
	}
	private boolean uniqueArea(String area) {
		boolean unique = true;
		for(String value:deliveryArea) {
			if(value.equalsIgnoreCase(area)) {
				unique = false;
			}
		}
		return unique;
	}
	private void successfulDelivery() {
		this.successfulDeliveries++;
	}
}
