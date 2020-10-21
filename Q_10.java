package New;

public class Q_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    double p=1000.0,r=10.0;
    int t=3;
    double temp=1;
    double m=(1+(r/100));
    for(int i=1;i<=t;i++) {
    	temp=temp*m;
    }
    double amount=p*temp;
    System.out.println("Amount="+amount);
    double ci=amount-p;
    System.out.println("Compound Interest="+ci);
    
	}

}

/* Output
Amount=1331.0000000000005
Compound Interest=331.00000000000045
*/
