package com.heshi.multiThread;

public class Run4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			final SynchronizedObject synchronizedObject = new SynchronizedObject();
			Thread thread = new Thread(){
				@Override
				public void run(){
					synchronizedObject.printString();
				}
			};
			thread.setName("a");
			thread.start();
			Thread.sleep(1000);
//			thread.resume();
			Thread thread2 = new Thread(){
				@Override
				public void run(){
					System.out.println("thread2启动了，但进入不了printString()方法！");
					System.out.println("因为printString方法被a线程锁定并且永远暂停了！");
					synchronizedObject.printString();
				}
			};
			thread2.start();
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
