
import java.util.Scanner;
class Student{
	String qual,fname,lname,addr,contact,course;
	double salary;
	Scanner sc=new Scanner(System.in);
	String getQual() {
		System.out.println("Enter qualification");
		qual=sc.nextLine();
		return qual;
	}
	String getFirstName() {
		System.out.println("Enter first name");
		fname=sc.nextLine();
		return fname;
	}
	String getLastName() {
		System.out.println("Enter last name");
		lname=sc.nextLine();
		return lname;
	}
	String getAddress() {
		System.out.println("Enter address");
		addr=sc.nextLine();
		return addr;
	}
	String getContact() {
		System.out.println("Enter contact");
		contact=sc.nextLine();
		return contact;
	}
}

class Scholar extends Student{
	
	String Course() {
		System.out.println("Enter Course");
		course=sc.nextLine();
		return course;
	}
}

class Faculty extends Student{
	
	double salary() {
		System.out.println("Enter Salary");
		salary=sc.nextDouble();
		return salary;
	}
}
public class Q_43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String quali,firstname,lastname,address,cont,cour;
		double sal;
		Faculty obj1=new Faculty();
		Scholar obj2=new Scholar();
		quali=obj1.getQual();
		firstname=obj1.getFirstName();
		lastname=obj1.getLastName();
		address=obj1.getAddress();
		cont=obj1.getContact();
		sal=obj1.salary();
		
		quali=obj2.getQual();
		firstname=obj2.getFirstName();
		lastname=obj2.getLastName();
		address=obj2.getAddress();
		cont=obj2.getContact();
		cour=obj2.Course();		

	}

}
/*Output

Enter qualification
BCA
Enter first name
ABC
Enter last name
XYZ
Enter address
www
Enter contact
5555555
Enter Salary
5677
Enter qualification
MBA
Enter first name
PQR
Enter last name
MNO
Enter address
rrr
Enter contact
666666
Enter Course
Data Science

*/
