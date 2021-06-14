package javaproject;
class Hworld extends Thread{
	
	public void run() {
		System.out.println("\n************************HELLO WORLD***********************\n");
	}
	
}
public class ThreadSample {

	public static void main(String args[]) throws InterruptedException {
		Hworld h = new Hworld();
		h.start();
		System.out.println("STATE 1     :      "+h.getState());
		System.out.println("STATE 2     :      "+h.getState());
		System.out.println("STATE 3     :      "+h.getState());
		System.out.println("STATE 4     :      "+h.getState());
		System.out.println("NAME        :      "+h.getName());
		System.out.println("PRIORITY    :      "+h.getPriority());
		System.out.println("STATE 5     :      "+h.getState());
		h.sleep(200);
	}
}

