package New;
import java.util.Scanner;

class Emp{
	Scanner sc=new Scanner(System.in);
	String fname,lname,desg,dep;
	void getFirstName(){
		System.out.println("Enter Firstname of an Employee");
		fname=sc.nextLine();
	}
	void getLastName() {
		System.out.println("Enter Lastname of an Employee");
		lname=sc.nextLine();
	}
}

class ContractEmployee extends Emp{


	void displayFullName() {
		System.out.println("FirstName="+fname);
		System.out.println("LAstName="+lname);
	}
	
	void getDepartment() {
		System.out.println("Enter department of Contract Employee");
		dep=sc.nextLine();
	}
	void getDesignation() {
		System.out.println("Enter designation of Contract Employee");
		desg=sc.nextLine();
	}
}
class RegularEmployee extends Emp{
	

	void displayFullName() {
		System.out.println(fname+" "+lname);
		
	}
	
	void getDepartment() {
		System.out.println("Enter department of Regular Employee");
		dep=sc.nextLine();
	}
	void getDesignation() {
		System.out.println("Enter designation of Regular Employee");
		desg=sc.nextLine();
	}
}

public class Q_35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ContractEmployee obj1=new ContractEmployee();
		RegularEmployee obj2=new RegularEmployee();
		obj1.getFirstName();
		obj1.getLastName();
		obj2.getFirstName();
		obj2.getLastName();
		
		obj1.displayFullName();
		obj2.displayFullName();
		
		obj1.getDepartment();
		obj2.getDepartment();
		obj1.getDesignation();
		obj2.getDesignation();
		

	}

}
/*Output
Enter Firstname of an Employee
Manisha
Enter Lastname of an Employee
Sahu
Enter Firstname of an Employee
Sonia
Enter Lastname of an Employee
Goplani
FirstName=Manisha
LAstName=Sahu
Sonia Goplani
Enter department of Contract Employee
Mtech
Enter department of Regular Employee
MCA
Enter designation of Contract Employee
Student
Enter designation of Regular Employee
Working Professional
*/
