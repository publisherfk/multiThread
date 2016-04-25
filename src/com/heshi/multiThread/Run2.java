package com.heshi.multiThread;

public class Run2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			MyThread2 myThread2 = new MyThread2();
			myThread2.start();
			Thread.sleep(2);
			myThread2.interrupt();
			System.out.println("是否停止1?=" + myThread2.isInterrupted());
			System.out.println("是否停止2?=" + myThread2.isInterrupted());
			System.out.println("end");
			System.exit(0);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			System.out.println("main catch");
			e.printStackTrace();

		}

	}

}
