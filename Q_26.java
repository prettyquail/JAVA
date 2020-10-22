package New;
import java.util.Scanner;
public class EmployeeTest {
	    
		double salary=getMonthlySalary();
		double raisedSalary=getRaisedSalary();
		double yearlySalary=getYearlySalary();
		
		static Scanner sc = new Scanner(System.in);
		public  static final double getMonthlySalary() {
			      System.out.println("Enter monthly salary");
			      return sc.nextDouble();
			   }
		
		public  double getRaisedSalary()
		{
			double raisedSalary = salary * 0.1+salary;
			return raisedSalary;
		}
		public  double getYearlySalary()
		{
			double yearlySalary = raisedSalary * 12.0;
			return yearlySalary;
		}
		public  void display(){
		      System.out.println("New Yearly salary after raise of 10% : ");
		    
		      System.out.println(this.yearlySalary);
		   }
		  
public static void main(String args[]){
    EmployeeTest obj1 = new EmployeeTest();
    obj1.display();
    EmployeeTest obj2=new EmployeeTest();
    obj2.display();
 }
}
/*Output
Enter monthly salary
100
New Yearly salary after raise of 10% : 
1320.0
Enter monthly salary
200
New Yearly salary after raise of 10% : 
2640.0
*/
