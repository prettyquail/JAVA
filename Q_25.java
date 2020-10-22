package New;
import java.util.Scanner;
public class EmployeeTest {
	    
		double salary=getMonthlySalary();
		double yearlySalary=getYearlySalary();
		static Scanner sc = new Scanner(System.in);
		public  static final double getMonthlySalary() {
			      System.out.println("Enter monthly salary");
			      return sc.nextDouble();
			   }
		public  double getYearlySalary()
		{
			double yearlySalary = salary * 12.0;
			return yearlySalary;
		}
		public  void display(){
		      System.out.println("Yearly salary: ");
		    
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
Yearly salary: 
1200.0
Enter monthly salary
200
Yearly salary: 
2400.0
*/
