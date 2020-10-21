package New;
import java.util.Scanner;
public class Q_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Scanner sc=new Scanner(System.in);
		int[][] array=new int[n][2];
		double[] total;
		double[] price= {99.90 ,20.20 ,6.87 ,45.50,40.49};
		System.out.println("Enter the Product id and Quantity sold");
		for(int i=0;i<n;i++) {
			
		   array[i][0]=sc.nextInt();
		   array[i][1]=sc.nextInt();
			
		}
		
		
			   
	   for(int i=0;i<n;i++) {
		   
	   
		switch(array[i][0]) {
		case 1:
			System.out.println("Product id:"+array[i][0]+", Quantity:"+array[i][1]+",Retail Value:"+array[i][0]*price[i]);
			break;
		case 2:
			System.out.println("Product id:"+array[i][0]+", Quantity:"+array[i][1]+",Retail Value:"+array[i][0]*price[i]);
			break;
		case 3:
			System.out.println("Product id:"+array[i][0]+", Quantity:"+array[i][1]+",Retail Value:"+array[i][0]*price[i]);
			break;
		case 4:
			System.out.println("Product id:"+array[i][0]+", Quantity:"+array[i][1]+",Retail Value:"+array[i][0]*price[i]);
			break;
		case 5:
			System.out.println("Product id:"+array[i][0]+", Quantity:"+array[i][1]+",Retail Value:"+array[i][0]*price[i]);
			break;
		default:
			System.out.println("No Product id");
			break;
			
		}
	
}

	
	}

}

/*Output
Enter the Product id and Quantity sold
1
1
2
2
3
3
4
4
5
5
Product id:1, Quantity:1,Retail Value:99.9
Product id:2, Quantity:2,Retail Value:40.4
Product id:3, Quantity:3,Retail Value:20.61
Product id:4, Quantity:4,Retail Value:182.0
Product id:5, Quantity:5,Retail Value:202.45000000000002
*/
