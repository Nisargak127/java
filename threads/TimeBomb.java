package threads;


public class TimeBomb extends Thread {
	 String[] timeStr = {"Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};

	    public void run() {
	        for (int i = 9; i >= 0; i--) {
	            try {
	                System.out.println(timeStr[i]);
	                Thread.sleep(1000);
	            } catch (InterruptedException ie) {
	                ie.printStackTrace();
	            }
	        }
	        
	        class main {

	        	public static void main(String[] args) {
	        		// TODO Auto-generated method stub
	        		 TimeBomb timer = new TimeBomb();
	        	        System.out.println("Starting 10 second count down. . . ");
	        	        System.out.println("Boom!!!");
	        	}

	        }
	        }
}
