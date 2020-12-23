import java.io.ObjectInputStream.GetField;
import java.util.Scanner;

public class Main {
	static Scanner scan = new Scanner(System.in);
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input = 0;
		do {
		System.out.println("Logwarts School");
		System.out.println("=================");
		System.out.println("1. Insert Employee");
		System.out.println("2. Insert Permanent Employee");
		System.out.println("3. Exit");
		System.out.print(">> ");
		input = scan.nextInt();
		scan.nextLine();
			if(input == 1) {
				insertEmployee(false);
			}
			else if(input == 2) {
				insertEmployee(true);
			}
			else if(input == 3){
				break;
			}
		}while(input < 1 || input > 3);
	}
	
	public static void insertEmployee(boolean isPermanent){
		Employee employee = null;
		String name = "";
		String address = "";
		String position = "";
		String gender = "";
		int salary = 0;
		
		do {
			System.out.println("Employee Name : ");
			name = scan.nextLine();
			if(!name.startsWith("Mr.") || !name.startsWith("Mrs."))
				break;
		}while(!name.startsWith("Mr.") || !name.startsWith("Mrs."));
		
		do {
			System.out.println("Employee Address [Must end with ' Street'] : ");
			address = scan.nextLine();
			if(!address.endsWith(" Street"))
				break;
		}while(!address.endsWith(" Street"));
		
		do {
			System.out.println("Employee Gender [Male | Female]: ");
			gender=scan.nextLine();
			if(!gender.equals("Male") || !gender.equals("Female"))
				break;
		}while(!gender.equals("Male") || !gender.equals("Female"));
		
		do {
			System.out.println("Employee Position [Teacher | Staff | Office boy]: ");
			position = scan.nextLine();
			if(position.equals("Teacher")) {
				employee = new Teacher();
				break;
			}
			else if(position.equals("Staff")) {
				employee = new Staff();
				break;
			}
			else if(position.equals("Office boy")) {
				employee = new OfficeBoy();
				break;
			}
		}while(!position.equals("Teacher") || !position.equals("Staff") || !position.equals("Office boy"));
		
		do {
			System.out.println("Employee Salary [Minimum Salary = 4000000]: ");
			salary = scan.nextInt();
			if(salary < 4000000)
				break;
		}while(salary < 4000000);
		
		employee.setName(name);
		employee.setAddress(address);
		employee.setGender(gender);
		employee.setSalary(salary);
		
		
		if(isPermanent) {
			do {
				System.out.println("Bonus salary [Must be greater than 50000]: ");
				employee.setBonusSalary(scan.nextInt());
				if(employee.getBonusSalary() <= 50000)
					break;
			}while(employee.getBonusSalary() <= 50000);
			employee.setTotalSalary(employee.getBonusSalary());
		}
		displayEmployee(employee);
	}
	
	public static void displayEmployee(Employee employee) {
		System.out.println("Inert Employee Success !!");
		System.out.println("Name : "+ employee.getName());
		System.out.println("Address : "+ employee.getAddress());
		System.out.println("Gender : "+ employee.getGender());
		System.out.println("Position : "+ employee.getClass().toString());
		System.out.println("Total Salary : "+ employee.getTotalSalary());
	}
	

}
