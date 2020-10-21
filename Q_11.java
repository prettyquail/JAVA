package New;

public class Q_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    double p=1000.0,r;
	    int t=3;
	    double temp;
	    double m;
	    for(r=5;r<=10;r++) {
	    	m=(1+(r/100));
	    	temp=1;
	    for(int i=1;i<=t;i++) {
	    	temp=temp*m;
	    
	    }
	    
	    
	    double amount=p*temp;
	    System.out.println("Amount="+amount);
	    double ci=amount-p;
	    System.out.println("Compound Interest="+ci);
	    }
  }
}


/*Output
Amount=1157.6250000000002
Compound Interest=157.62500000000023
Amount=1191.0160000000003
Compound Interest=191.0160000000003
Amount=1225.0430000000001
Compound Interest=225.04300000000012
Amount=1259.7120000000002
Compound Interest=259.7120000000002
Amount=1295.0290000000002
Compound Interest=295.0290000000002
Amount=1331.0000000000005
Compound Interest=331.00000000000045
*/
