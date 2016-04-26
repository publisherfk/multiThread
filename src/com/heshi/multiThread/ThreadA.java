package com.heshi.multiThread;

public class ThreadA extends Thread {

	private HashSelfPrivateNum hashSelfPrivateNum;

	public ThreadA(HashSelfPrivateNum hashSelfPrivateNum) {
		super();
		this.hashSelfPrivateNum = hashSelfPrivateNum;
	}

	@Override
	public void run() {
		super.run();
		hashSelfPrivateNum.addI("a");
	}
}
