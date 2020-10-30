package New;

import java.util.Random;
import java.util.Scanner;
public class Q_14 {

		// TODO Auto-generated method stub
		
		 public static void main(String args[]) {
			 
				 Scanner sc=new Scanner(System.in);
				 Random num = new Random();
				 int max=0,min=0;
			      int res[][][]=new int[3][4][6];
			      
			      for ( int i = 0; i <3; i++ ) {
			    	  for(int j=0;j<4;j++) {
			    		  for(int k=0;k<6;k++) {
			         res[i][j][k] =1+num.nextInt(70);
			         System.out.println(res[i][j][k]);
			 				if(i==0 && j==0 && k==0) {
			 					min=res[i][j][k];
			 					max=res[i][j][k];
			 				}
			 				if(res[i][j][k]>max) {
			 					max=res[i][j][k];
			 				}
			 				if(res[i][j][k]<min) {
			 					min=res[i][j][k];
			 				}
			 		  }
			    	}
			    }
			      System.out.println("Max="+max);
			      System.out.println("Min="+min);
		}
}


