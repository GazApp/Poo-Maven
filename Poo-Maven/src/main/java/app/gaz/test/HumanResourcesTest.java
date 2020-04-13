package app.gaz.test;

import app.gaz.model.Employee;

public class HumanResourcesTest {
	
	public static void main(String[] args) {
		
	Employee e1 = new Employee();
	Employee e2 = new Employee();
	//Employee e2 = e1;
	
	e1.id = 1;
	e1.firstName = "Pablo";
	e1.lastname = "Guzman";
	e1.age = 23;
	e1.email= "pablo@gaz.app";
	e1.phoneNumber = "123.456.789";
	e1.salary = 555.55;
	e1.hireDate = "06-06-2000";
	
	e2.id = 2;
	e2.firstName = "Julio";
	e2.lastname = "Arias";
	e2.age = 49;
	e2.email= "julio @gaz.app";
	e2.phoneNumber = "987.654.321.";
	e2.salary = 666.66;
	e2.hireDate = "24-06-1995";
	
	// INVOCANDO A LOS METODOS
	e1.getDetails();
	System.out.println("****************************************");
	e2.getDetails();
	
	
		
	}

}
