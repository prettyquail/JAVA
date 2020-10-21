package New;

public class Q_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String theString = "is this good or is this bad?";
		String substring = "i";
        int count=0;
		int index = theString.indexOf(substring);
		while(index != -1) {
		    count=count+1;
		    index = theString.indexOf(substring, index + 1);
		}
      System.out.println("Number of occurences="+count);
	}

}
/*Output
Number of occurences=4
*/
