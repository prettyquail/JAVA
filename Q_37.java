package New;
import java.util.Scanner;
class Vehicle{
	Scanner sc=new Scanner(System.in);
	Scanner in=new Scanner(System.in);
	int vehicleNo,insuranceNo;
	String color;
	double average,maint;
	double fuel;
	void getDetails() {
		System.out.println("Enter vehicle no,insurance no. and color of vehicle");
		vehicleNo=in.nextInt();
		insuranceNo=in.nextInt();
		
		sc.nextLine();
		color=sc.nextLine();
		average=sc.nextDouble();
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

class TwoWheeler extends Vehicle{
	void average() {
	System.out.println("Average of two wheeler vehicle"+average);
	}
	void maintenance() {
	System.out.println("Maintenance of two wheeler vehicle"+maint);
	}
	
}
class FourWheeler extends Vehicle{
	void average() {
	System.out.println("Average of four wheeler vehicle"+average);
	}
	void maintenance() {
	System.out.println("Maintenance of four wheeler vehicle"+maint);
	}
	
}
public class Q_37 {
	public static void main(String[] args) {
	TwoWheeler obj1=new TwoWheeler();
	FourWheeler obj2=new FourWheeler();
	obj1.getDetails();
	obj1.getConsumption();
	obj1.displayConsumption();
	obj1.average();
	obj1.maintenance();
	
	obj2.getDetails();
	obj2.getConsumption();
	obj2.displayConsumption();
	obj2.average();
	obj2.maintenance();
	}
}
/*Output
Enter vehicle no,insurance no. and color of vehicle
1911
345
566
Blue
45.4
23
Enter consumption of vehicle
33
Consumption=33.0
Average of two wheeler vehicle45.4
Maintenance of two wheeler vehicle23.0
Enter vehicle no,insurance no. and color of vehicle
1902
567
334
Black
78.8
30.3
Enter consumption of vehicle
12
Consumption=12.0
Average of four wheeler vehicle78.8
Maintenance of four wheeler vehicle30.3
*/
