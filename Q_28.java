package New;

import java.util.Scanner;
public class Q_28{
	  static double balance;
	  static Scanner sc=new Scanner(System.in);
	  public static double getbalance() {
		  balance=sc.nextDouble();
		  return balance;
	  }
	  public static void credit(double a) {
		  double sum=balance+a;
		  System.out.println("Credit="+sum);
	  }
	  
	  public static void main(String[] args) {
		  System.out.println("Enter Balance");
		double balance=getbalance();
	    double amount;
	    System.out.println("Enter Amount");
	    amount=sc.nextDouble();
	    credit(amount);
	  }
}

 

/*Output
Enter Balance
300
Enter Amount
200
Credit=500.0
*/
