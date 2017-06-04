package Threading.DemoThreading;

class MyClass extends Thread{

	public void run() {
		for (int i=0;i<=10;i++){
			System.out.println(Thread.currentThread().getId()+" Value: "+i);
		}
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
public class Demo {

	public static void main(String[] args) {
		MyClass m= new MyClass();
		m.start();
		MyClass m1= new MyClass();
		m1.start();
	}

}
