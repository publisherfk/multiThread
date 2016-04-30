package day20160427;

public class Sub extends Main {

	synchronized public void operateMainMethod(){
		try {
			while(i > 0){
				i--;
				System.out.println("Sub print i=" + i);
				Thread.sleep(100);
				super.operateMainMethod();
			}
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
