package thread;

public class mynewthread extends Thread {// implements Runnable
	public void run()
	{
		for (int i=0;i<=10;i++)
		{
			System.out.println("thread"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		mynewthread mnt =new mynewthread();//creating thread using extends
		mnt.start();
		Thread t=new Thread(mnt);//creating threds using runnable
		//t.start();

	}

}
