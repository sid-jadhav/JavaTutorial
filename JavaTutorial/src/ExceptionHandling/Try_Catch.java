package ExceptionHandling;

public class Try_Catch {

	public static void main(String[] args) {
		try{
			int[] a= new int[3];
			System.out.println("see this "+a[4]);
			int i=100/0;
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
