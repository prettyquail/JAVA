package New;
import java.util.Scanner;
public class Qu_13 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		int hcf=0;
		System.out.println("Enter the number of pairs");
		Scanner sc=new Scanner(System.in);
		
		n=sc.nextInt();
		int[][] arr=new int[n][2];
		System.out.println("Enter a and b for each pair");
		for(int i=0;i<n;i++) {
			arr[i][0]=sc.nextInt();
			arr[i][1]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i][0]<arr[i][1]) {
				System.out.println("b is greater than a");
				
			}
			if(arr[i][0]>arr[i][1]) {
					System.out.println("a is greater than b");
				
			}
			if(arr[i][0]%2==0 && arr[i][1]%2==0) {
				System.out.println("Both a and b are even");
			}
			else {
				System.out.println("Both a and b are not even");
			}
			 for(int j = 1; j <= arr[i][0] || j <= arr[i][1]; j++) {
		         if( arr[i][0]%j == 0 && arr[i][1]%j == 0 ) {
		           hcf = j;
		         }
		     }
			if(hcf==1) {
				System.out.println("Relatively Prime");
			}
			else {
				System.out.println("Not Relatively Prime");
			}
	    }
	}
}

	


/*Output
Enter the number of pairs
2
Enter a and b for each pair
1
4
2
6
b is greater than a
Both a and b are not even
Relatively Prime
b is greater than a
Both a and b are even
Not Relatively Prime
*/
