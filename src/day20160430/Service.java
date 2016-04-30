package day20160430;

import com.heshi.multiThread.HashSelfPrivateNum;

public class Service extends HashSelfPrivateNum {

	synchronized public void testMethdo() {
		if (Thread.currentThread().getName().equals("a")) {
			System.out.println(
					"ThreadName=" + Thread.currentThread().getName() + " run beginTime=" + System.currentTimeMillis());
			int i = 1;
			while(i == 1){
				//这句能执行的可能性很小啊
				if(("" + Math.random()).substring(0, 8).equals("0.123456")){
					System.out.println("ThreadName="
							+ Thread.currentThread().getName()
							+ " run exceptionTime="
							+ System.currentTimeMillis());
					Integer.parseInt("a");
				}
			}
		}else{
			System.out.println("Thread B run Time="
					+ System.currentTimeMillis());
		}
	}
}