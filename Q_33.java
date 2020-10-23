package New;
import java.util.Scanner;
public class Q_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius");
		double radius=sc.nextDouble();
		
		double area=circleArea(radius);
		System.out.println("Area of Circle="+area);
		

	}
   public static double circleArea(double radius) {
	   return 3.14*radius*radius;
   }
}
/*Output
Enter the radius
7.0
Area of Circle=153.86
*/
