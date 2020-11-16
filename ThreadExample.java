class ThreadExample extends Thread{

	public void run(){
		System.out.println("Counting");
	}
	public static void main(String args[]){
		ThreadExample t1=new ThreadExample();
		t1.start();
	}
}
