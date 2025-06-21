import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner scanner= new Scanner(System.in);
		
		System.out.println("Enter no: ");
		int no= scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter name: ");
		String name= scanner.nextLine();

		System.out.println("Enter surname: ");
		String surname= scanner.nextLine();

		System.out.println("Enter experience: ");
		int experience= scanner.nextInt();
		scanner.nextLine();
		
		System.out.println("Enter salary: ");
		int salary= scanner.nextInt();
		scanner.nextLine();
		
		
		
		Employee employee= new Employee(no, name, surname, salary, experience);

		

		boolean loop=true;
		
		while(loop) {
			
			String options= "1 - Display employee informations.\n"
					+"2 - Raise salary.\n"
					+"3 - Exit.\n";
			System.out.println("------------------------");
			System.out.println(options);
			System.out.println("Select one of the options.");
			int secim= scanner.nextInt();
			
			
			switch (secim) {
			case 1: {
				employee.displayEmployeeInfo();
				break;
			}
			case 2: {
				System.out.println("Enter amount of the raise: ");
				int raise= scanner.nextInt();
				scanner.nextLine();
				employee.raise(raise);
				System.out.println(employee.name+"'s "+"new salary is: "+employee.salary);
				break;
			}	
			case 3: {
				loop=false;
				System.out.println("Exiting the application...");	
				break;
			}
			}
				
		}
		
	}

}
