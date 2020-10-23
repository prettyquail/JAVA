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
		
		double perimeter=circlePerimeter(radius);
		System.out.println("Perimeter of Circle="+perimeter);
		

	}
   public static double circleArea(double radius) {
	   return 3.14*radius*radius;
   }
   public static double circlePerimeter(double radius) {
	   return 2*3.14*radius;
   }
}
/*Output
Enter the radius
3
Area of Circle=28.259999999999998
Perimeter of Circle=18.84
*/
