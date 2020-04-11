package app.gaz.model;

public class Employee {

	public int id;
	public String firstName;
	public String lastname;
	public int age;
	public String email;
	public String phoneNumber;
	public double salary;
	public String hireDate;

	public void getDetails() {

		System.out.println("Id: " + id);
		System.out.println("First Name: " + firstName);
		System.out.println("Last name:" + lastname);
		System.out.println("Age: " + age);
		System.out.println("Email: " + email);
		System.out.println("Phone Number: " + phoneNumber);
		System.out.println("Salary: " + salary);
		System.out.println("Hire Date: " + hireDate);

	}
}

/*
 * -NO PUEDE HABER MAS DE DOS CLASES PUBLICAS...SOLO LA QUE TENGA EL NOMBRE DEL
 * ARCHIVO .JAVA public class employed{ -B.P.=> SOLO UNA CLASE POR ARCHIVO .JAVA
 * }
 */