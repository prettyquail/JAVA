package Q40;
import java.util.Scanner;
class Shape{
	String type;
	Scanner sc=new Scanner(System.in);
	String getName() {
		
		type=sc.nextLine();
		return type;
	}

}
class TwoDim extends Shape{
	double area(double radius) {
		return 3.14*radius*radius;
	}
	double volume(double radius) {
		return 2*3.14*radius;
	}
}
class ThreeDim extends Shape{
	int area(int side) {
		return side*side*side;
	}
	int volume(int side) {
		return 6*side*side;
	}
}
public class Q_40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		String str;
		int s;
		double r;
		int a,v;
		double ar,vol;
		System.out.println("Enter the side of cube");
		s=scan.nextInt();
		scan.nextLine();
		System.out.println("Enter radius of circle");
		r=scan.nextDouble();
		scan.nextLine();
		TwoDim obj1=new TwoDim();
		ThreeDim obj2=new ThreeDim();
		System.out.println("Enter the type of shape");
		str=obj1.getName();
		System.out.println(str);
		
		if(str.equals("twoDim")) {
			ar=obj1.area(r);
			System.out.println("Area of Circle="+ar);
			vol=obj1.volume(r);
			System.out.println("Circumference of circle="+vol);
		}
		else if(str.equals("threeDim")){
			a=obj2.area(s);
			System.out.println("Area of cube="+a);
			v=obj2.volume(s);
			System.out.println("volume of cube="+v);
		}
		
			
	}

}
/*Output
Enter the side of cube
2
Enter radius of circle
7.5
Enter the type of shape
threeDim
threeDim
Area of cube=8
volume of cube=24
*/
