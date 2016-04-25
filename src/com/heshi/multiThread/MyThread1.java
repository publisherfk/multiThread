package com.heshi.multiThread;

public class MyThread1 extends Thread {

	@Override
	public void run(){
		try {
			System.out.println("run threadName=" + this.currentThread().getName() + " begin");
			Thread.sleep(2000);
			System.out.println("run threadname=" + this.currentThread().getName() + " end");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
