package New;
import java.util.Scanner;
public class Account {
	  double b;
	  public Account(double b) {
	     if(b>0.0) {
	    	 this.b=b;
	     }
		  
	  }

	  public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double balance;
		balance=sc.nextDouble();
	    Account myObj = new Account(balance); 
	    System.out.println(myObj.b);
	  }
}

 

/*Output
3.0
3.0
*/
