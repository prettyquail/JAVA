package New;
import java.util.Scanner;
public class Q_18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String one,two;
		System.out.println("Enter the string");
		one=sc.next();
		two=sc.next();
		System.out.println("Concatenated string="+one.concat(" ").concat(two));

	}

}
/*Output
Enter the string
Manisha
Sahu
Concatenated string=Manisha Sahu
*/
