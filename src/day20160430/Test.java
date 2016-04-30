package day20160430;

import com.heshi.multiThread.ThreadA;
import com.heshi.multiThread.ThreadB;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Service service = new Service();
			ThreadA a = new ThreadA(service);
			a.setName("a");
			a.start();
			Thread.sleep(500);
			ThreadB b = new ThreadB(service);
			b.setName("b");
			b.start();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}

}

