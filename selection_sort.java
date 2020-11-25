import java.util.Scanner;
class selection_sort{
  public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of elements");
	int n=sc.nextInt();
	int[] arr=new int[n];
	System.out.println("Enter elements");
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	
	int i,j,temp;
	System.out.println("Selection sort");
	System.out.println("Array before sorting");
	for(i=0;i<n;i++){
		System.out.print(" "+arr[i]);
	}
	for(i=0;i<=n-2;i++){
		for(j=i+1;j<=n-1;j++){
			if(arr[i]>arr[j]){
			 temp=arr[i];
			 arr[i]=arr[j];
			 arr[j]=temp;
			}
		
		}

	}
        System.out.println();
	System.out.println("Array after sorting");
	for(i=0;i<n;i++){
		System.out.print(" "+arr[i]);
	}
	
  }

}
