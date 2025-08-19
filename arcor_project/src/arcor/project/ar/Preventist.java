package arcor.project.ar;

public class Preventist extends Employee {

	//porcentaje por venta de un preventista
		private static final double Sales_Commission = 0.10; // 10 %
		
		private double totalSales ; //cantidad total de ventas 
		//constructor
		public Preventist(String name, String surname, String dni, double salary, int jobSeniority,double totalSales) {
			super(name,surname,dni,salary,jobSeniority);
			totalSales = 0;
		}
		//methods
		
		@Override
		public double calculateSalary() {
			return super.calculateSalary()+(Sales_Commission * totalSales); // salario + la comision del 10 % del total de ventas
		}
		private void newSale (double sale) {
			this.totalSales = this.totalSales+sale; // como se ha concretado una venta, el valor acumulado se incrementa
		}
}
