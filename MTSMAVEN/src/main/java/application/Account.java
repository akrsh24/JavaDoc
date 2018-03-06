package application;

public class Account {
	public static void main(String args[])
	{
		App app=new App();
		
	Thread t1=new Thread(app);
	Thread t2=new Thread(app);
	
	Thread t3=new Thread(app);
	t1.start();
	
	
	
	
	t2.start();
	t3.start();
	}    
}
