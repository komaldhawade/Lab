
package oop;


class Employee{
	long employeeId , employeePhone;
	String employeeName , employeeAddress;
	double basicSalary;
	double specialAllowance =250.80;
	double Hra = 1000.50;
	
	Employee(long employeeId , String employeeName , String employeeAddress , long employeePhone) {
		
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress=employeeAddress;
		this.employeePhone=employeePhone;
		
	}
	 Employee() {
		
	}
	
	public void calculateSalary() {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter Basic Salary : ");
//		basicSalary = sc.nextDouble();
		
		double salary;
		salary=basicSalary + (basicSalary*specialAllowance/100) + (basicSalary*Hra/100);
		
//		return salary;
		System.out.println(salary);
		
	}
	
	public void calculateTransportAllowance(double basicSalary) {
		double transportAllowance = 10*basicSalary/100;
		System.out.println(transportAllowance);
	}
	
	
}
	
	class Manager extends Employee{
		
		Manager(long employeeId, String employeeName,String employeeAddress,long employeePhone , double basicSalary) {
			super(employeeId,employeeName,employeeAddress,employeePhone);
			this.basicSalary=basicSalary;
					
		}
		
		public void display() {
			System.out.println("Employee Id : " +employeeId);
			System.out.println("Employee Name : " +employeeName);
			System.out.println("Employee Address  : " +employeeAddress);
			System.out.println("Employee Contact : " +employeePhone);
			System.out.println("Employee Salary : " +basicSalary);
			
		}
		
		@Override
		public void calculateTransportAllowance(double basicSalary) {
			double transportAllowance = 15*basicSalary/100;
			System.out.println(transportAllowance);
		}
		
	}
		

	
	class Trainee extends Employee{
		
		Trainee(long employeeId, String employeeName,String employeeAddress,long employeePhone , double basicSalary) 
		{
			super(employeeId,employeeName,employeeAddress,employeePhone);
			this.basicSalary=basicSalary;
					
		}	
		
		public void display() {
			System.out.println("Employee Id : " +employeeId);
			System.out.println("Employee Name : " +employeeName);
			System.out.println("Employee Address  : " +employeeAddress);
			System.out.println("Employee Contact : " +employeePhone);
			System.out.println("Employee Salary : " +basicSalary);
			
		}	
		
	}
	

public class InheritanceActivity {
	
	public static void main(String[] args) {
         
		Manager mg = new Manager(126534 , "Peter", "Chennai India", 237844l , 65000);
		System.out.print("Salary of Manager : " ); mg.calculateSalary(); 
		System.out.println();
		System.out.print("Salary of Manager after Transport Allowance : "); mg.calculateTransportAllowance(65000);
		System.out.println();
	        mg.display();
	    
	        System.out.println();
		System.out.println();
		
		
		Trainee tr = new Trainee(29846, "Jack", "Mumbai India", 442085l , 45000);
		System.out.print("Salary of Trainee : "); tr.calculateSalary();
		System.out.println();
		System.out.print("Salary of Trainee after Transport Allowance : "); tr.calculateTransportAllowance(45000);
		System.out.println();
		tr.display();
	
		
		
	}

}
