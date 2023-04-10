package basic;

class Employee{
	long employeeId,employeePhone;
	String employeeName,employeeAddress;
	double basicSalary,specialAllowance =250.80,Hra=1000.50;
    public Employee(long employeeId,String employeeName,String employeeAddress,long employeePhone) 
    {
    	this.employeeId=employeeId;
    	this.employeeName=employeeName;
    	this.employeeAddress=employeeAddress;
    	this.employeePhone=employeePhone;
      
    }
    public void calculateSalary(double specialAllowance,double Hra) {
        double salary;
    	salary = basicSalary+(basicSalary*specialAllowance/100)+(basicSalary*Hra/100);
    	System.out.println("Salary is : "+salary);
    }
    public void calculateTransportAllowance(double basicSalary)
    {
    	double transportAllowance = (10*basicSalary)/100;
        System.out.println("Transport Allowance is : "+transportAllowance);
    }
}
class Manager extends Employee{

	public Manager(long employeeId, String employeeName, String employeeAddress, long employeePhone,double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary=basicSalary;
	}
	public void display(){
		System.out.println("Employee Id : "+this.employeeId);
		System.out.println("Employee Name :"+this.employeeName);
		System.out.println("Employee Address : "+this.employeeAddress);
		System.out.println("Phone Number : "+this.employeePhone);
		System.out.println("Basic Salary of Employee is : "+this.basicSalary);
	}
	@Override 
	 public void calculateTransportAllowance(double basicSalary)
	 {
	    	double transportAllowance = (15*basicSalary)/100;
	        System.out.println("Transport Allowance is : "+transportAllowance);
	 }
}
class Trainee extends Employee{

	public Trainee(long employeeId, String employeeName, String employeeAddress, long employeePhone,double basicSalary) {
		super(employeeId, employeeName, employeeAddress, employeePhone);
		this.basicSalary=basicSalary;
	}
	public void display(){
		System.out.println("Employee Id : "+this.employeeId);
		System.out.println("Employee Name :"+this.employeeName);
		System.out.println("Employee Address : "+this.employeeAddress);
		System.out.println("Phone Number : "+this.employeePhone);
		System.out.println("Basic Salary of Employee is : "+this.basicSalary);
	}
}

public class InheritanceActivity {

	public static void main(String[] args) {
		Manager mg = new Manager(126534,"Peter","Chennai India",237844,65000);
		mg.display();
		mg.calculateSalary(250.80, 1000.50);
		mg.calculateTransportAllowance(65000);
		System.out.println();
		System.out.println();
		Trainee tr = new Trainee(29846,"jack","Mumbai India",457865,45000);
		tr.display();
		tr.calculateSalary(250.80, 1000.50);
		tr.calculateTransportAllowance(45000);
	}

}