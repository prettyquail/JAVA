import java.util.Scanner;
public class Q_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int first;
		int second;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number");
		first=sc.nextInt();
		System.out.println("Enter the second number");
		second=sc.nextInt();
		int rem=first%second;
		if(rem==0) {
			System.out.println("Frst is the multiple of second");
		}
		else {
			System.out.println("First is not the multiple of second");
		}
	}

}
