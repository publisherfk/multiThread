package day20160427;
/*
 * 函数
 */
public class Main {

	public int i=10;
	synchronized public void operateMainMethod(){
		try {
			i--;
			System.out.println("main print i=" + i);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
