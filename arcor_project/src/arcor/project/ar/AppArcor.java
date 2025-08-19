package arcor.project.ar;

public class AppArcor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		TruckDriver dri = TruckDriver.makeTruckDriver("pedro", "suarez", "3567483", 890000, 2, "type B2C");
		dri.showEmployee();
		}
		catch(IllegalArgumentException e) {
			System.out.println("Error: "+e.getMessage());
		}
		finally {
			System.out.println("The program finished");
		}
	}

}
