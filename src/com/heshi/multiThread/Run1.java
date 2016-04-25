package com.heshi.multiThread;

public class Run1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyThread1 myThread1 = new MyThread1();
		System.out.println("begin =" + System.currentTimeMillis());
		myThread1.setName("AAA");
		myThread1.start();
		System.out.println("myThread1.getId() = " + myThread1.getId());
		System.out.println("end =" + System.currentTimeMillis());
	}

}
