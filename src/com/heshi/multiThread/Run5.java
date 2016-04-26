package com.heshi.multiThread;

public class Run5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSelfPrivateNum hashSelfPrivateNum = new HashSelfPrivateNum();
		ThreadA thread = new ThreadA(hashSelfPrivateNum);		
		thread.start();
		ThreadB thread2 = new ThreadB(hashSelfPrivateNum);
		thread2.start();
	}

}
