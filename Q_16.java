package New;
import java.util.Scanner;
public class Q_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String one,two,three,four;
		System.out.println("Enter First String");
		one=sc.next();
		System.out.println("Enter Second String");
		two=sc.next();
		System.out.println("Enter Third String");
		three=sc.next();
		System.out.println("Enter Fourth String");
		four=sc.next();
		System.out.println(one.equals(two));
		System.out.println(three.equalsIgnoreCase(four));
		

	}

}
/*Output
Enter First String
Apple
Enter Second String
apple
Enter Third String
BANANA
Enter Fourth String
banana
false
true
*/
