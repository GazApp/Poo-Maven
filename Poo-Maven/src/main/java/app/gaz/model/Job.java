package app.gaz.model;

public class Job {

	public int id;
	public String title;
	public double minSalary;
	public double maxSalary;

	public void getDetails() {

		System.out.println("Id: "+id);
		System.out.println("Title: "+title);
		System.out.println("Minum Salary: "+minSalary);
		System.out.println("Maximum Salary: "+maxSalary);

	}

}
