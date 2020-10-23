package New;
import java.util.Scanner;
public class Q_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3;
		boolean userInputCorrect=false;
		Scanner sc=new Scanner(System.in);
		do {
			System.out.println("Enter the value of three integers");
			num1=sc.nextInt();
			num2=sc.nextInt();
			num3=sc.nextInt();
			if(num1>0 && num2>0 && num3>0) {
				break;
			}
			else {
				System.out.println("Enter non zero values");
			}
		}while(!userInputCorrect);
		
	  int sum=num1+num2+num3;
      System.out.println("Sum="+sum);
      System.out.println("Product="+num1*num2*num3);
      System.out.println("Average="+sum/3);
      if( num1 >= num2 && num1 >= num3)
          System.out.println(num1+" is the largest Number");

      else if (num2 >= num1 && num2 >= num3)
          System.out.println(num2+" is the largest Number");

      else
          System.out.println(num3+" is the largest Number");
	}

}
/*Output
Enter the value of three integers
2
3
4
Sum=9
Product=24
Average=3
4 is the largest Number
*/
