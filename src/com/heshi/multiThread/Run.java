package com.heshi.multiThread;

//测试线程使用状态
public class Run {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		MyThread myThread = new MyThread();
		System.out.println("begin == " + myThread.isAlive());
		myThread.start();
		myThread.sleep(1000);
		System.out.println("end == " + myThread.isAlive());
	}

}
