package New;
import java.util.Scanner;
public class Q_31 {
	static Scanner sc=new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num;
		boolean userInputCorrect=false;
    //Validation for five digit number
		do {
			System.out.println("Enter num");
			num=sc.nextInt();
		
			if(Integer.toString(num).length()==5) {
				break;
			}
			else {
				System.out.println("This is not a five digit number");
			}
			
		}while(!userInputCorrect);
		
			int reversed = 0;
            int org=num;
	        while(num != 0) {
	            int digit = num % 10;
	            reversed = reversed * 10 + digit;
	            num /= 10;
	        }
	       
	        if(reversed==org) {
	        	
	        	System.out.println("Palindrome");
	        }
	        else {
	        	System.out.println("Not Palindrome");
	        }
		
		
		
	}

}
/*Output
Enter num
44554
Not Palindrome
*/
