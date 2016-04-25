package com.heshi.multiThread;

public class RunCountOperate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOperate countOperate = new CountOperate();
		Thread thread = new Thread(countOperate);
		System.out.println("main begin thread isAlive=" + thread.isAlive());
		thread.setName("AA");
		thread.start();
		System.out.println("main end thread isAlive=" + thread.isAlive());
	}

}
