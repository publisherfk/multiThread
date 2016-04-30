package day20160430;

public class Task {

	private String getDate1;
	private String getDate2;
	synchronized public void doLongTimeTask(){
		try {
			System.out.println("begin Task");
			Thread.sleep(3000);
			getDate1 = "长时间处理任务后从远程返回的 值1 threadName="
					+ Thread.currentThread().getName();
			getDate2 = "长时间处理任务后从远程返回的 值2 threadName="
					+ Thread.currentThread().getName();
			System.out.println(getDate1);
			System.out.println(getDate2);
			System.out.println("end Task");			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
