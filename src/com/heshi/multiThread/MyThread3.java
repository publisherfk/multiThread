package com.heshi.multiThread;

public class MyThread3 extends Thread {

	@Override
	public void run(){
		
		try {
			System.out.println("进入到线程中");
			this.stop();
		} catch (ThreadDeath e) {
			// TODO: handle exception
			System.out.println("进入了catch()方法！");
			e.printStackTrace();
		}
	}
}
