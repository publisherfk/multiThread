package day20160427;

public class MyThread extends Thread {

	@Override
	public void run() {
		Sub sub = new Sub();
		sub.operateMainMethod();
	}
}
