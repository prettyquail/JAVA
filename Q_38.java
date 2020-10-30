package Q37;


import java.util.Scanner;
class vehicle{
	Scanner sc=new Scanner(System.in);
	Scanner in=new Scanner(System.in);
	int vehicleNo,insuranceNo;
	String color;
	double average,maint;
	double fuel;
	
	void getDetails() {
		System.out.println("Enter vehicle no");
		vehicleNo=in.nextInt();
		System.out.println("Enter insurance no");
		insuranceNo=in.nextInt();
		System.out.println("Enter color");
		color=sc.nextLine();
		System.out.println("Enter average");
		average=sc.nextDouble();
		System.out.println("Enter maintenance");
		maint=sc.nextDouble();
		
		}

	void getConsumption() {
		System.out.println("Enter consumption of vehicle");
		fuel=sc.nextDouble();
	}
	void displayConsumption() {
		System.out.println("Consumption="+fuel);
	}
}

class twoWheeler extends vehicle{
	String type,name;
	void average() {
	System.out.println("Average of two wheeler vehicle"+average);
	}
	void maintenance() {
	System.out.println("Maintenance of two wheeler vehicle"+maint);
	}
	void getType() {
		System.out.println("Enter the type of company");
		type=sc.nextLine();
		
	}
	void getName() {
		System.out.println("Enter the type of company");
		name=sc.nextLine();
		
	}
	
}

class Geared extends twoWheeler{
	
	void Average() {
		double avg;
		System.out.println("Enter average of geared two wheeler vehicle");
		avg=sc.nextDouble();
	System.out.println("Geared Average="+avg);
	}
}
class NonGeared extends twoWheeler{
	
	void Average() {
		double avg;
		System.out.println("Enter average of Non geared two wheeler vehicle");
		avg=sc.nextDouble();
	System.out.println("Non Geared Average"+avg);
	}
}
class fourWheeler extends vehicle{
	void average() {
	System.out.println("Average of four wheeler vehicle"+average);
	}
	void maintenance() {
	System.out.println("Maintenance of four wheeler vehicle"+maint);
	}
	
}
public class Q_37 {
	public static void main(String[] args) {
	twoWheeler obj1=new twoWheeler();
	fourWheeler obj2=new fourWheeler();
	Geared obj3=new Geared();
	NonGeared obj4=new NonGeared();
	obj1.getDetails();
	obj1.getConsumption();
	obj1.displayConsumption();
	obj1.average();
	obj1.maintenance();
	obj3.Average();
	obj4.Average();
	
	obj2.getDetails();
	obj2.getConsumption();
	obj2.displayConsumption();
	obj2.average();
	obj2.maintenance();
	obj3.Average();
	obj4.Average();
	}
}

/*Output
Enter vehicle no
1911
Enter insurance no
3455
Enter color
Blue
Enter average
77.6
Enter maintenance
32.2
Enter consumption of vehicle
12
Consumption=12.0
Average of two wheeler vehicle77.6
Maintenance of two wheeler vehicle32.2
Enter average of geared two wheeler vehicle
66.
Geared Average=66.0
Enter average of Non geared two wheeler vehicle
45.3
Non Geared Average45.3
Enter vehicle no
1923
Enter insurance no
5678
Enter color
Black
Enter average
78.5
Enter maintenance
10
Enter consumption of vehicle
56.4
Consumption=56.4
Average of four wheeler vehicle78.5
Maintenance of four wheeler vehicle10.0
Enter average of geared two wheeler vehicle
65.4
Geared Average=65.4
Enter average of Non geared two wheeler vehicle
43.6
Non Geared Average43.6
*/
