package Q39;
import java.util.Scanner;
class CommunityManager{
	String name,address,dofJoin;
	String contact;
	Scanner sc=new Scanner(System.in);
	void getName() {
		System.out.println("Enter name:");
		name=sc.nextLine();
	}
	void getAddress() {
		System.out.println("Enter address:");
		address=sc.nextLine();
	}
	void getDate_of_join() {
		System.out.println("Enter date of joining:");
		dofJoin=sc.nextLine();
	}
	void getContact() {
		System.out.println("Enter contact:");
		contact=sc.nextLine();
	}
}
class Employee extends CommunityManager{
	String qual;
	void qualification() {
		System.out.println("Enter qualification of an Employee:");
		qual=sc.nextLine();
	}
}
class Student extends CommunityManager{
	String qual;
	void qualification() {
		System.out.println("Enter qualification of an Student:");
		qual=sc.nextLine();
	}
}
public class Q_39 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1=new Employee();
		Student obj2=new Student();
		obj1.getName();
		obj1.getAddress();
		obj1.getDate_of_join();
		obj1.getContact();
		obj1.qualification();
		
		obj2.getName();
		obj2.getAddress();
		obj2.getDate_of_join();
		obj2.getContact();
		obj2.qualification();
	}

}




/*Output
Enter name:
Manisha Sahu
Enter address:
kanha kumari
Enter date of joining:
23-06-2010
Enter contact:
m@gmail.com
Enter qualification of an Employee:
Btech
Enter name:
Anumeha 
Enter address:
Gulmohan kunj
Enter date of joining:
16-09-2011
Enter contact:
a@gy.com
Enter qualification of an Student:
Mtech
*/
