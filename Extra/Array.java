//This is the program to take inputs in an array and then print even and odd numbers.
package Online_Class;
import java.util.Scanner;
public class H_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int[] arr=new int[20];
		System.out.println("Enter values of array");
		for(int i=0;i<20;i++) {
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Even numbers=");
		for(int i=0;i<20;i++) {
			if(arr[i]%2==0) {
				System.out.println(arr[i]);
			}
		}
		
		System.out.println("Odd numbers=");
		for(int i=0;i<20;i++) {
			if(arr[i]%2!=0) {
				System.out.println(arr[i]);
			}
		}

	}

}
