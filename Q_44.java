
import java.util.Scanner;
abstract class Shape{


abstract void area();
abstract void volume();

}
class Sqaure extends Shape{
	double side;
	Scanner sc=new Scanner(System.in);
	
	
	double area;  
	void area(){
	System.out.println("Enter the side of sqaure");
		side=sc.nextDouble();
 		area=side*side;
		System.out.println("Area of a sqaure"+area);
   	}
	void volume(){
 	
	System.out.println("Since it is a 2D shape it doesnot consists of volume");
   	}
 
 
}
class Circle extends Shape{
	double radius;

	Scanner sc=new Scanner(System.in);
	double area;  
	void area(){

		System.out.println("Enter the radius of circle");
		radius=sc.nextDouble();
 		area=3.14*radius*radius;
		System.out.println("Area of a circle"+area);
   	}
	void volume(){
 	
	System.out.println("It is a 2D shape ,so there is no volume");
   	}
 
 
}
class Cube extends Shape{
	double side;
	double area;  
	double volume;
	Scanner sc=new Scanner(System.in);
	void area(){
		System.out.println("Enter the side of cube");
		side=sc.nextDouble();
 		volume=side*side*side;
		System.out.println("Volume of a cube"+volume);
   	}
	void volume(){
		System.out.println("Enter the side of cube");
		side=sc.nextDouble();
 		area=6*side*side;
		System.out.println("Area of a cube"+area);
   	}
 
}
class Q_44{
 public static void main(String args[]){
	Shape s=new Sqaure();
	s.area();
	Shape s1=new Circle();
	s1.area();
	Shape s2=new Cube();
	s2.area();
	s2.volume();
	}
}


