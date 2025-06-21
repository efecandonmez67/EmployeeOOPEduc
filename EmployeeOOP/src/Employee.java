
public class Employee {
	
	public int no;
	public String name;
	public String surname;
	public double salary;
	public int experience;
	
	public Employee() {
		
	}
	
	public Employee(int no, String name, String surname, double salary, int experience) {
		super();
		this.no = no;
		this.name = name;
		this.surname = surname;
		this.salary = salary;
		this.experience = experience;
	}


	public void displayEmployeeInfo() {
		System.out.println("Number: "+no);
		System.out.println("Name: "+name);
		System.out.println("Surname: "+surname);
		System.out.println("Maas: "+salary);
		System.out.println("Experience: "+experience);
		
	}
	
	public void raise(int raiseAmount) {
		salary+=raiseAmount;
	}

}
