interface Fare
{
	public double getAmount();
	

}
class Bus implements Fare
{
	double amount;
	void setData(double amount)
	{
		this.amount=amount;
	}
	public double getAmount()
	{
		return amount;
	}
}
class Train implements Fare

{
	double amount;
	void setData(double amount)
	{
		this.amount=amount;
	}
	public double getAmount()
	{
		return amount;
	}

}
class Q_48
{
	public static void main(String args[])
	{
	Bus ob=new Bus();
	ob.setData(500.12);
	
	double amt=ob.getAmount();
	System.out.println("Fare of Bus : "+amt);
	
	Train ob1=new Train();
	ob1.setData(800.30);
	 
	amt=ob1.getAmount();
	System.out.println("Fare of Train : "+amt);
	}
	


}
