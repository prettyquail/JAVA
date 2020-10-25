package Online_Class;
import java.util.Scanner;
public class Perfect_Number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int number;
		System.out.println("Enter the number");
		number=sc.nextInt();
		int sum=0;
		for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum=sum+i;
			}
		}
		System.out.println("Sum is="+sum);
		if(sum==number) {
			System.out.println("Perfect number");
		}
		else {
			System.out.println("Not a Perfect number");
		}
		

	}

}
/*Output
Enter the number
6
Sum is=6
Perfect number
*/
