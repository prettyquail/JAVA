import java.util.Scanner;
class Logic
{
	int n;
	int nums[];
	Logic(int n)
	{
		this.n = n;
	}
	public void readNumbers()
	{
		Scanner sc = new Scanner(System.in);
		nums = new int[n];
		System.out.println("Enter " + n + " numbers");
		for(int i = 0; i < n; i++)
		{
			nums[i] = sc.nextInt();
		}
	}
	public void printEvenNumbers()
	{
		System.out.println("Even numbers in the range 1 - " + n);
		for(int i = 2; i <= n; i = i + 2)
			System.out.println(i + " ");
	}
	public void printOddNumbers()
	{
		System.out.println("Odd numbers in the range 1 - " + n);
		for(int i = 1; i <= n; i = i + 2)
			System.out.println(i + " ");
	}
	public void average()
	{
		int sum = 0;
		float avg = 0.0f;
		for(int i = 0; i < n; i++)
			sum = sum + nums[i];
		avg = (float) sum / n;
		System.out.println("Average is : " + avg);
	}
}

class MyThread1 implements Runnable
{
	Thread t;
	Logic l;
	MyThread1(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		l.readNumbers();
	}
}
class MyThread2 implements Runnable
{
	Thread t;
	Logic l;
	MyThread2(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		l.printEvenNumbers();
	}
}

class MyThread3 implements Runnable
{
	Thread t;
	Logic l;
	MyThread3(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		l.printOddNumbers();
	}
}
class MyThread4 implements Runnable
{
	Thread t;
	Logic l;
	MyThread4(Logic l)
	{
		this.l = l;
		t = new Thread(this);
		t.start();
	}
	public void run()
	{
		l.average();
	}
}

public class Driver
{	
	public static void main(String[] args) throws InterruptedException
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter n: ");
		int n = input.nextInt();
		Logic l = new Logic(n);
		MyThread1 t1 = new MyThread1(l);
		MyThread2 t2 = new MyThread2(l);
		MyThread3 t3 = new MyThread3(l);
		t1.t.join();
		MyThread4 t4 = new MyThread4(l);		
	}
}
