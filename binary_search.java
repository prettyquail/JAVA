import java.util.Scanner;
class binary_search6{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	int[] a=new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++){
		a[i]=sc.nextInt();
	}
	
	int mid,lower=0,upper=a[n-1],num,flag=1;
	System.out.println("Enter the number to search");
	num=sc.nextInt();
	for(mid=(lower+upper)/2;lower<=upper;mid=(lower+upper)/2){
		if(a[mid]==num){
			System.out.println("Element found at="+mid);
			flag=0;
			break;
		}
		if(a[mid]>num){
			upper=mid-1;
		}
		if(a[mid]<num){
			lower=mid+1;
		}
	}
	if(flag==1){
	 System.out.println("Element is not present in the array");
	}

  }

}
