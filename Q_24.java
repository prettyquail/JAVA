package New;
import java.util.Scanner;
public class Employee {
	String firstname = getfname();
	String lastname = getlname();
	double salary=getsalary();
	static Scanner sc = new Scanner(System.in);
	public static final String getfname() {
	      System.out.println("Enter firstname");
	      return sc.next();
	   }
	   public static final String getlname() {
	      System.out.println("Enter lastname");
	      return sc.next();
	   }
	   public static final double getsalary() {
		      System.out.println("Enter lastname");
		      return sc.nextDouble();
		   }
	   public void display(){
	      System.out.println("Firstname , lastname , salary: ");
	      System.out.println(this.firstname);
	      System.out.println(this.lastname);
	      System.out.println(this.salary);
	   }
	   public static void main(String args[]){
	      Employee obj = new Employee();
	      obj.display();
	   }

}
/*Output
Enter firstname
Manisha
Enter lastname
Sahu
Enter lastname
50000
Firstname , lastname , salary: 
Manisha
Sahu
50000.0
*/
