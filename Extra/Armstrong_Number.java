package Online_Class;
import java.util.Scanner;
import java.lang.Math;
public class H_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int number;
		int a;
		number=sc.nextInt();
		int orignalNum=number;
		String length = Integer.toString(number);
	
		int i;
		double sum=0.0;
		
		while(number>0) {
			a=number%10;
		
			number=number/10;
			
			sum=sum+Math.pow(Double.valueOf(a),Double.valueOf(length.length()));
			
			
		}
		if(orignalNum==sum) {
			System.out.println("It is an Armstrong number");
		}
		else {
			System.out.println("It is not an Armstrong number");
		}
	    
	}

}
/*Output
Enter the number
1634
It is an Armstrong number
*/
