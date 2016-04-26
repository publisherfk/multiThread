package com.heshi.multiThread;

public class ThreadB extends Thread {

	private HashSelfPrivateNum hashSelfPrivateNum;

	public ThreadB(HashSelfPrivateNum hashSelfPrivateNum) {
		super();
		this.hashSelfPrivateNum = hashSelfPrivateNum;
	}

	@Override
	public void run() {
		super.run();
		hashSelfPrivateNum.addI("b");
	}
}